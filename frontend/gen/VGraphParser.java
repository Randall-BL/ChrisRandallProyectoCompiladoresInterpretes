// Generated from E:/tec/2025/iisem/Compiladores E Interpetres/Proyecto/ChrisRandallProyectoCompiladoresInterpretes/frontend/src/main/antlr4/com/miorganizacion/vgraph/frontend/VGraph.g4 by ANTLR 4.13.2
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
		T__9=10, T__10=11, T__11=12, COMP_OP=13, HAZ=14, INIC=15, INC=16, AVANZA=17, 
		RETROCEDE=18, GIRADERECHA=19, GIRAIZQUIERDA=20, OCULTATORTUGA=21, PONCOLORLAPIZ=22, 
		CENTRO=23, ESPERA=24, PONPOS=25, PONRUMBO=26, RUMBO=27, PONX=28, PONY=29, 
		BAJALAPIZ=30, SUBELAPIZ=31, EJECUTA=32, REPITE=33, SI=34, HAZHASTA=35, 
		HASTA=36, HAZMIENTRAS=37, MIENTRAS=38, IGUALES=39, Y=40, O=41, MAYORQUE=42, 
		MENORQUE=43, DIFERENCIA=44, AZAR=45, PRODUCTO=46, SUMA=47, POTENCIA=48, 
		DIVISION=49, ROJO=50, VERDE=51, AZUL=52, AMARILLO=53, CYAN=54, MAGENTA=55, 
		BLANCO=56, NEGRO=57, ID=58, INT=59, FLOAT=60, WS=61, COMMENT=62;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_varStmt = 2, RULE_incStmt = 3, 
		RULE_repiteStmt = 4, RULE_ejecutaStmt = 5, RULE_siStmt = 6, RULE_hazHastaStmt = 7, 
		RULE_hastaStmt = 8, RULE_hazMientrasStmt = 9, RULE_mientrasStmt = 10, 
		RULE_ordenList = 11, RULE_ordenSinPuntoYComa = 12, RULE_siSinPuntoYComa = 13, 
		RULE_incStmtSinPC = 14, RULE_repiteStmtSinPC = 15, RULE_mientrasStmtSinPC = 16, 
		RULE_hastaStmtSinPC = 17, RULE_hazMientrasStmtSinPC = 18, RULE_hazHastaStmtSinPC = 19, 
		RULE_turtleMoveStmt = 20, RULE_turtleTurnStmt = 21, RULE_turtleStateStmt = 22, 
		RULE_turtlePosStmt = 23, RULE_esperaStmt = 24, RULE_turtleMoveStmtSinPC = 25, 
		RULE_turtleTurnStmtSinPC = 26, RULE_turtleStateStmtSinPC = 27, RULE_turtlePosStmtSinPC = 28, 
		RULE_esperaStmtSinPC = 29, RULE_colorName = 30, RULE_condition = 31, RULE_expr = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "varStmt", "incStmt", "repiteStmt", "ejecutaStmt", 
			"siStmt", "hazHastaStmt", "hastaStmt", "hazMientrasStmt", "mientrasStmt", 
			"ordenList", "ordenSinPuntoYComa", "siSinPuntoYComa", "incStmtSinPC", 
			"repiteStmtSinPC", "mientrasStmtSinPC", "hastaStmtSinPC", "hazMientrasStmtSinPC", 
			"hazHastaStmtSinPC", "turtleMoveStmt", "turtleTurnStmt", "turtleStateStmt", 
			"turtlePosStmt", "esperaStmt", "turtleMoveStmtSinPC", "turtleTurnStmtSinPC", 
			"turtleStateStmtSinPC", "turtlePosStmtSinPC", "esperaStmtSinPC", "colorName", 
			"condition", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'['", "']'", "'('", "')'", "','", "'*'", "'/'", 
			"'+'", "'-'", "'%'", null, "'Haz'", "'inic'", "'inc'", null, null, null, 
			null, null, null, "'centro'", "'espera'", null, "'ponrumbo'", "'rumbo'", 
			"'ponx'", "'pony'", null, null, null, null, "'SI'", "'HAZ.HASTA'", "'HASTA'", 
			"'HAZ.MIENTRAS'", "'MIENTRAS'", "'iguales?'", "'Y'", "'O'", "'mayorque?'", 
			"'menorque?'", "'Diferencia'", "'azar'", "'producto'", "'suma'", "'potencia'", 
			"'division'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMP_OP", "HAZ", "INIC", "INC", "AVANZA", "RETROCEDE", "GIRADERECHA", 
			"GIRAIZQUIERDA", "OCULTATORTUGA", "PONCOLORLAPIZ", "CENTRO", "ESPERA", 
			"PONPOS", "PONRUMBO", "RUMBO", "PONX", "PONY", "BAJALAPIZ", "SUBELAPIZ", 
			"EJECUTA", "REPITE", "SI", "HAZHASTA", "HASTA", "HAZMIENTRAS", "MIENTRAS", 
			"IGUALES", "Y", "O", "MAYORQUE", "MENORQUE", "DIFERENCIA", "AZAR", "PRODUCTO", 
			"SUMA", "POTENCIA", "DIVISION", "ROJO", "VERDE", "AZUL", "AMARILLO", 
			"CYAN", "MAGENTA", "BLANCO", "NEGRO", "ID", "INT", "FLOAT", "WS", "COMMENT"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 865817028361961504L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	public static class StmtAssignContext extends StatementContext {
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtAssign(this);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StmtVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				varStmt();
				}
				break;
			case 2:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__0);
				setState(77);
				expr(0);
				setState(78);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new StmtIncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				incStmt();
				}
				break;
			case 4:
				_localctx = new StmtTurtleMoveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				turtleMoveStmt();
				}
				break;
			case 5:
				_localctx = new StmtTurtleTurnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				turtleTurnStmt();
				}
				break;
			case 6:
				_localctx = new StmtTurtleStateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				turtleStateStmt();
				}
				break;
			case 7:
				_localctx = new StmtTurtlePosContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				turtlePosStmt();
				}
				break;
			case 8:
				_localctx = new StmtEsperaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				esperaStmt();
				}
				break;
			case 9:
				_localctx = new StmtEjecutaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				ejecutaStmt();
				}
				break;
			case 10:
				_localctx = new StmtRepiteContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(87);
				repiteStmt();
				}
				break;
			case 11:
				_localctx = new StmtSiContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				siStmt();
				}
				break;
			case 12:
				_localctx = new StmtHazHastaContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(89);
				hazHastaStmt();
				}
				break;
			case 13:
				_localctx = new StmtHastaContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				hastaStmt();
				}
				break;
			case 14:
				_localctx = new StmtHazMientrasContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				hazMientrasStmt();
				}
				break;
			case 15:
				_localctx = new StmtMientrasContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(92);
				mientrasStmt();
				}
				break;
			case 16:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(93);
				expr(0);
				setState(94);
				match(T__1);
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
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
				_localctx = new StmtHazContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(HAZ);
				setState(99);
				match(ID);
				setState(100);
				expr(0);
				setState(101);
				match(T__1);
				}
				break;
			case INIC:
				_localctx = new StmtInicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(INIC);
				setState(104);
				match(ID);
				setState(105);
				match(T__0);
				setState(106);
				expr(0);
				setState(107);
				match(T__1);
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
			setState(111);
			match(INC);
			setState(112);
			match(T__2);
			setState(113);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 865816478740381728L) != 0)) {
				{
				setState(114);
				expr(0);
				}
			}

			setState(117);
			match(T__3);
			setState(118);
			match(T__1);
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
		enterRule(_localctx, 8, RULE_repiteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(REPITE);
			setState(121);
			expr(0);
			setState(122);
			match(T__2);
			setState(123);
			ordenList();
			setState(124);
			match(T__3);
			setState(125);
			match(T__1);
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
		enterRule(_localctx, 10, RULE_ejecutaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(EJECUTA);
			setState(128);
			match(T__2);
			setState(129);
			ordenList();
			setState(130);
			match(T__3);
			setState(131);
			match(T__1);
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
		enterRule(_localctx, 12, RULE_siStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SI);
			setState(134);
			match(T__4);
			setState(135);
			condition();
			setState(136);
			match(T__5);
			setState(137);
			match(T__2);
			setState(138);
			ordenList();
			setState(139);
			match(T__3);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(140);
				match(T__2);
				setState(141);
				ordenList();
				setState(142);
				match(T__3);
				}
			}

			setState(146);
			match(T__1);
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
		enterRule(_localctx, 14, RULE_hazHastaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(HAZHASTA);
			setState(149);
			match(T__2);
			setState(150);
			ordenList();
			setState(151);
			match(T__3);
			setState(152);
			match(T__4);
			setState(153);
			condition();
			setState(154);
			match(T__5);
			setState(155);
			match(T__1);
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
		enterRule(_localctx, 16, RULE_hastaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(HASTA);
			setState(158);
			match(T__4);
			setState(159);
			condition();
			setState(160);
			match(T__5);
			setState(161);
			match(T__2);
			setState(162);
			ordenList();
			setState(163);
			match(T__3);
			setState(164);
			match(T__1);
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
		enterRule(_localctx, 18, RULE_hazMientrasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(HAZMIENTRAS);
			setState(167);
			match(T__2);
			setState(168);
			ordenList();
			setState(169);
			match(T__3);
			setState(170);
			match(T__4);
			setState(171);
			condition();
			setState(172);
			match(T__5);
			setState(173);
			match(T__1);
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
		enterRule(_localctx, 20, RULE_mientrasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(MIENTRAS);
			setState(176);
			match(T__4);
			setState(177);
			condition();
			setState(178);
			match(T__5);
			setState(179);
			match(T__2);
			setState(180);
			ordenList();
			setState(181);
			match(T__3);
			setState(182);
			match(T__1);
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
		enterRule(_localctx, 22, RULE_ordenList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			ordenSinPuntoYComa();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(185);
				match(T__6);
				setState(186);
				ordenSinPuntoYComa();
				}
				}
				setState(191);
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
		public RepiteStmtSinPCContext repiteStmtSinPC() {
			return getRuleContext(RepiteStmtSinPCContext.class,0);
		}
		public MientrasStmtSinPCContext mientrasStmtSinPC() {
			return getRuleContext(MientrasStmtSinPCContext.class,0);
		}
		public HastaStmtSinPCContext hastaStmtSinPC() {
			return getRuleContext(HastaStmtSinPCContext.class,0);
		}
		public HazMientrasStmtSinPCContext hazMientrasStmtSinPC() {
			return getRuleContext(HazMientrasStmtSinPCContext.class,0);
		}
		public HazHastaStmtSinPCContext hazHastaStmtSinPC() {
			return getRuleContext(HazHastaStmtSinPCContext.class,0);
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
		enterRule(_localctx, 24, RULE_ordenSinPuntoYComa);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
			case RETROCEDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				turtleMoveStmtSinPC();
				}
				break;
			case GIRADERECHA:
			case GIRAIZQUIERDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				turtleTurnStmtSinPC();
				}
				break;
			case OCULTATORTUGA:
			case PONCOLORLAPIZ:
			case BAJALAPIZ:
			case SUBELAPIZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
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
				setState(195);
				turtlePosStmtSinPC();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				esperaStmtSinPC();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				siSinPuntoYComa();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				incStmtSinPC();
				}
				break;
			case REPITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				repiteStmtSinPC();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				mientrasStmtSinPC();
				}
				break;
			case HASTA:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				hastaStmtSinPC();
				}
				break;
			case HAZMIENTRAS:
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				hazMientrasStmtSinPC();
				}
				break;
			case HAZHASTA:
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				hazHastaStmtSinPC();
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
	public static class SiSinPuntoYComaContext extends ParserRuleContext {
		public SiSinPuntoYComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siSinPuntoYComa; }
	 
		public SiSinPuntoYComaContext() { }
		public void copyFrom(SiSinPuntoYComaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiSinPCContext extends SiSinPuntoYComaContext {
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
		public SiSinPCContext(SiSinPuntoYComaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSiSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSiSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSiSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiSinPuntoYComaContext siSinPuntoYComa() throws RecognitionException {
		SiSinPuntoYComaContext _localctx = new SiSinPuntoYComaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_siSinPuntoYComa);
		int _la;
		try {
			_localctx = new SiSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(SI);
			setState(207);
			match(T__4);
			setState(208);
			condition();
			setState(209);
			match(T__5);
			setState(210);
			match(T__2);
			setState(211);
			ordenList();
			setState(212);
			match(T__3);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(213);
				match(T__2);
				setState(214);
				ordenList();
				setState(215);
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
		public IncStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incStmtSinPC; }
	 
		public IncStmtSinPCContext() { }
		public void copyFrom(IncStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncSinPCContext extends IncStmtSinPCContext {
		public TerminalNode INC() { return getToken(VGraphParser.INC, 0); }
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncSinPCContext(IncStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterIncSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitIncSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitIncSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncStmtSinPCContext incStmtSinPC() throws RecognitionException {
		IncStmtSinPCContext _localctx = new IncStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_incStmtSinPC);
		int _la;
		try {
			_localctx = new IncSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(INC);
			setState(220);
			match(T__2);
			setState(221);
			match(ID);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 865816478740381728L) != 0)) {
				{
				setState(222);
				expr(0);
				}
			}

			setState(225);
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
	public static class RepiteStmtSinPCContext extends ParserRuleContext {
		public RepiteStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repiteStmtSinPC; }
	 
		public RepiteStmtSinPCContext() { }
		public void copyFrom(RepiteStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepiteSinPCContext extends RepiteStmtSinPCContext {
		public TerminalNode REPITE() { return getToken(VGraphParser.REPITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public RepiteSinPCContext(RepiteStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterRepiteSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitRepiteSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitRepiteSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteStmtSinPCContext repiteStmtSinPC() throws RecognitionException {
		RepiteStmtSinPCContext _localctx = new RepiteStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_repiteStmtSinPC);
		try {
			_localctx = new RepiteSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(REPITE);
			setState(228);
			expr(0);
			setState(229);
			match(T__2);
			setState(230);
			ordenList();
			setState(231);
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
	public static class MientrasStmtSinPCContext extends ParserRuleContext {
		public MientrasStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientrasStmtSinPC; }
	 
		public MientrasStmtSinPCContext() { }
		public void copyFrom(MientrasStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MientrasSinPCContext extends MientrasStmtSinPCContext {
		public TerminalNode MIENTRAS() { return getToken(VGraphParser.MIENTRAS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public MientrasSinPCContext(MientrasStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMientrasSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMientrasSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMientrasSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasStmtSinPCContext mientrasStmtSinPC() throws RecognitionException {
		MientrasStmtSinPCContext _localctx = new MientrasStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mientrasStmtSinPC);
		try {
			_localctx = new MientrasSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(MIENTRAS);
			setState(234);
			match(T__4);
			setState(235);
			condition();
			setState(236);
			match(T__5);
			setState(237);
			match(T__2);
			setState(238);
			ordenList();
			setState(239);
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
	public static class HastaStmtSinPCContext extends ParserRuleContext {
		public HastaStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastaStmtSinPC; }
	 
		public HastaStmtSinPCContext() { }
		public void copyFrom(HastaStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HastaSinPCContext extends HastaStmtSinPCContext {
		public TerminalNode HASTA() { return getToken(VGraphParser.HASTA, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public HastaSinPCContext(HastaStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHastaSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHastaSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHastaSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastaStmtSinPCContext hastaStmtSinPC() throws RecognitionException {
		HastaStmtSinPCContext _localctx = new HastaStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hastaStmtSinPC);
		try {
			_localctx = new HastaSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(HASTA);
			setState(242);
			match(T__4);
			setState(243);
			condition();
			setState(244);
			match(T__5);
			setState(245);
			match(T__2);
			setState(246);
			ordenList();
			setState(247);
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
	public static class HazMientrasStmtSinPCContext extends ParserRuleContext {
		public HazMientrasStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hazMientrasStmtSinPC; }
	 
		public HazMientrasStmtSinPCContext() { }
		public void copyFrom(HazMientrasStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HazMientrasSinPCContext extends HazMientrasStmtSinPCContext {
		public TerminalNode HAZMIENTRAS() { return getToken(VGraphParser.HAZMIENTRAS, 0); }
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HazMientrasSinPCContext(HazMientrasStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHazMientrasSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHazMientrasSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHazMientrasSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazMientrasStmtSinPCContext hazMientrasStmtSinPC() throws RecognitionException {
		HazMientrasStmtSinPCContext _localctx = new HazMientrasStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hazMientrasStmtSinPC);
		try {
			_localctx = new HazMientrasSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(HAZMIENTRAS);
			setState(250);
			match(T__2);
			setState(251);
			ordenList();
			setState(252);
			match(T__3);
			setState(253);
			match(T__4);
			setState(254);
			condition();
			setState(255);
			match(T__5);
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
	public static class HazHastaStmtSinPCContext extends ParserRuleContext {
		public HazHastaStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hazHastaStmtSinPC; }
	 
		public HazHastaStmtSinPCContext() { }
		public void copyFrom(HazHastaStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HazHastaSinPCContext extends HazHastaStmtSinPCContext {
		public TerminalNode HAZHASTA() { return getToken(VGraphParser.HAZHASTA, 0); }
		public OrdenListContext ordenList() {
			return getRuleContext(OrdenListContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HazHastaSinPCContext(HazHastaStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterHazHastaSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitHazHastaSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitHazHastaSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazHastaStmtSinPCContext hazHastaStmtSinPC() throws RecognitionException {
		HazHastaStmtSinPCContext _localctx = new HazHastaStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_hazHastaStmtSinPC);
		try {
			_localctx = new HazHastaSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(HAZHASTA);
			setState(258);
			match(T__2);
			setState(259);
			ordenList();
			setState(260);
			match(T__3);
			setState(261);
			match(T__4);
			setState(262);
			condition();
			setState(263);
			match(T__5);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
				_localctx = new MoveAvanzaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(AVANZA);
				setState(266);
				expr(0);
				setState(267);
				match(T__1);
				}
				break;
			case RETROCEDE:
				_localctx = new MoveRetrocedeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(RETROCEDE);
				setState(270);
				expr(0);
				setState(271);
				match(T__1);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GIRADERECHA:
				_localctx = new TurnRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(GIRADERECHA);
				setState(276);
				expr(0);
				setState(277);
				match(T__1);
				}
				break;
			case GIRAIZQUIERDA:
				_localctx = new TurnLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(GIRAIZQUIERDA);
				setState(280);
				expr(0);
				setState(281);
				match(T__1);
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
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCULTATORTUGA:
				_localctx = new StateHideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(OCULTATORTUGA);
				setState(286);
				match(T__1);
				}
				break;
			case PONCOLORLAPIZ:
				_localctx = new StateSetColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(PONCOLORLAPIZ);
				setState(288);
				colorName();
				setState(289);
				match(T__1);
				}
				break;
			case BAJALAPIZ:
				_localctx = new StatePenDownContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(BAJALAPIZ);
				setState(292);
				match(T__1);
				}
				break;
			case SUBELAPIZ:
				_localctx = new StatePenUpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(SUBELAPIZ);
				setState(294);
				match(T__1);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new PosCenterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(CENTRO);
				setState(298);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new PosSetXYBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(PONPOS);
				setState(300);
				match(T__2);
				setState(301);
				expr(0);
				setState(302);
				expr(0);
				setState(303);
				match(T__3);
				setState(304);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new PosSetXYNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(PONPOS);
				setState(307);
				expr(0);
				setState(308);
				expr(0);
				setState(309);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new PosSetHeadingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(PONRUMBO);
				setState(312);
				expr(0);
				setState(313);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new PosSetXContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(PONX);
				setState(316);
				expr(0);
				setState(317);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new PosSetYContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(PONY);
				setState(320);
				expr(0);
				setState(321);
				match(T__1);
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
		enterRule(_localctx, 48, RULE_esperaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ESPERA);
			setState(326);
			expr(0);
			setState(327);
			match(T__1);
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
		enterRule(_localctx, 50, RULE_turtleMoveStmtSinPC);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
				_localctx = new MoveAvanzaSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(AVANZA);
				setState(330);
				expr(0);
				}
				break;
			case RETROCEDE:
				_localctx = new MoveRetrocedeSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(RETROCEDE);
				setState(332);
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
		enterRule(_localctx, 52, RULE_turtleTurnStmtSinPC);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GIRADERECHA:
				_localctx = new TurnRightSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(GIRADERECHA);
				setState(336);
				expr(0);
				}
				break;
			case GIRAIZQUIERDA:
				_localctx = new TurnLeftSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(GIRAIZQUIERDA);
				setState(338);
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
		enterRule(_localctx, 54, RULE_turtleStateStmtSinPC);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCULTATORTUGA:
				_localctx = new StateHideSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(OCULTATORTUGA);
				}
				break;
			case PONCOLORLAPIZ:
				_localctx = new StateSetColorSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(PONCOLORLAPIZ);
				setState(343);
				colorName();
				}
				break;
			case BAJALAPIZ:
				_localctx = new StatePenDownSinPCContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(BAJALAPIZ);
				}
				break;
			case SUBELAPIZ:
				_localctx = new StatePenUpSinPCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
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
		enterRule(_localctx, 56, RULE_turtlePosStmtSinPC);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PosCenterSinPCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(CENTRO);
				}
				break;
			case 2:
				_localctx = new PosSetXYBracketsSinPCContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(PONPOS);
				setState(350);
				match(T__2);
				setState(351);
				expr(0);
				setState(352);
				expr(0);
				setState(353);
				match(T__3);
				setState(354);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new PosSetXYNoBracketsSinPCContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(PONPOS);
				setState(357);
				expr(0);
				setState(358);
				expr(0);
				}
				break;
			case 4:
				_localctx = new PosSetHeadingSinPCContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(PONRUMBO);
				setState(361);
				expr(0);
				}
				break;
			case 5:
				_localctx = new PosSetXSinPCContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(PONX);
				setState(363);
				expr(0);
				}
				break;
			case 6:
				_localctx = new PosSetYSinPCContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(PONY);
				setState(365);
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
		public EsperaStmtSinPCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperaStmtSinPC; }
	 
		public EsperaStmtSinPCContext() { }
		public void copyFrom(EsperaStmtSinPCContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EsperaSinPCContext extends EsperaStmtSinPCContext {
		public TerminalNode ESPERA() { return getToken(VGraphParser.ESPERA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EsperaSinPCContext(EsperaStmtSinPCContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterEsperaSinPC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitEsperaSinPC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitEsperaSinPC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaStmtSinPCContext esperaStmtSinPC() throws RecognitionException {
		EsperaStmtSinPCContext _localctx = new EsperaStmtSinPCContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_esperaStmtSinPC);
		try {
			_localctx = new EsperaSinPCContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ESPERA);
			setState(369);
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
		enterRule(_localctx, 60, RULE_colorName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 287104476244869120L) != 0)) ) {
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
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
	public static class CompExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OP() { return getToken(VGraphParser.COMP_OP, 0); }
		public CompExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitCompExpr(this);
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
	public static class MayorqueContext extends ExprContext {
		public TerminalNode MAYORQUE() { return getToken(VGraphParser.MAYORQUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MayorqueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMayorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMayorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMayorque(this);
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
	public static class MenorqueContext extends ExprContext {
		public TerminalNode MENORQUE() { return getToken(VGraphParser.MENORQUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MenorqueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterMenorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitMenorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitMenorque(this);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(376);
				match(T__4);
				setState(377);
				expr(0);
				setState(378);
				match(T__5);
				}
				break;
			case RUMBO:
				{
				_localctx = new ExprRumboContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(RUMBO);
				}
				break;
			case IGUALES:
				{
				_localctx = new IgualesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				match(IGUALES);
				setState(382);
				expr(0);
				setState(383);
				expr(17);
				}
				break;
			case Y:
				{
				_localctx = new YLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(Y);
				setState(386);
				expr(0);
				setState(387);
				expr(16);
				}
				break;
			case O:
				{
				_localctx = new OLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				match(O);
				setState(390);
				expr(0);
				setState(391);
				expr(15);
				}
				break;
			case MAYORQUE:
				{
				_localctx = new MayorqueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(MAYORQUE);
				setState(394);
				expr(0);
				setState(395);
				expr(14);
				}
				break;
			case MENORQUE:
				{
				_localctx = new MenorqueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(397);
				match(MENORQUE);
				setState(398);
				expr(0);
				setState(399);
				expr(13);
				}
				break;
			case DIFERENCIA:
				{
				_localctx = new DiferenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(401);
				match(DIFERENCIA);
				setState(402);
				expr(0);
				setState(404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case AZAR:
				{
				_localctx = new AzarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(408);
				match(AZAR);
				setState(409);
				expr(11);
				}
				break;
			case PRODUCTO:
				{
				_localctx = new ProductoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				match(PRODUCTO);
				setState(411);
				expr(0);
				setState(413); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(412);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(415); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SUMA:
				{
				_localctx = new SumaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(417);
				match(SUMA);
				setState(418);
				expr(0);
				setState(420); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(419);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(422); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case POTENCIA:
				{
				_localctx = new PotenciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(POTENCIA);
				setState(425);
				expr(0);
				setState(426);
				expr(8);
				}
				break;
			case DIVISION:
				{
				_localctx = new DivisionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				match(DIVISION);
				setState(429);
				expr(0);
				setState(430);
				expr(7);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(433);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(448);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(436);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(437);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(438);
						((MulDivContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(439);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(440);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(441);
						((AddSubContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(442);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(443);
						((ModContext)_localctx).op = match(T__11);
						setState(444);
						((ModContext)_localctx).right = expr(5);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(445);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(446);
						match(COMP_OP);
						setState(447);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 32:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u01c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00bc\b\u000b\n\u000b\f\u000b\u00bf\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00cd\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00da\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e0\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0112\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011c\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0128\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0144\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u014e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0154\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u015b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u016f\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0004 \u0195\b \u000b"+
		" \f \u0196\u0001 \u0001 \u0001 \u0001 \u0001 \u0004 \u019e\b \u000b \f"+
		" \u019f\u0001 \u0001 \u0001 \u0004 \u01a5\b \u000b \f \u01a6\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01b3"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u01c1\b \n \f \u01c4\t \u0001 \u0000\u0001@!\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@\u0000\u0003\u0001\u000029\u0001\u0000\b\t\u0001"+
		"\u0000\n\u000b\u01ee\u0000E\u0001\u0000\u0000\u0000\u0002`\u0001\u0000"+
		"\u0000\u0000\u0004m\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000"+
		"\bx\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0085\u0001"+
		"\u0000\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u009d\u0001"+
		"\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00af\u0001"+
		"\u0000\u0000\u0000\u0016\u00b8\u0001\u0000\u0000\u0000\u0018\u00cc\u0001"+
		"\u0000\u0000\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00db\u0001"+
		"\u0000\u0000\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00e9\u0001\u0000"+
		"\u0000\u0000\"\u00f1\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000"+
		"\u0000&\u0101\u0001\u0000\u0000\u0000(\u0111\u0001\u0000\u0000\u0000*"+
		"\u011b\u0001\u0000\u0000\u0000,\u0127\u0001\u0000\u0000\u0000.\u0143\u0001"+
		"\u0000\u0000\u00000\u0145\u0001\u0000\u0000\u00002\u014d\u0001\u0000\u0000"+
		"\u00004\u0153\u0001\u0000\u0000\u00006\u015a\u0001\u0000\u0000\u00008"+
		"\u016e\u0001\u0000\u0000\u0000:\u0170\u0001\u0000\u0000\u0000<\u0173\u0001"+
		"\u0000\u0000\u0000>\u0175\u0001\u0000\u0000\u0000@\u01b2\u0001\u0000\u0000"+
		"\u0000BD\u0003\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000\u0000\u0001"+
		"I\u0001\u0001\u0000\u0000\u0000Ja\u0003\u0004\u0002\u0000KL\u0005:\u0000"+
		"\u0000LM\u0005\u0001\u0000\u0000MN\u0003@ \u0000NO\u0005\u0002\u0000\u0000"+
		"Oa\u0001\u0000\u0000\u0000Pa\u0003\u0006\u0003\u0000Qa\u0003(\u0014\u0000"+
		"Ra\u0003*\u0015\u0000Sa\u0003,\u0016\u0000Ta\u0003.\u0017\u0000Ua\u0003"+
		"0\u0018\u0000Va\u0003\n\u0005\u0000Wa\u0003\b\u0004\u0000Xa\u0003\f\u0006"+
		"\u0000Ya\u0003\u000e\u0007\u0000Za\u0003\u0010\b\u0000[a\u0003\u0012\t"+
		"\u0000\\a\u0003\u0014\n\u0000]^\u0003@ \u0000^_\u0005\u0002\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`J\u0001\u0000\u0000\u0000`K\u0001\u0000\u0000"+
		"\u0000`P\u0001\u0000\u0000\u0000`Q\u0001\u0000\u0000\u0000`R\u0001\u0000"+
		"\u0000\u0000`S\u0001\u0000\u0000\u0000`T\u0001\u0000\u0000\u0000`U\u0001"+
		"\u0000\u0000\u0000`V\u0001\u0000\u0000\u0000`W\u0001\u0000\u0000\u0000"+
		"`X\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000"+
		"\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`]\u0001\u0000"+
		"\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bc\u0005\u000e\u0000\u0000"+
		"cd\u0005:\u0000\u0000de\u0003@ \u0000ef\u0005\u0002\u0000\u0000fn\u0001"+
		"\u0000\u0000\u0000gh\u0005\u000f\u0000\u0000hi\u0005:\u0000\u0000ij\u0005"+
		"\u0001\u0000\u0000jk\u0003@ \u0000kl\u0005\u0002\u0000\u0000ln\u0001\u0000"+
		"\u0000\u0000mb\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000n\u0005"+
		"\u0001\u0000\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0005\u0003\u0000"+
		"\u0000qs\u0005:\u0000\u0000rt\u0003@ \u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0004\u0000"+
		"\u0000vw\u0005\u0002\u0000\u0000w\u0007\u0001\u0000\u0000\u0000xy\u0005"+
		"!\u0000\u0000yz\u0003@ \u0000z{\u0005\u0003\u0000\u0000{|\u0003\u0016"+
		"\u000b\u0000|}\u0005\u0004\u0000\u0000}~\u0005\u0002\u0000\u0000~\t\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005 \u0000\u0000\u0080\u0081\u0005\u0003"+
		"\u0000\u0000\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0005\u0004"+
		"\u0000\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u000b\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086\u0087\u0005\u0005\u0000"+
		"\u0000\u0087\u0088\u0003>\u001f\u0000\u0088\u0089\u0005\u0006\u0000\u0000"+
		"\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000"+
		"\u008b\u0090\u0005\u0004\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000"+
		"\u008d\u008e\u0003\u0016\u000b\u0000\u008e\u008f\u0005\u0004\u0000\u0000"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u0002\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005#\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097"+
		"\u0003\u0016\u000b\u0000\u0097\u0098\u0005\u0004\u0000\u0000\u0098\u0099"+
		"\u0005\u0005\u0000\u0000\u0099\u009a\u0003>\u001f\u0000\u009a\u009b\u0005"+
		"\u0006\u0000\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u000f\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005$\u0000\u0000\u009e\u009f\u0005\u0005"+
		"\u0000\u0000\u009f\u00a0\u0003>\u001f\u0000\u00a0\u00a1\u0005\u0006\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0003\u0016\u000b"+
		"\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000"+
		"\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005%\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0003\u0000\u0000\u00a8\u00a9\u0003\u0016\u000b\u0000"+
		"\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005\u0005\u0000\u0000"+
		"\u00ab\u00ac\u0003>\u001f\u0000\u00ac\u00ad\u0005\u0006\u0000\u0000\u00ad"+
		"\u00ae\u0005\u0002\u0000\u0000\u00ae\u0013\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005&\u0000\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b2"+
		"\u0003>\u001f\u0000\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0003\u0000\u0000\u00b4\u00b5\u0003\u0016\u000b\u0000\u00b5\u00b6\u0005"+
		"\u0004\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u0015\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bd\u0003\u0018\f\u0000\u00b9\u00ba\u0005\u0007"+
		"\u0000\u0000\u00ba\u00bc\u0003\u0018\f\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0017\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00cd\u00032\u0019\u0000"+
		"\u00c1\u00cd\u00034\u001a\u0000\u00c2\u00cd\u00036\u001b\u0000\u00c3\u00cd"+
		"\u00038\u001c\u0000\u00c4\u00cd\u0003:\u001d\u0000\u00c5\u00cd\u0003\u001a"+
		"\r\u0000\u00c6\u00cd\u0003\u001c\u000e\u0000\u00c7\u00cd\u0003\u001e\u000f"+
		"\u0000\u00c8\u00cd\u0003 \u0010\u0000\u00c9\u00cd\u0003\"\u0011\u0000"+
		"\u00ca\u00cd\u0003$\u0012\u0000\u00cb\u00cd\u0003&\u0013\u0000\u00cc\u00c0"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c1\u0001\u0000\u0000\u0000\u00cc\u00c2"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000\u0000\u0000\u00cc\u00c4"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u0019"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0005\u0000\u0000\u00d0\u00d1\u0003>\u001f\u0000\u00d1\u00d2\u0005\u0006"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0003\u0000\u0000\u00d3\u00d4\u0003\u0016"+
		"\u000b\u0000\u00d4\u00d9\u0005\u0004\u0000\u0000\u00d5\u00d6\u0005\u0003"+
		"\u0000\u0000\u00d6\u00d7\u0003\u0016\u000b\u0000\u00d7\u00d8\u0005\u0004"+
		"\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u001b\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0010\u0000\u0000\u00dc\u00dd\u0005\u0003"+
		"\u0000\u0000\u00dd\u00df\u0005:\u0000\u0000\u00de\u00e0\u0003@ \u0000"+
		"\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000"+
		"\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005!\u0000\u0000\u00e4"+
		"\u00e5\u0003@ \u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6\u00e7\u0003"+
		"\u0016\u000b\u0000\u00e7\u00e8\u0005\u0004\u0000\u0000\u00e8\u001f\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0005&\u0000\u0000\u00ea\u00eb\u0005\u0005"+
		"\u0000\u0000\u00eb\u00ec\u0003>\u001f\u0000\u00ec\u00ed\u0005\u0006\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0003\u0000\u0000\u00ee\u00ef\u0003\u0016\u000b"+
		"\u0000\u00ef\u00f0\u0005\u0004\u0000\u0000\u00f0!\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0005$\u0000\u0000\u00f2\u00f3\u0005\u0005\u0000\u0000\u00f3"+
		"\u00f4\u0003>\u001f\u0000\u00f4\u00f5\u0005\u0006\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0003\u0000\u0000\u00f6\u00f7\u0003\u0016\u000b\u0000\u00f7\u00f8"+
		"\u0005\u0004\u0000\u0000\u00f8#\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"%\u0000\u0000\u00fa\u00fb\u0005\u0003\u0000\u0000\u00fb\u00fc\u0003\u0016"+
		"\u000b\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd\u00fe\u0005\u0005"+
		"\u0000\u0000\u00fe\u00ff\u0003>\u001f\u0000\u00ff\u0100\u0005\u0006\u0000"+
		"\u0000\u0100%\u0001\u0000\u0000\u0000\u0101\u0102\u0005#\u0000\u0000\u0102"+
		"\u0103\u0005\u0003\u0000\u0000\u0103\u0104\u0003\u0016\u000b\u0000\u0104"+
		"\u0105\u0005\u0004\u0000\u0000\u0105\u0106\u0005\u0005\u0000\u0000\u0106"+
		"\u0107\u0003>\u001f\u0000\u0107\u0108\u0005\u0006\u0000\u0000\u0108\'"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a\u010b"+
		"\u0003@ \u0000\u010b\u010c\u0005\u0002\u0000\u0000\u010c\u0112\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u0012\u0000\u0000\u010e\u010f\u0003@ \u0000"+
		"\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000"+
		"\u0111\u0109\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0112)\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u0013\u0000\u0000\u0114"+
		"\u0115\u0003@ \u0000\u0115\u0116\u0005\u0002\u0000\u0000\u0116\u011c\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\u0014\u0000\u0000\u0118\u0119\u0003"+
		"@ \u0000\u0119\u011a\u0005\u0002\u0000\u0000\u011a\u011c\u0001\u0000\u0000"+
		"\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000"+
		"\u0000\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0015\u0000\u0000"+
		"\u011e\u0128\u0005\u0002\u0000\u0000\u011f\u0120\u0005\u0016\u0000\u0000"+
		"\u0120\u0121\u0003<\u001e\u0000\u0121\u0122\u0005\u0002\u0000\u0000\u0122"+
		"\u0128\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u001e\u0000\u0000\u0124"+
		"\u0128\u0005\u0002\u0000\u0000\u0125\u0126\u0005\u001f\u0000\u0000\u0126"+
		"\u0128\u0005\u0002\u0000\u0000\u0127\u011d\u0001\u0000\u0000\u0000\u0127"+
		"\u011f\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0128-\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u0017\u0000\u0000\u012a\u0144\u0005\u0002\u0000\u0000\u012b\u012c"+
		"\u0005\u0019\u0000\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u012e"+
		"\u0003@ \u0000\u012e\u012f\u0003@ \u0000\u012f\u0130\u0005\u0004\u0000"+
		"\u0000\u0130\u0131\u0005\u0002\u0000\u0000\u0131\u0144\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005\u0019\u0000\u0000\u0133\u0134\u0003@ \u0000\u0134"+
		"\u0135\u0003@ \u0000\u0135\u0136\u0005\u0002\u0000\u0000\u0136\u0144\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0005\u001a\u0000\u0000\u0138\u0139\u0003"+
		"@ \u0000\u0139\u013a\u0005\u0002\u0000\u0000\u013a\u0144\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0005\u001c\u0000\u0000\u013c\u013d\u0003@ \u0000\u013d"+
		"\u013e\u0005\u0002\u0000\u0000\u013e\u0144\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\u001d\u0000\u0000\u0140\u0141\u0003@ \u0000\u0141\u0142\u0005"+
		"\u0002\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0129\u0001"+
		"\u0000\u0000\u0000\u0143\u012b\u0001\u0000\u0000\u0000\u0143\u0132\u0001"+
		"\u0000\u0000\u0000\u0143\u0137\u0001\u0000\u0000\u0000\u0143\u013b\u0001"+
		"\u0000\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0144/\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005\u0018\u0000\u0000\u0146\u0147\u0003@ \u0000"+
		"\u0147\u0148\u0005\u0002\u0000\u0000\u01481\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0005\u0011\u0000\u0000\u014a\u014e\u0003@ \u0000\u014b\u014c\u0005"+
		"\u0012\u0000\u0000\u014c\u014e\u0003@ \u0000\u014d\u0149\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e3\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005\u0013\u0000\u0000\u0150\u0154\u0003@ \u0000\u0151\u0152"+
		"\u0005\u0014\u0000\u0000\u0152\u0154\u0003@ \u0000\u0153\u014f\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u01545\u0001\u0000\u0000"+
		"\u0000\u0155\u015b\u0005\u0015\u0000\u0000\u0156\u0157\u0005\u0016\u0000"+
		"\u0000\u0157\u015b\u0003<\u001e\u0000\u0158\u015b\u0005\u001e\u0000\u0000"+
		"\u0159\u015b\u0005\u001f\u0000\u0000\u015a\u0155\u0001\u0000\u0000\u0000"+
		"\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u0159\u0001\u0000\u0000\u0000\u015b7\u0001\u0000\u0000\u0000\u015c"+
		"\u016f\u0005\u0017\u0000\u0000\u015d\u015e\u0005\u0019\u0000\u0000\u015e"+
		"\u015f\u0005\u0003\u0000\u0000\u015f\u0160\u0003@ \u0000\u0160\u0161\u0003"+
		"@ \u0000\u0161\u0162\u0005\u0004\u0000\u0000\u0162\u0163\u0005\u0002\u0000"+
		"\u0000\u0163\u016f\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0019\u0000"+
		"\u0000\u0165\u0166\u0003@ \u0000\u0166\u0167\u0003@ \u0000\u0167\u016f"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u001a\u0000\u0000\u0169\u016f"+
		"\u0003@ \u0000\u016a\u016b\u0005\u001c\u0000\u0000\u016b\u016f\u0003@"+
		" \u0000\u016c\u016d\u0005\u001d\u0000\u0000\u016d\u016f\u0003@ \u0000"+
		"\u016e\u015c\u0001\u0000\u0000\u0000\u016e\u015d\u0001\u0000\u0000\u0000"+
		"\u016e\u0164\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000"+
		"\u016e\u016a\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016f9\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0018\u0000\u0000\u0171"+
		"\u0172\u0003@ \u0000\u0172;\u0001\u0000\u0000\u0000\u0173\u0174\u0007"+
		"\u0000\u0000\u0000\u0174=\u0001\u0000\u0000\u0000\u0175\u0176\u0003@ "+
		"\u0000\u0176?\u0001\u0000\u0000\u0000\u0177\u0178\u0006 \uffff\uffff\u0000"+
		"\u0178\u0179\u0005\u0005\u0000\u0000\u0179\u017a\u0003@ \u0000\u017a\u017b"+
		"\u0005\u0006\u0000\u0000\u017b\u01b3\u0001\u0000\u0000\u0000\u017c\u01b3"+
		"\u0005\u001b\u0000\u0000\u017d\u017e\u0005\'\u0000\u0000\u017e\u017f\u0003"+
		"@ \u0000\u017f\u0180\u0003@ \u0011\u0180\u01b3\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005(\u0000\u0000\u0182\u0183\u0003@ \u0000\u0183\u0184"+
		"\u0003@ \u0010\u0184\u01b3\u0001\u0000\u0000\u0000\u0185\u0186\u0005)"+
		"\u0000\u0000\u0186\u0187\u0003@ \u0000\u0187\u0188\u0003@ \u000f\u0188"+
		"\u01b3\u0001\u0000\u0000\u0000\u0189\u018a\u0005*\u0000\u0000\u018a\u018b"+
		"\u0003@ \u0000\u018b\u018c\u0003@ \u000e\u018c\u01b3\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0005+\u0000\u0000\u018e\u018f\u0003@ \u0000\u018f"+
		"\u0190\u0003@ \r\u0190\u01b3\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		",\u0000\u0000\u0192\u0194\u0003@ \u0000\u0193\u0195\u0003@ \u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u01b3\u0001\u0000\u0000\u0000\u0198\u0199\u0005-\u0000\u0000\u0199\u01b3"+
		"\u0003@ \u000b\u019a\u019b\u0005.\u0000\u0000\u019b\u019d\u0003@ \u0000"+
		"\u019c\u019e\u0003@ \u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u01b3\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005/\u0000\u0000\u01a2\u01a4\u0003@ \u0000\u01a3\u01a5\u0003@ \u0000"+
		"\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01b3\u0001\u0000\u0000\u0000\u01a8\u01a9\u00050\u0000\u0000\u01a9"+
		"\u01aa\u0003@ \u0000\u01aa\u01ab\u0003@ \b\u01ab\u01b3\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u00051\u0000\u0000\u01ad\u01ae\u0003@ \u0000\u01ae"+
		"\u01af\u0003@ \u0007\u01af\u01b3\u0001\u0000\u0000\u0000\u01b0\u01b3\u0005"+
		":\u0000\u0000\u01b1\u01b3\u0005;\u0000\u0000\u01b2\u0177\u0001\u0000\u0000"+
		"\u0000\u01b2\u017c\u0001\u0000\u0000\u0000\u01b2\u017d\u0001\u0000\u0000"+
		"\u0000\u01b2\u0181\u0001\u0000\u0000\u0000\u01b2\u0185\u0001\u0000\u0000"+
		"\u0000\u01b2\u0189\u0001\u0000\u0000\u0000\u01b2\u018d\u0001\u0000\u0000"+
		"\u0000\u01b2\u0191\u0001\u0000\u0000\u0000\u01b2\u0198\u0001\u0000\u0000"+
		"\u0000\u01b2\u019a\u0001\u0000\u0000\u0000\u01b2\u01a1\u0001\u0000\u0000"+
		"\u0000\u01b2\u01a8\u0001\u0000\u0000\u0000\u01b2\u01ac\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01c2\u0001\u0000\u0000\u0000\u01b4\u01b5\n\u0006\u0000\u0000"+
		"\u01b5\u01b6\u0007\u0001\u0000\u0000\u01b6\u01c1\u0003@ \u0007\u01b7\u01b8"+
		"\n\u0005\u0000\u0000\u01b8\u01b9\u0007\u0002\u0000\u0000\u01b9\u01c1\u0003"+
		"@ \u0006\u01ba\u01bb\n\u0004\u0000\u0000\u01bb\u01bc\u0005\f\u0000\u0000"+
		"\u01bc\u01c1\u0003@ \u0005\u01bd\u01be\n\u0003\u0000\u0000\u01be\u01bf"+
		"\u0005\r\u0000\u0000\u01bf\u01c1\u0003@ \u0004\u01c0\u01b4\u0001\u0000"+
		"\u0000\u0000\u01c0\u01b7\u0001\u0000\u0000\u0000\u01c0\u01ba\u0001\u0000"+
		"\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3A\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u0017E`ms\u0090\u00bd\u00cc\u00d9\u00df\u0111\u011b\u0127\u0143"+
		"\u014d\u0153\u015a\u016e\u0196\u019f\u01a6\u01b2\u01c0\u01c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}