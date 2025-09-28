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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INT_TYPE=15, COLOR_TYPE=16, 
		DRAW=17, SETCOLOR=18, FRAME=19, LOOP=20, IF=21, ELSE=22, WAIT=23, LINE=24, 
		RECT=25, CIRCLE=26, PIXEL=27, COS=28, SIN=29, COMP_OP=30, HAZ=31, INIC=32, 
		INC=33, AVANZA=34, RETROCEDE=35, GIRADERECHA=36, GIRAIZQUIERDA=37, OCULTATORTUGA=38, 
		PONCOLORLAPIZ=39, CENTRO=40, ESPERA=41, PONPOS=42, PONRUMBO=43, RUMBO=44, 
		PONX=45, PONY=46, BAJALAPIZ=47, SUBELAPIZ=48, COLOR_LITERAL=49, ID=50, 
		INT=51, FLOAT=52, WS=53, COMMENT=54;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_varStmt = 2, RULE_incStmt = 3, 
		RULE_turtleMoveStmt = 4, RULE_turtleTurnStmt = 5, RULE_turtleStateStmt = 6, 
		RULE_turtlePosStmt = 7, RULE_esperaStmt = 8, RULE_type = 9, RULE_drawStmt = 10, 
		RULE_setcolorStmt = 11, RULE_frameStmt = 12, RULE_loopStmt = 13, RULE_ifStmt = 14, 
		RULE_waitStmt = 15, RULE_assignment = 16, RULE_condition = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "varStmt", "incStmt", "turtleMoveStmt", "turtleTurnStmt", 
			"turtleStateStmt", "turtlePosStmt", "esperaStmt", "type", "drawStmt", 
			"setcolorStmt", "frameStmt", "loopStmt", "ifStmt", "waitStmt", "assignment", 
			"condition", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'('", "','", "')'", "'{'", "'}'", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'int'", "'color'", "'draw'", "'setcolor'", 
			"'frame'", "'loop'", "'if'", "'else'", "'wait'", "'line'", "'rect'", 
			"'circle'", "'pixel'", "'cos'", "'sin'", null, "'Haz'", "'inic'", "'inc'", 
			null, null, null, null, null, null, "'centro'", "'espera'", null, "'ponrumbo'", 
			"'rumbo'", "'ponx'", "'pony'"
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
			"COLOR_LITERAL", "ID", "INT", "FLOAT", "WS", "COMMENT"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545355619893248L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
			case INIC:
				_localctx = new StmtVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				varStmt();
				}
				break;
			case INC:
				_localctx = new StmtIncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				incStmt();
				}
				break;
			case AVANZA:
			case RETROCEDE:
				_localctx = new StmtTurtleMoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				turtleMoveStmt();
				}
				break;
			case GIRADERECHA:
			case GIRAIZQUIERDA:
				_localctx = new StmtTurtleTurnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
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
				setState(50);
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
				setState(51);
				turtlePosStmt();
				}
				break;
			case ESPERA:
				_localctx = new StmtEsperaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				esperaStmt();
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
				_localctx = new StmtHazContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(HAZ);
				setState(56);
				match(ID);
				setState(57);
				expr(0);
				setState(58);
				match(T__0);
				}
				break;
			case INIC:
				_localctx = new StmtInicContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(INIC);
				setState(61);
				match(ID);
				setState(62);
				match(T__1);
				setState(63);
				expr(0);
				setState(64);
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
			setState(68);
			match(INC);
			setState(69);
			match(T__2);
			setState(70);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3395291906572320L) != 0)) {
				{
				setState(71);
				expr(0);
				}
			}

			setState(74);
			match(T__3);
			setState(75);
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
		enterRule(_localctx, 8, RULE_turtleMoveStmt);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVANZA:
				_localctx = new MoveAvanzaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(AVANZA);
				setState(78);
				expr(0);
				setState(79);
				match(T__0);
				}
				break;
			case RETROCEDE:
				_localctx = new MoveRetrocedeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(RETROCEDE);
				setState(82);
				expr(0);
				setState(83);
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
		enterRule(_localctx, 10, RULE_turtleTurnStmt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GIRADERECHA:
				_localctx = new TurnRightContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(GIRADERECHA);
				setState(88);
				expr(0);
				setState(89);
				match(T__0);
				}
				break;
			case GIRAIZQUIERDA:
				_localctx = new TurnLeftContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(GIRAIZQUIERDA);
				setState(92);
				expr(0);
				setState(93);
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
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_turtleStateStmt);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCULTATORTUGA:
				_localctx = new StateHideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(OCULTATORTUGA);
				setState(98);
				match(T__0);
				}
				break;
			case PONCOLORLAPIZ:
				_localctx = new StateSetColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(PONCOLORLAPIZ);
				setState(100);
				match(ID);
				setState(101);
				match(T__0);
				}
				break;
			case BAJALAPIZ:
				_localctx = new StatePenDownContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(BAJALAPIZ);
				setState(103);
				match(T__0);
				}
				break;
			case SUBELAPIZ:
				_localctx = new StatePenUpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(SUBELAPIZ);
				setState(105);
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
		enterRule(_localctx, 14, RULE_turtlePosStmt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PosCenterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(CENTRO);
				setState(109);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new PosSetXYBracketsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(PONPOS);
				setState(111);
				match(T__2);
				setState(112);
				expr(0);
				setState(113);
				expr(0);
				setState(114);
				match(T__3);
				setState(115);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new PosSetXYNoBracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(PONPOS);
				setState(118);
				expr(0);
				setState(119);
				expr(0);
				setState(120);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new PosSetHeadingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(PONRUMBO);
				setState(123);
				expr(0);
				setState(124);
				match(T__0);
				}
				break;
			case 5:
				_localctx = new PosSetXContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(PONX);
				setState(127);
				expr(0);
				setState(128);
				match(T__0);
				}
				break;
			case 6:
				_localctx = new PosSetYContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(PONY);
				setState(131);
				expr(0);
				setState(132);
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
		enterRule(_localctx, 16, RULE_esperaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ESPERA);
			setState(137);
			expr(0);
			setState(138);
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
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		enterRule(_localctx, 20, RULE_drawStmt);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DrawLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(DRAW);
				setState(143);
				match(LINE);
				setState(144);
				match(T__4);
				setState(145);
				expr(0);
				setState(146);
				match(T__5);
				setState(147);
				expr(0);
				setState(148);
				match(T__5);
				setState(149);
				expr(0);
				setState(150);
				match(T__5);
				setState(151);
				expr(0);
				setState(152);
				match(T__6);
				setState(153);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new DrawRectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(DRAW);
				setState(156);
				match(RECT);
				setState(157);
				match(T__4);
				setState(158);
				expr(0);
				setState(159);
				match(T__5);
				setState(160);
				expr(0);
				setState(161);
				match(T__5);
				setState(162);
				expr(0);
				setState(163);
				match(T__5);
				setState(164);
				expr(0);
				setState(165);
				match(T__6);
				setState(166);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new DrawCircleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(DRAW);
				setState(169);
				match(CIRCLE);
				setState(170);
				match(T__4);
				setState(171);
				expr(0);
				setState(172);
				match(T__5);
				setState(173);
				expr(0);
				setState(174);
				match(T__5);
				setState(175);
				expr(0);
				setState(176);
				match(T__6);
				setState(177);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new DrawPixelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(DRAW);
				setState(180);
				match(PIXEL);
				setState(181);
				match(T__4);
				setState(182);
				expr(0);
				setState(183);
				match(T__5);
				setState(184);
				expr(0);
				setState(185);
				match(T__6);
				setState(186);
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
		enterRule(_localctx, 22, RULE_setcolorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SETCOLOR);
			setState(191);
			match(T__4);
			setState(192);
			expr(0);
			setState(193);
			match(T__6);
			setState(194);
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
		enterRule(_localctx, 24, RULE_frameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(FRAME);
			setState(197);
			match(T__7);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545355619893248L) != 0)) {
				{
				{
				setState(198);
				statement();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		enterRule(_localctx, 26, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LOOP);
			setState(207);
			match(T__4);
			setState(208);
			((LoopStmtContext)_localctx).init = assignment();
			setState(209);
			match(T__0);
			setState(210);
			((LoopStmtContext)_localctx).cond = condition();
			setState(211);
			match(T__0);
			setState(212);
			((LoopStmtContext)_localctx).update = assignment();
			setState(213);
			match(T__6);
			setState(214);
			match(T__7);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545355619893248L) != 0)) {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
		enterRule(_localctx, 28, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(IF);
			setState(224);
			match(T__4);
			setState(225);
			((IfStmtContext)_localctx).cond = condition();
			setState(226);
			match(T__6);
			setState(227);
			match(T__7);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545355619893248L) != 0)) {
				{
				{
				setState(228);
				statement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(T__8);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(235);
				match(ELSE);
				setState(236);
				match(T__7);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 545355619893248L) != 0)) {
					{
					{
					setState(237);
					statement();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
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
		enterRule(_localctx, 30, RULE_waitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(WAIT);
			setState(247);
			match(T__4);
			setState(248);
			expr(0);
			setState(249);
			match(T__6);
			setState(250);
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
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID);
			setState(253);
			match(T__1);
			setState(254);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expr(0);
			setState(257);
			((ConditionContext)_localctx).op = match(COMP_OP);
			setState(258);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				match(T__4);
				setState(262);
				expr(0);
				setState(263);
				match(T__6);
				}
				break;
			case RUMBO:
				{
				_localctx = new ExprRumboContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(RUMBO);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(271);
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
						setState(272);
						((MulDivContext)_localctx).right = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(274);
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
						setState(275);
						((AddSubContext)_localctx).right = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						((ModContext)_localctx).op = match(T__13);
						setState(278);
						((ModContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 18:
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
		"\u0004\u00016\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006k\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0087\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00bd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00c8\b\f\n\f\f\f\u00cb"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d9\b\r\n\r\f\r\u00dc\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00e6\b\u000e\n\u000e\f\u000e\u00e9\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ef\b\u000e\n\u000e"+
		"\f\u000e\u00f2\t\u000e\u0001\u000e\u0003\u000e\u00f5\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u010d\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0118\b\u0012\n\u0012\f\u0012\u011b"+
		"\t\u0012\u0001\u0012\u0000\u0001$\u0013\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\n\u000b\u0001\u0000\f\r\u012a\u0000"+
		")\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004B\u0001"+
		"\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000"+
		"\u0000\n_\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e\u0086"+
		"\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u008c"+
		"\u0001\u0000\u0000\u0000\u0014\u00bc\u0001\u0000\u0000\u0000\u0016\u00be"+
		"\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000\u0000\u0000\u001a\u00ce"+
		"\u0001\u0000\u0000\u0000\u001c\u00df\u0001\u0000\u0000\u0000\u001e\u00f6"+
		"\u0001\u0000\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u0100\u0001"+
		"\u0000\u0000\u0000$\u010c\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000"+
		"\u0000.6\u0003\u0004\u0002\u0000/6\u0003\u0006\u0003\u000006\u0003\b\u0004"+
		"\u000016\u0003\n\u0005\u000026\u0003\f\u0006\u000036\u0003\u000e\u0007"+
		"\u000046\u0003\u0010\b\u00005.\u0001\u0000\u0000\u00005/\u0001\u0000\u0000"+
		"\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0003"+
		"\u0001\u0000\u0000\u000078\u0005\u001f\u0000\u000089\u00052\u0000\u0000"+
		"9:\u0003$\u0012\u0000:;\u0005\u0001\u0000\u0000;C\u0001\u0000\u0000\u0000"+
		"<=\u0005 \u0000\u0000=>\u00052\u0000\u0000>?\u0005\u0002\u0000\u0000?"+
		"@\u0003$\u0012\u0000@A\u0005\u0001\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B7\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000\u0000C\u0005\u0001\u0000"+
		"\u0000\u0000DE\u0005!\u0000\u0000EF\u0005\u0003\u0000\u0000FH\u00052\u0000"+
		"\u0000GI\u0003$\u0012\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0001"+
		"\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0005\"\u0000\u0000NO\u0003"+
		"$\u0012\u0000OP\u0005\u0001\u0000\u0000PV\u0001\u0000\u0000\u0000QR\u0005"+
		"#\u0000\u0000RS\u0003$\u0012\u0000ST\u0005\u0001\u0000\u0000TV\u0001\u0000"+
		"\u0000\u0000UM\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000V\t\u0001"+
		"\u0000\u0000\u0000WX\u0005$\u0000\u0000XY\u0003$\u0012\u0000YZ\u0005\u0001"+
		"\u0000\u0000Z`\u0001\u0000\u0000\u0000[\\\u0005%\u0000\u0000\\]\u0003"+
		"$\u0012\u0000]^\u0005\u0001\u0000\u0000^`\u0001\u0000\u0000\u0000_W\u0001"+
		"\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000"+
		"\u0000ab\u0005&\u0000\u0000bk\u0005\u0001\u0000\u0000cd\u0005\'\u0000"+
		"\u0000de\u00052\u0000\u0000ek\u0005\u0001\u0000\u0000fg\u0005/\u0000\u0000"+
		"gk\u0005\u0001\u0000\u0000hi\u00050\u0000\u0000ik\u0005\u0001\u0000\u0000"+
		"ja\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0005(\u0000"+
		"\u0000m\u0087\u0005\u0001\u0000\u0000no\u0005*\u0000\u0000op\u0005\u0003"+
		"\u0000\u0000pq\u0003$\u0012\u0000qr\u0003$\u0012\u0000rs\u0005\u0004\u0000"+
		"\u0000st\u0005\u0001\u0000\u0000t\u0087\u0001\u0000\u0000\u0000uv\u0005"+
		"*\u0000\u0000vw\u0003$\u0012\u0000wx\u0003$\u0012\u0000xy\u0005\u0001"+
		"\u0000\u0000y\u0087\u0001\u0000\u0000\u0000z{\u0005+\u0000\u0000{|\u0003"+
		"$\u0012\u0000|}\u0005\u0001\u0000\u0000}\u0087\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005-\u0000\u0000\u007f\u0080\u0003$\u0012\u0000\u0080\u0081"+
		"\u0005\u0001\u0000\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005.\u0000\u0000\u0083\u0084\u0003$\u0012\u0000\u0084\u0085\u0005\u0001"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086l\u0001\u0000\u0000"+
		"\u0000\u0086n\u0001\u0000\u0000\u0000\u0086u\u0001\u0000\u0000\u0000\u0086"+
		"z\u0001\u0000\u0000\u0000\u0086~\u0001\u0000\u0000\u0000\u0086\u0082\u0001"+
		"\u0000\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		")\u0000\u0000\u0089\u008a\u0003$\u0012\u0000\u008a\u008b\u0005\u0001\u0000"+
		"\u0000\u008b\u0011\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0000\u0000"+
		"\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0011\u0000"+
		"\u0000\u008f\u0090\u0005\u0018\u0000\u0000\u0090\u0091\u0005\u0005\u0000"+
		"\u0000\u0091\u0092\u0003$\u0012\u0000\u0092\u0093\u0005\u0006\u0000\u0000"+
		"\u0093\u0094\u0003$\u0012\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095"+
		"\u0096\u0003$\u0012\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0098"+
		"\u0003$\u0012\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u009a\u0005"+
		"\u0001\u0000\u0000\u009a\u00bd\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0011\u0000\u0000\u009c\u009d\u0005\u0019\u0000\u0000\u009d\u009e\u0005"+
		"\u0005\u0000\u0000\u009e\u009f\u0003$\u0012\u0000\u009f\u00a0\u0005\u0006"+
		"\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2\u0005\u0006\u0000"+
		"\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000"+
		"\u00a4\u00a5\u0003$\u0012\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0001\u0000\u0000\u00a7\u00bd\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0011\u0000\u0000\u00a9\u00aa\u0005\u001a\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0005\u0000\u0000\u00ab\u00ac\u0003$\u0012\u0000\u00ac\u00ad"+
		"\u0005\u0006\u0000\u0000\u00ad\u00ae\u0003$\u0012\u0000\u00ae\u00af\u0005"+
		"\u0006\u0000\u0000\u00af\u00b0\u0003$\u0012\u0000\u00b0\u00b1\u0005\u0007"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0001\u0000\u0000\u00b2\u00bd\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0011\u0000\u0000\u00b4\u00b5\u0005\u001b"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0005\u0000\u0000\u00b6\u00b7\u0003$\u0012"+
		"\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u00b9\u0003$\u0012\u0000"+
		"\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u008e\u0001\u0000\u0000\u0000"+
		"\u00bc\u009b\u0001\u0000\u0000\u0000\u00bc\u00a8\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b3\u0001\u0000\u0000\u0000\u00bd\u0015\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0\u0005\u0005\u0000\u0000"+
		"\u00c0\u00c1\u0003$\u0012\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0001\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0013\u0000\u0000\u00c5\u00c9\u0005\b\u0000\u0000\u00c6\u00c8"+
		"\u0003\u0002\u0001\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\t\u0000\u0000\u00cd\u0019\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\u0014\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0005\u0000\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d2\u0005\u0001"+
		"\u0000\u0000\u00d2\u00d3\u0003\"\u0011\u0000\u00d3\u00d4\u0005\u0001\u0000"+
		"\u0000\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000"+
		"\u00d6\u00da\u0005\b\u0000\u0000\u00d7\u00d9\u0003\u0002\u0001\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\t\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0015\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e2"+
		"\u0003\"\u0011\u0000\u00e2\u00e3\u0005\u0007\u0000\u0000\u00e3\u00e7\u0005"+
		"\b\u0000\u0000\u00e4\u00e6\u0003\u0002\u0001\u0000\u00e5\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00f4\u0005\t\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u00f0\u0005\b\u0000\u0000"+
		"\u00ed\u00ef\u0003\u0002\u0001\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005\t\u0000\u0000\u00f4"+
		"\u00eb\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0005\u0000\u0000\u00f8\u00f9\u0003$\u0012\u0000\u00f9\u00fa"+
		"\u0005\u0007\u0000\u0000\u00fa\u00fb\u0005\u0001\u0000\u0000\u00fb\u001f"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u00052\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0002\u0000\u0000\u00fe\u00ff\u0003$\u0012\u0000\u00ff!\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0003$\u0012\u0000\u0101\u0102\u0005\u001e\u0000\u0000"+
		"\u0102\u0103\u0003$\u0012\u0000\u0103#\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0006\u0012\uffff\uffff\u0000\u0105\u0106\u0005\u0005\u0000\u0000\u0106"+
		"\u0107\u0003$\u0012\u0000\u0107\u0108\u0005\u0007\u0000\u0000\u0108\u010d"+
		"\u0001\u0000\u0000\u0000\u0109\u010d\u0005,\u0000\u0000\u010a\u010d\u0005"+
		"2\u0000\u0000\u010b\u010d\u00053\u0000\u0000\u010c\u0104\u0001\u0000\u0000"+
		"\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0119\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\n\u0005\u0000\u0000\u010f\u0110\u0007\u0001\u0000\u0000"+
		"\u0110\u0118\u0003$\u0012\u0006\u0111\u0112\n\u0004\u0000\u0000\u0112"+
		"\u0113\u0007\u0002\u0000\u0000\u0113\u0118\u0003$\u0012\u0005\u0114\u0115"+
		"\n\u0003\u0000\u0000\u0115\u0116\u0005\u000e\u0000\u0000\u0116\u0118\u0003"+
		"$\u0012\u0004\u0117\u010e\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000"+
		"\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a%\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u0011)5BHU_j\u0086\u00bc\u00c9\u00da\u00e7\u00f0\u00f4\u010c\u0117"+
		"\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}