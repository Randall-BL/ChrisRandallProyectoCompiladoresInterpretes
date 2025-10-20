package com.miorganizacion.vgraph.frontend;

import com.miorganizacion.vgraph.frontend.ast.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class CodeGenerator {

    private StringBuilder llvmIr;
    private StringBuilder globalDeclarations;
    private Map<String, SymbolInfo> symbolTable;
    private int tempCounter;
    private int labelCounter;
    private int strCounter;

    private static final String STR_AVANZA = "@.str.avanza = private unnamed_addr constant [11 x i8] c\"AVANZA:%d\\0A\\00\"\n";
    private static final String STR_RETROCEDE = "@.str.retrocede = private unnamed_addr constant [14 x i8] c\"RETROCEDE:%d\\0A\\00\"\n";
    private static final String STR_GIRADERECHA = "@.str.giraderecha = private unnamed_addr constant [16 x i8] c\"GIRADERECHA:%d\\0A\\00\"\n";
    private static final String STR_GIRAIZQUIERDA = "@.str.giraizquierda = private unnamed_addr constant [18 x i8] c\"GIRAIZQUIERDA:%d\\0A\\00\"\n";
    private static final String STR_PONCOLOR = "@.str.poncolor = private unnamed_addr constant [10 x i8] c\"COLOR:%s\\0A\\00\"\n";

    private static final String STR_PENUP = "@.str.penup = private unnamed_addr constant [11 x i8] c\"SUBELAPIZ\\0A\\00\"\n";
    private static final String STR_PENDOWN = "@.str.pendown = private unnamed_addr constant [11 x i8] c\"BAJALAPIZ\\0A\\00\"\n";
    private static final String STR_PONPOS = "@.str.ponpos = private unnamed_addr constant [14 x i8] c\"PONPOS:%d:%d\\0A\\00\"\n";
    private static final String STR_PONRUMBO = "@.str.ponrumbo = private unnamed_addr constant [13 x i8] c\"PONRUMBO:%d\\0A\\00\"\n";
    private static final String STR_ESPERA = "@.str.espera = private unnamed_addr constant [11 x i8] c\"ESPERA:%d\\0A\\00\"\n";
    private static final String STR_CENTRO = "@.str.centro = private unnamed_addr constant [8 x i8] c\"CENTRO\\0A\\00\"\n";
    private static final String STR_OCULTATORTUGA = "@.str.ocultatortuga = private unnamed_addr constant [15 x i8] c\"OCULTATORTUGA\\0A\\00\"\n";

    private static class SymbolInfo {
        String llvmRegister;
        SymbolTable.Type type;
        SymbolInfo(String llvmRegister, SymbolTable.Type type) {
            this.llvmRegister = llvmRegister;
            this.type = type;
        }
    }

    public String generate(ProgramNode program) {
        this.llvmIr = new StringBuilder();
        this.globalDeclarations = new StringBuilder();
        this.symbolTable = new HashMap<>();
        this.tempCounter = 0;
        this.labelCounter = 0;
        this.strCounter = 0;

        // Declaraciones de funciones externas y strings
        globalDeclarations.append(STR_AVANZA);
        globalDeclarations.append(STR_RETROCEDE);
        globalDeclarations.append(STR_GIRADERECHA);
        globalDeclarations.append(STR_GIRAIZQUIERDA);
        globalDeclarations.append(STR_PONCOLOR);
        globalDeclarations.append(STR_PENUP);
        globalDeclarations.append(STR_PENDOWN);
        globalDeclarations.append(STR_PONPOS);
        globalDeclarations.append(STR_PONRUMBO);
        globalDeclarations.append(STR_ESPERA);
        globalDeclarations.append(STR_CENTRO);
        globalDeclarations.append(STR_OCULTATORTUGA);
        globalDeclarations.append("declare i32 @printf(i8*, ...)\n\n");
        globalDeclarations.append("declare i32 @pow(i32, i32)\n\n"); // Para la potencia
        globalDeclarations.append("declare i32 @rand()\n\n"); // Para el azar
        globalDeclarations.append("declare void @srand(i32)\n\n"); // Para semilla de azar
        globalDeclarations.append("declare i32 @time(i32*)\n\n"); // Para semilla de azar
        globalDeclarations.append("declare i32 @fflush(i8*)\n\n"); // Declaración para fflush

        // Función principal
        llvmIr.append("define i32 @main() {\n");
        llvmIr.append("entry:\n");

        // Inicializar la semilla para 'azar'
        llvmIr.append("  %t.time = call i32 @time(i32* null)\n");
        llvmIr.append("  call void @srand(i32 %t.time)\n");


        for (ASTNode statement : program.getStatements()) {
            visit(statement);
        }

        llvmIr.append("  ret i32 0\n");
        llvmIr.append("}\n");

        return globalDeclarations.toString() + llvmIr.toString();
    }

    // --- Despachador principal ---
    private void visit(ASTNode node) {
        if (node == null) return;
        if (node instanceof HazNode) visitHaz((HazNode) node);
        else if (node instanceof AssignmentNode) visitAssignment((AssignmentNode) node);
        else if (node instanceof AvanzaNode) visitAvanza((AvanzaNode) node);
        else if (node instanceof RetrocedeNode) visitRetrocede((RetrocedeNode) node);
        else if (node instanceof GiraDerechaNode) visitGiraDerecha((GiraDerechaNode) node);
        else if (node instanceof GiraIzquierdaNode) visitGiraIzquierda((GiraIzquierdaNode) node);
        else if (node instanceof PonColorLapizNode) visitPonColorLapiz((PonColorLapizNode) node);
        else if (node instanceof SiNode) visitSi((SiNode) node);
        else if (node instanceof RepiteNode) visitRepite((RepiteNode) node);
        else if (node instanceof IncrementNode) visitIncrement((IncrementNode) node);
        else if (node instanceof OcultaTortugaNode) visitOcultaTortuga((OcultaTortugaNode) node);
        else if (node instanceof BajaLapizNode) visitBajaLapiz((BajaLapizNode) node);
        else if (node instanceof SubeLapizNode) visitSubeLapiz((SubeLapizNode) node);
        else if (node instanceof CentroNode) visitCentro((CentroNode) node);
        else if (node instanceof PonPosNode) visitPonPos((PonPosNode) node);
        else if (node instanceof PonRumboNode) visitPonRumbo((PonRumboNode) node);
        else if (node instanceof PonXNode) visitPonX((PonXNode) node);
        else if (node instanceof PonYNode) visitPonY((PonYNode) node);
        else if (node instanceof EsperaNode) visitEspera((EsperaNode) node);
        else if (node instanceof EjecutaNode) visitEjecuta((EjecutaNode) node);
        else if (node instanceof MientrasNode) visitMientras((MientrasNode) node);
        else if (node instanceof HastaNode) visitHasta((HastaNode) node);
        else if (node instanceof HazMientrasNode) visitHazMientras((HazMientrasNode) node);
        else if (node instanceof HazHastaNode) visitHazHasta((HazHastaNode) node);
    }

    // --- Generadores para Statements ---

    private void visitHaz(HazNode node) {
        String varName = node.getIdentifier();
        String llvmVarName = "@" + varName;

        // Las variables en VGraph son globales
        globalDeclarations.append(llvmVarName).append(" = common global i32 0, align 4\n");
        symbolTable.put(varName, new SymbolInfo(llvmVarName, SymbolTable.Type.NUMBER));

        String exprResultReg = evaluateExpression(node.getExpression());
        llvmIr.append("  store i32 ").append(exprResultReg).append(", i32* ").append(llvmVarName).append(", align 4\n");
    }

    private void visitAssignment(AssignmentNode node) {
        String varName = node.getIdentifier();
        SymbolInfo info = symbolTable.get(varName);
        if (info == null) return; // Error semántico

        String exprResultReg = evaluateExpression(node.getExpression());
        llvmIr.append("  store i32 ").append(exprResultReg).append(", i32* ").append(info.llvmRegister).append(", align 4\n");
    }

    private void visitAvanza(AvanzaNode node) {
        String distanceReg = evaluateExpression(node.getDistance());
        String strPtr = getConstantStringPtr("@.str.avanza", 11);
        callPrintfWithFlush(strPtr, 11, "i32 " + distanceReg);
    }

    private void visitRetrocede(RetrocedeNode node) {
        String distanceReg = evaluateExpression(node.getDistance());
        String strPtr = getConstantStringPtr("@.str.retrocede", 14);
        callPrintfWithFlush(strPtr, 14, "i32 " + distanceReg);
    }

    private void visitGiraDerecha(GiraDerechaNode node) {
        String angleReg = evaluateExpression(node.getAngle());
        String strPtr = getConstantStringPtr("@.str.giraderecha", 16);
        callPrintfWithFlush(strPtr, 16, "i32 " + angleReg);
    }

    private void visitGiraIzquierda(GiraIzquierdaNode node) {
        String angleReg = evaluateExpression(node.getAngle());
        String strPtr = getConstantStringPtr("@.str.giraizquierda", 18);
        callPrintfWithFlush(strPtr, 18, "i32 " + angleReg);
    }

    private void visitPonColorLapiz(PonColorLapizNode node) {
        String colorName = node.getColorName();
        String strConstantName = "@.str.color." + (strCounter++);
        String colorConstant = strConstantName + " = private unnamed_addr constant [" + (colorName.length() + 1) + " x i8] c\"" + colorName + "\\00\"\n";
        globalDeclarations.insert(0, colorConstant);

        String colorPtr = getConstantStringPtr(strConstantName, colorName.length() + 1);
        String formatStrPtr = getConstantStringPtr("@.str.poncolor", 10);
        callPrintfWithFlush(formatStrPtr, 10, "i8* " + colorPtr);
    }

    private void visitSi(SiNode node) {
        String thenLabel = newLabel("if.then");
        String elseLabel = node.tieneElse() ? newLabel("if.else") : newLabel("if.end");
        String endLabel = node.tieneElse() ? newLabel("if.end") : elseLabel;

        String condReg = evaluateExpression(node.getCondicion());
        String condBoolReg = newTempRegister();
        llvmIr.append("  ").append(condBoolReg).append(" = icmp ne i32 ").append(condReg).append(", 0\n");
        llvmIr.append("  br i1 ").append(condBoolReg).append(", label %").append(thenLabel).append(", label %").append(elseLabel).append("\n");

        // Bloque 'then'
        llvmIr.append(thenLabel).append(":\n");
        for (ASTNode instruction : node.getInstruccionesSi()) {
            visit(instruction);
        }
        llvmIr.append("  br label %").append(endLabel).append("\n");

        // Bloque 'else'
        if (node.tieneElse()) {
            llvmIr.append(elseLabel).append(":\n");
            for (ASTNode instruction : node.getInstruccionesSino()) {
                visit(instruction);
            }
            llvmIr.append("  br label %").append(endLabel).append("\n");
        }

        llvmIr.append(endLabel).append(":\n");
    }

    private void visitRepite(RepiteNode node) {
        String headerLabel = newLabel("loop.header");
        String bodyLabel = newLabel("loop.body");
        String exitLabel = newLabel("loop.exit");

        String counterPtr = newTempRegister();
        llvmIr.append("  ").append(counterPtr).append(" = alloca i32, align 4\n");
        llvmIr.append("  store i32 0, i32* ").append(counterPtr).append(", align 4\n");

        String limitReg = evaluateExpression(node.getVeces());
        llvmIr.append("  br label %").append(headerLabel).append("\n");

        llvmIr.append(headerLabel).append(":\n");
        String currentCounterVal = newTempRegister();
        llvmIr.append("  ").append(currentCounterVal).append(" = load i32, i32* ").append(counterPtr).append(", align 4\n");
        String condReg = newTempRegister();
        llvmIr.append("  ").append(condReg).append(" = icmp slt i32 ").append(currentCounterVal).append(", ").append(limitReg).append("\n");
        llvmIr.append("  br i1 ").append(condReg).append(", label %").append(bodyLabel).append(", label %").append(exitLabel).append("\n");

        llvmIr.append(bodyLabel).append(":\n");
        for (ASTNode orden : node.getOrdenes()) {
            visit(orden);
        }

        String nextCounterVal = newTempRegister();
        llvmIr.append("  ").append(nextCounterVal).append(" = add nsw i32 ").append(currentCounterVal).append(", 1\n");
        llvmIr.append("  store i32 ").append(nextCounterVal).append(", i32* ").append(counterPtr).append(", align 4\n");
        llvmIr.append("  br label %").append(headerLabel).append("\n");

        llvmIr.append(exitLabel).append(":\n");
    }

    // --- Evaluadores para Expresiones ---

    private String evaluateExpression(ASTNode expr) {
        if (expr instanceof IntLiteralNode) return String.valueOf(((IntLiteralNode) expr).getValue());
        if (expr instanceof VarReferenceNode) return visitVarReference((VarReferenceNode) expr);
        if (expr instanceof ConditionNode) return visitCondition((ConditionNode) expr);

        if (expr instanceof IgualesNode) return visitComparison((IgualesNode) expr, "eq");
        if (expr instanceof MayorQueNode) return visitComparison((MayorQueNode) expr, "sgt");
        if (expr instanceof MenorQueNode) return visitComparison((MenorQueNode) expr, "slt");
        if (expr instanceof YLogicoNode) return visitLogicalOp((YLogicoNode) expr, "and");
        if (expr instanceof OLogicoNode) return visitLogicalOp((OLogicoNode) expr, "or");

        // Operaciones Prefijas
        if (expr instanceof SumaNode) return visitMultiOperandOp((SumaNode) expr, "add");
        if (expr instanceof ProductoNode) return visitMultiOperandOp((ProductoNode) expr, "mul");
        if (expr instanceof DiferenciaNode) return visitMultiOperandOp((DiferenciaNode) expr, "sub");
        if (expr instanceof DivisionNode) return visitBinaryOp((DivisionNode) expr, "sdiv");
        if (expr instanceof PotenciaNode) return visitPotencia((PotenciaNode) expr);
        if (expr instanceof AzarNode) return visitAzar((AzarNode) expr);

        // Operaciones Lógicas/Comparación
        if (expr instanceof YLogicoNode) return visitLogicalOp((YLogicoNode) expr, "and");
        if (expr instanceof OLogicoNode) return visitLogicalOp((OLogicoNode) expr, "or");

        return "0"; // Default
    }

    private String visitVarReference(VarReferenceNode node) {
        String varName = node.getVarName();
        SymbolInfo info = symbolTable.get(varName);
        if (info == null) return "0";
        String tempReg = newTempRegister();
        llvmIr.append("  ").append(tempReg).append(" = load i32, i32* ").append(info.llvmRegister).append(", align 4\n");
        return tempReg;
    }

    private String visitCondition(ConditionNode node) {
        String op = node.getOperator();
        String llvmOp;
        switch (op) {
            case "==": case "=": case "iguales?": llvmOp = "eq"; break;
            case "!=": llvmOp = "ne"; break;
            case ">": case "mayorque?": llvmOp = "sgt"; break;
            case "<": case "menorque?": llvmOp = "slt"; break;
            case ">=": llvmOp = "sge"; break;
            case "<=": llvmOp = "sle"; break;
            default: llvmOp = "eq";
        }

        String leftReg = evaluateExpression(node.getLeft());
        String rightReg = evaluateExpression(node.getRight());
        String cmpReg = newTempRegister();
        llvmIr.append("  ").append(cmpReg).append(" = icmp ").append(llvmOp).append(" i32 ").append(leftReg).append(", ").append(rightReg).append("\n");
        String finalReg = newTempRegister();
        llvmIr.append("  ").append(finalReg).append(" = zext i1 ").append(cmpReg).append(" to i32\n");
        return finalReg;
    }

    private String visitComparison(ASTNode node, String op) {
        ASTNode left, right;
        if (node instanceof IgualesNode) {
            left = ((IgualesNode) node).getLeft();
            right = ((IgualesNode) node).getRight();
        } else if (node instanceof MayorQueNode) {
            left = ((MayorQueNode) node).getLeft();
            right = ((MayorQueNode) node).getRight();
        } else if (node instanceof MenorQueNode) {
            left = ((MenorQueNode) node).getLeft();
            right = ((MenorQueNode) node).getRight();
        } else {
            return "0"; // No debería pasar
        }

        String leftReg = evaluateExpression(left);
        String rightReg = evaluateExpression(right);
        String cmpReg = newTempRegister();
        llvmIr.append("  ").append(cmpReg).append(" = icmp ").append(op).append(" i32 ").append(leftReg).append(", ").append(rightReg).append("\n");
        String finalReg = newTempRegister();
        llvmIr.append("  ").append(finalReg).append(" = zext i1 ").append(cmpReg).append(" to i32\n");
        return finalReg;
    }

    private String visitMultiOperandOp(ASTNode node, String op) {
        List<ASTNode> operands;
        if (node instanceof SumaNode) operands = ((SumaNode)node).getOperandos();
        else if (node instanceof ProductoNode) operands = ((ProductoNode)node).getOperandos();
        else if (node instanceof DiferenciaNode) operands = ((DiferenciaNode)node).getOperandos();
        else return "0";

        if (operands.isEmpty()) return "0";

        String currentResultReg = evaluateExpression(operands.get(0));
        for (int i = 1; i < operands.size(); i++) {
            String nextOperandReg = evaluateExpression(operands.get(i));
            String newResultReg = newTempRegister();
            llvmIr.append("  ").append(newResultReg).append(" = ").append(op).append(" nsw i32 ").append(currentResultReg).append(", ").append(nextOperandReg).append("\n");
            currentResultReg = newResultReg;
        }
        return currentResultReg;
    }

    private String visitBinaryOp(DivisionNode node, String op) {
        String leftReg = evaluateExpression(node.getDividendo());
        String rightReg = evaluateExpression(node.getDivisor());
        String resultReg = newTempRegister();
        llvmIr.append("  ").append(resultReg).append(" = ").append(op).append(" i32 ").append(leftReg).append(", ").append(rightReg).append("\n");
        return resultReg;
    }

    private String visitPotencia(PotenciaNode node) {
        String baseReg = evaluateExpression(node.getBase());
        String expReg = evaluateExpression(node.getExponente());
        String resultReg = newTempRegister();
        llvmIr.append("  ").append(resultReg).append(" = call i32 @pow(i32 ").append(baseReg).append(", i32 ").append(expReg).append(")\n");
        return resultReg;
    }

    private String visitAzar(AzarNode node) {
        String limitReg = evaluateExpression(node.getLimite());
        String randResult = newTempRegister();
        llvmIr.append("  ").append(randResult).append(" = call i32 @rand()\n");
        String modResult = newTempRegister();
        llvmIr.append("  ").append(modResult).append(" = srem i32 ").append(randResult).append(", ").append(limitReg).append("\n");
        return modResult;
    }

    private String visitLogicalOp(ASTNode node, String op) {
        ASTNode leftNode, rightNode;
        if (node instanceof YLogicoNode) {
            leftNode = ((YLogicoNode)node).getLeft();
            rightNode = ((YLogicoNode)node).getRight();
        } else if (node instanceof OLogicoNode) {
            leftNode = ((OLogicoNode)node).getLeft();
            rightNode = ((OLogicoNode)node).getRight();
        } else return "0";

        String leftReg = evaluateExpression(leftNode);
        String rightReg = evaluateExpression(rightNode);

        String leftBool = newTempRegister();
        llvmIr.append("  ").append(leftBool).append(" = icmp ne i32 ").append(leftReg).append(", 0\n");
        String rightBool = newTempRegister();
        llvmIr.append("  ").append(rightBool).append(" = icmp ne i32 ").append(rightReg).append(", 0\n");

        String opReg = newTempRegister();
        llvmIr.append("  ").append(opReg).append(" = ").append(op).append(" i1 ").append(leftBool).append(", ").append(rightBool).append("\n");

        String finalReg = newTempRegister();
        llvmIr.append("  ").append(finalReg).append(" = zext i1 ").append(opReg).append(" to i32\n");
        return finalReg;
    }

    private void visitIncrement(IncrementNode node) {
        String varName = node.getIdentifier();
        SymbolInfo info = symbolTable.get(varName);
        if (info == null) return; // Error semántico

        // Cargar el valor actual de la variable
        String currentValueReg = newTempRegister();
        llvmIr.append("  ").append(currentValueReg).append(" = load i32, i32* ").append(info.llvmRegister).append(", align 4\n");

        // Determinar el valor del incremento (1 por defecto)
        String incrementValueReg = "1";
        if (node.getByValue() != null) {
            incrementValueReg = evaluateExpression(node.getByValue());
        }

        // Realizar la suma
        String newValueReg = newTempRegister();
        llvmIr.append("  ").append(newValueReg).append(" = add nsw i32 ").append(currentValueReg).append(", ").append(incrementValueReg).append("\n");

        // Guardar el nuevo valor
        llvmIr.append("  store i32 ").append(newValueReg).append(", i32* ").append(info.llvmRegister).append(", align 4\n");
    }

    private void visitOcultaTortuga(OcultaTortugaNode node) {
        String strPtr = getConstantStringPtr("@.str.ocultatortuga", 15);
        callPrintfWithFlush(strPtr, 15);
    }

    private void visitBajaLapiz(BajaLapizNode node) {
        String strPtr = getConstantStringPtr("@.str.pendown", 11);
        callPrintfWithFlush(strPtr, 11);
    }

    private void visitSubeLapiz(SubeLapizNode node) {
        String strPtr = getConstantStringPtr("@.str.penup", 11);
        callPrintfWithFlush(strPtr, 11);
    }

    private void visitCentro(CentroNode node) {
        String strPtr = getConstantStringPtr("@.str.centro", 8);
        callPrintfWithFlush(strPtr, 8);
    }

    private void visitPonPos(PonPosNode node) {
        String xReg = evaluateExpression(node.getX());
        String yReg = evaluateExpression(node.getY());
        String strPtr = getConstantStringPtr("@.str.ponpos", 14);
        callPrintfWithFlush(strPtr, 14, "i32 " + xReg, "i32 " + yReg);
    }

    private void visitPonRumbo(PonRumboNode node) {
        String angleReg = evaluateExpression(node.getValue());
        String strPtr = getConstantStringPtr("@.str.ponrumbo", 13);
        callPrintfWithFlush(strPtr, 13, "i32 " + angleReg);
    }

    private void visitPonX(PonXNode node) {
        // Para simplificar, implementamos PonX como un PONPOS especial
        // donde la Y actual no cambia. Esto requiere una variable global para la tortuga.
        // Por ahora, solo imprimiremos un mensaje.
        System.out.println("// TODO: Implementar lógica completa para PonX");
    }

    private void visitPonY(PonYNode node) {
        // Similar a PonX
        System.out.println("// TODO: Implementar lógica completa para PonY");
    }

    private void visitEspera(EsperaNode node) {
        String durationReg = evaluateExpression(node.getDuration());
        String strPtr = getConstantStringPtr("@.str.espera", 11);
        callPrintfWithFlush(strPtr, 11, "i32 " + durationReg);
    }

    private void visitEjecuta(EjecutaNode node) {
        for (ASTNode orden : node.getOrdenes()) {
            visit(orden);
        }
    }

    private void visitMientras(MientrasNode node) {
        String headerLabel = newLabel("while.header");
        String bodyLabel = newLabel("while.body");
        String exitLabel = newLabel("while.exit");

        llvmIr.append("  br label %").append(headerLabel).append("\n");
        llvmIr.append(headerLabel).append(":\n");

        String condReg = evaluateExpression(node.getCondicion());
        String condBoolReg = newTempRegister();
        llvmIr.append("  ").append(condBoolReg).append(" = icmp ne i32 ").append(condReg).append(", 0\n");
        llvmIr.append("  br i1 ").append(condBoolReg).append(", label %").append(bodyLabel).append(", label %").append(exitLabel).append("\n");

        llvmIr.append(bodyLabel).append(":\n");
        for (ASTNode instruccion : node.getInstrucciones()) {
            visit(instruccion);
        }
        llvmIr.append("  br label %").append(headerLabel).append("\n");

        llvmIr.append(exitLabel).append(":\n");
    }

    private void visitHasta(HastaNode node) {
        String headerLabel = newLabel("until.header");
        String bodyLabel = newLabel("until.body");
        String exitLabel = newLabel("until.exit");

        llvmIr.append("  br label %").append(headerLabel).append("\n");
        llvmIr.append(headerLabel).append(":\n");

        String condReg = evaluateExpression(node.getCondicion());
        String condBoolReg = newTempRegister();
        // La condición de HASTA es inversa: el bucle se ejecuta MIENTRAS sea FALSO.
        llvmIr.append("  ").append(condBoolReg).append(" = icmp eq i32 ").append(condReg).append(", 0\n");
        llvmIr.append("  br i1 ").append(condBoolReg).append(", label %").append(bodyLabel).append(", label %").append(exitLabel).append("\n");

        llvmIr.append(bodyLabel).append(":\n");
        for (ASTNode instruccion : node.getInstrucciones()) {
            visit(instruccion);
        }
        llvmIr.append("  br label %").append(headerLabel).append("\n");

        llvmIr.append(exitLabel).append(":\n");
    }

    private void visitHazMientras(HazMientrasNode node) {
        String bodyLabel = newLabel("do-while.body");
        String exitLabel = newLabel("do-while.exit");

        llvmIr.append("  br label %").append(bodyLabel).append("\n");
        llvmIr.append(bodyLabel).append(":\n");

        for (ASTNode instruccion : node.getInstrucciones()) {
            visit(instruccion);
        }

        String condReg = evaluateExpression(node.getCondicion());
        String condBoolReg = newTempRegister();
        llvmIr.append("  ").append(condBoolReg).append(" = icmp ne i32 ").append(condReg).append(", 0\n");
        llvmIr.append("  br i1 ").append(condBoolReg).append(", label %").append(bodyLabel).append(", label %").append(exitLabel).append("\n");

        llvmIr.append(exitLabel).append(":\n");
    }

    private void visitHazHasta(HazHastaNode node) {
        String bodyLabel = newLabel("do-until.body");
        String exitLabel = newLabel("do-until.exit");

        llvmIr.append("  br label %").append(bodyLabel).append("\n");
        llvmIr.append(bodyLabel).append(":\n");

        for (ASTNode instruccion : node.getInstrucciones()) {
            visit(instruccion);
        }

        String condReg = evaluateExpression(node.getCondicion());
        String condBoolReg = newTempRegister();
        // Condición inversa: repetir si es falso.
        llvmIr.append("  ").append(condBoolReg).append(" = icmp eq i32 ").append(condReg).append(", 0\n");
        llvmIr.append("  br i1 ").append(condBoolReg).append(", label %").append(bodyLabel).append(", label %").append(exitLabel).append("\n");

        llvmIr.append(exitLabel).append(":\n");
    }

    private void callPrintfWithFlush(String formatStrPtr, int formatStrLen, String... args) {
        StringBuilder argString = new StringBuilder();
        for (String arg : args) {
            argString.append(", ").append(arg);
        }

        llvmIr.append("  call i32 (i8*, ...) @printf(i8* ")
                .append(formatStrPtr)
                .append(argString)
                .append(")\n");

        // Forzar el vaciado del búfer de salida para que los comandos se muestren inmediatamente
        llvmIr.append("  call i32 @fflush(i8* null)\n");
    }

    // --- Helpers ---
    private String newTempRegister() { return "%t" + tempCounter++; }
    private String newLabel(String prefix) { return prefix + "." + labelCounter++; }
    private String getConstantStringPtr(String name, int len) {
        String ptr = newTempRegister();
        llvmIr.append("  ").append(ptr).append(" = getelementptr inbounds [").append(len).append(" x i8], [").append(len).append(" x i8]* ").append(name).append(", i64 0, i64 0\n");
        return ptr;
    }
}