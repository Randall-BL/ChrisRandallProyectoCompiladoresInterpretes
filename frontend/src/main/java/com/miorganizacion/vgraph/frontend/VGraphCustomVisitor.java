package com.miorganizacion.vgraph.frontend;

public class VGraphCustomVisitor extends VGraphBaseVisitor<Void> {

    @Override
    public Void visitDrawCircle(VGraphParser.DrawCircleContext ctx) {
        String cx = ctx.expr(0).getText();
        String cy = ctx.expr(1).getText();
        String r  = ctx.expr(2).getText();
        System.out.println("[CIRCLE] Position: (" + cx + ", " + cy + ") Radius: " + r);
        return null;
    }

    @Override
    public Void visitDrawRect(VGraphParser.DrawRectContext ctx) {
        String x1 = ctx.expr(0).getText();
        String y1 = ctx.expr(1).getText();
        String x2 = ctx.expr(2).getText();
        String y2 = ctx.expr(3).getText();
        System.out.println("[RECT] From (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        return null;
    }

    @Override
    public Void visitDrawLine(VGraphParser.DrawLineContext ctx) {
        String x1 = ctx.expr(0).getText();
        String y1 = ctx.expr(1).getText();
        String x2 = ctx.expr(2).getText();
        String y2 = ctx.expr(3).getText();
        String thickness = ctx.expr(4).getText();
        System.out.println("[LINE] From (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") Thickness: " + thickness);
        return null;
    }

    @Override
    public Void visitLoopStmt(VGraphParser.LoopStmtContext ctx) {
        System.out.println("[LOOP START] Init: " + ctx.init.getText() + " Condition: " + ctx.cond.getText() + " Update: " + ctx.update.getText());
        visitChildren(ctx);
        System.out.println("[LOOP END]");
        return null;
    }

    @Override
    public Void visitAssignment(VGraphParser.AssignmentContext ctx) {
        System.out.println("[ASSIGN] " + ctx.ID().getText() + " = " + ctx.expr().getText());
        return null;
    }

    @Override
    public Void visitIfStmt(VGraphParser.IfStmtContext ctx) {
        System.out.println("[IF] Condition: " + ctx.condition().getText());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Void visitWaitStmt(VGraphParser.WaitStmtContext ctx) {
        System.out.println("[WAIT] " + ctx.expr().getText() + " ms");
        return null;
    }
}