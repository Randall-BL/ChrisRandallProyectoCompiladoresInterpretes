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
	 * Enter a parse tree produced by the {@code StmtVar}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtVar(VGraphParser.StmtVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtVar}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtVar(VGraphParser.StmtVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtInc}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtInc(VGraphParser.StmtIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtInc}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtInc(VGraphParser.StmtIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtTurtleMove}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTurtleMove(VGraphParser.StmtTurtleMoveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtTurtleMove}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTurtleMove(VGraphParser.StmtTurtleMoveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtTurtleTurn}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTurtleTurn(VGraphParser.StmtTurtleTurnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtTurtleTurn}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTurtleTurn(VGraphParser.StmtTurtleTurnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtTurtleState}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTurtleState(VGraphParser.StmtTurtleStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtTurtleState}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTurtleState(VGraphParser.StmtTurtleStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtTurtlePos}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtTurtlePos(VGraphParser.StmtTurtlePosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtTurtlePos}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtTurtlePos(VGraphParser.StmtTurtlePosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtEspera}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtEspera(VGraphParser.StmtEsperaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtEspera}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtEspera(VGraphParser.StmtEsperaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtHaz}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtHaz(VGraphParser.StmtHazContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtHaz}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtHaz(VGraphParser.StmtHazContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtInic}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtInic(VGraphParser.StmtInicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtInic}
	 * labeled alternative in {@link VGraphParser#varStmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtInic(VGraphParser.StmtInicContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncStmt(VGraphParser.IncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncStmt(VGraphParser.IncStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveAvanza}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 */
	void enterMoveAvanza(VGraphParser.MoveAvanzaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveAvanza}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 */
	void exitMoveAvanza(VGraphParser.MoveAvanzaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveRetrocede}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 */
	void enterMoveRetrocede(VGraphParser.MoveRetrocedeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveRetrocede}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmt}.
	 * @param ctx the parse tree
	 */
	void exitMoveRetrocede(VGraphParser.MoveRetrocedeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TurnRight}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 */
	void enterTurnRight(VGraphParser.TurnRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TurnRight}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 */
	void exitTurnRight(VGraphParser.TurnRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TurnLeft}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 */
	void enterTurnLeft(VGraphParser.TurnLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TurnLeft}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmt}.
	 * @param ctx the parse tree
	 */
	void exitTurnLeft(VGraphParser.TurnLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateHide}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void enterStateHide(VGraphParser.StateHideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateHide}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void exitStateHide(VGraphParser.StateHideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateSetColor}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void enterStateSetColor(VGraphParser.StateSetColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateSetColor}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void exitStateSetColor(VGraphParser.StateSetColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatePenDown}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void enterStatePenDown(VGraphParser.StatePenDownContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatePenDown}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void exitStatePenDown(VGraphParser.StatePenDownContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatePenUp}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void enterStatePenUp(VGraphParser.StatePenUpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatePenUp}
	 * labeled alternative in {@link VGraphParser#turtleStateStmt}.
	 * @param ctx the parse tree
	 */
	void exitStatePenUp(VGraphParser.StatePenUpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosCenter}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosCenter(VGraphParser.PosCenterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosCenter}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosCenter(VGraphParser.PosCenterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetXYBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosSetXYBrackets(VGraphParser.PosSetXYBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetXYBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosSetXYBrackets(VGraphParser.PosSetXYBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetXYNoBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosSetXYNoBrackets(VGraphParser.PosSetXYNoBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetXYNoBrackets}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosSetXYNoBrackets(VGraphParser.PosSetXYNoBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetHeading}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosSetHeading(VGraphParser.PosSetHeadingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetHeading}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosSetHeading(VGraphParser.PosSetHeadingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetX}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosSetX(VGraphParser.PosSetXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetX}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosSetX(VGraphParser.PosSetXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetY}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void enterPosSetY(VGraphParser.PosSetYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetY}
	 * labeled alternative in {@link VGraphParser#turtlePosStmt}.
	 * @param ctx the parse tree
	 */
	void exitPosSetY(VGraphParser.PosSetYContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#esperaStmt}.
	 * @param ctx the parse tree
	 */
	void enterEsperaStmt(VGraphParser.EsperaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#esperaStmt}.
	 * @param ctx the parse tree
	 */
	void exitEsperaStmt(VGraphParser.EsperaStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprRumbo}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRumbo(VGraphParser.ExprRumboContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRumbo}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRumbo(VGraphParser.ExprRumboContext ctx);
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