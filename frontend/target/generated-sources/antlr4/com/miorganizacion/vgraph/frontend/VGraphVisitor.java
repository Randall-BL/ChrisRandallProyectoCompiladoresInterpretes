// Generated from com/miorganizacion/vgraph/frontend/VGraph.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code StmtEjecuta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtEjecuta(VGraphParser.StmtEjecutaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtRepite}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtRepite(VGraphParser.StmtRepiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtSi}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSi(VGraphParser.StmtSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtHazHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHazHasta(VGraphParser.StmtHazHastaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtHasta}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHasta(VGraphParser.StmtHastaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtHazMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtHazMientras(VGraphParser.StmtHazMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtMientras}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtMientras(VGraphParser.StmtMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link VGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(VGraphParser.StmtExprContext ctx);
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
	 * Visit a parse tree produced by {@link VGraphParser#hastaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHastaStmt(VGraphParser.HastaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#hazMientrasStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHazMientrasStmt(VGraphParser.HazMientrasStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#mientrasStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientrasStmt(VGraphParser.MientrasStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#repiteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepiteStmt(VGraphParser.RepiteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#ejecutaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjecutaStmt(VGraphParser.EjecutaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#ordenList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenList(VGraphParser.OrdenListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#ordenSinPuntoYComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenSinPuntoYComa(VGraphParser.OrdenSinPuntoYComaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveAvanzaSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveAvanzaSinPC(VGraphParser.MoveAvanzaSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoveRetrocedeSinPC}
	 * labeled alternative in {@link VGraphParser#turtleMoveStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRetrocedeSinPC(VGraphParser.MoveRetrocedeSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TurnRightSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnRightSinPC(VGraphParser.TurnRightSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TurnLeftSinPC}
	 * labeled alternative in {@link VGraphParser#turtleTurnStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnLeftSinPC(VGraphParser.TurnLeftSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateHideSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateHideSinPC(VGraphParser.StateHideSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StateSetColorSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateSetColorSinPC(VGraphParser.StateSetColorSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatePenDownSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatePenDownSinPC(VGraphParser.StatePenDownSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatePenUpSinPC}
	 * labeled alternative in {@link VGraphParser#turtleStateStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatePenUpSinPC(VGraphParser.StatePenUpSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosCenterSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosCenterSinPC(VGraphParser.PosCenterSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetXYBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetXYBracketsSinPC(VGraphParser.PosSetXYBracketsSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetXYNoBracketsSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetXYNoBracketsSinPC(VGraphParser.PosSetXYNoBracketsSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetHeadingSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetHeadingSinPC(VGraphParser.PosSetHeadingSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetXSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetXSinPC(VGraphParser.PosSetXSinPCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PosSetYSinPC}
	 * labeled alternative in {@link VGraphParser#turtlePosStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosSetYSinPC(VGraphParser.PosSetYSinPCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#esperaStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsperaStmtSinPC(VGraphParser.EsperaStmtSinPCContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#siStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiStmt(VGraphParser.SiStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#hazHastaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHazHastaStmt(VGraphParser.HazHastaStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#siSinPuntoYComa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiSinPuntoYComa(VGraphParser.SiSinPuntoYComaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VGraphParser#incStmtSinPC}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncStmtSinPC(VGraphParser.IncStmtSinPCContext ctx);
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
	 * Visit a parse tree produced by {@link VGraphParser#colorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorName(VGraphParser.ColorNameContext ctx);
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
	 * Visit a parse tree produced by the {@code Producto}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(VGraphParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(VGraphParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Diferencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(VGraphParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOLogico(VGraphParser.OLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YLogico}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYLogico(VGraphParser.YLogicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(VGraphParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Azar}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(VGraphParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Iguales}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguales(VGraphParser.IgualesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRumbo}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRumbo(VGraphParser.ExprRumboContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mayorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorque(VGraphParser.MayorqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(VGraphParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(VGraphParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(VGraphParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Menorque}
	 * labeled alternative in {@link VGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorque(VGraphParser.MenorqueContext ctx);
}