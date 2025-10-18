// Generated from com/miorganizacion/vgraph/frontend/VGraph.g4 by ANTLR 4.13.2
package com.miorganizacion.vgraph.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INT_TYPE=15, COLOR_TYPE=16, 
		DRAW=17, SETCOLOR=18, FRAME=19, LOOP=20, IF=21, ELSE=22, WAIT=23, LINE=24, 
		RECT=25, CIRCLE=26, PIXEL=27, COS=28, SIN=29, COMP_OP=30, HAZ=31, INIC=32, 
		INC=33, AVANZA=34, RETROCEDE=35, GIRADERECHA=36, GIRAIZQUIERDA=37, OCULTATORTUGA=38, 
		PONCOLORLAPIZ=39, CENTRO=40, ESPERA=41, PONPOS=42, PONRUMBO=43, RUMBO=44, 
		PONX=45, PONY=46, BAJALAPIZ=47, SUBELAPIZ=48, EJECUTA=49, REPITE=50, SI=51, 
		HAZHASTA=52, HASTA=53, HAZMIENTRAS=54, MIENTRAS=55, IGUALES=56, Y=57, 
		O=58, MAYORQUE=59, MENORQUE=60, DIFERENCIA=61, AZAR=62, PRODUCTO=63, SUMA=64, 
		POTENCIA=65, DIVISION=66, ROJO=67, VERDE=68, AZUL=69, AMARILLO=70, CYAN=71, 
		MAGENTA=72, BLANCO=73, NEGRO=74, COLOR_LITERAL=75, ID=76, INT=77, FLOAT=78, 
		WS=79, COMMENT=80;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_varStmt = 2, RULE_incStmt = 3, 
		RULE_hastaStmt = 4, RULE_hazMientrasStmt = 5, RULE_mientrasStmt = 6, RULE_repiteStmt = 7, 
		RULE_ejecutaStmt = 8, RULE_ordenList = 9, RULE_ordenSinPuntoYComa = 10, 
		RULE_turtleMoveStmtSinPC = 11, RULE_turtleTurnStmtSinPC = 12, RULE_turtleStateStmtSinPC = 13, 
		RULE_turtlePosStmtSinPC = 14, RULE_esperaStmtSinPC = 15, RULE_siStmt = 16, 
		RULE_hazHastaStmt = 17, RULE_siSinPuntoYComa = 18, RULE_incStmtSinPC = 19, 
		RULE_turtleMoveStmt = 20, RULE_turtleTurnStmt = 21, RULE_turtleStateStmt = 22, 
		RULE_turtlePosStmt = 23, RULE_colorName = 24, RULE_esperaStmt = 25, RULE_type = 26, 
		RULE_drawStmt = 27, RULE_setcolorStmt = 28, RULE_frameStmt = 29, RULE_loopStmt = 30, 
		RULE_ifStmt = 31, RULE_waitStmt = 32, RULE_assignment = 33, RULE_condition = 34, 
		RULE_expr = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "varStmt", "incStmt", "hastaStmt", "hazMientrasStmt", 
			"mientrasStmt", "repiteStmt", "ejecutaStmt", "ordenList", "ordenSinPuntoYComa", 
			"turtleMoveStmtSinPC", "turtleTurnStmtSinPC", "turtleStateStmtSinPC", 
			"turtlePosStmtSinPC", "esperaStmtSinPC", "siStmt", "hazHastaStmt", "siSinPuntoYComa", 
			"incStmtSinPC", "turtleMoveStmt", "turtleTurnStmt", "turtleStateStmt", 
			"turtlePosStmt", "colorName", "esperaStmt", "type", "drawStmt", "setcolorStmt", 
			"frameStmt", "loopStmt", "ifStmt", "waitStmt", "assignment", "condition", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'int'", "'color'", "'draw'", "'setcolor'", 
			"'frame'", "'loop'", "'if'", "'else'", "'wait'", "'line'", "'rect'", 
			"'circle'", "'pixel'", "'cos'", "'sin'", null, "'Haz'", "'inic'", "'inc'", 
			null, null, null, null, null, null, "'centro'", "'espera'", null, "'ponrumbo'", 
			"'rumbo'", "'ponx'", "'pony'", null, null, null, null, "'SI'", "'HAZ.HASTA'", 
			"'HASTA'", "'HAZ.MIENTRAS'", "'MIENTRAS'", "'iguales?'", "'Y'", "'O'", 
			"'mayorque?'", "'menorque?'", "'Diferencia'", "'azar'", "'producto'", 
			"'suma'", "'potencia'", "'division'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_TYPE", "COLOR_TYPE", "DRAW", "SETCOLOR", "FRAME", 
			"LOOP", "IF", "ELSE", "WAIT", "LINE", "RECT", "CIRCLE", "PIXEL", "COS", 
			"SIN", "COMP_OP", "HAZ", "INIC", "INC", "AVANZA", "RETROCEDE", "GIRADERECHA", 
			"GIRAIZQUIERDA", "OCULTATORTUGA", "PONCOLORLAPIZ", "CENTRO", "ESPERA", 
			"PONPOS", "PONRUMBO", "RUMBO", "PONX", "PONY", "BAJALAPIZ", "SUBELAPIZ", 
			"EJECUTA", "REPITE", "SI", "HAZHASTA", "HASTA", "HAZMIENTRAS", "MIENTRAS", 
			"IGUALES", "Y", "O", "MAYORQUE", "MENORQUE", "DIFERENCIA", "AZAR", "PRODUCTO", 
			"SUMA", "POTENCIA", "DIVISION", "ROJO", "VERDE", "AZUL", "AMARILLO", 
			"CYAN", "MAGENTA", "BLANCO", "NEGRO", "COLOR_LITERAL", "ID", "INT", "FLOAT", 
			"WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VGraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VGraphParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2147483616L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtExprContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtTurtleTurnContext extends StatementContext {
		public TurtleTurnStmtContext turtleTurnStmt() {
			return getRuleContext(TurtleTurnStmtContext.class,0);
		}
		public StmtTurtleTurnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtTurtleTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtTurtleTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtTurtleTurn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSiContext extends StatementContext {
		public SiStmtContext siStmt() {
			return getRuleContext(SiStmtContext.class,0);
		}
		public StmtSiContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtSi(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtTurtleStateContext extends StatementContext {
		public TurtleStateStmtContext turtleStateStmt() {
			return getRuleContext(TurtleStateStmtContext.class,0);
		}
		public StmtTurtleStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtTurtleState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtTurtleState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtTurtleState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtTurtlePosContext extends StatementContext {
		public TurtlePosStmtContext turtlePosStmt() {
			return getRuleContext(TurtlePosStmtContext.class,0);
		}
		public StmtTurtlePosContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtTurtlePos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtTurtlePos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtTurtlePos(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtHastaContext extends StatementContext {
		public HastaStmtContext hastaStmt() {
			return getRuleContext(HastaStmtContext.class,0);
		}
		public StmtHastaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtHasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtHasta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtHazHastaContext extends StatementContext {
		public HazHastaStmtContext hazHastaStmt() {
			return getRuleContext(HazHastaStmtContext.class,0);
		}
		public StmtHazHastaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtHazHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtHazHasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtHazHasta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtEjecutaContext extends StatementContext {
		public EjecutaStmtContext ejecutaStmt() {
			return getRuleContext(EjecutaStmtContext.class,0);
		}
		public StmtEjecutaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtEjecuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtEjecuta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtEjecuta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtVarContext extends StatementContext {
		public VarStmtContext varStmt() {
			return getRuleContext(VarStmtContext.class,0);
		}
		public StmtVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtRepiteContext extends StatementContext {
		public RepiteStmtContext repiteStmt() {
			return getRuleContext(RepiteStmtContext.class,0);
		}
		public StmtRepiteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtRepite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtRepite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtRepite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtTurtleMoveContext extends StatementContext {
		public TurtleMoveStmtContext turtleMoveStmt() {
			return getRuleContext(TurtleMoveStmtContext.class,0);
		}
		public StmtTurtleMoveContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtTurtleMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtTurtleMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtTurtleMove(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtEsperaContext extends StatementContext {
		public EsperaStmtContext esperaStmt() {
			return getRuleContext(EsperaStmtContext.class,0);
		}
		public StmtEsperaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtEspera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtEspera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtEspera(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtMientrasContext extends StatementContext {
		public MientrasStmtContext mientrasStmt() {
			return getRuleContext(MientrasStmtContext.class,0);
		}
		public StmtMientrasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtMientras(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIncContext extends StatementContext {
		public IncStmtContext incStmt() {
			return getRuleContext(IncStmtContext.class,0);
		}
		public StmtIncContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtInc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtHazMientrasContext extends StatementContext {
		public HazMientrasStmtContext hazMientrasStmt() {
			return getRuleContext(HazMientrasStmtContext.class,0);
		}
		public StmtHazMientrasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtHazMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtHazMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtHazMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
			case INIC:
				_localctx = new StmtVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				varStmt();
				}
				break;
			case INC:
				_localctx = new StmtIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				incStmt();
				}
				break;
			case AVANZA:
			case RETROCEDE:
				_localctx = new StmtTurtleMoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				turtleMoveStmt();
				}
				break;
			case GIRADERECHA:
			case GIRAIZQUIERDA:
				_localctx = new StmtTurtleTurnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				turtleTurnStmt();
				}
				break;
			case OCULTATORTUGA:
			case PONCOLORLAPIZ:
			case BAJALAPIZ:
			case SUBELAPIZ:
				_localctx = new StmtTurtleStateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				turtleStateStmt();
				}
				break;
			case CENTRO:
			case PONPOS:
			case PONRUMBO:
			case PONX:
			case PONY:
				_localctx = new StmtTurtlePosContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				turtlePosStmt();
				}
				break;
			case ESPERA:
				_localctx = new StmtEsperaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				esperaStmt();
				}
				break;
			case EJECUTA:
				_localctx = new StmtEjecutaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				ejecutaStmt();
				}
				break;
			case REPITE:
				_localctx = new StmtRepiteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				repiteStmt();
				}
				break;
			case SI:
				_localctx = new StmtSiContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				siStmt();
				}
				break;
			case HAZHASTA:
				_localctx = new StmtHazHastaContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				hazHastaStmt();
				}
				break;
			case HASTA:
				_localctx = new StmtHastaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				hastaStmt();
				}
				break;
			case HAZMIENTRAS:
				_localctx = new StmtHazMientrasContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				hazMientrasStmt();
				}
				break;
			case MIENTRAS:
				_localctx = new StmtMientrasContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				mientrasStmt();
				}
				break;
			case T__4:
			case RUMBO:
			case IGUALES:
			case Y:
			case O:
			case MAYORQUE:
			case MENORQUE:
			case DIFERENCIA:
			case AZAR:
			case PRODUCTO:
			case SUMA:
			case POTENCIA:
			case DIVISION:
			case ID:
			case INT:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				expr(0);
				setState(95);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarStmtContext extends ParserRuleContext {
		public VarStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStmt; }
	 
		public VarStmtContext() { }
		public void copyFrom(VarStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtHazContext extends VarStmtContext {
		public TerminalNode HAZ() { return getToken(VGraphParser.HAZ, 0); }
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtHazContext(VarStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtHaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtHaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtHaz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInicContext extends VarStmtContext {
		public TerminalNode INIC() { return getToken(VGraphParser.INIC, 0); }
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtInicContext(VarStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtInic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtInic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtInic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarStmtContext varStmt() throws RecognitionException {
		VarStmtContext _localctx = new VarStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varStmt);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
				_localctx = new StmtHazContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(HAZ);
				setState(100);
				match(ID);
				setState(101);
				expr(0);
				setState(102);
				match(T__0);
				}
				break;
			case INIC:
				_localctx = new StmtInicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(INIC);
				setState(105);
				match(ID);
				setState(106);
				match(T__1);
				setState(107);
				expr(0);
				setState(108);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncStmtContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(VGraphParser.INC, 0); }
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIncStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncStmtContext incStmt() throws RecognitionException {
		IncStmtContext _localctx = new IncStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_incStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INC);
			setState(113);
			match(T__2);
			setState(114);
			match(ID);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72040001851883488L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				setState(115);
				expr(0);
				}
			}

			setState(118);
			match(T__3);
			setState(119);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HastaStmtContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(VGraphParser.HASTA, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public HastaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHastaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHastaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHastaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastaStmtContext hastaStmt() throws RecognitionException {
		HastaStmtContext _localctx = new HastaStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hastaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(HASTA);
			setState(122);
			match(T__4);
			setState(123);
			condition();
			setState(124);
			match(T__5);
			setState(125);
			match(T__2);
			setState(126);
			ordenList();
			setState(127);
			match(T__3);
			setState(128);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HazMientrasStmtContext extends ParserRuleContext {
		public TerminalNode HAZMIENTRAS() { return getToken(VGraphParser.HAZMIENTRAS, 0); }
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HazMientrasStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hazMientrasStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHazMientrasStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHazMientrasStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHazMientrasStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazMientrasStmtContext hazMientrasStmt() throws RecognitionException {
		HazMientrasStmtContext _localctx = new HazMientrasStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hazMientrasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(HAZMIENTRAS);
			setState(131);
			match(T__2);
			setState(132);
			ordenList();
			setState(133);
			match(T__3);
			setState(134);
			match(T__4);
			setState(135);
			condition();
			setState(136);
			match(T__5);
			setState(137);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasStmtContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(VGraphParser.MIENTRAS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public MientrasStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientrasStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMientrasStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMientrasStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMientrasStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasStmtContext mientrasStmt() throws RecognitionException {
		MientrasStmtContext _localctx = new MientrasStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mientrasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(MIENTRAS);
			setState(140);
			match(T__4);
			setState(141);
			condition();
			setState(142);
			match(T__5);
			setState(143);
			match(T__2);
			setState(144);
			ordenList();
			setState(145);
			match(T__3);
			setState(146);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepiteStmtContext extends ParserRuleContext {
		public TerminalNode REPITE() { return getToken(VGraphParser.REPITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public RepiteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repiteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterRepiteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitRepiteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitRepiteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteStmtContext repiteStmt() throws RecognitionException {
		RepiteStmtContext _localctx = new RepiteStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repiteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(REPITE);
			setState(149);
			expr(0);
			setState(150);
			match(T__2);
			setState(151);
			ordenList();
			setState(152);
			match(T__3);
			setState(153);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EjecutaStmtContext extends ParserRuleContext {
		public TerminalNode EJECUTA() { return getToken(VGraphParser.EJECUTA, 0); }
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public EjecutaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejecutaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterEjecutaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitEjecutaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitEjecutaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjecutaStmtContext ejecutaStmt() throws RecognitionException {
		EjecutaStmtContext _localctx = new EjecutaStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ejecutaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(EJECUTA);
			setState(156);
			match(T__2);
			setState(157);
			ordenList();
			setState(158);
			match(T__3);
			setState(159);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenListContext extends ParserRuleContext {
		public List<OrdenSinPuntoYComaContext> ordenSinPuntoYComa() {
			return getRuleContexts(OrdenSinPuntoYComaContext.class);
		}
		public OrdenSinPuntoYComaContext ordenSinPuntoYComa(int i) {
			return getRuleContext(OrdenSinPuntoYComaContext.class,i);
		}
		public OrdenListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterOrdenList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitOrdenList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitOrdenList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenListContext ordenList() throws RecognitionException {
		OrdenListContext _localctx = new OrdenListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ordenList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			ordenSinPuntoYComa();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(162);
				match(T__6);
				setState(163);
				ordenSinPuntoYComa();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenSinPuntoYComaContext extends ParserRuleContext {
		public TurtleMoveStmtSinPCContext turtleMoveStmtSinPC() {
			return getRuleContext(TurtleMoveStmtSinPCContext.class,0);
		}
		public TurtleTurnStmtSinPCContext turtleTurnStmtSinPC() {
			return getRuleContext(TurtleTurnStmtSinPCContext.class,0);
		}
		public TurtleStateStmtSinPCContext turtleStateStmtSinPC() {
			return getRuleContext(TurtleStateStmtSinPCContext.class,0);
		}
		public TurtlePosStmtSinPCContext turtlePosStmtSinPC() {
			return getRuleContext(TurtlePosStmtSinPCContext.class,0);
		}
		public EsperaStmtSinPCContext esperaStmtSinPC() {
			return getRuleContext(EsperaStmtSinPCContext.class,0);
		}
		public SiSinPuntoYComaContext siSinPuntoYComa() {
			return getRuleContext(SiSinPuntoYComaContext.class,0);
		}
		public IncStmtSinPCContext incStmtSinPC() {
			return getRuleContext(IncStmtSinPCContext.class,0);
		}
		public OrdenSinPuntoYComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenSinPuntoYComa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterOrdenSinPuntoYComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitOrdenSinPuntoYComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitOrdenSinPuntoYComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenSinPuntoYComaContext ordenSinPuntoYComa() throws RecognitionException {
		OrdenSinPuntoYComaContext _localctx = new OrdenSinPuntoYComaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ordenSinPuntoYComa);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
			case RETROCEDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				turtleMoveStmtSinPC();
				}
				break;
			case GIRADERECHA:
			case GIRAIZQUIERDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				turtleTurnStmtSinPC();
				}
				break;
			case OCULTATORTUGA:
			case PONCOLORLAPIZ:
			case BAJALAPIZ:
			case SUBELAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				turtleStateStmtSinPC();
				}
				break;
			case CENTRO:
			case PONPOS:
			case PONRUMBO:
			case PONX:
			case PONY:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				turtlePosStmtSinPC();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				esperaStmtSinPC();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				siSinPuntoYComa();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				incStmtSinPC();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleMoveStmtSinPCContext extends ParserRuleContext {
		public TurtleMoveStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleMoveStmtSinPC; }
	 
		public TurtleMoveStmtSinPCContext() { }
		public void copyFrom(TurtleMoveStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveAvanzaSinPCContext extends TurtleMoveStmtSinPCContext {
		public TerminalNode AVANZA() { return getToken(VGraphParser.AVANZA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveAvanzaSinPCContext(TurtleMoveStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMoveAvanzaSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMoveAvanzaSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMoveAvanzaSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveRetrocedeSinPCContext extends TurtleMoveStmtSinPCContext {
		public TerminalNode RETROCEDE() { return getToken(VGraphParser.RETROCEDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveRetrocedeSinPCContext(TurtleMoveStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMoveRetrocedeSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMoveRetrocedeSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMoveRetrocedeSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleMoveStmtSinPCContext turtleMoveStmtSinPC() throws RecognitionException {
		TurtleMoveStmtSinPCContext _localctx = new TurtleMoveStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_turtleMoveStmtSinPC);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
				_localctx = new MoveAvanzaSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(AVANZA);
				setState(179);
				expr(0);
				}
				break;
			case RETROCEDE:
				_localctx = new MoveRetrocedeSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(RETROCEDE);
				setState(181);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleTurnStmtSinPCContext extends ParserRuleContext {
		public TurtleTurnStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleTurnStmtSinPC; }
	 
		public TurtleTurnStmtSinPCContext() { }
		public void copyFrom(TurtleTurnStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnRightSinPCContext extends TurtleTurnStmtSinPCContext {
		public TerminalNode GIRADERECHA() { return getToken(VGraphParser.GIRADERECHA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TurnRightSinPCContext(TurtleTurnStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterTurnRightSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitTurnRightSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitTurnRightSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnLeftSinPCContext extends TurtleTurnStmtSinPCContext {
		public TerminalNode GIRAIZQUIERDA() { return getToken(VGraphParser.GIRAIZQUIERDA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TurnLeftSinPCContext(TurtleTurnStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterTurnLeftSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitTurnLeftSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitTurnLeftSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleTurnStmtSinPCContext turtleTurnStmtSinPC() throws RecognitionException {
		TurtleTurnStmtSinPCContext _localctx = new TurtleTurnStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_turtleTurnStmtSinPC);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GIRADERECHA:
				_localctx = new TurnRightSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(GIRADERECHA);
				setState(185);
				expr(0);
				}
				break;
			case GIRAIZQUIERDA:
				_localctx = new TurnLeftSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(GIRAIZQUIERDA);
				setState(187);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleStateStmtSinPCContext extends ParserRuleContext {
		public TurtleStateStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleStateStmtSinPC; }
	 
		public TurtleStateStmtSinPCContext() { }
		public void copyFrom(TurtleStateStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatePenUpSinPCContext extends TurtleStateStmtSinPCContext {
		public TerminalNode SUBELAPIZ() { return getToken(VGraphParser.SUBELAPIZ, 0); }
		public StatePenUpSinPCContext(TurtleStateStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStatePenUpSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStatePenUpSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStatePenUpSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateSetColorSinPCContext extends TurtleStateStmtSinPCContext {
		public TerminalNode PONCOLORLAPIZ() { return getToken(VGraphParser.PONCOLORLAPIZ, 0); }
		public ColorNameContext colorName() {
			return getRuleContext(ColorNameContext.class,0);
		}
		public StateSetColorSinPCContext(TurtleStateStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStateSetColorSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStateSetColorSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStateSetColorSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatePenDownSinPCContext extends TurtleStateStmtSinPCContext {
		public TerminalNode BAJALAPIZ() { return getToken(VGraphParser.BAJALAPIZ, 0); }
		public StatePenDownSinPCContext(TurtleStateStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStatePenDownSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStatePenDownSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStatePenDownSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateHideSinPCContext extends TurtleStateStmtSinPCContext {
		public TerminalNode OCULTATORTUGA() { return getToken(VGraphParser.OCULTATORTUGA, 0); }
		public StateHideSinPCContext(TurtleStateStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStateHideSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStateHideSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStateHideSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleStateStmtSinPCContext turtleStateStmtSinPC() throws RecognitionException {
		TurtleStateStmtSinPCContext _localctx = new TurtleStateStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_turtleStateStmtSinPC);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCULTATORTUGA:
				_localctx = new StateHideSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(OCULTATORTUGA);
				}
				break;
			case PONCOLORLAPIZ:
				_localctx = new StateSetColorSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(PONCOLORLAPIZ);
				setState(192);
				colorName();
				}
				break;
			case BAJALAPIZ:
				_localctx = new StatePenDownSinPCContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(BAJALAPIZ);
				}
				break;
			case SUBELAPIZ:
				_localctx = new StatePenUpSinPCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(SUBELAPIZ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtlePosStmtSinPCContext extends ParserRuleContext {
		public TurtlePosStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtlePosStmtSinPC; }
	 
		public TurtlePosStmtSinPCContext() { }
		public void copyFrom(TurtlePosStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetHeadingSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode PONRUMBO() { return getToken(VGraphParser.PONRUMBO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetHeadingSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetHeadingSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetHeadingSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetHeadingSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXYNoBracketsSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode PONPOS() { return getToken(VGraphParser.PONPOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PosSetXYNoBracketsSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetXYNoBracketsSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetXYNoBracketsSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetXYNoBracketsSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosCenterSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode CENTRO() { return getToken(VGraphParser.CENTRO, 0); }
		public PosCenterSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosCenterSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosCenterSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosCenterSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode PONX() { return getToken(VGraphParser.PONX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetXSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetXSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetXSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetXSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetYSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode PONY() { return getToken(VGraphParser.PONY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetYSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetYSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetYSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetYSinPC(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXYBracketsSinPCContext extends TurtlePosStmtSinPCContext {
		public TerminalNode PONPOS() { return getToken(VGraphParser.PONPOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PosSetXYBracketsSinPCContext(TurtlePosStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetXYBracketsSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetXYBracketsSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetXYBracketsSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtlePosStmtSinPCContext turtlePosStmtSinPC() throws RecognitionException {
		TurtlePosStmtSinPCContext _localctx = new TurtlePosStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_turtlePosStmtSinPC);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PosCenterSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(CENTRO);
				}
				break;
			case 2:
				_localctx = new PosSetXYBracketsSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(PONPOS);
				setState(199);
				match(T__2);
				setState(200);
				expr(0);
				setState(201);
				expr(0);
				setState(202);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new PosSetXYNoBracketsSinPCContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(PONPOS);
				setState(205);
				expr(0);
				setState(206);
				expr(0);
				}
				break;
			case 4:
				_localctx = new PosSetHeadingSinPCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(PONRUMBO);
				setState(209);
				expr(0);
				}
				break;
			case 5:
				_localctx = new PosSetXSinPCContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(PONX);
				setState(211);
				expr(0);
				}
				break;
			case 6:
				_localctx = new PosSetYSinPCContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(PONY);
				setState(213);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EsperaStmtSinPCContext extends ParserRuleContext {
		public TerminalNode ESPERA() { return getToken(VGraphParser.ESPERA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EsperaStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperaStmtSinPC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterEsperaStmtSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitEsperaStmtSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitEsperaStmtSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaStmtSinPCContext esperaStmtSinPC() throws RecognitionException {
		EsperaStmtSinPCContext _localctx = new EsperaStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_esperaStmtSinPC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ESPERA);
			setState(217);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiStmtContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(VGraphParser.SI, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<OrdenListContext> ordenList() {
			return getRuleContexts(OrdenListContext.class);
		}
		public OrdenListContext ordenList(int i) {
			return getRuleContext(OrdenListContext.class,i);
		}
		public SiStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSiStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSiStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSiStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiStmtContext siStmt() throws RecognitionException {
		SiStmtContext _localctx = new SiStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_siStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(SI);
			setState(220);
			match(T__4);
			setState(221);
			condition();
			setState(222);
			match(T__5);
			setState(223);
			match(T__2);
			setState(224);
			ordenList();
			setState(225);
			match(T__3);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(226);
				match(T__2);
				setState(227);
				ordenList();
				setState(228);
				match(T__3);
				}
			}

			setState(232);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HazHastaStmtContext extends ParserRuleContext {
		public TerminalNode HAZHASTA() { return getToken(VGraphParser.HAZHASTA, 0); }
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HazHastaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hazHastaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHazHastaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHazHastaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHazHastaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazHastaStmtContext hazHastaStmt() throws RecognitionException {
		HazHastaStmtContext _localctx = new HazHastaStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hazHastaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(HAZHASTA);
			setState(235);
			match(T__2);
			setState(236);
			ordenList();
			setState(237);
			match(T__3);
			setState(238);
			match(T__4);
			setState(239);
			condition();
			setState(240);
			match(T__5);
			setState(241);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiSinPuntoYComaContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(VGraphParser.SI, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<OrdenListContext> ordenList() {
			return getRuleContexts(OrdenListContext.class);
		}
		public OrdenListContext ordenList(int i) {
			return getRuleContext(OrdenListContext.class,i);
		}
		public SiSinPuntoYComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siSinPuntoYComa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSiSinPuntoYComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSiSinPuntoYComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSiSinPuntoYComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiSinPuntoYComaContext siSinPuntoYComa() throws RecognitionException {
		SiSinPuntoYComaContext _localctx = new SiSinPuntoYComaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_siSinPuntoYComa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SI);
			setState(244);
			match(T__4);
			setState(245);
			condition();
			setState(246);
			match(T__5);
			setState(247);
			match(T__2);
			setState(248);
			ordenList();
			setState(249);
			match(T__3);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(250);
				match(T__2);
				setState(251);
				ordenList();
				setState(252);
				match(T__3);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncStmtSinPCContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(VGraphParser.INC, 0); }
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmtSinPC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIncStmtSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIncStmtSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIncStmtSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncStmtSinPCContext incStmtSinPC() throws RecognitionException {
		IncStmtSinPCContext _localctx = new IncStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incStmtSinPC);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(INC);
			setState(257);
			match(T__2);
			setState(258);
			match(ID);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -72040001851883488L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				setState(259);
				expr(0);
				}
			}

			setState(262);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleMoveStmtContext extends ParserRuleContext {
		public TurtleMoveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleMoveStmt; }
	 
		public TurtleMoveStmtContext() { }
		public void copyFrom(TurtleMoveStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveAvanzaContext extends TurtleMoveStmtContext {
		public TerminalNode AVANZA() { return getToken(VGraphParser.AVANZA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveAvanzaContext(TurtleMoveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMoveAvanza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMoveAvanza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMoveAvanza(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveRetrocedeContext extends TurtleMoveStmtContext {
		public TerminalNode RETROCEDE() { return getToken(VGraphParser.RETROCEDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MoveRetrocedeContext(TurtleMoveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMoveRetrocede(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMoveRetrocede(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMoveRetrocede(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleMoveStmtContext turtleMoveStmt() throws RecognitionException {
		TurtleMoveStmtContext _localctx = new TurtleMoveStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_turtleMoveStmt);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
				_localctx = new MoveAvanzaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(AVANZA);
				setState(265);
				expr(0);
				setState(266);
				match(T__0);
				}
				break;
			case RETROCEDE:
				_localctx = new MoveRetrocedeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(RETROCEDE);
				setState(269);
				expr(0);
				setState(270);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleTurnStmtContext extends ParserRuleContext {
		public TurtleTurnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleTurnStmt; }
	 
		public TurtleTurnStmtContext() { }
		public void copyFrom(TurtleTurnStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnRightContext extends TurtleTurnStmtContext {
		public TerminalNode GIRADERECHA() { return getToken(VGraphParser.GIRADERECHA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TurnRightContext(TurtleTurnStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterTurnRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitTurnRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitTurnRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TurnLeftContext extends TurtleTurnStmtContext {
		public TerminalNode GIRAIZQUIERDA() { return getToken(VGraphParser.GIRAIZQUIERDA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TurnLeftContext(TurtleTurnStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterTurnLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitTurnLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitTurnLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleTurnStmtContext turtleTurnStmt() throws RecognitionException {
		TurtleTurnStmtContext _localctx = new TurtleTurnStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_turtleTurnStmt);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GIRADERECHA:
				_localctx = new TurnRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(GIRADERECHA);
				setState(275);
				expr(0);
				setState(276);
				match(T__0);
				}
				break;
			case GIRAIZQUIERDA:
				_localctx = new TurnLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(GIRAIZQUIERDA);
				setState(279);
				expr(0);
				setState(280);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtleStateStmtContext extends ParserRuleContext {
		public TurtleStateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleStateStmt; }
	 
		public TurtleStateStmtContext() { }
		public void copyFrom(TurtleStateStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateSetColorContext extends TurtleStateStmtContext {
		public TerminalNode PONCOLORLAPIZ() { return getToken(VGraphParser.PONCOLORLAPIZ, 0); }
		public ColorNameContext colorName() {
			return getRuleContext(ColorNameContext.class,0);
		}
		public StateSetColorContext(TurtleStateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStateSetColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStateSetColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStateSetColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatePenUpContext extends TurtleStateStmtContext {
		public TerminalNode SUBELAPIZ() { return getToken(VGraphParser.SUBELAPIZ, 0); }
		public StatePenUpContext(TurtleStateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStatePenUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStatePenUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStatePenUp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateHideContext extends TurtleStateStmtContext {
		public TerminalNode OCULTATORTUGA() { return getToken(VGraphParser.OCULTATORTUGA, 0); }
		public StateHideContext(TurtleStateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStateHide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStateHide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStateHide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatePenDownContext extends TurtleStateStmtContext {
		public TerminalNode BAJALAPIZ() { return getToken(VGraphParser.BAJALAPIZ, 0); }
		public StatePenDownContext(TurtleStateStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStatePenDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStatePenDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStatePenDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtleStateStmtContext turtleStateStmt() throws RecognitionException {
		TurtleStateStmtContext _localctx = new TurtleStateStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_turtleStateStmt);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCULTATORTUGA:
				_localctx = new StateHideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(OCULTATORTUGA);
				setState(285);
				match(T__0);
				}
				break;
			case PONCOLORLAPIZ:
				_localctx = new StateSetColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(PONCOLORLAPIZ);
				setState(287);
				colorName();
				setState(288);
				match(T__0);
				}
				break;
			case BAJALAPIZ:
				_localctx = new StatePenDownContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(BAJALAPIZ);
				setState(291);
				match(T__0);
				}
				break;
			case SUBELAPIZ:
				_localctx = new StatePenUpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(SUBELAPIZ);
				setState(293);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TurtlePosStmtContext extends ParserRuleContext {
		public TurtlePosStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtlePosStmt; }
	 
		public TurtlePosStmtContext() { }
		public void copyFrom(TurtlePosStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosCenterContext extends TurtlePosStmtContext {
		public TerminalNode CENTRO() { return getToken(VGraphParser.CENTRO, 0); }
		public PosCenterContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosCenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosCenter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosCenter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXContext extends TurtlePosStmtContext {
		public TerminalNode PONX() { return getToken(VGraphParser.PONX, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetXContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetX(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetYContext extends TurtlePosStmtContext {
		public TerminalNode PONY() { return getToken(VGraphParser.PONY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetYContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetY(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetHeadingContext extends TurtlePosStmtContext {
		public TerminalNode PONRUMBO() { return getToken(VGraphParser.PONRUMBO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PosSetHeadingContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetHeading(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXYNoBracketsContext extends TurtlePosStmtContext {
		public TerminalNode PONPOS() { return getToken(VGraphParser.PONPOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PosSetXYNoBracketsContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetXYNoBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetXYNoBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetXYNoBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PosSetXYBracketsContext extends TurtlePosStmtContext {
		public TerminalNode PONPOS() { return getToken(VGraphParser.PONPOS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PosSetXYBracketsContext(TurtlePosStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPosSetXYBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPosSetXYBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPosSetXYBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurtlePosStmtContext turtlePosStmt() throws RecognitionException {
		TurtlePosStmtContext _localctx = new TurtlePosStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_turtlePosStmt);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PosCenterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(CENTRO);
				setState(297);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new PosSetXYBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(PONPOS);
				setState(299);
				match(T__2);
				setState(300);
				expr(0);
				setState(301);
				expr(0);
				setState(302);
				match(T__3);
				setState(303);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new PosSetXYNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(PONPOS);
				setState(306);
				expr(0);
				setState(307);
				expr(0);
				setState(308);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new PosSetHeadingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				match(PONRUMBO);
				setState(311);
				expr(0);
				setState(312);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new PosSetXContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(PONX);
				setState(315);
				expr(0);
				setState(316);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new PosSetYContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				match(PONY);
				setState(319);
				expr(0);
				setState(320);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorNameContext extends ParserRuleContext {
		public TerminalNode ROJO() { return getToken(VGraphParser.ROJO, 0); }
		public TerminalNode VERDE() { return getToken(VGraphParser.VERDE, 0); }
		public TerminalNode AZUL() { return getToken(VGraphParser.AZUL, 0); }
		public TerminalNode AMARILLO() { return getToken(VGraphParser.AMARILLO, 0); }
		public TerminalNode CYAN() { return getToken(VGraphParser.CYAN, 0); }
		public TerminalNode MAGENTA() { return getToken(VGraphParser.MAGENTA, 0); }
		public TerminalNode BLANCO() { return getToken(VGraphParser.BLANCO, 0); }
		public TerminalNode NEGRO() { return getToken(VGraphParser.NEGRO, 0); }
		public ColorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterColorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitColorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitColorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorNameContext colorName() throws RecognitionException {
		ColorNameContext _localctx = new ColorNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_colorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EsperaStmtContext extends ParserRuleContext {
		public TerminalNode ESPERA() { return getToken(VGraphParser.ESPERA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EsperaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterEsperaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitEsperaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitEsperaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaStmtContext esperaStmt() throws RecognitionException {
		EsperaStmtContext _localctx = new EsperaStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_esperaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ESPERA);
			setState(327);
			expr(0);
			setState(328);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(VGraphParser.INT_TYPE, 0); }
		public TerminalNode COLOR_TYPE() { return getToken(VGraphParser.COLOR_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==COLOR_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DrawStmtContext extends ParserRuleContext {
		public DrawStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawStmt; }
	 
		public DrawStmtContext() { }
		public void copyFrom(DrawStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DrawCircleContext extends DrawStmtContext {
		public TerminalNode DRAW() { return getToken(VGraphParser.DRAW, 0); }
		public TerminalNode CIRCLE() { return getToken(VGraphParser.CIRCLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DrawCircleContext(DrawStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDrawCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDrawCircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDrawCircle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DrawLineContext extends DrawStmtContext {
		public TerminalNode DRAW() { return getToken(VGraphParser.DRAW, 0); }
		public TerminalNode LINE() { return getToken(VGraphParser.LINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DrawLineContext(DrawStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDrawLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDrawLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDrawLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DrawRectContext extends DrawStmtContext {
		public TerminalNode DRAW() { return getToken(VGraphParser.DRAW, 0); }
		public TerminalNode RECT() { return getToken(VGraphParser.RECT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DrawRectContext(DrawStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDrawRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDrawRect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDrawRect(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DrawPixelContext extends DrawStmtContext {
		public TerminalNode DRAW() { return getToken(VGraphParser.DRAW, 0); }
		public TerminalNode PIXEL() { return getToken(VGraphParser.PIXEL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DrawPixelContext(DrawStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDrawPixel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDrawPixel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDrawPixel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawStmtContext drawStmt() throws RecognitionException {
		DrawStmtContext _localctx = new DrawStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_drawStmt);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DrawLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(DRAW);
				setState(333);
				match(LINE);
				setState(334);
				match(T__4);
				setState(335);
				expr(0);
				setState(336);
				match(T__6);
				setState(337);
				expr(0);
				setState(338);
				match(T__6);
				setState(339);
				expr(0);
				setState(340);
				match(T__6);
				setState(341);
				expr(0);
				setState(342);
				match(T__5);
				setState(343);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new DrawRectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(DRAW);
				setState(346);
				match(RECT);
				setState(347);
				match(T__4);
				setState(348);
				expr(0);
				setState(349);
				match(T__6);
				setState(350);
				expr(0);
				setState(351);
				match(T__6);
				setState(352);
				expr(0);
				setState(353);
				match(T__6);
				setState(354);
				expr(0);
				setState(355);
				match(T__5);
				setState(356);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new DrawCircleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(DRAW);
				setState(359);
				match(CIRCLE);
				setState(360);
				match(T__4);
				setState(361);
				expr(0);
				setState(362);
				match(T__6);
				setState(363);
				expr(0);
				setState(364);
				match(T__6);
				setState(365);
				expr(0);
				setState(366);
				match(T__5);
				setState(367);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new DrawPixelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(DRAW);
				setState(370);
				match(PIXEL);
				setState(371);
				match(T__4);
				setState(372);
				expr(0);
				setState(373);
				match(T__6);
				setState(374);
				expr(0);
				setState(375);
				match(T__5);
				setState(376);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetcolorStmtContext extends ParserRuleContext {
		public TerminalNode SETCOLOR() { return getToken(VGraphParser.SETCOLOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetcolorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcolorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSetcolorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSetcolorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSetcolorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcolorStmtContext setcolorStmt() throws RecognitionException {
		SetcolorStmtContext _localctx = new SetcolorStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_setcolorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(SETCOLOR);
			setState(381);
			match(T__4);
			setState(382);
			expr(0);
			setState(383);
			match(T__5);
			setState(384);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameStmtContext extends ParserRuleContext {
		public TerminalNode FRAME() { return getToken(VGraphParser.FRAME, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FrameStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterFrameStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitFrameStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitFrameStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameStmtContext frameStmt() throws RecognitionException {
		FrameStmtContext _localctx = new FrameStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_frameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(FRAME);
			setState(387);
			match(T__7);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2147483616L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				{
				setState(388);
				statement();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStmtContext extends ParserRuleContext {
		public AssignmentContext init;
		public ConditionContext cond;
		public AssignmentContext update;
		public TerminalNode LOOP() { return getToken(VGraphParser.LOOP, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LOOP);
			setState(397);
			match(T__4);
			setState(398);
			((LoopStmtContext)_localctx).init = assignment();
			setState(399);
			match(T__0);
			setState(400);
			((LoopStmtContext)_localctx).cond = condition();
			setState(401);
			match(T__0);
			setState(402);
			((LoopStmtContext)_localctx).update = assignment();
			setState(403);
			match(T__5);
			setState(404);
			match(T__7);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2147483616L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				{
				setState(405);
				statement();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public ConditionContext cond;
		public TerminalNode IF() { return getToken(VGraphParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VGraphParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(IF);
			setState(414);
			match(T__4);
			setState(415);
			((IfStmtContext)_localctx).cond = condition();
			setState(416);
			match(T__5);
			setState(417);
			match(T__7);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2147483616L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
				{
				{
				setState(418);
				statement();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(T__8);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(425);
				match(ELSE);
				setState(426);
				match(T__7);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2147483616L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 12295L) != 0)) {
					{
					{
					setState(427);
					statement();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(T__8);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WaitStmtContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(VGraphParser.WAIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WaitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterWaitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitWaitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitWaitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitStmtContext waitStmt() throws RecognitionException {
		WaitStmtContext _localctx = new WaitStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_waitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(WAIT);
			setState(437);
			match(T__4);
			setState(438);
			expr(0);
			setState(439);
			match(T__5);
			setState(440);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(ID);
			setState(443);
			match(T__1);
			setState(444);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OP() { return getToken(VGraphParser.COMP_OP, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			expr(0);
			setState(447);
			((ConditionContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==COMP_OP) ) {
				((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(448);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProductoContext extends ExprContext {
		public TerminalNode PRODUCTO() { return getToken(VGraphParser.PRODUCTO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProductoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterProducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitProducto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitProducto(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiferenciaContext extends ExprContext {
		public TerminalNode DIFERENCIA() { return getToken(VGraphParser.DIFERENCIA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DiferenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDiferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OLogicoContext extends ExprContext {
		public TerminalNode O() { return getToken(VGraphParser.O, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OLogicoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterOLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitOLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitOLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YLogicoContext extends ExprContext {
		public TerminalNode Y() { return getToken(VGraphParser.Y, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public YLogicoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterYLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitYLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitYLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ExprContext {
		public TerminalNode SUMA() { return getToken(VGraphParser.SUMA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AzarContext extends ExprContext {
		public TerminalNode AZAR() { return getToken(VGraphParser.AZAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AzarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitAzar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitAzar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualesContext extends ExprContext {
		public TerminalNode IGUALES() { return getToken(VGraphParser.IGUALES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IgualesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIguales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIguales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIguales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRumboContext extends ExprContext {
		public TerminalNode RUMBO() { return getToken(VGraphParser.RUMBO, 0); }
		public ExprRumboContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterExprRumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitExprRumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitExprRumbo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExprContext {
		public TerminalNode DIVISION() { return getToken(VGraphParser.DIVISION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExprContext {
		public TerminalNode INT() { return getToken(VGraphParser.INT, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MayorQueContext extends ExprContext {
		public TerminalNode MAYORQUE() { return getToken(VGraphParser.MAYORQUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MayorQueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMayorQue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMayorQue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMayorQue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PotenciaContext extends ExprContext {
		public TerminalNode POTENCIA() { return getToken(VGraphParser.POTENCIA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenorQueContext extends ExprContext {
		public TerminalNode MENORQUE() { return getToken(VGraphParser.MENORQUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MenorQueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMenorQue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMenorQue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMenorQue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(451);
				match(T__4);
				setState(452);
				expr(0);
				setState(453);
				match(T__5);
				}
				break;
			case RUMBO:
				{
				_localctx = new ExprRumboContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(455);
				match(RUMBO);
				}
				break;
			case IGUALES:
				{
				_localctx = new IgualesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(456);
				match(IGUALES);
				setState(457);
				expr(0);
				setState(458);
				expr(16);
				}
				break;
			case Y:
				{
				_localctx = new YLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460);
				match(Y);
				setState(461);
				expr(0);
				setState(462);
				expr(15);
				}
				break;
			case O:
				{
				_localctx = new OLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(464);
				match(O);
				setState(465);
				expr(0);
				setState(466);
				expr(14);
				}
				break;
			case MAYORQUE:
				{
				_localctx = new MayorQueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(468);
				match(MAYORQUE);
				setState(469);
				expr(0);
				setState(470);
				expr(13);
				}
				break;
			case MENORQUE:
				{
				_localctx = new MenorQueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(472);
				match(MENORQUE);
				setState(473);
				expr(0);
				setState(474);
				expr(12);
				}
				break;
			case DIFERENCIA:
				{
				_localctx = new DiferenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(DIFERENCIA);
				setState(477);
				expr(0);
				setState(479); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(478);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(481); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case AZAR:
				{
				_localctx = new AzarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				match(AZAR);
				setState(484);
				expr(10);
				}
				break;
			case PRODUCTO:
				{
				_localctx = new ProductoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
				match(PRODUCTO);
				setState(486);
				expr(0);
				setState(488); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(487);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(490); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SUMA:
				{
				_localctx = new SumaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(492);
				match(SUMA);
				setState(493);
				expr(0);
				setState(495); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(494);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(497); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case POTENCIA:
				{
				_localctx = new PotenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(POTENCIA);
				setState(500);
				expr(0);
				setState(501);
				expr(7);
				}
				break;
			case DIVISION:
				{
				_localctx = new DivisionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				match(DIVISION);
				setState(504);
				expr(0);
				setState(505);
				expr(6);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(520);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(511);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(512);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(513);
						((MulDivContext)_localctx).right = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(514);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(515);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(516);
						((AddSubContext)_localctx).right = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(517);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(518);
						((ModContext)_localctx).op = match(T__13);
						setState(519);
						((ModContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001P\u020e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001b\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003u\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a5"+
		"\b\t\n\t\f\t\u00a8\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00b1\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00b7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bd"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c4\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d7\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00e7\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00ff\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0105\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0111\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u011b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u0127\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0143\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u017b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0186\b\u001d\n\u001d\f\u001d\u0189\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0197\b\u001e\n"+
		"\u001e\f\u001e\u019a\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a4"+
		"\b\u001f\n\u001f\f\u001f\u01a7\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01ad\b\u001f\n\u001f\f\u001f\u01b0\t\u001f\u0001"+
		"\u001f\u0003\u001f\u01b3\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0004#\u01e0\b#\u000b"+
		"#\f#\u01e1\u0001#\u0001#\u0001#\u0001#\u0001#\u0004#\u01e9\b#\u000b#\f"+
		"#\u01ea\u0001#\u0001#\u0001#\u0004#\u01f0\b#\u000b#\f#\u01f1\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01fe"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u0209\b#\n#\f#\u020c\t#\u0001#\u0000\u0001F$\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDF\u0000\u0005\u0001\u0000CJ\u0001\u0000\u000f\u0010\u0002\u0000"+
		"\u0002\u0002\u001e\u001e\u0001\u0000\n\u000b\u0001\u0000\f\r\u0234\u0000"+
		"K\u0001\u0000\u0000\u0000\u0002a\u0001\u0000\u0000\u0000\u0004n\u0001"+
		"\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000"+
		"\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u009b\u0001\u0000\u0000\u0000"+
		"\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000\u0000"+
		"\u0016\u00b6\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000"+
		"\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00d6\u0001\u0000\u0000\u0000"+
		"\u001e\u00d8\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000\u0000\""+
		"\u00ea\u0001\u0000\u0000\u0000$\u00f3\u0001\u0000\u0000\u0000&\u0100\u0001"+
		"\u0000\u0000\u0000(\u0110\u0001\u0000\u0000\u0000*\u011a\u0001\u0000\u0000"+
		"\u0000,\u0126\u0001\u0000\u0000\u0000.\u0142\u0001\u0000\u0000\u00000"+
		"\u0144\u0001\u0000\u0000\u00002\u0146\u0001\u0000\u0000\u00004\u014a\u0001"+
		"\u0000\u0000\u00006\u017a\u0001\u0000\u0000\u00008\u017c\u0001\u0000\u0000"+
		"\u0000:\u0182\u0001\u0000\u0000\u0000<\u018c\u0001\u0000\u0000\u0000>"+
		"\u019d\u0001\u0000\u0000\u0000@\u01b4\u0001\u0000\u0000\u0000B\u01ba\u0001"+
		"\u0000\u0000\u0000D\u01be\u0001\u0000\u0000\u0000F\u01fd\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0000\u0000\u0001"+
		"O\u0001\u0001\u0000\u0000\u0000Pb\u0003\u0004\u0002\u0000Qb\u0003\u0006"+
		"\u0003\u0000Rb\u0003(\u0014\u0000Sb\u0003*\u0015\u0000Tb\u0003,\u0016"+
		"\u0000Ub\u0003.\u0017\u0000Vb\u00032\u0019\u0000Wb\u0003\u0010\b\u0000"+
		"Xb\u0003\u000e\u0007\u0000Yb\u0003 \u0010\u0000Zb\u0003\"\u0011\u0000"+
		"[b\u0003\b\u0004\u0000\\b\u0003\n\u0005\u0000]b\u0003\f\u0006\u0000^_"+
		"\u0003F#\u0000_`\u0005\u0001\u0000\u0000`b\u0001\u0000\u0000\u0000aP\u0001"+
		"\u0000\u0000\u0000aQ\u0001\u0000\u0000\u0000aR\u0001\u0000\u0000\u0000"+
		"aS\u0001\u0000\u0000\u0000aT\u0001\u0000\u0000\u0000aU\u0001\u0000\u0000"+
		"\u0000aV\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000aX\u0001\u0000"+
		"\u0000\u0000aY\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a[\u0001"+
		"\u0000\u0000\u0000a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000"+
		"a^\u0001\u0000\u0000\u0000b\u0003\u0001\u0000\u0000\u0000cd\u0005\u001f"+
		"\u0000\u0000de\u0005L\u0000\u0000ef\u0003F#\u0000fg\u0005\u0001\u0000"+
		"\u0000go\u0001\u0000\u0000\u0000hi\u0005 \u0000\u0000ij\u0005L\u0000\u0000"+
		"jk\u0005\u0002\u0000\u0000kl\u0003F#\u0000lm\u0005\u0001\u0000\u0000m"+
		"o\u0001\u0000\u0000\u0000nc\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000"+
		"\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0005!\u0000\u0000qr\u0005\u0003"+
		"\u0000\u0000rt\u0005L\u0000\u0000su\u0003F#\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\u0004"+
		"\u0000\u0000wx\u0005\u0001\u0000\u0000x\u0007\u0001\u0000\u0000\u0000"+
		"yz\u00055\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u0003D\"\u0000|}\u0005"+
		"\u0006\u0000\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0003\u0012\t\u0000"+
		"\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0081\u0005\u0001\u0000\u0000"+
		"\u0081\t\u0001\u0000\u0000\u0000\u0082\u0083\u00056\u0000\u0000\u0083"+
		"\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000\u0085\u0086"+
		"\u0005\u0004\u0000\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088"+
		"\u0003D\"\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u008a\u0005"+
		"\u0001\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"7\u0000\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u008e\u0003D\""+
		"\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\u0004\u0000\u0000"+
		"\u0092\u0093\u0005\u0001\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u00052\u0000\u0000\u0095\u0096\u0003F#\u0000\u0096\u0097\u0005"+
		"\u0003\u0000\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098\u0099\u0005\u0004"+
		"\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u000f\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u00051\u0000\u0000\u009c\u009d\u0005\u0003\u0000"+
		"\u0000\u009d\u009e\u0003\u0012\t\u0000\u009e\u009f\u0005\u0004\u0000\u0000"+
		"\u009f\u00a0\u0005\u0001\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a6\u0003\u0014\n\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3"+
		"\u00a5\u0003\u0014\n\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00b1\u0003\u0016\u000b\u0000\u00aa\u00b1"+
		"\u0003\u0018\f\u0000\u00ab\u00b1\u0003\u001a\r\u0000\u00ac\u00b1\u0003"+
		"\u001c\u000e\u0000\u00ad\u00b1\u0003\u001e\u000f\u0000\u00ae\u00b1\u0003"+
		"$\u0012\u0000\u00af\u00b1\u0003&\u0013\u0000\u00b0\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\"\u0000\u0000"+
		"\u00b3\u00b7\u0003F#\u0000\u00b4\u00b5\u0005#\u0000\u0000\u00b5\u00b7"+
		"\u0003F#\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005$\u0000"+
		"\u0000\u00b9\u00bd\u0003F#\u0000\u00ba\u00bb\u0005%\u0000\u0000\u00bb"+
		"\u00bd\u0003F#\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u0019\u0001\u0000\u0000\u0000\u00be\u00c4\u0005"+
		"&\u0000\u0000\u00bf\u00c0\u0005\'\u0000\u0000\u00c0\u00c4\u00030\u0018"+
		"\u0000\u00c1\u00c4\u0005/\u0000\u0000\u00c2\u00c4\u00050\u0000\u0000\u00c3"+
		"\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u001b\u0001\u0000\u0000\u0000\u00c5\u00d7\u0005(\u0000\u0000\u00c6\u00c7"+
		"\u0005*\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u00c9\u0003"+
		"F#\u0000\u00c9\u00ca\u0003F#\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000"+
		"\u00cb\u00d7\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd"+
		"\u00ce\u0003F#\u0000\u00ce\u00cf\u0003F#\u0000\u00cf\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005+\u0000\u0000\u00d1\u00d7\u0003F#\u0000"+
		"\u00d2\u00d3\u0005-\u0000\u0000\u00d3\u00d7\u0003F#\u0000\u00d4\u00d5"+
		"\u0005.\u0000\u0000\u00d5\u00d7\u0003F#\u0000\u00d6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00c6\u0001\u0000\u0000\u0000\u00d6\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u001d\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005)\u0000\u0000\u00d9\u00da\u0003F#\u0000"+
		"\u00da\u001f\u0001\u0000\u0000\u0000\u00db\u00dc\u00053\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0005\u0000\u0000\u00dd\u00de\u0003D\"\u0000\u00de\u00df"+
		"\u0005\u0006\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1"+
		"\u0003\u0012\t\u0000\u00e1\u00e6\u0005\u0004\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0003\u0000\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00e5\u0005\u0004"+
		"\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0001\u0000\u0000\u00e9!\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u00054\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000"+
		"\u00ec\u00ed\u0003\u0012\t\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0005\u0000\u0000\u00ef\u00f0\u0003D\"\u0000\u00f0\u00f1"+
		"\u0005\u0006\u0000\u0000\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2#\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u00053\u0000\u0000\u00f4\u00f5\u0005\u0005"+
		"\u0000\u0000\u00f5\u00f6\u0003D\"\u0000\u00f6\u00f7\u0005\u0006\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000\u00f8\u00f9\u0003\u0012\t\u0000"+
		"\u00f9\u00fe\u0005\u0004\u0000\u0000\u00fa\u00fb\u0005\u0003\u0000\u0000"+
		"\u00fb\u00fc\u0003\u0012\t\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff%\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005!\u0000\u0000\u0101\u0102\u0005\u0003\u0000\u0000\u0102\u0104\u0005"+
		"L\u0000\u0000\u0103\u0105\u0003F#\u0000\u0104\u0103\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005\u0004\u0000\u0000\u0107\'\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\"\u0000\u0000\u0109\u010a\u0003F#\u0000\u010a\u010b"+
		"\u0005\u0001\u0000\u0000\u010b\u0111\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0005#\u0000\u0000\u010d\u010e\u0003F#\u0000\u010e\u010f\u0005\u0001"+
		"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000"+
		"\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111)\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005$\u0000\u0000\u0113\u0114\u0003F#\u0000\u0114"+
		"\u0115\u0005\u0001\u0000\u0000\u0115\u011b\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005%\u0000\u0000\u0117\u0118\u0003F#\u0000\u0118\u0119\u0005"+
		"\u0001\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0112\u0001"+
		"\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000\u011b+\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005&\u0000\u0000\u011d\u0127\u0005\u0001\u0000"+
		"\u0000\u011e\u011f\u0005\'\u0000\u0000\u011f\u0120\u00030\u0018\u0000"+
		"\u0120\u0121\u0005\u0001\u0000\u0000\u0121\u0127\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005/\u0000\u0000\u0123\u0127\u0005\u0001\u0000\u0000\u0124"+
		"\u0125\u00050\u0000\u0000\u0125\u0127\u0005\u0001\u0000\u0000\u0126\u011c"+
		"\u0001\u0000\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u0122"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127-\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005(\u0000\u0000\u0129\u0143\u0005\u0001"+
		"\u0000\u0000\u012a\u012b\u0005*\u0000\u0000\u012b\u012c\u0005\u0003\u0000"+
		"\u0000\u012c\u012d\u0003F#\u0000\u012d\u012e\u0003F#\u0000\u012e\u012f"+
		"\u0005\u0004\u0000\u0000\u012f\u0130\u0005\u0001\u0000\u0000\u0130\u0143"+
		"\u0001\u0000\u0000\u0000\u0131\u0132\u0005*\u0000\u0000\u0132\u0133\u0003"+
		"F#\u0000\u0133\u0134\u0003F#\u0000\u0134\u0135\u0005\u0001\u0000\u0000"+
		"\u0135\u0143\u0001\u0000\u0000\u0000\u0136\u0137\u0005+\u0000\u0000\u0137"+
		"\u0138\u0003F#\u0000\u0138\u0139\u0005\u0001\u0000\u0000\u0139\u0143\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0005-\u0000\u0000\u013b\u013c\u0003F#"+
		"\u0000\u013c\u013d\u0005\u0001\u0000\u0000\u013d\u0143\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0005.\u0000\u0000\u013f\u0140\u0003F#\u0000\u0140"+
		"\u0141\u0005\u0001\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000\u0142"+
		"\u0128\u0001\u0000\u0000\u0000\u0142\u012a\u0001\u0000\u0000\u0000\u0142"+
		"\u0131\u0001\u0000\u0000\u0000\u0142\u0136\u0001\u0000\u0000\u0000\u0142"+
		"\u013a\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0143"+
		"/\u0001\u0000\u0000\u0000\u0144\u0145\u0007\u0000\u0000\u0000\u01451\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0005)\u0000\u0000\u0147\u0148\u0003F#"+
		"\u0000\u0148\u0149\u0005\u0001\u0000\u0000\u01493\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0007\u0001\u0000\u0000\u014b5\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005\u0011\u0000\u0000\u014d\u014e\u0005\u0018\u0000\u0000\u014e"+
		"\u014f\u0005\u0005\u0000\u0000\u014f\u0150\u0003F#\u0000\u0150\u0151\u0005"+
		"\u0007\u0000\u0000\u0151\u0152\u0003F#\u0000\u0152\u0153\u0005\u0007\u0000"+
		"\u0000\u0153\u0154\u0003F#\u0000\u0154\u0155\u0005\u0007\u0000\u0000\u0155"+
		"\u0156\u0003F#\u0000\u0156\u0157\u0005\u0006\u0000\u0000\u0157\u0158\u0005"+
		"\u0001\u0000\u0000\u0158\u017b\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0011\u0000\u0000\u015a\u015b\u0005\u0019\u0000\u0000\u015b\u015c\u0005"+
		"\u0005\u0000\u0000\u015c\u015d\u0003F#\u0000\u015d\u015e\u0005\u0007\u0000"+
		"\u0000\u015e\u015f\u0003F#\u0000\u015f\u0160\u0005\u0007\u0000\u0000\u0160"+
		"\u0161\u0003F#\u0000\u0161\u0162\u0005\u0007\u0000\u0000\u0162\u0163\u0003"+
		"F#\u0000\u0163\u0164\u0005\u0006\u0000\u0000\u0164\u0165\u0005\u0001\u0000"+
		"\u0000\u0165\u017b\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0011\u0000"+
		"\u0000\u0167\u0168\u0005\u001a\u0000\u0000\u0168\u0169\u0005\u0005\u0000"+
		"\u0000\u0169\u016a\u0003F#\u0000\u016a\u016b\u0005\u0007\u0000\u0000\u016b"+
		"\u016c\u0003F#\u0000\u016c\u016d\u0005\u0007\u0000\u0000\u016d\u016e\u0003"+
		"F#\u0000\u016e\u016f\u0005\u0006\u0000\u0000\u016f\u0170\u0005\u0001\u0000"+
		"\u0000\u0170\u017b\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0011\u0000"+
		"\u0000\u0172\u0173\u0005\u001b\u0000\u0000\u0173\u0174\u0005\u0005\u0000"+
		"\u0000\u0174\u0175\u0003F#\u0000\u0175\u0176\u0005\u0007\u0000\u0000\u0176"+
		"\u0177\u0003F#\u0000\u0177\u0178\u0005\u0006\u0000\u0000\u0178\u0179\u0005"+
		"\u0001\u0000\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u014c\u0001"+
		"\u0000\u0000\u0000\u017a\u0159\u0001\u0000\u0000\u0000\u017a\u0166\u0001"+
		"\u0000\u0000\u0000\u017a\u0171\u0001\u0000\u0000\u0000\u017b7\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0005\u0012\u0000\u0000\u017d\u017e\u0005\u0005"+
		"\u0000\u0000\u017e\u017f\u0003F#\u0000\u017f\u0180\u0005\u0006\u0000\u0000"+
		"\u0180\u0181\u0005\u0001\u0000\u0000\u01819\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005\u0013\u0000\u0000\u0183\u0187\u0005\b\u0000\u0000\u0184\u0186"+
		"\u0003\u0002\u0001\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189"+
		"\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005\t\u0000\u0000\u018b;\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005\u0014\u0000\u0000\u018d\u018e\u0005"+
		"\u0005\u0000\u0000\u018e\u018f\u0003B!\u0000\u018f\u0190\u0005\u0001\u0000"+
		"\u0000\u0190\u0191\u0003D\"\u0000\u0191\u0192\u0005\u0001\u0000\u0000"+
		"\u0192\u0193\u0003B!\u0000\u0193\u0194\u0005\u0006\u0000\u0000\u0194\u0198"+
		"\u0005\b\u0000\u0000\u0195\u0197\u0003\u0002\u0001\u0000\u0196\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001"+
		"\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0005"+
		"\t\u0000\u0000\u019c=\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0015"+
		"\u0000\u0000\u019e\u019f\u0005\u0005\u0000\u0000\u019f\u01a0\u0003D\""+
		"\u0000\u01a0\u01a1\u0005\u0006\u0000\u0000\u01a1\u01a5\u0005\b\u0000\u0000"+
		"\u01a2\u01a4\u0003\u0002\u0001\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01b2\u0005\t\u0000\u0000\u01a9"+
		"\u01aa\u0005\u0016\u0000\u0000\u01aa\u01ae\u0005\b\u0000\u0000\u01ab\u01ad"+
		"\u0003\u0002\u0001\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005\t\u0000\u0000\u01b2\u01a9\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3?\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005\u0017\u0000\u0000\u01b5\u01b6\u0005\u0005"+
		"\u0000\u0000\u01b6\u01b7\u0003F#\u0000\u01b7\u01b8\u0005\u0006\u0000\u0000"+
		"\u01b8\u01b9\u0005\u0001\u0000\u0000\u01b9A\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0005L\u0000\u0000\u01bb\u01bc\u0005\u0002\u0000\u0000\u01bc\u01bd"+
		"\u0003F#\u0000\u01bdC\u0001\u0000\u0000\u0000\u01be\u01bf\u0003F#\u0000"+
		"\u01bf\u01c0\u0007\u0002\u0000\u0000\u01c0\u01c1\u0003F#\u0000\u01c1E"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0006#\uffff\uffff\u0000\u01c3\u01c4"+
		"\u0005\u0005\u0000\u0000\u01c4\u01c5\u0003F#\u0000\u01c5\u01c6\u0005\u0006"+
		"\u0000\u0000\u01c6\u01fe\u0001\u0000\u0000\u0000\u01c7\u01fe\u0005,\u0000"+
		"\u0000\u01c8\u01c9\u00058\u0000\u0000\u01c9\u01ca\u0003F#\u0000\u01ca"+
		"\u01cb\u0003F#\u0010\u01cb\u01fe\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005"+
		"9\u0000\u0000\u01cd\u01ce\u0003F#\u0000\u01ce\u01cf\u0003F#\u000f\u01cf"+
		"\u01fe\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005:\u0000\u0000\u01d1\u01d2"+
		"\u0003F#\u0000\u01d2\u01d3\u0003F#\u000e\u01d3\u01fe\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0005;\u0000\u0000\u01d5\u01d6\u0003F#\u0000\u01d6"+
		"\u01d7\u0003F#\r\u01d7\u01fe\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005"+
		"<\u0000\u0000\u01d9\u01da\u0003F#\u0000\u01da\u01db\u0003F#\f\u01db\u01fe"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005=\u0000\u0000\u01dd\u01df\u0003"+
		"F#\u0000\u01de\u01e0\u0003F#\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01fe\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0005>\u0000\u0000\u01e4\u01fe\u0003F#\n\u01e5\u01e6\u0005"+
		"?\u0000\u0000\u01e6\u01e8\u0003F#\u0000\u01e7\u01e9\u0003F#\u0000\u01e8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01fe\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005@\u0000\u0000\u01ed\u01ef"+
		"\u0003F#\u0000\u01ee\u01f0\u0003F#\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01fe\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0005A\u0000\u0000\u01f4\u01f5\u0003F#\u0000\u01f5"+
		"\u01f6\u0003F#\u0007\u01f6\u01fe\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005"+
		"B\u0000\u0000\u01f8\u01f9\u0003F#\u0000\u01f9\u01fa\u0003F#\u0006\u01fa"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fb\u01fe\u0005L\u0000\u0000\u01fc\u01fe"+
		"\u0005M\u0000\u0000\u01fd\u01c2\u0001\u0000\u0000\u0000\u01fd\u01c7\u0001"+
		"\u0000\u0000\u0000\u01fd\u01c8\u0001\u0000\u0000\u0000\u01fd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01fd\u01d0\u0001\u0000\u0000\u0000\u01fd\u01d4\u0001"+
		"\u0000\u0000\u0000\u01fd\u01d8\u0001\u0000\u0000\u0000\u01fd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01fd\u01e3\u0001\u0000\u0000\u0000\u01fd\u01e5\u0001"+
		"\u0000\u0000\u0000\u01fd\u01ec\u0001\u0000\u0000\u0000\u01fd\u01f3\u0001"+
		"\u0000\u0000\u0000\u01fd\u01f7\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u020a\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\n\u0005\u0000\u0000\u0200\u0201\u0007\u0003"+
		"\u0000\u0000\u0201\u0209\u0003F#\u0006\u0202\u0203\n\u0004\u0000\u0000"+
		"\u0203\u0204\u0007\u0004\u0000\u0000\u0204\u0209\u0003F#\u0005\u0205\u0206"+
		"\n\u0003\u0000\u0000\u0206\u0207\u0005\u000e\u0000\u0000\u0207\u0209\u0003"+
		"F#\u0004\u0208\u01ff\u0001\u0000\u0000\u0000\u0208\u0202\u0001\u0000\u0000"+
		"\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000"+
		"\u0000\u020bG\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000"+
		"\u001dKant\u00a6\u00b0\u00b6\u00bc\u00c3\u00d6\u00e6\u00fe\u0104\u0110"+
		"\u011a\u0126\u0142\u017a\u0187\u0198\u01a5\u01ae\u01b2\u01e1\u01ea\u01f1"+
		"\u01fd\u0208\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}