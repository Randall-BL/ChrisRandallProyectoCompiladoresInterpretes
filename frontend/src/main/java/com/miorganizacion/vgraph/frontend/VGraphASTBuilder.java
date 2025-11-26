package com.miorganizacion.vgraph.frontend;

import com.miorganizacion.vgraph.frontend.ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import java.util.List;
import java.util.function.Consumer;

public class VGraphASTBuilder extends VGraphBaseVisitor<ASTNode> {

    // --- Métodos Principales (Start y Despachadores) ---

    @Override
    public ASTNode visitStart(VGraphParser.StartContext ctx) {
        ProgramNode program = new ProgramNode();
        for (VGraphParser.StatementContext stmt : ctx.statement()) {
            ASTNode node = visit(stmt);
            if (node != null) {
                program.addStatement(node);
            }
        }
        return buildNode(program, ctx);
    }

    @Override
    public ASTNode visitStmtVar(VGraphParser.StmtVarContext ctx){
        return visit(ctx.varStmt());
    }

    @Override
    public ASTNode visitStmtInc(VGraphParser.StmtIncContext ctx){
        return visit(ctx.incStmt());
    }
    
    @Override 
    public ASTNode visitStmtTurtleMove(VGraphParser.StmtTurtleMoveContext ctx) { 
        return visit(ctx.turtleMoveStmt()); 
    }

    @Override 
    public ASTNode visitStmtTurtleTurn(VGraphParser.StmtTurtleTurnContext ctx) { 
        return visit(ctx.turtleTurnStmt()); 
    }

    @Override 
    public ASTNode visitStmtTurtleState(VGraphParser.StmtTurtleStateContext ctx) { 
        return visit(ctx.turtleStateStmt()); 
    }

    @Override 
    public ASTNode visitStmtTurtlePos(VGraphParser.StmtTurtlePosContext ctx) { 
        return visit(ctx.turtlePosStmt()); 
    }

    @Override 
    public ASTNode visitStmtEspera(VGraphParser.StmtEsperaContext ctx) { 
        return visit(ctx.esperaStmt()); 
    }

    @Override 
    public ASTNode visitStmtEjecuta(VGraphParser.StmtEjecutaContext ctx) { 
        return visit(ctx.ejecutaStmt()); 
    }

    @Override 
    public ASTNode visitStmtRepite(VGraphParser.StmtRepiteContext ctx) { 
        return visit(ctx.repiteStmt()); 
    }

    @Override 
    public ASTNode visitStmtSi(VGraphParser.StmtSiContext ctx) { 
        return visit(ctx.siStmt()); 
    }

    @Override 
    public ASTNode visitStmtHazHasta(VGraphParser.StmtHazHastaContext ctx) { 
        return visit(ctx.hazHastaStmt()); 
    }

    @Override 
    public ASTNode visitStmtHasta(VGraphParser.StmtHastaContext ctx) { 
        return visit(ctx.hastaStmt()); 
    }

    @Override 
    public ASTNode visitStmtHazMientras(VGraphParser.StmtHazMientrasContext ctx) { 
        return visit(ctx.hazMientrasStmt()); 
    }

    @Override 
    public ASTNode visitStmtMientras(VGraphParser.StmtMientrasContext ctx) { 
        return visit(ctx.mientrasStmt()); 
    }

    @Override 
    public ASTNode visitStmtExpr(VGraphParser.StmtExprContext ctx) { 
        return visit(ctx.expr()); 
    }


    @Override
    public ASTNode visitCondition(VGraphParser.ConditionContext ctx) {
     
        return visit(ctx.expr());
    }

    // --- Métodos para Estructuras de Control ---

