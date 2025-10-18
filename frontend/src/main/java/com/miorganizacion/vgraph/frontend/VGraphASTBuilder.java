package com.miorganizacion.vgraph.frontend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.miorganizacion.vgraph.frontend.ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import java.util.List;
import java.util.function.Consumer;

public class VGraphASTBuilder extends VGraphBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitStart(VGraphParser.StartContext ctx) {
        ProgramNode program = new ProgramNode();
        for (VGraphParser.StatementContext stmt : ctx.statement()) {
            ASTNode node = visit(stmt);
            if (node != null) {
                program.addStatement(node);
                setLocation(node, stmt);
            }
        }
        setLocation(program, ctx);
        return program;
    }

    @Override
    public ASTNode visitStmtVar(VGraphParser.StmtVarContext ctx) {
        return visit(ctx.varStmt());
    }

    @Override
    public ASTNode visitStmtInc(VGraphParser.StmtIncContext ctx) {
        return visit(ctx.incStmt());
    }

    @Override
    public ASTNode visitStmtTurtleMove(VGraphParser.StmtTurtleMoveContext ctx) {
        return visit(ctx.turtleMoveStmt());
    }

    @Override
    public ASTNode visitStmtHaz(VGraphParser.StmtHazContext ctx) {
        HazNode node = new HazNode(ctx.ID().getText(), visit(ctx.expr()));
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtInic(VGraphParser.StmtInicContext ctx) {
        // Reutilizamos AssignmentNode para 'inic', ya que es funcionalmente una asignación
        AssignmentNode node = new AssignmentNode(ctx.ID().getText(), visit(ctx.expr()));
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitIncStmt(VGraphParser.IncStmtContext ctx) {
        ASTNode byValue = ctx.expr() != null ? visit(ctx.expr()) : null;
        IncrementNode node = new IncrementNode(ctx.ID().getText(), byValue);
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitMoveAvanza(VGraphParser.MoveAvanzaContext ctx) {
        AvanzaNode node = new AvanzaNode(visit(ctx.expr()));
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitMoveRetrocede(VGraphParser.MoveRetrocedeContext ctx) {
        RetrocedeNode node = new RetrocedeNode(visit(ctx.expr()));
        setLocation(node, ctx);
        return node;
    }

    public ConditionNode visitCondition(VGraphParser.ConditionContext ctx) {
        ASTNode left  = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));
        ConditionNode node = new ConditionNode(left, ctx.op.getText(), right);
        setLocation(node, ctx);
        return node;
    }


    @Override public ASTNode visitStmtTurtleTurn(VGraphParser.StmtTurtleTurnContext ctx) { return visit(ctx.turtleTurnStmt()); }
    @Override public ASTNode visitStmtTurtleState(VGraphParser.StmtTurtleStateContext ctx) { return visit(ctx.turtleStateStmt()); }
    @Override public ASTNode visitStmtTurtlePos(VGraphParser.StmtTurtlePosContext ctx) { return visit(ctx.turtlePosStmt()); }
    @Override public ASTNode visitStmtEspera(VGraphParser.StmtEsperaContext ctx) { return visit(ctx.esperaStmt()); }

    @Override public ASTNode visitTurnRight(VGraphParser.TurnRightContext ctx) { return buildNode(new GiraDerechaNode(visit(ctx.expr())), ctx); }
    @Override public ASTNode visitTurnLeft(VGraphParser.TurnLeftContext ctx) { return buildNode(new GiraIzquierdaNode(visit(ctx.expr())), ctx); }

    @Override public ASTNode visitStateHide(VGraphParser.StateHideContext ctx) { return buildNode(new OcultaTortugaNode(), ctx); }
    @Override public ASTNode visitStateSetColor(VGraphParser.StateSetColorContext ctx) { return buildNode(new PonColorLapizNode(ctx.colorName().getText()), ctx); }
    @Override public ASTNode visitStatePenDown(VGraphParser.StatePenDownContext ctx) { return buildNode(new BajaLapizNode(), ctx); }
    @Override public ASTNode visitStatePenUp(VGraphParser.StatePenUpContext ctx) { return buildNode(new SubeLapizNode(), ctx); }

    @Override public ASTNode visitPosCenter(VGraphParser.PosCenterContext ctx) { return buildNode(new CentroNode(), ctx); }
    @Override public ASTNode visitPosSetXYBrackets(VGraphParser.PosSetXYBracketsContext ctx) { return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); }
    @Override public ASTNode visitPosSetXYNoBrackets(VGraphParser.PosSetXYNoBracketsContext ctx) { return buildNode(new PonPosNode(visit(ctx.expr(0)), visit(ctx.expr(1))), ctx); }
    @Override public ASTNode visitPosSetHeading(VGraphParser.PosSetHeadingContext ctx) { return buildNode(new PonRumboNode(visit(ctx.expr())), ctx); }
    @Override public ASTNode visitPosSetX(VGraphParser.PosSetXContext ctx) { return buildNode(new PonXNode(visit(ctx.expr())), ctx); }
    @Override public ASTNode visitPosSetY(VGraphParser.PosSetYContext ctx) { return buildNode(new PonYNode(visit(ctx.expr())), ctx); }

    @Override public ASTNode visitEsperaStmt(VGraphParser.EsperaStmtContext ctx) { return buildNode(new EsperaNode(visit(ctx.expr())), ctx); }

    @Override public ASTNode visitExprRumbo(VGraphParser.ExprRumboContext ctx) { return buildNode(new RumboNode(), ctx); }

    // Helper para reducir la repetición
    private <T extends ASTNode> T buildNode(T node, ParserRuleContext ctx) {
        setLocation(node, ctx);
        return node;
    }

    @Override public ASTNode visitParens(VGraphParser.ParensContext ctx) { return visit(ctx.expr()); }
    @Override public ASTNode visitMulDiv(VGraphParser.MulDivContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1)))); }
    @Override public ASTNode visitAddSub(VGraphParser.AddSubContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1)))); }
    @Override public ASTNode visitMod(VGraphParser.ModContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.left), visit(ctx.right))); }
    @Override public ASTNode visitVar(VGraphParser.VarContext ctx) { VarReferenceNode n = new VarReferenceNode(ctx.ID().getText()); setLocation(n, ctx); return n; }
    @Override public ASTNode visitIntLiteral(VGraphParser.IntLiteralContext ctx) { IntLiteralNode n = new IntLiteralNode(Integer.parseInt(ctx.INT().getText())); setLocation(n, ctx); return n; }

    @Override
    public ASTNode visitStmtEjecuta(VGraphParser.StmtEjecutaContext ctx) {
        return visit(ctx.ejecutaStmt());
    }

    @Override
    public ASTNode visitEjecutaStmt(VGraphParser.EjecutaStmtContext ctx) {
        EjecutaNode node = new EjecutaNode();
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addOrden(orden);
                setLocation(orden, ordenCtx);
            }
        }
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtRepite(VGraphParser.StmtRepiteContext ctx) {
        return visit(ctx.repiteStmt());
    }

    @Override
    public ASTNode visitRepiteStmt(VGraphParser.RepiteStmtContext ctx) {
        RepiteNode node = new RepiteNode(visit(ctx.expr()));
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addOrden(orden);
                setLocation(orden, ordenCtx);
            }
        }
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtSi(VGraphParser.StmtSiContext ctx) {
        return visit(ctx.siStmt());
    }

    @Override
    public ASTNode visitSiStmt(VGraphParser.SiStmtContext ctx) {
        ConditionNode condicion = visitCondition(ctx.condition());
        SiNode node = new SiNode(condicion);

        // Procesar el primer bloque [instrucciones]
        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(0).ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addInstruccionSi(orden);
                setLocation(orden, ordenCtx);
            }
        }

        // Si hay un segundo bloque [instrucciones], es el ELSE
        if (ctx.ordenList().size() > 1) {
            for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList(1).ordenSinPuntoYComa()) {
                ASTNode orden = visit(ordenCtx);
                if (orden != null) {
                    node.addInstruccionSino(orden);
                    setLocation(orden, ordenCtx);
                }
            }
        }

        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtHazHasta(VGraphParser.StmtHazHastaContext ctx) {
        return visit(ctx.hazHastaStmt());
    }

    @Override
    public ASTNode visitHazHastaStmt(VGraphParser.HazHastaStmtContext ctx) {
        ConditionNode condicion = visitCondition(ctx.condition());
        HazHastaNode node = new HazHastaNode(condicion);

        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addInstruccion(orden);
                setLocation(orden, ordenCtx);
            }
        }

        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtHasta(VGraphParser.StmtHastaContext ctx) {
        return visit(ctx.hastaStmt());
    }

    @Override
    public ASTNode visitHastaStmt(VGraphParser.HastaStmtContext ctx) {
        ConditionNode condicion = visitCondition(ctx.condition());
        HastaNode node = new HastaNode(condicion);

        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addInstruccion(orden);
                setLocation(orden, ordenCtx);
            }
        }

        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtHazMientras(VGraphParser.StmtHazMientrasContext ctx) {
        return visit(ctx.hazMientrasStmt());
    }

    @Override
    public ASTNode visitHazMientrasStmt(VGraphParser.HazMientrasStmtContext ctx) {
        ConditionNode condicion = visitCondition(ctx.condition());
        HazMientrasNode node = new HazMientrasNode(condicion);

        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addInstruccion(orden);
                setLocation(orden, ordenCtx);
            }
        }

        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitStmtMientras(VGraphParser.StmtMientrasContext ctx) {
        return visit(ctx.mientrasStmt());
    }

    @Override
    public ASTNode visitMientrasStmt(VGraphParser.MientrasStmtContext ctx) {
        ConditionNode condicion = visitCondition(ctx.condition());
        MientrasNode node = new MientrasNode(condicion);

        for (VGraphParser.OrdenSinPuntoYComaContext ordenCtx : ctx.ordenList().ordenSinPuntoYComa()) {
            ASTNode orden = visit(ordenCtx);
            if (orden != null) {
                node.addInstruccion(orden);
                setLocation(orden, ordenCtx);
            }
        }

        setLocation(node, ctx);
        return node;
    }
    @Override
    public ASTNode visitStmtExpr(VGraphParser.StmtExprContext ctx) {
        return visit(ctx.expr());
    }
    @Override
    public ASTNode visitProducto(VGraphParser.ProductoContext ctx) {
        ProductoNode node = new ProductoNode();
        for (VGraphParser.ExprContext exprCtx : ctx.expr()) {
            node.addOperando(visit(exprCtx));
        }
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitSuma(VGraphParser.SumaContext ctx) {
        SumaNode node = new SumaNode();
        for (VGraphParser.ExprContext exprCtx : ctx.expr()) {
            node.addOperando(visit(exprCtx));
        }
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitPotencia(VGraphParser.PotenciaContext ctx) {
        PotenciaNode node = new PotenciaNode(visit(ctx.expr(0)), visit(ctx.expr(1)));
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitDivision(VGraphParser.DivisionContext ctx) {
        DivisionNode node = new DivisionNode(visit(ctx.expr(0)), visit(ctx.expr(1)));
        setLocation(node, ctx);
        return node;
    }

    // Helpers
    private <T extends ASTNode> T binOp(ParserRuleContext ctx, T node) { setLocation(node, ctx); return node; }
    private void addStatements(List<VGraphParser.StatementContext> stmts, Consumer<ASTNode> adder) {
        for (VGraphParser.StatementContext stmtCtx : stmts) {
            ASTNode stmt = visit(stmtCtx);
            if (stmt != null) {
                adder.accept(stmt);
                setLocation(stmt, stmtCtx);
            }
        }
    }
    private void setLocation(ASTNode node, ParserRuleContext ctx) {
        Token t = ctx.getStart(); node.setLocation(t.getLine(), t.getCharPositionInLine());
    }
}
