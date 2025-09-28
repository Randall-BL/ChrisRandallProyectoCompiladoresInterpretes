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
		T__9=10, T__10=11, T__11=12, INT_TYPE=13, COLOR_TYPE=14, DRAW=15, SETCOLOR=16, 
		FRAME=17, LOOP=18, IF=19, ELSE=20, WAIT=21, LINE=22, RECT=23, CIRCLE=24, 
		PIXEL=25, COS=26, SIN=27, COMP_OP=28, COLOR_LITERAL=29, ID=30, INT=31, 
		FLOAT=32, WS=33, COMMENT=34;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_type = 3, 
		RULE_drawStmt = 4, RULE_setcolorStmt = 5, RULE_frameStmt = 6, RULE_loopStmt = 7, 
		RULE_ifStmt = 8, RULE_waitStmt = 9, RULE_assignment = 10, RULE_condition = 11, 
		RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "varDeclaration", "type", "drawStmt", "setcolorStmt", 
			"frameStmt", "loopStmt", "ifStmt", "waitStmt", "assignment", "condition", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "','", "'{'", "'}'", "'*'", "'/'", 
			"'+'", "'-'", "'%'", "'int'", "'color'", "'draw'", "'setcolor'", "'frame'", 
			"'loop'", "'if'", "'else'", "'wait'", "'line'", "'rect'", "'circle'", 
			"'pixel'", "'cos'", "'sin'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_TYPE", "COLOR_TYPE", "DRAW", "SETCOLOR", "FRAME", "LOOP", 
			"IF", "ELSE", "WAIT", "LINE", "RECT", "CIRCLE", "PIXEL", "COS", "SIN", 
			"COMP_OP", "COLOR_LITERAL", "ID", "INT", "FLOAT", "WS", "COMMENT"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1076854788L) != 0)) {
				{
				{
				setState(26);
				statement();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
	public static class StmtVarDeclContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StmtVarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFrameContext extends StatementContext {
		public FrameStmtContext frameStmt() {
			return getRuleContext(FrameStmtContext.class,0);
		}
		public StmtFrameContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSetColorContext extends StatementContext {
		public SetcolorStmtContext setcolorStmt() {
			return getRuleContext(SetcolorStmtContext.class,0);
		}
		public StmtSetColorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtSetColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtSetColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtSetColor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtLoopContext extends StatementContext {
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public StmtLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDrawContext extends StatementContext {
		public DrawStmtContext drawStmt() {
			return getRuleContext(DrawStmtContext.class,0);
		}
		public StmtDrawContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtDraw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtDraw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtDraw(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StatementContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtWaitContext extends StatementContext {
		public WaitStmtContext waitStmt() {
			return getRuleContext(WaitStmtContext.class,0);
		}
		public StmtWaitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterStmtWait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitStmtWait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitStmtWait(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new StmtVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				varDeclaration();
				}
				break;
			case SETCOLOR:
				_localctx = new StmtSetColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				setcolorStmt();
				}
				break;
			case DRAW:
				_localctx = new StmtDrawContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				drawStmt();
				}
				break;
			case FRAME:
				_localctx = new StmtFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				frameStmt();
				}
				break;
			case LOOP:
				_localctx = new StmtLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				loopStmt();
				}
				break;
			case IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				ifStmt();
				}
				break;
			case WAIT:
				_localctx = new StmtWaitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				waitStmt();
				}
				break;
			case ID:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				assignment();
				setState(42);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(VGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(47);
			type();
			setState(48);
			match(T__2);
			setState(49);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(50);
				match(T__3);
				setState(51);
				expr(0);
				}
			}

			setState(54);
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
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 8, RULE_drawStmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DrawLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(DRAW);
				setState(59);
				match(LINE);
				setState(60);
				match(T__1);
				setState(61);
				expr(0);
				setState(62);
				match(T__4);
				setState(63);
				expr(0);
				setState(64);
				match(T__4);
				setState(65);
				expr(0);
				setState(66);
				match(T__4);
				setState(67);
				expr(0);
				setState(68);
				match(T__2);
				setState(69);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new DrawRectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(DRAW);
				setState(72);
				match(RECT);
				setState(73);
				match(T__1);
				setState(74);
				expr(0);
				setState(75);
				match(T__4);
				setState(76);
				expr(0);
				setState(77);
				match(T__4);
				setState(78);
				expr(0);
				setState(79);
				match(T__4);
				setState(80);
				expr(0);
				setState(81);
				match(T__2);
				setState(82);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new DrawCircleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(DRAW);
				setState(85);
				match(CIRCLE);
				setState(86);
				match(T__1);
				setState(87);
				expr(0);
				setState(88);
				match(T__4);
				setState(89);
				expr(0);
				setState(90);
				match(T__4);
				setState(91);
				expr(0);
				setState(92);
				match(T__2);
				setState(93);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new DrawPixelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(DRAW);
				setState(96);
				match(PIXEL);
				setState(97);
				match(T__1);
				setState(98);
				expr(0);
				setState(99);
				match(T__4);
				setState(100);
				expr(0);
				setState(101);
				match(T__2);
				setState(102);
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
		enterRule(_localctx, 10, RULE_setcolorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SETCOLOR);
			setState(107);
			match(T__1);
			setState(108);
			expr(0);
			setState(109);
			match(T__2);
			setState(110);
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
		enterRule(_localctx, 12, RULE_frameStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(FRAME);
			setState(113);
			match(T__5);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1076854788L) != 0)) {
				{
				{
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__6);
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
		enterRule(_localctx, 14, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LOOP);
			setState(123);
			match(T__1);
			setState(124);
			((LoopStmtContext)_localctx).init = assignment();
			setState(125);
			match(T__0);
			setState(126);
			((LoopStmtContext)_localctx).cond = condition();
			setState(127);
			match(T__0);
			setState(128);
			((LoopStmtContext)_localctx).update = assignment();
			setState(129);
			match(T__2);
			setState(130);
			match(T__5);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1076854788L) != 0)) {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(T__6);
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
		enterRule(_localctx, 16, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IF);
			setState(140);
			match(T__1);
			setState(141);
			((IfStmtContext)_localctx).cond = condition();
			setState(142);
			match(T__2);
			setState(143);
			match(T__5);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1076854788L) != 0)) {
				{
				{
				setState(144);
				statement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__6);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(151);
				match(ELSE);
				setState(152);
				match(T__5);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1076854788L) != 0)) {
					{
					{
					setState(153);
					statement();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__6);
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
		enterRule(_localctx, 18, RULE_waitStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WAIT);
			setState(163);
			match(T__1);
			setState(164);
			expr(0);
			setState(165);
			match(T__2);
			setState(166);
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
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T__3);
			setState(170);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expr(0);
			setState(173);
			((ConditionContext)_localctx).op = match(COMP_OP);
			setState(174);
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
	public static class ColorLiteralContext extends ExprContext {
		public TerminalNode COLOR_LITERAL() { return getToken(VGraphParser.COLOR_LITERAL, 0); }
		public ColorLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterColorLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitColorLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitColorLiteral(this);
			else return visitor.visitChildren(this);
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
	public static class CosContext extends ExprContext {
		public TerminalNode COS() { return getToken(VGraphParser.COS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitCos(this);
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
	public static class FloatLiteralContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(VGraphParser.FLOAT, 0); }
		public FloatLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SinContext extends ExprContext {
		public TerminalNode SIN() { return getToken(VGraphParser.SIN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VGraphListener ) ((VGraphListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VGraphVisitor ) return ((VGraphVisitor<? extends T>)visitor).visitSin(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(T__1);
				setState(178);
				expr(0);
				setState(179);
				match(T__2);
				}
				break;
			case COS:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(COS);
				setState(182);
				match(T__1);
				setState(183);
				expr(0);
				setState(184);
				match(T__2);
				}
				break;
			case SIN:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(SIN);
				setState(187);
				match(T__1);
				setState(188);
				expr(0);
				setState(189);
				match(T__2);
				}
				break;
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(ID);
				}
				break;
			case INT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(FLOAT);
				}
				break;
			case COLOR_LITERAL:
				{
				_localctx = new ColorLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(COLOR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
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
						setState(199);
						((MulDivContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
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
						setState(202);
						((AddSubContext)_localctx).right = expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						((ModContext)_localctx).op = match(T__11);
						setState(205);
						((ModContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b\u0007\n"+
		"\u0007\f\u0007\u0088\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001\b\u0003"+
		"\b\u00a1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00c4\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00cf\b\f\n\f\f\f\u00d2\t\f\u0001\f\u0000\u0001"+
		"\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u0000\u0003\u0001\u0000\r\u000e\u0001\u0000\b\t\u0001\u0000\n\u000b\u00e0"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004"+
		".\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bh\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000e"+
		"z\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000\u0012\u00a2"+
		"\u0001\u0000\u0000\u0000\u0014\u00a8\u0001\u0000\u0000\u0000\u0016\u00ac"+
		"\u0001\u0000\u0000\u0000\u0018\u00c3\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000"+
		"\u0000\"-\u0003\u0004\u0002\u0000#-\u0003\n\u0005\u0000$-\u0003\b\u0004"+
		"\u0000%-\u0003\f\u0006\u0000&-\u0003\u000e\u0007\u0000\'-\u0003\u0010"+
		"\b\u0000(-\u0003\u0012\t\u0000)*\u0003\u0014\n\u0000*+\u0005\u0001\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,\"\u0001\u0000\u0000\u0000,#\u0001\u0000"+
		"\u0000\u0000,$\u0001\u0000\u0000\u0000,%\u0001\u0000\u0000\u0000,&\u0001"+
		"\u0000\u0000\u0000,\'\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005\u0002"+
		"\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u0003\u0000\u000014\u0005"+
		"\u001e\u0000\u000023\u0005\u0004\u0000\u000035\u0003\u0018\f\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0005\u0001\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0007\u0000"+
		"\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u000f\u0000\u0000"+
		";<\u0005\u0016\u0000\u0000<=\u0005\u0002\u0000\u0000=>\u0003\u0018\f\u0000"+
		">?\u0005\u0005\u0000\u0000?@\u0003\u0018\f\u0000@A\u0005\u0005\u0000\u0000"+
		"AB\u0003\u0018\f\u0000BC\u0005\u0005\u0000\u0000CD\u0003\u0018\f\u0000"+
		"DE\u0005\u0003\u0000\u0000EF\u0005\u0001\u0000\u0000Fi\u0001\u0000\u0000"+
		"\u0000GH\u0005\u000f\u0000\u0000HI\u0005\u0017\u0000\u0000IJ\u0005\u0002"+
		"\u0000\u0000JK\u0003\u0018\f\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0018"+
		"\f\u0000MN\u0005\u0005\u0000\u0000NO\u0003\u0018\f\u0000OP\u0005\u0005"+
		"\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0003\u0000\u0000RS\u0005\u0001"+
		"\u0000\u0000Si\u0001\u0000\u0000\u0000TU\u0005\u000f\u0000\u0000UV\u0005"+
		"\u0018\u0000\u0000VW\u0005\u0002\u0000\u0000WX\u0003\u0018\f\u0000XY\u0005"+
		"\u0005\u0000\u0000YZ\u0003\u0018\f\u0000Z[\u0005\u0005\u0000\u0000[\\"+
		"\u0003\u0018\f\u0000\\]\u0005\u0003\u0000\u0000]^\u0005\u0001\u0000\u0000"+
		"^i\u0001\u0000\u0000\u0000_`\u0005\u000f\u0000\u0000`a\u0005\u0019\u0000"+
		"\u0000ab\u0005\u0002\u0000\u0000bc\u0003\u0018\f\u0000cd\u0005\u0005\u0000"+
		"\u0000de\u0003\u0018\f\u0000ef\u0005\u0003\u0000\u0000fg\u0005\u0001\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000h:\u0001\u0000\u0000\u0000hG\u0001\u0000"+
		"\u0000\u0000hT\u0001\u0000\u0000\u0000h_\u0001\u0000\u0000\u0000i\t\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0005\u0002\u0000\u0000"+
		"lm\u0003\u0018\f\u0000mn\u0005\u0003\u0000\u0000no\u0005\u0001\u0000\u0000"+
		"o\u000b\u0001\u0000\u0000\u0000pq\u0005\u0011\u0000\u0000qu\u0005\u0006"+
		"\u0000\u0000rt\u0003\u0002\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0007\u0000"+
		"\u0000y\r\u0001\u0000\u0000\u0000z{\u0005\u0012\u0000\u0000{|\u0005\u0002"+
		"\u0000\u0000|}\u0003\u0014\n\u0000}~\u0005\u0001\u0000\u0000~\u007f\u0003"+
		"\u0016\u000b\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u0081\u0003"+
		"\u0014\n\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0086\u0005\u0006"+
		"\u0000\u0000\u0083\u0085\u0003\u0002\u0001\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0007"+
		"\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0013"+
		"\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u008e\u0003\u0016"+
		"\u000b\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0093\u0005\u0006"+
		"\u0000\u0000\u0090\u0092\u0003\u0002\u0001\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u00a0\u0005\u0007"+
		"\u0000\u0000\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u009c\u0005\u0006"+
		"\u0000\u0000\u0099\u009b\u0003\u0002\u0001\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\u0007"+
		"\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u0011\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0015"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5\u0003\u0018"+
		"\f\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000"+
		"\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u001e\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0004\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000"+
		"\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad"+
		"\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u0017"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0006\f\uffff\uffff\u0000\u00b1\u00b2"+
		"\u0005\u0002\u0000\u0000\u00b2\u00b3\u0003\u0018\f\u0000\u00b3\u00b4\u0005"+
		"\u0003\u0000\u0000\u00b4\u00c4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u001a\u0000\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0018\f\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00c4\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb\u00bc\u0005\u0002"+
		"\u0000\u0000\u00bc\u00bd\u0003\u0018\f\u0000\u00bd\u00be\u0005\u0003\u0000"+
		"\u0000\u00be\u00c4\u0001\u0000\u0000\u0000\u00bf\u00c4\u0005\u001e\u0000"+
		"\u0000\u00c0\u00c4\u0005\u001f\u0000\u0000\u00c1\u00c4\u0005 \u0000\u0000"+
		"\u00c2\u00c4\u0005\u001d\u0000\u0000\u00c3\u00b0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00b5\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000"+
		"\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00d0\u0001\u0000\u0000\u0000\u00c5\u00c6\n\u0007\u0000\u0000\u00c6"+
		"\u00c7\u0007\u0001\u0000\u0000\u00c7\u00cf\u0003\u0018\f\b\u00c8\u00c9"+
		"\n\u0006\u0000\u0000\u00c9\u00ca\u0007\u0002\u0000\u0000\u00ca\u00cf\u0003"+
		"\u0018\f\u0007\u00cb\u00cc\n\u0005\u0000\u0000\u00cc\u00cd\u0005\f\u0000"+
		"\u0000\u00cd\u00cf\u0003\u0018\f\u0006\u00ce\u00c5\u0001\u0000\u0000\u0000"+
		"\u00ce\u00c8\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u0019\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\f\u001d,4hu\u0086\u0093\u009c\u00a0"+
		"\u00c3\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}