// Generated from com\miorganizacion\vgraph\frontend\VGraph.g4 by ANTLR 4.5.1
package com.miorganizacion.vgraph.frontend;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"start", "statement", "varDeclaration", "type", "drawStmt", "setcolorStmt", 
		"frameStmt", "loopStmt", "ifStmt", "waitStmt", "assignment", "condition", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "','", "'{'", "'}'", "'*'", "'/'", "'+'", 
		"'-'", "'%'", "'int'", "'color'", "'draw'", "'setcolor'", "'frame'", "'loop'", 
		"'if'", "'else'", "'wait'", "'line'", "'rect'", "'circle'", "'pixel'", 
		"'cos'", "'sin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT_TYPE", "COLOR_TYPE", "DRAW", "SETCOLOR", "FRAME", "LOOP", "IF", 
		"ELSE", "WAIT", "LINE", "RECT", "CIRCLE", "PIXEL", "COS", "SIN", "COMP_OP", 
		"COLOR_LITERAL", "ID", "INT", "FLOAT", "WS", "COMMENT"
	};
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DRAW) | (1L << SETCOLOR) | (1L << FRAME) | (1L << LOOP) | (1L << IF) | (1L << WAIT) | (1L << ID))) != 0)) {
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
			} else {
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
	public static class DrawCircleContext extends DrawStmtContext {
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
	public static class DrawLineContext extends DrawStmtContext {
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
	public static class DrawRectContext extends DrawStmtContext {
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
	public static class DrawPixelContext extends DrawStmtContext {
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

	public static class SetcolorStmtContext extends ParserRuleContext {
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

	public static class FrameStmtContext extends ParserRuleContext {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DRAW) | (1L << SETCOLOR) | (1L << FRAME) | (1L << LOOP) | (1L << IF) | (1L << WAIT) | (1L << ID))) != 0)) {
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

	public static class LoopStmtContext extends ParserRuleContext {
		public AssignmentContext init;
		public ConditionContext cond;
		public AssignmentContext update;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DRAW) | (1L << SETCOLOR) | (1L << FRAME) | (1L << LOOP) | (1L << IF) | (1L << WAIT) | (1L << ID))) != 0)) {
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

	public static class IfStmtContext extends ParserRuleContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DRAW) | (1L << SETCOLOR) | (1L << FRAME) | (1L << LOOP) | (1L << IF) | (1L << WAIT) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << DRAW) | (1L << SETCOLOR) | (1L << FRAME) | (1L << LOOP) | (1L << IF) | (1L << WAIT) | (1L << ID))) != 0)) {
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

	public static class WaitStmtContext extends ParserRuleContext {
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
	public static class CosContext extends ExprContext {
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
	public static class SinContext extends ExprContext {
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
						} else {
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
						} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\67\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bv\n\b\f\b\16\by\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16"+
		"\t\u008a\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097"+
		"\13\n\3\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n\5\n\u00a3"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16\3\16\2\3\32\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\5\3\2\17\20\3\2\n\13\3\2\f\r\u00e2\2\37"+
		"\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b:\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16r"+
		"\3\2\2\2\20|\3\2\2\2\22\u008d\3\2\2\2\24\u00a4\3\2\2\2\26\u00aa\3\2\2"+
		"\2\30\u00ae\3\2\2\2\32\u00c5\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3"+
		"\3\2\2\2$/\5\6\4\2%/\5\f\7\2&/\5\n\6\2\'/\5\16\b\2(/\5\20\t\2)/\5\22\n"+
		"\2*/\5\24\13\2+,\5\26\f\2,-\7\3\2\2-/\3\2\2\2.$\3\2\2\2.%\3\2\2\2.&\3"+
		"\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2/\5\3\2\2\2\60"+
		"\61\7\4\2\2\61\62\5\b\5\2\62\63\7\5\2\2\63\66\7 \2\2\64\65\7\6\2\2\65"+
		"\67\5\32\16\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\3\2\29\7\3\2"+
		"\2\2:;\t\2\2\2;\t\3\2\2\2<=\7\21\2\2=>\7\30\2\2>?\7\4\2\2?@\5\32\16\2"+
		"@A\7\7\2\2AB\5\32\16\2BC\7\7\2\2CD\5\32\16\2DE\7\7\2\2EF\5\32\16\2FG\7"+
		"\5\2\2GH\7\3\2\2Hk\3\2\2\2IJ\7\21\2\2JK\7\31\2\2KL\7\4\2\2LM\5\32\16\2"+
		"MN\7\7\2\2NO\5\32\16\2OP\7\7\2\2PQ\5\32\16\2QR\7\7\2\2RS\5\32\16\2ST\7"+
		"\5\2\2TU\7\3\2\2Uk\3\2\2\2VW\7\21\2\2WX\7\32\2\2XY\7\4\2\2YZ\5\32\16\2"+
		"Z[\7\7\2\2[\\\5\32\16\2\\]\7\7\2\2]^\5\32\16\2^_\7\5\2\2_`\7\3\2\2`k\3"+
		"\2\2\2ab\7\21\2\2bc\7\33\2\2cd\7\4\2\2de\5\32\16\2ef\7\7\2\2fg\5\32\16"+
		"\2gh\7\5\2\2hi\7\3\2\2ik\3\2\2\2j<\3\2\2\2jI\3\2\2\2jV\3\2\2\2ja\3\2\2"+
		"\2k\13\3\2\2\2lm\7\22\2\2mn\7\4\2\2no\5\32\16\2op\7\5\2\2pq\7\3\2\2q\r"+
		"\3\2\2\2rs\7\23\2\2sw\7\b\2\2tv\5\4\3\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\t\2\2{\17\3\2\2\2|}\7\24\2\2}~\7\4"+
		"\2\2~\177\5\26\f\2\177\u0080\7\3\2\2\u0080\u0081\5\30\r\2\u0081\u0082"+
		"\7\3\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\5\2\2\u0084\u0088\7\b\2\2"+
		"\u0085\u0087\5\4\3\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\t\2\2\u008c\21\3\2\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\4\2"+
		"\2\u008f\u0090\5\30\r\2\u0090\u0091\7\5\2\2\u0091\u0095\7\b\2\2\u0092"+
		"\u0094\5\4\3\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u00a2\7\t\2\2\u0099\u009a\7\26\2\2\u009a\u009e\7\b\2\2\u009b\u009d\5"+
		"\4\3\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\t"+
		"\2\2\u00a2\u0099\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a5"+
		"\7\27\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8\7\5\2"+
		"\2\u00a8\u00a9\7\3\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac"+
		"\7\6\2\2\u00ac\u00ad\5\32\16\2\u00ad\27\3\2\2\2\u00ae\u00af\5\32\16\2"+
		"\u00af\u00b0\7\36\2\2\u00b0\u00b1\5\32\16\2\u00b1\31\3\2\2\2\u00b2\u00b3"+
		"\b\16\1\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\7\5\2"+
		"\2\u00b6\u00c6\3\2\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\u00ba\5\32\16\2\u00ba\u00bb\7\5\2\2\u00bb\u00c6\3\2\2\2\u00bc\u00bd\7"+
		"\35\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7\5\2\2"+
		"\u00c0\u00c6\3\2\2\2\u00c1\u00c6\7 \2\2\u00c2\u00c6\7!\2\2\u00c3\u00c6"+
		"\7\"\2\2\u00c4\u00c6\7\37\2\2\u00c5\u00b2\3\2\2\2\u00c5\u00b7\3\2\2\2"+
		"\u00c5\u00bc\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00d2\3\2\2\2\u00c7\u00c8\f\t\2\2\u00c8"+
		"\u00c9\t\3\2\2\u00c9\u00d1\5\32\16\n\u00ca\u00cb\f\b\2\2\u00cb\u00cc\t"+
		"\4\2\2\u00cc\u00d1\5\32\16\t\u00cd\u00ce\f\7\2\2\u00ce\u00cf\7\16\2\2"+
		"\u00cf\u00d1\5\32\16\b\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d2\3\2\2\2\16\37.\66jw\u0088\u0095\u009e\u00a2\u00c5"+
		"\u00d0\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}