    @Override
    public ASTNode visitSiStmt(VGraphParser.SiStmtContext ctx) {
        ASTNode condicion = visit(ctx.condition()); // Corregido
        SiNode node = new SiNode(condicion);
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(0).ordenSinPuntoYComa()) {
            node.addInstruccionSi(visit(ordenCtx));
        }
        if (ctx.ordenList().size() > 1) {
            for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(1).ordenSinPuntoYComa()) {
                node.addInstruccionSino(visit(ordenCtx));
            }
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitRepiteStmt(VGraphParser.RepiteStmtContext ctx) {
        RepiteNode node = new RepiteNode(visit(ctx.expr()));
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addOrden(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitEjecutaStmt(VGraphParser.EjecutaStmtContext ctx) {
        EjecutaNode node = new EjecutaNode();
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addOrden(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitMientrasStmt(VGraphParser.MientrasStmtContext ctx) {
        ASTNode condicion = visit(ctx.condition()); // Corregido
        MientrasNode node = new MientrasNode(condicion);
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addInstruccion(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitHastaStmt(VGraphParser.HastaStmtContext ctx) {
        ASTNode condicion = visit(ctx.condition()); // Corregido
        HastaNode node = new HastaNode(condicion);
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addInstruccion(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitHazMientrasStmt(VGraphParser.HazMientrasStmtContext ctx) {
        ASTNode condicion = visit(ctx.condition()); // Corregido
        HazMientrasNode node = new HazMientrasNode(condicion);
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addInstruccion(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    @Override
    public ASTNode visitHazHastaStmt(VGraphParser.HazHastaStmtContext ctx) {
        ASTNode condicion = visit(ctx.condition()); // Corregido
        HazHastaNode node = new HazHastaNode(condicion);
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            node.addInstruccion(visit(ordenCtx));
        }
        return buildNode(node, ctx);
    }

    // --- Métodos para Expresiones y Literales ---

    @Override 
    public ASTNode visitStmtHaz(VGraphParser.StmtHazContext ctx) { 
        return buildNode(new HazNode(ctx.ID().getText(), visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitStmtInic(VGraphParser.StmtInicContext ctx) { 
        return buildNode(new AssignmentNode(ctx.ID().getText(), visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitIncStmt(VGraphParser.IncStmtContext ctx) { 
        return buildNode(new IncrementNode(ctx.ID().getText(), ctx.expr() != null ? visit(ctx.expr()) : null), ctx); 
    }

    @Override 
    public ASTNode visitParens(VGraphParser.ParensContext ctx) { 
        return visit(ctx.expr()); 
    }

    @Override 
    public ASTNode visitVar(VGraphParser.VarContext ctx) { 
        return buildNode(new VarReferenceNode(ctx.ID().getText()), ctx); 
    }

    @Override 
    public ASTNode visitIntLiteral(VGraphParser.IntLiteralContext ctx) { 
        return buildNode(new IntLiteralNode(Integer.parseInt(ctx.INT().getText())), ctx); 
    }

    @Override 
    public ASTNode visitExprRumbo(VGraphParser.ExprRumboContext ctx) { 
        return buildNode(new RumboNode(), ctx); 
    }

    @Override 
    public ASTNode visitMulDiv(VGraphParser.MulDivContext ctx) { 
        return buildNode(new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitAddSub(VGraphParser.AddSubContext ctx) { 
        return buildNode(new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitMod(VGraphParser.ModContext ctx) { 
        return buildNode(new BinaryOpNode(ctx.op.getText(), visit(ctx.left), visit(ctx.right)), ctx); 
    }

    @Override 
    public ASTNode visitIguales(VGraphParser.IgualesContext ctx) { 
        return buildNode(new IgualesNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitMayorque(VGraphParser.MayorqueContext ctx) { 
        return buildNode(new MayorQueNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitMenorque(VGraphParser.MenorqueContext ctx) { 
        return buildNode(new MenorQueNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitYLogico(VGraphParser.YLogicoContext ctx) { 
        return buildNode(new YLogicoNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitOLogico(VGraphParser.OLogicoContext ctx) { 
        return buildNode(new OLogicoNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitPotencia(VGraphParser.PotenciaContext ctx) { 
        return buildNode(new PotenciaNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitDivision(VGraphParser.DivisionContext ctx) { 
        return buildNode(new DivisionNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitAzar(VGraphParser.AzarContext ctx) { 
        return buildNode(new AzarNode(visit(ctx.expr())), ctx); 
    }


    @Override
    public ASTNode visitProducto(VGraphParser.ProductoContext ctx) {
        ProductoNode node = new ProductoNode();
        for (VGraphParser.ExprContext exprCtx : ctx.expr()) node.addOperando(visit(exprCtx));
        return buildNode(node, ctx);
    }
    @Override
    public ASTNode visitSuma(VGraphParser.SumaContext ctx) {
        SumaNode node = new SumaNode();
        for (VGraphParser.ExprContext exprCtx : ctx.expr()) node.addOperando(visit(exprCtx));
        return buildNode(node, ctx);
    }
    @Override
    public ASTNode visitDiferencia(VGraphParser.DiferenciaContext ctx) {
        DiferenciaNode node = new DiferenciaNode();
        for (VGraphParser.ExprContext exprCtx : ctx.expr()) node.addOperando(visit(exprCtx));
        return buildNode(node, ctx);
    }

    // En VGraphASTBuilder.java, AÑADE ESTOS MÉTODOS NUEVOS

@Override
public ASTNode visitSiSinPC(VGraphParser.SiSinPCContext ctx) {
    ASTNode condicion = visit(ctx.condition());
    SiNode node = new SiNode(condicion);
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(0).ordenSinPuntoYComa()) {
        node.addInstruccionSi(visit(ordenCtx));
    }
    if (ctx.ordenList().size() > 1) {
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(1).ordenSinPuntoYComa()) {
            node.addInstruccionSino(visit(ordenCtx));
        }
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitRepiteSinPC(VGraphParser.RepiteSinPCContext ctx) {
    RepiteNode node = new RepiteNode(visit(ctx.expr()));
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
        node.addOrden(visit(ordenCtx));
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitMientrasSinPC(VGraphParser.MientrasSinPCContext ctx) {
    ASTNode condicion = visit(ctx.condition());
    MientrasNode node = new MientrasNode(condicion);
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
        node.addInstruccion(visit(ordenCtx));
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitHastaSinPC(VGraphParser.HastaSinPCContext ctx) {
    ASTNode condicion = visit(ctx.condition());
    HastaNode node = new HastaNode(condicion);
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
        node.addInstruccion(visit(ordenCtx));
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitHazMientrasSinPC(VGraphParser.HazMientrasSinPCContext ctx) {
    ASTNode condicion = visit(ctx.condition());
    HazMientrasNode node = new HazMientrasNode(condicion);
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
        node.addInstruccion(visit(ordenCtx));
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitHazHastaSinPC(VGraphParser.HazHastaSinPCContext ctx) {
    ASTNode condicion = visit(ctx.condition());
    HazHastaNode node = new HazHastaNode(condicion);
    for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
        node.addInstruccion(visit(ordenCtx));
    }
    return buildNode(node, ctx);
}

@Override
public ASTNode visitCompExpr(VGraphParser.CompExprContext ctx) {
    // Este método maneja las comparaciones infijas como 'i < estrellas'
    ASTNode left = visit(ctx.expr(0));
    ASTNode right = visit(ctx.expr(1));
    String operator = ctx.COMP_OP().getText();
    return buildNode(new ConditionNode(left, operator, right), ctx);
}

@Override
public ASTNode visitEsperaSinPC(VGraphParser.EsperaSinPCContext ctx) {
    return buildNode(new EsperaNode(visit(ctx.expr())), ctx);
}

    // --- Métodos para Comandos Con Punto y Coma ---
    @Override 
    public ASTNode visitMoveAvanza(VGraphParser.MoveAvanzaContext ctx) { 
        return buildNode(new AvanzaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitMoveRetrocede(VGraphParser.MoveRetrocedeContext ctx) { 
        return buildNode(new RetrocedeNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitTurnRight(VGraphParser.TurnRightContext ctx) { 
        return buildNode(new GiraDerechaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitTurnLeft(VGraphParser.TurnLeftContext ctx) { 
        return buildNode(new GiraIzquierdaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitStateHide(VGraphParser.StateHideContext ctx) { 
        return buildNode(new OcultaTortugaNode(), ctx); 
    }

    @Override 
    public ASTNode visitStateSetColor(VGraphParser.StateSetColorContext ctx) { 
        return buildNode(new PonColorLapizNode(ctx.colorName().getText()), ctx); 
    }

    @Override 
    public ASTNode visitStatePenDown(VGraphParser.StatePenDownContext ctx) { 
        return buildNode(new BajaLapizNode(), ctx); 
    }

    @Override 
    public ASTNode visitStatePenUp(VGraphParser.StatePenUpContext ctx) { 
        return buildNode(new SubeLapizNode(), ctx); 
    }

    @Override 
    public ASTNode visitPosCenter(VGraphParser.PosCenterContext ctx) { 
        return buildNode(new CentroNode(), ctx); 
    }

    @Override 
    public ASTNode visitPosSetXYBrackets(VGraphParser.PosSetXYBracketsContext ctx) { 
        return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitPosSetXYNoBrackets(VGraphParser.PosSetXYNoBracketsContext ctx) { 
        return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitPosSetHeading(VGraphParser.PosSetHeadingContext ctx) { 
        return buildNode(new PonRumboNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitPosSetX(VGraphParser.PosSetXContext ctx) { 
        return buildNode(new PonXNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitPosSetY(VGraphParser.PosSetYContext ctx) { 
        return buildNode(new PonYNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitEsperaStmt(VGraphParser.EsperaStmtContext ctx) { 
        return buildNode(new EsperaNode(visit(ctx.expr())), ctx); 
    }


    // --- Métodos para Comandos Sin Punto y Coma ---
    @Override
    public ASTNode visitIncSinPC(VGraphParser.IncSinPCContext ctx) { // <-- NEW NAME
        ASTNode byValue = ctx.expr() != null ? visit(ctx.expr()) : null;
        IncrementNode node = new IncrementNode(ctx.ID().getText(), byValue);
        return buildNode(node, ctx); // Using your helper method for consistency
    }

    @Override 
    public ASTNode visitMoveAvanzaSinPC(VGraphParser.MoveAvanzaSinPCContext ctx) { 
        return buildNode(new AvanzaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitMoveRetrocedeSinPC(VGraphParser.MoveRetrocedeSinPCContext ctx) { 
        return buildNode(new RetrocedeNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitTurnRightSinPC(VGraphParser.TurnRightSinPCContext ctx) { 
        return buildNode(new GiraDerechaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitTurnLeftSinPC(VGraphParser.TurnLeftSinPCContext ctx) { 
        return buildNode(new GiraIzquierdaNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitStateHideSinPC(VGraphParser.StateHideSinPCContext ctx) { 
        return buildNode(new OcultaTortugaNode(), ctx); 
    }

    @Override 
    public ASTNode visitStateSetColorSinPC(VGraphParser.StateSetColorSinPCContext ctx) { 
        return buildNode(new PonColorLapizNode(ctx.colorName().getText()), ctx); 
    }

    @Override 
    public ASTNode visitStatePenDownSinPC(VGraphParser.StatePenDownSinPCContext ctx) { 
        return buildNode(new BajaLapizNode(), ctx); 
    }

    @Override 
    public ASTNode visitStatePenUpSinPC(VGraphParser.StatePenUpSinPCContext ctx) { 
        return buildNode(new SubeLapizNode(), ctx); 
    }

    @Override 
    public ASTNode visitPosCenterSinPC(VGraphParser.PosCenterSinPCContext ctx) { 
        return buildNode(new CentroNode(), ctx); 
    }

    @Override 
    public ASTNode visitPosSetXYBracketsSinPC(VGraphParser.PosSetXYBracketsSinPCContext ctx) { 
        return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitPosSetXYNoBracketsSinPC(VGraphParser.PosSetXYNoBracketsSinPCContext ctx) { 
        return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); 
    }

    @Override 
    public ASTNode visitPosSetHeadingSinPC(VGraphParser.PosSetHeadingSinPCContext ctx) { 
        return buildNode(new PonRumboNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitPosSetXSinPC(VGraphParser.PosSetXSinPCContext ctx) { 
        return buildNode(new PonXNode(visit(ctx.expr())), ctx); 
    }

    @Override 
    public ASTNode visitPosSetYSinPC(VGraphParser.PosSetYSinPCContext ctx) { 
        return buildNode(new PonYNode(visit(ctx.expr())), ctx); 
    }


    // --- Helpers ---
    private <T extends ASTNode> T buildNode(T node, ParserRuleContext ctx) {
        Token t = ctx.getStart();
        node.setLocation(t.getLine(), t.getCharPositionInLine());
        return node;
    }
}