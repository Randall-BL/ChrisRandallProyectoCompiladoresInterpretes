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
        if (node instanceof HazNode) {
            HazNode var = (HazNode) node;
            String id = var.getIdentifier();

            // El tipo se infiere, así que lo analizaremos después.
            // Por ahora, solo declaramos el símbolo.
            if (table.isDeclared(id)) {
                addError(var, "La variable '" + id + "' ya está declarada (solo se puede usar 'Haz' una vez por variable)");
            } else {
                // Declaramos con un tipo provisional, la segunda pasada lo corregirá.
                table.declare(id, SymbolTable.Type.UNKNOWN);
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
        if (node == null || node instanceof HazNode) return;

        if (node instanceof IncrementNode) {
            visitIncrement((IncrementNode) node);
        } else if (node instanceof AvanzaNode) {
            visitAvanza((AvanzaNode) node);
        } else if (node instanceof RetrocedeNode) {
            visitRetrocede((RetrocedeNode) node);
        } else if (node instanceof GiraDerechaNode) {
            visitGiraDerecha((GiraDerechaNode) node);
        } else if (node instanceof GiraIzquierdaNode) {
            visitGiraIzquierda((GiraIzquierdaNode) node);
        } else if (node instanceof PonColorLapizNode) {
            visitPonColorLapiz((PonColorLapizNode) node);
        } else if (node instanceof PonPosNode) {
            visitPonPos((PonPosNode) node);
        } else if (node instanceof PonRumboNode) {
            visitPonRumbo((PonRumboNode) node);
        } else if (node instanceof PonXNode) {
            visitPonX((PonXNode) node);
        } else if (node instanceof PonYNode) {
            visitPonY((PonYNode) node);
        } else if (node instanceof EsperaNode) {
            visitEspera((EsperaNode) node);
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
        else if (node instanceof RumboNode) { // NUEVO
            return SymbolTable.Type.NUMBER;
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



    // NUEVOS MÉTODOS
    private void visitIncrement(IncrementNode node) {
        String id = node.getIdentifier();
        if (!table.isDeclared(id)) {
            addError(node, "Variable no declarada: '" + id + "'");
            return;
        }
        if (table.getType(id) != SymbolTable.Type.NUMBER) {
            addError(node, "El comando 'inc' solo se puede usar con variables numéricas.");
        }
        if (node.getByValue() != null) {
            visit(node.getByValue());
            if (inferType(node.getByValue()) != SymbolTable.Type.NUMBER) {
                addError(node, "El valor de incremento debe ser numérico.");
            }
        }
    }

    private void visitAvanza(AvanzaNode node) {
        visit(node.getDistance());
        if (inferType(node.getDistance()) != SymbolTable.Type.NUMBER) {
            addError(node, "El comando 'avanza' espera una distancia numérica.");
        }
    }

    private void visitRetrocede(RetrocedeNode node) {
        visit(node.getDistance());
        if (inferType(node.getDistance()) != SymbolTable.Type.NUMBER) {
            addError(node, "El comando 'retrocede' espera una distancia numérica.");
        }
    }

    private void checkIsNumber(ASTNode node, String commandName) {
        visit(node); // Analiza la expresión recursivamente
        if (inferType(node) != SymbolTable.Type.NUMBER) {
            addError(node, "El comando '" + commandName + "' espera un valor numérico.");
        }
    }

    private void visitGiraDerecha(GiraDerechaNode node) {
        checkIsNumber(node.getAngle(), "giraderecha");
    }

    private void visitGiraIzquierda(GiraIzquierdaNode node) {
        checkIsNumber(node.getAngle(), "giraizquierda");
    }

    private void visitPonColorLapiz(PonColorLapizNode node) {
        String color = node.getColorName().toLowerCase();

        if (!color.equals("negro") && !color.equals("azul") && !color.equals("rojo")) {
            addError(node, "Color no válido: '" + node.getColorName() + "'. Los colores permitidos son Negro, Azul, Rojo.");
        }
    }

    private void visitPonPos(PonPosNode node) {
        checkIsNumber(node.getX(), "ponpos (coordenada X)");
        checkIsNumber(node.getY(), "ponpos (coordenada Y)");
    }

    private void visitPonRumbo(PonRumboNode node) {
        checkIsNumber(node.getValue(), "ponrumbo");
    }

    private void visitPonX(PonXNode node) {
        checkIsNumber(node.getValue(), "ponx");
    }

    private void visitPonY(PonYNode node) {
        checkIsNumber(node.getValue(), "pony");
    }

    private void visitEspera(EsperaNode node) {
        checkIsNumber(node.getDuration(), "espera");
    }

    // 2) En visitAssignment, ahora dará COLOR para c = rojo/azul/verde:
    private void visitAssignment(AssignmentNode node) {
        visit(node.getExpression());
        String id = node.getIdentifier();
        SymbolTable.Type exprType = inferType(node.getExpression());

        if (!table.isDeclared(id)) {
            addError(node, "Variable no declarada: '" + id + "'. Debes usar 'Haz' para crearla primero.");
            return;
        }

        SymbolTable.Type varType = table.getType(id);

        // Si la variable fue declarada con 'Haz' pero aún no tiene tipo, se lo asignamos ahora.
        if (varType == SymbolTable.Type.UNKNOWN) {
            table.declare(id, exprType); // Asigna el tipo en la primera asignación.
            varType = exprType;
        }

        if (varType != exprType) {
            addError(node, "Asignación de tipo incompatible para '" + id + "'. Esperado: " + varType + ", Encontrado: " + exprType);
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