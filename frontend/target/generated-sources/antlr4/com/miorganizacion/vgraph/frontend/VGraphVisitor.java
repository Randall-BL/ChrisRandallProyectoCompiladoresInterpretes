// Generated from com\miorganizacion\vgraph\frontend\VGraph.g4 by ANTLR 4.5.1
package com.miorganizacion.vgraph.frontend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VGraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VGraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VGraphParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(VGraphParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVarDecl(VGraphParser.StmtVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtSetColor}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSetColor(VGraphParser.StmtSetColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtDraw}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDraw(VGraphParser.StmtDrawContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFrame}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFrame(VGraphParser.StmtFrameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtLoop}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtLoop(VGraphParser.StmtLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(VGraphParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWait}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWait(VGraphParser.StmtWaitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(VGraphParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(VGraphParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(VGraphParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DrawLine}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawLine(VGraphParser.DrawLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DrawRect}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawRect(VGraphParser.DrawRectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DrawCircle}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawCircle(VGraphParser.DrawCircleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DrawPixel}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawPixel(VGraphParser.DrawPixelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#setcolorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcolorStmt(VGraphParser.SetcolorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#frameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStmt(VGraphParser.FrameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(VGraphParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(VGraphParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#waitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStmt(VGraphParser.WaitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(VGraphParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(VGraphParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColorLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorLiteral(VGraphParser.ColorLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(VGraphParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(VGraphParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(VGraphParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(VGraphParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(VGraphParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(VGraphParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(VGraphParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(VGraphParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(VGraphParser.IntLiteralContext ctx);
}