package com.miorganizacion.vgraph.frontend;

import com.miorganizacion.vgraph.frontend.ast.*;
import java.util.*;

public class SemanticAnalyzer {

    private final SymbolTable table = new SymbolTable();
    private final List<String> errors = new ArrayList<>();

    public void analyze(ProgramNode program) {
        // 1ª pasada: registrar todas las declaraciones en todo el programa
        collectDeclarations(program);

        // 2ª pasada: análisis semántico real, sin volver a declarar
        for (ASTNode stmt : program.getStatements()) {
            visit(stmt);
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    // Recorre el AST y declara cada VarDeclarationNode una sola vez
    private void collectDeclarations(ASTNode node) {
        if (node instanceof VarDeclarationNode) {
            VarDeclarationNode var = (VarDeclarationNode) node;
            String id = var.getIdentifier();
            SymbolTable.Type type = var.getDataType().equals("color")
                ? SymbolTable.Type.COLOR
                : SymbolTable.Type.NUMBER;
            if (table.isDeclared(id)) {
                addError(var, "La variable '" + id + "' ya está declarada");
            } else {
                table.declare(id, type);
            }
        }

        // Recurse into children
        if (node instanceof ProgramNode) {
            for (ASTNode child : ((ProgramNode) node).getStatements()) {
                collectDeclarations(child);
            }
        }
        else if (node instanceof FrameNode) {
            for (ASTNode child : ((FrameNode) node).getStatements()) {
                collectDeclarations(child);
            }
        }
        else if (node instanceof LoopNode) {
            LoopNode loop = (LoopNode) node;
            collectDeclarations(loop.getInitialization());
            collectDeclarations(loop.getCondition());
            collectDeclarations(loop.getUpdate());
            for (ASTNode child : loop.getBody()) {
                collectDeclarations(child);
            }
        }
        else if (node instanceof IfNode) {
            IfNode iff = (IfNode) node;
            collectDeclarations(iff.getCondition());
            
            // Corregido: Acceder a los statements a través del BlockNode
            BlockNode thenBlock = (BlockNode) iff.getThenBlock();
            for (ASTNode child : thenBlock.getStatements()) {
                collectDeclarations(child);
            }
            
            if (iff.getElseBlock() != null) {
                BlockNode elseBlock = (BlockNode) iff.getElseBlock();
                for (ASTNode child : elseBlock.getStatements()) {
                    collectDeclarations(child);
                }
            }
        }
        // Otros nodos (Draw*, SetColor, Wait, Assignment, etc.) no declaran vars
    }

    // Despacha nodos para análisis semántico; ignora VarDeclarationNode
    private void visit(ASTNode node) {
        if (node == null || node instanceof VarDeclarationNode) return;

        if (node instanceof SetColorNode) {
            visitSetColor((SetColorNode) node);
        } else if (node instanceof DrawCircleNode) {
            visitDrawCircle((DrawCircleNode) node);
        } else if (node instanceof DrawRectNode) {
            visitDrawRect((DrawRectNode) node);
        } else if (node instanceof DrawLineNode) {
            visitDrawLine((DrawLineNode) node);
        } else if (node instanceof PixelNode) {
            visitDrawPixel((PixelNode) node);
        } else if (node instanceof IfNode) {
            visitIf((IfNode) node);
        } else if (node instanceof LoopNode) {
            visitLoop((LoopNode) node);
        } else if (node instanceof FrameNode) {
            visitFrame((FrameNode) node);
        } else if (node instanceof AssignmentNode) {
            visitAssignment((AssignmentNode) node);
        } else if (node instanceof FunctionCallNode) {
            visitFunctionCall((FunctionCallNode) node);
        } else if (node instanceof BinaryOpNode) {
            visitBinaryOp((BinaryOpNode) node);
        } else if (node instanceof BlockNode) {
            visitBlock((BlockNode) node);
        }
    }

 // 1) Infiriendo el tipo de nodo correctamente:
    private SymbolTable.Type inferType(ASTNode node) {
        if (node instanceof IntLiteralNode) {
            return SymbolTable.Type.NUMBER;
        } 
        else if (node instanceof FloatLiteralNode) {
            return SymbolTable.Type.NUMBER;           // <-- agregamos
        }
        else if (node instanceof ColorLiteralNode) {
            return SymbolTable.Type.COLOR;            // <-- agregamos
        }
        else if (node instanceof VarReferenceNode) {
            String varName = ((VarReferenceNode) node).getVarName();
            return table.getType(varName);
        } 
        else if (node instanceof FunctionCallNode || node instanceof BinaryOpNode) {
            return SymbolTable.Type.NUMBER;
        }
        return SymbolTable.Type.UNKNOWN;
    }


    private void visitSetColor(SetColorNode node) {
        visit(node.getColorExpr());
        SymbolTable.Type type = inferType(node.getColorExpr());
        if (type != SymbolTable.Type.COLOR) {
            addError(node, "setcolor espera un color, se encontró: " + type);
        }
    }

    private void visitDrawCircle(DrawCircleNode node) {
        visit(node.getCx());
        visit(node.getCy());
        visit(node.getRadius());
        checkCoordinate(node, node.getCx(), "Coordenada X", 0, 639);
        checkCoordinate(node, node.getCy(), "Coordenada Y", 0, 479);
        checkPositive(node, node.getRadius(), "Radio");
    }

    private void visitDrawRect(DrawRectNode node) {
        visit(node.getX1());
        visit(node.getY1());
        visit(node.getX2());
        visit(node.getY2());
        checkCoordinate(node, node.getX1(), "Coordenada X1", 0, 639);
        checkCoordinate(node, node.getY1(), "Coordenada Y1", 0, 479);
        checkCoordinate(node, node.getX2(), "Coordenada X2", 0, 639);
        checkCoordinate(node, node.getY2(), "Coordenada Y2", 0, 479);
    }

    private void visitDrawLine(DrawLineNode node) {
        visit(node.getX1());
        visit(node.getY1());
        visit(node.getX2());
        visit(node.getY2());
        checkCoordinate(node, node.getX1(), "Coordenada X1", 0, 639);
        checkCoordinate(node, node.getY1(), "Coordenada Y1", 0, 479);
        checkCoordinate(node, node.getX2(), "Coordenada X2", 0, 639);
        checkCoordinate(node, node.getY2(), "Coordenada Y2", 0, 479);
    }

    private void visitDrawPixel(PixelNode node) {
        visit(node.getX());
        visit(node.getY());
        checkCoordinate(node, node.getX(), "Coordenada X", 0, 639);
        checkCoordinate(node, node.getY(), "Coordenada Y", 0, 479);
    }

    private void visitIf(IfNode node) {
        visit(node.getCondition());
        
        // Corregido: Acceder al contenido del BlockNode
        BlockNode thenBlock = (BlockNode) node.getThenBlock();
        visitBlock(thenBlock);
        
        if (node.getElseBlock() != null) {
            BlockNode elseBlock = (BlockNode) node.getElseBlock();
            visitBlock(elseBlock);
        }
    }

    private void visitLoop(LoopNode node) {
        visit(node.getInitialization());
        visit(node.getCondition());
        visit(node.getUpdate());
        for (ASTNode stmt : node.getBody()) {
            visit(stmt);
        }
    }

    private void visitFrame(FrameNode node) {
        for (ASTNode stmt : node.getStatements()) {
            visit(stmt);
        }
    }

    // 2) En visitAssignment, ahora dará COLOR para c = rojo/azul/verde:
    private void visitAssignment(AssignmentNode node) {
        visit(node.getExpression());
        SymbolTable.Type varType  = table.getType(node.getIdentifier());
        SymbolTable.Type exprType = inferType(node.getExpression());
        if (varType == SymbolTable.Type.UNKNOWN) {
            addError(node, "Variable no declarada: '" + node.getIdentifier() + "'");
        } 
        else if (varType != exprType) {
            addError(node,
                "Asignación de tipo incompatible para '" + node.getIdentifier()
                + "'. Esperado: " + varType + ", Encontrado: " + exprType);
        }
    }


    private void visitFunctionCall(FunctionCallNode node) {
        visit(node.getArgument());
        SymbolTable.Type argType = inferType(node.getArgument());
        if (argType != SymbolTable.Type.NUMBER) {
            addError(node, "La función " + node.getFunctionName() + " espera un argumento numérico");
        }
    }

    private void visitBinaryOp(BinaryOpNode node) {
        visit(node.getLeft());
        visit(node.getRight());
        SymbolTable.Type leftType = inferType(node.getLeft());
        SymbolTable.Type rightType = inferType(node.getRight());
        if (leftType != SymbolTable.Type.NUMBER || rightType != SymbolTable.Type.NUMBER) {
            addError(node, "Operación aritmética con tipos no numéricos");
        }
    }

    private void visitBlock(BlockNode node) {
        for (ASTNode stmt : node.getStatements()) {
            visit(stmt);
        }
    }

    // 3) (Opcional) Si quieres validar coordenadas flotantes, adapta checkCoordinate:
    private void checkCoordinate(ASTNode context, ASTNode coord, String name, int min, int max) {
        if (coord instanceof IntLiteralNode) {
            int v = ((IntLiteralNode) coord).getValue();
            if (v < min || v > max) {
                addError(context, name + " fuera de rango ("+min+"-"+max+"): " + v);
            }
        }
        else if (coord instanceof FloatLiteralNode) {
            double v = ((FloatLiteralNode) coord).getValue();
            if (v < min || v > max) {
                addError(context, name + " fuera de rango ("+min+"-"+max+"): " + v);
            }
        }
    }


    private void checkPositive(ASTNode context, ASTNode valueNode, String name) {
        if (valueNode instanceof IntLiteralNode) {
            int value = ((IntLiteralNode) valueNode).getValue();
            if (value <= 0) {
                addError(context, name + " debe ser positivo: " + value);
            }
        }
    }

    private void addError(ASTNode node, String message) {
        errors.add("Línea " + node.getLine() + ": " + message);
    }
}