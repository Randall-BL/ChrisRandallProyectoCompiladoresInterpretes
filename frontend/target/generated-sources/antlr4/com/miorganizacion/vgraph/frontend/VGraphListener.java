// Generated from com\miorganizacion\vgraph\frontend\VGraph.g4 by ANTLR 4.5.1
package com.miorganizacion.vgraph.frontend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VGraphParser}.
 */
public interface VGraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VGraphParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(VGraphParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(VGraphParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarDecl(VGraphParser.StmtVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtVarDecl}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarDecl(VGraphParser.StmtVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSetColor}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSetColor(VGraphParser.StmtSetColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSetColor}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSetColor(VGraphParser.StmtSetColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtDraw}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDraw(VGraphParser.StmtDrawContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtDraw}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDraw(VGraphParser.StmtDrawContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFrame}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFrame(VGraphParser.StmtFrameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFrame}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFrame(VGraphParser.StmtFrameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtLoop}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtLoop(VGraphParser.StmtLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtLoop}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtLoop(VGraphParser.StmtLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(VGraphParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(VGraphParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWait}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWait(VGraphParser.StmtWaitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWait}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWait(VGraphParser.StmtWaitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(VGraphParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(VGraphParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(VGraphParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(VGraphParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VGraphParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VGraphParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawLine}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawLine(VGraphParser.DrawLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawLine}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawLine(VGraphParser.DrawLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawRect}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawRect(VGraphParser.DrawRectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawRect}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawRect(VGraphParser.DrawRectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawCircle}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawCircle(VGraphParser.DrawCircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawCircle}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawCircle(VGraphParser.DrawCircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawPixel}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void enterDrawPixel(VGraphParser.DrawPixelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawPixel}
	 * labeled alternative in {@link VGraphParser#drawStmt}.
	 * @param ctx the parse tree
	 */
	void exitDrawPixel(VGraphParser.DrawPixelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#setcolorStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetcolorStmt(VGraphParser.SetcolorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#setcolorStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetcolorStmt(VGraphParser.SetcolorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#frameStmt}.
	 * @param ctx the parse tree
	 */
	void enterFrameStmt(VGraphParser.FrameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#frameStmt}.
	 * @param ctx the parse tree
	 */
	void exitFrameStmt(VGraphParser.FrameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(VGraphParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(VGraphParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(VGraphParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(VGraphParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#waitStmt}.
	 * @param ctx the parse tree
	 */
	void enterWaitStmt(VGraphParser.WaitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#waitStmt}.
	 * @param ctx the parse tree
	 */
	void exitWaitStmt(VGraphParser.WaitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(VGraphParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(VGraphParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(VGraphParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(VGraphParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterColorLiteral(VGraphParser.ColorLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitColorLiteral(VGraphParser.ColorLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(VGraphParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(VGraphParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(VGraphParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(VGraphParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(VGraphParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(VGraphParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(VGraphParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(VGraphParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCos(VGraphParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCos(VGraphParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(VGraphParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(VGraphParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(VGraphParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(VGraphParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSin(VGraphParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSin(VGraphParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(VGraphParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(VGraphParser.IntLiteralContext ctx);
}