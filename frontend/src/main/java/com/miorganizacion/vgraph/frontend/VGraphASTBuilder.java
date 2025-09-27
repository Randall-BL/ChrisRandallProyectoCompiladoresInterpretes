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
    public ASTNode visitStmtVarDecl(VGraphParser.StmtVarDeclContext ctx) {
        return visit(ctx.varDeclaration());
    }

    @Override
    public ASTNode visitStmtSetColor(VGraphParser.StmtSetColorContext ctx) {
        return visit(ctx.setcolorStmt());
    }

    @Override
    public ASTNode visitStmtDraw(VGraphParser.StmtDrawContext ctx) {
        return visit(ctx.drawStmt());
    }

    @Override
    public ASTNode visitStmtFrame(VGraphParser.StmtFrameContext ctx) {
        return visit(ctx.frameStmt());
    }

    @Override
    public ASTNode visitStmtLoop(VGraphParser.StmtLoopContext ctx) {
        return visit(ctx.loopStmt());
    }

    @Override
    public ASTNode visitStmtIf(VGraphParser.StmtIfContext ctx) {
        return visit(ctx.ifStmt());
    }

    @Override
    public ASTNode visitStmtWait(VGraphParser.StmtWaitContext ctx) {
        return visit(ctx.waitStmt());
    }

    @Override
    public ASTNode visitStmtAssign(VGraphParser.StmtAssignContext ctx) {
        return visit(ctx.assignment());
    }

    @Override
    public ASTNode visitVarDeclaration(VGraphParser.VarDeclarationContext ctx) {
        ASTNode init = ctx.expr() != null ? visit(ctx.expr()) : null;
        VarDeclarationNode node = new VarDeclarationNode(
            ctx.type().getText(),
            ctx.ID().getText(),
            init
        );
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitSetcolorStmt(VGraphParser.SetcolorStmtContext ctx) {
        SetColorNode node = new SetColorNode(visit(ctx.expr()));
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitDrawLine(VGraphParser.DrawLineContext ctx) {
        DrawLineNode node = new DrawLineNode(
            visit(ctx.expr(0)),
            visit(ctx.expr(1)),
            visit(ctx.expr(2)),
            visit(ctx.expr(3))
        );
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitDrawRect(VGraphParser.DrawRectContext ctx) {
        DrawRectNode node = new DrawRectNode(
            visit(ctx.expr(0)),
            visit(ctx.expr(1)),
            visit(ctx.expr(2)),
            visit(ctx.expr(3))
        );
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitDrawCircle(VGraphParser.DrawCircleContext ctx) {
        DrawCircleNode node = new DrawCircleNode(
            visit(ctx.expr(0)),
            visit(ctx.expr(1)),
            visit(ctx.expr(2))
        );
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitDrawPixel(VGraphParser.DrawPixelContext ctx) {
        PixelNode node = new PixelNode(
            visit(ctx.expr(0)),
            visit(ctx.expr(1))
        );
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitFrameStmt(VGraphParser.FrameStmtContext ctx) {
        FrameNode node = new FrameNode();
        addStatements(ctx.statement(), node::addStatement);
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitLoopStmt(VGraphParser.LoopStmtContext ctx) {
        LoopNode loop = new LoopNode();
        ASTNode init   = visit(ctx.init);
        ASTNode cond   = visitCondition(ctx.cond);
        ASTNode update = visit(ctx.update);
        loop.setInitialization(init);
        loop.setCondition(cond);
        loop.setUpdate(update);
        setLocation(init,   ctx.init);
        setLocation(cond,   ctx.cond);
        setLocation(update, ctx.update);

        addStatements(ctx.statement(), loop::addStatement);
        setLocation(loop, ctx);
        return loop;
    }
    
    @Override
    public ASTNode visitWaitStmt(VGraphParser.WaitStmtContext ctx) {
        ASTNode duration = visit(ctx.expr());
        WaitNode node = new WaitNode(duration);
        setLocation(node, ctx);
        return node;
    }

    @Override
    public ASTNode visitIfStmt(VGraphParser.IfStmtContext ctx) {
        // Crear nodos THEN y ELSE como BlockNode locales
        ConditionNode condNode = visitCondition(ctx.cond);
        BlockNode thenBlock = new BlockNode();
        BlockNode elseBlock = ctx.getToken(VGraphParser.ELSE, 0) != null ? new BlockNode() : null;

        // Construir el IfNode con bloques concretos
        IfNode ifNode = new IfNode(condNode, thenBlock, elseBlock);

        // Distribuir statements en thenBlock/elseBlock
        int total = ctx.statement().size();
        int split = elseBlock != null ? total / 2 : total;
        for (int i = 0; i < split; i++) {
            ASTNode stmt = visit(ctx.statement(i));
            thenBlock.addStatement(stmt);
            setLocation(stmt, ctx.statement(i));
        }
        if (elseBlock != null) {
            for (int i = split; i < total; i++) {
                ASTNode stmt = visit(ctx.statement(i));
                elseBlock.addStatement(stmt);
                setLocation(stmt, ctx.statement(i));
            }
        }

        setLocation(ifNode, ctx);
        return ifNode;
    }

    @Override
    public ASTNode visitAssignment(VGraphParser.AssignmentContext ctx) {
        AssignmentNode node = new AssignmentNode(
            ctx.ID().getText(),
            visit(ctx.expr())
        );
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

    @Override public ASTNode visitParens(VGraphParser.ParensContext ctx) { return visit(ctx.expr()); }
    @Override public ASTNode visitCos(VGraphParser.CosContext ctx) { FunctionCallNode n = new FunctionCallNode("cos", visit(ctx.expr())); setLocation(n, ctx); return n; }
    @Override public ASTNode visitSin(VGraphParser.SinContext ctx) { FunctionCallNode n = new FunctionCallNode("sin", visit(ctx.expr())); setLocation(n, ctx); return n; }
    @Override public ASTNode visitMulDiv(VGraphParser.MulDivContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1)))); }
    @Override public ASTNode visitAddSub(VGraphParser.AddSubContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1)))); }
    @Override public ASTNode visitMod(VGraphParser.ModContext ctx) { return binOp(ctx, new BinaryOpNode(ctx.op.getText(), visit(ctx.left), visit(ctx.right))); }
    @Override public ASTNode visitVar(VGraphParser.VarContext ctx) { VarReferenceNode n = new VarReferenceNode(ctx.ID().getText()); setLocation(n, ctx); return n; }
    @Override public ASTNode visitIntLiteral(VGraphParser.IntLiteralContext ctx) { IntLiteralNode n = new IntLiteralNode(Integer.parseInt(ctx.INT().getText())); setLocation(n, ctx); return n; }
    @Override public ASTNode visitFloatLiteral(VGraphParser.FloatLiteralContext ctx) { FloatLiteralNode n = new FloatLiteralNode(Double.parseDouble(ctx.FLOAT().getText())); setLocation(n, ctx); return n; }
    @Override public ASTNode visitColorLiteral(VGraphParser.ColorLiteralContext ctx) { ColorLiteralNode n = new ColorLiteralNode(ctx.COLOR_LITERAL().getText()); setLocation(n, ctx); return n; }

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
