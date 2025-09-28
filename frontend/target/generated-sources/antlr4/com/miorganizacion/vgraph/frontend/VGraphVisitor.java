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
	 * Visit a parse tree produced by the {@code StmtVar}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtVar(VGraphParser.StmtVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtInc}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtInc(VGraphParser.StmtIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtTurtleMove}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTurtleMove(VGraphParser.StmtTurtleMoveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtTurtleTurn}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTurtleTurn(VGraphParser.StmtTurtleTurnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtTurtleState}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTurtleState(VGraphParser.StmtTurtleStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtTurtlePos}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtTurtlePos(VGraphParser.StmtTurtlePosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtEspera}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtEspera(VGraphParser.StmtEsperaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtHaz}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHaz(VGraphParser.StmtHazContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtInic}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtInic(VGraphParser.StmtInicContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#incStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncStmt(VGraphParser.IncStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveAvanza}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveAvanza(VGraphParser.MoveAvanzaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveRetrocede}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRetrocede(VGraphParser.MoveRetrocedeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TurnRight}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnRight(VGraphParser.TurnRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TurnLeft}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnLeft(VGraphParser.TurnLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateHide}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateHide(VGraphParser.StateHideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateSetColor}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSetColor(VGraphParser.StateSetColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatePenDown}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatePenDown(VGraphParser.StatePenDownContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatePenUp}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatePenUp(VGraphParser.StatePenUpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosCenter}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosCenter(VGraphParser.PosCenterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetXYBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetXYBrackets(VGraphParser.PosSetXYBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetXYNoBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetXYNoBrackets(VGraphParser.PosSetXYNoBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetHeading}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetHeading(VGraphParser.PosSetHeadingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetX}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetX(VGraphParser.PosSetXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetY}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetY(VGraphParser.PosSetYContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#esperaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperaStmt(VGraphParser.EsperaStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(VGraphParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRumbo}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRumbo(VGraphParser.ExprRumboContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(VGraphParser.IntLiteralContext ctx);
}