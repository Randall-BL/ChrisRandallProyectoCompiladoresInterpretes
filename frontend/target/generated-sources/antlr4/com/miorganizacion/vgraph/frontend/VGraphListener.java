// Generated from com/miorganizacion/vgraph/frontend/VGraph.g4 by ANTLR 4.13.2
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
	 * Enter a parse tree produced by the {@code StmtEjecuta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtEjecuta(VGraphParser.StmtEjecutaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtEjecuta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtEjecuta(VGraphParser.StmtEjecutaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtRepite}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtRepite(VGraphParser.StmtRepiteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtRepite}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtRepite(VGraphParser.StmtRepiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSi}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSi(VGraphParser.StmtSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSi}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSi(VGraphParser.StmtSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtHazHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtHazHasta(VGraphParser.StmtHazHastaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtHazHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtHazHasta(VGraphParser.StmtHazHastaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtHasta(VGraphParser.StmtHastaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtHasta(VGraphParser.StmtHastaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtHazMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtHazMientras(VGraphParser.StmtHazMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtHazMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtHazMientras(VGraphParser.StmtHazMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtMientras(VGraphParser.StmtMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtMientras(VGraphParser.StmtMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(VGraphParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(VGraphParser.StmtExprContext ctx);
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
	 * Enter a parse tree produced by {@link VGraphParser#hastaStmt}.
	 * @param ctx the parse tree
	 */
	void enterHastaStmt(VGraphParser.HastaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#hastaStmt}.
	 * @param ctx the parse tree
	 */
	void exitHastaStmt(VGraphParser.HastaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#hazMientrasStmt}.
	 * @param ctx the parse tree
	 */
	void enterHazMientrasStmt(VGraphParser.HazMientrasStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#hazMientrasStmt}.
	 * @param ctx the parse tree
	 */
	void exitHazMientrasStmt(VGraphParser.HazMientrasStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#mientrasStmt}.
	 * @param ctx the parse tree
	 */
	void enterMientrasStmt(VGraphParser.MientrasStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#mientrasStmt}.
	 * @param ctx the parse tree
	 */
	void exitMientrasStmt(VGraphParser.MientrasStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#repiteStmt}.
	 * @param ctx the parse tree
	 */
	void enterRepiteStmt(VGraphParser.RepiteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#repiteStmt}.
	 * @param ctx the parse tree
	 */
	void exitRepiteStmt(VGraphParser.RepiteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#ejecutaStmt}.
	 * @param ctx the parse tree
	 */
	void enterEjecutaStmt(VGraphParser.EjecutaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#ejecutaStmt}.
	 * @param ctx the parse tree
	 */
	void exitEjecutaStmt(VGraphParser.EjecutaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#ordenList}.
	 * @param ctx the parse tree
	 */
	void enterOrdenList(VGraphParser.OrdenListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#ordenList}.
	 * @param ctx the parse tree
	 */
	void exitOrdenList(VGraphParser.OrdenListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#ordenSinPuntoYComa}.
	 * @param ctx the parse tree
	 */
	void enterOrdenSinPuntoYComa(VGraphParser.OrdenSinPuntoYComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#ordenSinPuntoYComa}.
	 * @param ctx the parse tree
	 */
	void exitOrdenSinPuntoYComa(VGraphParser.OrdenSinPuntoYComaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveAvanzaSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterMoveAvanzaSinPC(VGraphParser.MoveAvanzaSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveAvanzaSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitMoveAvanzaSinPC(VGraphParser.MoveAvanzaSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoveRetrocedeSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterMoveRetrocedeSinPC(VGraphParser.MoveRetrocedeSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoveRetrocedeSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitMoveRetrocedeSinPC(VGraphParser.MoveRetrocedeSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TurnRightSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterTurnRightSinPC(VGraphParser.TurnRightSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TurnRightSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitTurnRightSinPC(VGraphParser.TurnRightSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TurnLeftSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterTurnLeftSinPC(VGraphParser.TurnLeftSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TurnLeftSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitTurnLeftSinPC(VGraphParser.TurnLeftSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateHideSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterStateHideSinPC(VGraphParser.StateHideSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateHideSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitStateHideSinPC(VGraphParser.StateHideSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StateSetColorSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterStateSetColorSinPC(VGraphParser.StateSetColorSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StateSetColorSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitStateSetColorSinPC(VGraphParser.StateSetColorSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatePenDownSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterStatePenDownSinPC(VGraphParser.StatePenDownSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatePenDownSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitStatePenDownSinPC(VGraphParser.StatePenDownSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatePenUpSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterStatePenUpSinPC(VGraphParser.StatePenUpSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatePenUpSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitStatePenUpSinPC(VGraphParser.StatePenUpSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosCenterSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosCenterSinPC(VGraphParser.PosCenterSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosCenterSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosCenterSinPC(VGraphParser.PosCenterSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetXYBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosSetXYBracketsSinPC(VGraphParser.PosSetXYBracketsSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetXYBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosSetXYBracketsSinPC(VGraphParser.PosSetXYBracketsSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetXYNoBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosSetXYNoBracketsSinPC(VGraphParser.PosSetXYNoBracketsSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetXYNoBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosSetXYNoBracketsSinPC(VGraphParser.PosSetXYNoBracketsSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetHeadingSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosSetHeadingSinPC(VGraphParser.PosSetHeadingSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetHeadingSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosSetHeadingSinPC(VGraphParser.PosSetHeadingSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetXSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosSetXSinPC(VGraphParser.PosSetXSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetXSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosSetXSinPC(VGraphParser.PosSetXSinPCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PosSetYSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterPosSetYSinPC(VGraphParser.PosSetYSinPCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PosSetYSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitPosSetYSinPC(VGraphParser.PosSetYSinPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#esperaStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterEsperaStmtSinPC(VGraphParser.EsperaStmtSinPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#esperaStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitEsperaStmtSinPC(VGraphParser.EsperaStmtSinPCContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#siStmt}.
	 * @param ctx the parse tree
	 */
	void enterSiStmt(VGraphParser.SiStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#siStmt}.
	 * @param ctx the parse tree
	 */
	void exitSiStmt(VGraphParser.SiStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#hazHastaStmt}.
	 * @param ctx the parse tree
	 */
	void enterHazHastaStmt(VGraphParser.HazHastaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#hazHastaStmt}.
	 * @param ctx the parse tree
	 */
	void exitHazHastaStmt(VGraphParser.HazHastaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#siSinPuntoYComa}.
	 * @param ctx the parse tree
	 */
	void enterSiSinPuntoYComa(VGraphParser.SiSinPuntoYComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#siSinPuntoYComa}.
	 * @param ctx the parse tree
	 */
	void exitSiSinPuntoYComa(VGraphParser.SiSinPuntoYComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VGraphParser#incStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void enterIncStmtSinPC(VGraphParser.IncStmtSinPCContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#incStmtSinPC}.
	 * @param ctx the parse tree
	 */
	void exitIncStmtSinPC(VGraphParser.IncStmtSinPCContext ctx);
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
	 * Enter a parse tree produced by {@link VGraphParser#colorName}.
	 * @param ctx the parse tree
	 */
	void enterColorName(VGraphParser.ColorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VGraphParser#colorName}.
	 * @param ctx the parse tree
	 */
	void exitColorName(VGraphParser.ColorNameContext ctx);
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
	 * Enter a parse tree produced by the {@code Producto}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterProducto(VGraphParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Producto}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitProducto(VGraphParser.ProductoContext ctx);
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
	 * Enter a parse tree produced by the {@code Diferencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(VGraphParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Diferencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(VGraphParser.DiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOLogico(VGraphParser.OLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOLogico(VGraphParser.OLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterYLogico(VGraphParser.YLogicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitYLogico(VGraphParser.YLogicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuma(VGraphParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuma(VGraphParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Azar}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAzar(VGraphParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Azar}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAzar(VGraphParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Iguales}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIguales(VGraphParser.IgualesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Iguales}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIguales(VGraphParser.IgualesContext ctx);
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
	 * Enter a parse tree produced by the {@code Mayorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMayorque(VGraphParser.MayorqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mayorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMayorque(VGraphParser.MayorqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(VGraphParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(VGraphParser.DivisionContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(VGraphParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(VGraphParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Menorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMenorque(VGraphParser.MenorqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Menorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMenorque(VGraphParser.MenorqueContext ctx);
}