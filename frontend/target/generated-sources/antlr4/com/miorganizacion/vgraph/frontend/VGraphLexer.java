// Generated from com\miorganizacion\vgraph\frontend\VGraph.g4 by ANTLR 4.5.1
package com.miorganizacion.vgraph.frontend;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VGraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "INT_TYPE", "COLOR_TYPE", 
		"DRAW", "SETCOLOR", "FRAME", "LOOP", "IF", "ELSE", "WAIT", "LINE", "RECT", 
		"CIRCLE", "PIXEL", "COS", "SIN", "COMP_OP", "HAZ", "INIC", "INC", "AVANZA", 
		"RETROCEDE", "GIRADERECHA", "GIRAIZQUIERDA", "OCULTATORTUGA", "PONCOLORLAPIZ", 
		"CENTRO", "ESPERA", "PONPOS", "PONRUMBO", "RUMBO", "PONX", "PONY", "BAJALAPIZ", 
		"SUBELAPIZ", "COLOR_LITERAL", "HEX_DIGIT", "COLOR_NAMED", "ID", "INT", 
		"FLOAT", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'['", "']'", "'('", "','", "')'", "'{'", "'}'", "'*'", 
		"'/'", "'+'", "'-'", "'%'", "'int'", "'color'", "'draw'", "'setcolor'", 
		"'frame'", "'loop'", "'if'", "'else'", "'wait'", "'line'", "'rect'", "'circle'", 
		"'pixel'", "'cos'", "'sin'", null, "'Haz'", "'inic'", "'inc'", null, null, 
		null, null, null, null, "'centro'", "'espera'", null, "'ponrumbo'", "'rumbo'", 
		"'ponx'", "'pony'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INT_TYPE", "COLOR_TYPE", "DRAW", "SETCOLOR", "FRAME", 
		"LOOP", "IF", "ELSE", "WAIT", "LINE", "RECT", "CIRCLE", "PIXEL", "COS", 
		"SIN", "COMP_OP", "HAZ", "INIC", "INC", "AVANZA", "RETROCEDE", "GIRADERECHA", 
		"GIRAIZQUIERDA", "OCULTATORTUGA", "PONCOLORLAPIZ", "CENTRO", "ESPERA", 
		"PONPOS", "PONRUMBO", "RUMBO", "PONX", "PONY", "BAJALAPIZ", "SUBELAPIZ", 
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


	public VGraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 51:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        String text = getText();
			        if (text.length() > 10) {
			            LexerNoViableAltException e =
			                new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
			            notifyListeners(e);
			        }
			      
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u020e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e8\n\37\3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00ff\n"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u010c\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u011b\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u012c\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u013d\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0151\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u016c\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0192\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u019f\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u01aa\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01d9\n\64\3\65\3\65"+
		"\7\65\u01dd\n\65\f\65\16\65\u01e0\13\65\3\65\3\65\3\66\6\66\u01e5\n\66"+
		"\r\66\16\66\u01e6\3\67\6\67\u01ea\n\67\r\67\16\67\u01eb\3\67\3\67\6\67"+
		"\u01f0\n\67\r\67\16\67\u01f1\3\67\3\67\5\67\u01f6\n\67\3\67\6\67\u01f9"+
		"\n\67\r\67\16\67\u01fa\5\67\u01fd\n\67\38\68\u0200\n8\r8\168\u0201\38"+
		"\38\39\39\79\u0208\n9\f9\169\u020b\139\39\39\2\2:\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\64k\65m\66o\67q8\3\2\13\4\2>>@@\5"+
		"\2\62;CHch\3\2c|\6\2\62;C\\aac|\3\2\62;\4\2GGgg\4\2--//\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\u0229\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13"+
		"{\3\2\2\2\r}\3\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2"+
		"\25\u0085\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35"+
		"\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0093\3\2\2\2#\u0099\3\2\2\2%\u009e\3"+
		"\2\2\2\'\u00a7\3\2\2\2)\u00ad\3\2\2\2+\u00b2\3\2\2\2-\u00b5\3\2\2\2/\u00ba"+
		"\3\2\2\2\61\u00bf\3\2\2\2\63\u00c4\3\2\2\2\65\u00c9\3\2\2\2\67\u00d0\3"+
		"\2\2\29\u00d6\3\2\2\2;\u00da\3\2\2\2=\u00e7\3\2\2\2?\u00e9\3\2\2\2A\u00ed"+
		"\3\2\2\2C\u00f2\3\2\2\2E\u00fe\3\2\2\2G\u010b\3\2\2\2I\u011a\3\2\2\2K"+
		"\u012b\3\2\2\2M\u013c\3\2\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0159\3\2"+
		"\2\2U\u016b\3\2\2\2W\u016d\3\2\2\2Y\u0176\3\2\2\2[\u017c\3\2\2\2]\u0181"+
		"\3\2\2\2_\u0191\3\2\2\2a\u019e\3\2\2\2c\u01a9\3\2\2\2e\u01ab\3\2\2\2g"+
		"\u01d8\3\2\2\2i\u01da\3\2\2\2k\u01e4\3\2\2\2m\u01e9\3\2\2\2o\u01ff\3\2"+
		"\2\2q\u0205\3\2\2\2st\7=\2\2t\4\3\2\2\2uv\7?\2\2v\6\3\2\2\2wx\7]\2\2x"+
		"\b\3\2\2\2yz\7_\2\2z\n\3\2\2\2{|\7*\2\2|\f\3\2\2\2}~\7.\2\2~\16\3\2\2"+
		"\2\177\u0080\7+\2\2\u0080\20\3\2\2\2\u0081\u0082\7}\2\2\u0082\22\3\2\2"+
		"\2\u0083\u0084\7\177\2\2\u0084\24\3\2\2\2\u0085\u0086\7,\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7\61\2\2\u0088\30\3\2\2\2\u0089\u008a\7-\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7/\2\2\u008c\34\3\2\2\2\u008d\u008e\7\'\2\2\u008e"+
		"\36\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092"+
		" \3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7n\2\2\u0096"+
		"\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\"\3\2\2\2\u0099\u009a\7f\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\u009d\7y\2\2\u009d$\3\2\2\2\u009e"+
		"\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7e\2\2"+
		"\u00a2\u00a3\7q\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7t\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7g\2\2\u00ac(\3\2\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7r\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7h\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		".\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7v\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\64\3\2\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7e\2\2"+
		"\u00cd\u00ce\7n\2\2\u00ce\u00cf\7g\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7"+
		"r\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7z\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d58\3\2\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9:\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd"+
		"\7p\2\2\u00dd<\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e8\7?\2\2\u00e0\u00e1"+
		"\7#\2\2\u00e1\u00e8\7?\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e8\7?\2\2\u00e4"+
		"\u00e5\7@\2\2\u00e5\u00e8\7?\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00de\3\2\2"+
		"\2\u00e7\u00e0\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7J\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\7|\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7e\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4"+
		"\7p\2\2\u00f4\u00f5\7e\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7x\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7|\2\2\u00fb"+
		"\u00ff\7c\2\2\u00fc\u00fd\7c\2\2\u00fd\u00ff\7x\2\2\u00fe\u00f6\3\2\2"+
		"\2\u00fe\u00fc\3\2\2\2\u00ffF\3\2\2\2\u0100\u0101\7t\2\2\u0101\u0102\7"+
		"g\2\2\u0102\u0103\7v\2\2\u0103\u0104\7t\2\2\u0104\u0105\7q\2\2\u0105\u0106"+
		"\7e\2\2\u0106\u0107\7g\2\2\u0107\u0108\7f\2\2\u0108\u010c\7g\2\2\u0109"+
		"\u010a\7t\2\2\u010a\u010c\7g\2\2\u010b\u0100\3\2\2\2\u010b\u0109\3\2\2"+
		"\2\u010cH\3\2\2\2\u010d\u010e\7i\2\2\u010e\u010f\7k\2\2\u010f\u0110\7"+
		"t\2\2\u0110\u0111\7c\2\2\u0111\u0112\7f\2\2\u0112\u0113\7g\2\2\u0113\u0114"+
		"\7t\2\2\u0114\u0115\7g\2\2\u0115\u0116\7e\2\2\u0116\u0117\7j\2\2\u0117"+
		"\u011b\7c\2\2\u0118\u0119\7i\2\2\u0119\u011b\7f\2\2\u011a\u010d\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011bJ\3\2\2\2\u011c\u011d\7i\2\2\u011d\u011e\7"+
		"k\2\2\u011e\u011f\7t\2\2\u011f\u0120\7c\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7|\2\2\u0122\u0123\7s\2\2\u0123\u0124\7w\2\2\u0124\u0125\7k\2\2\u0125"+
		"\u0126\7g\2\2\u0126\u0127\7t\2\2\u0127\u0128\7f\2\2\u0128\u012c\7c\2\2"+
		"\u0129\u012a\7i\2\2\u012a\u012c\7k\2\2\u012b\u011c\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012cL\3\2\2\2\u012d\u012e\7q\2\2\u012e\u012f\7e\2\2\u012f\u0130"+
		"\7w\2\2\u0130\u0131\7n\2\2\u0131\u0132\7v\2\2\u0132\u0133\7c\2\2\u0133"+
		"\u0134\7v\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136\u0137\7v\2\2"+
		"\u0137\u0138\7w\2\2\u0138\u0139\7i\2\2\u0139\u013d\7c\2\2\u013a\u013b"+
		"\7q\2\2\u013b\u013d\7v\2\2\u013c\u012d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"N\3\2\2\2\u013e\u013f\7r\2\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141"+
		"\u0142\7e\2\2\u0142\u0143\7q\2\2\u0143\u0144\7n\2\2\u0144\u0145\7q\2\2"+
		"\u0145\u0146\7t\2\2\u0146\u0147\7n\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7r\2\2\u0149\u014a\7k\2\2\u014a\u0151\7|\2\2\u014b\u014c\7r\2\2\u014c"+
		"\u014d\7q\2\2\u014d\u014e\7p\2\2\u014e\u014f\7e\2\2\u014f\u0151\7n\2\2"+
		"\u0150\u013e\3\2\2\2\u0150\u014b\3\2\2\2\u0151P\3\2\2\2\u0152\u0153\7"+
		"e\2\2\u0153\u0154\7g\2\2\u0154\u0155\7p\2\2\u0155\u0156\7v\2\2\u0156\u0157"+
		"\7t\2\2\u0157\u0158\7q\2\2\u0158R\3\2\2\2\u0159\u015a\7g\2\2\u015a\u015b"+
		"\7u\2\2\u015b\u015c\7r\2\2\u015c\u015d\7g\2\2\u015d\u015e\7t\2\2\u015e"+
		"\u015f\7c\2\2\u015fT\3\2\2\2\u0160\u0161\7r\2\2\u0161\u0162\7q\2\2\u0162"+
		"\u0163\7p\2\2\u0163\u0164\7r\2\2\u0164\u0165\7q\2\2\u0165\u016c\7u\2\2"+
		"\u0166\u0167\7r\2\2\u0167\u0168\7q\2\2\u0168\u0169\7p\2\2\u0169\u016a"+
		"\7z\2\2\u016a\u016c\7{\2\2\u016b\u0160\3\2\2\2\u016b\u0166\3\2\2\2\u016c"+
		"V\3\2\2\2\u016d\u016e\7r\2\2\u016e\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170"+
		"\u0171\7t\2\2\u0171\u0172\7w\2\2\u0172\u0173\7o\2\2\u0173\u0174\7d\2\2"+
		"\u0174\u0175\7q\2\2\u0175X\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7w\2"+
		"\2\u0178\u0179\7o\2\2\u0179\u017a\7d\2\2\u017a\u017b\7q\2\2\u017bZ\3\2"+
		"\2\2\u017c\u017d\7r\2\2\u017d\u017e\7q\2\2\u017e\u017f\7p\2\2\u017f\u0180"+
		"\7z\2\2\u0180\\\3\2\2\2\u0181\u0182\7r\2\2\u0182\u0183\7q\2\2\u0183\u0184"+
		"\7p\2\2\u0184\u0185\7{\2\2\u0185^\3\2\2\2\u0186\u0187\7d\2\2\u0187\u0188"+
		"\7c\2\2\u0188\u0189\7l\2\2\u0189\u018a\7c\2\2\u018a\u018b\7n\2\2\u018b"+
		"\u018c\7c\2\2\u018c\u018d\7r\2\2\u018d\u018e\7k\2\2\u018e\u0192\7|\2\2"+
		"\u018f\u0190\7d\2\2\u0190\u0192\7n\2\2\u0191\u0186\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192`\3\2\2\2\u0193\u0194\7u\2\2\u0194\u0195\7w\2\2\u0195\u0196"+
		"\7d\2\2\u0196\u0197\7g\2\2\u0197\u0198\7n\2\2\u0198\u0199\7c\2\2\u0199"+
		"\u019a\7r\2\2\u019a\u019b\7k\2\2\u019b\u019f\7|\2\2\u019c\u019d\7u\2\2"+
		"\u019d\u019f\7d\2\2\u019e\u0193\3\2\2\2\u019e\u019c\3\2\2\2\u019fb\3\2"+
		"\2\2\u01a0\u01a1\7%\2\2\u01a1\u01a2\5e\63\2\u01a2\u01a3\5e\63\2\u01a3"+
		"\u01a4\5e\63\2\u01a4\u01a5\5e\63\2\u01a5\u01a6\5e\63\2\u01a6\u01a7\5e"+
		"\63\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa\5g\64\2\u01a9\u01a0\3\2\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aad\3\2\2\2\u01ab\u01ac\t\3\2\2\u01acf\3\2\2\2\u01ad"+
		"\u01ae\7t\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7l\2\2\u01b0\u01d9\7q\2\2"+
		"\u01b1\u01b2\7x\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7t\2\2\u01b4\u01b5"+
		"\7f\2\2\u01b5\u01d9\7g\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7|\2\2\u01b8"+
		"\u01b9\7w\2\2\u01b9\u01d9\7n\2\2\u01ba\u01bb\7c\2\2\u01bb\u01bc\7o\2\2"+
		"\u01bc\u01bd\7c\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0"+
		"\7n\2\2\u01c0\u01c1\7n\2\2\u01c1\u01d9\7q\2\2\u01c2\u01c3\7e\2\2\u01c3"+
		"\u01c4\7{\2\2\u01c4\u01c5\7c\2\2\u01c5\u01d9\7p\2\2\u01c6\u01c7\7o\2\2"+
		"\u01c7\u01c8\7c\2\2\u01c8\u01c9\7i\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb"+
		"\7p\2\2\u01cb\u01cc\7v\2\2\u01cc\u01d9\7c\2\2\u01cd\u01ce\7d\2\2\u01ce"+
		"\u01cf\7n\2\2\u01cf\u01d0\7c\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7e\2\2"+
		"\u01d2\u01d9\7q\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6"+
		"\7i\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d9\7q\2\2\u01d8\u01ad\3\2\2\2\u01d8"+
		"\u01b1\3\2\2\2\u01d8\u01b6\3\2\2\2\u01d8\u01ba\3\2\2\2\u01d8\u01c2\3\2"+
		"\2\2\u01d8\u01c6\3\2\2\2\u01d8\u01cd\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d9"+
		"h\3\2\2\2\u01da\u01de\t\4\2\2\u01db\u01dd\t\5\2\2\u01dc\u01db\3\2\2\2"+
		"\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\b\65\2\2\u01e2j\3\2\2\2\u01e3"+
		"\u01e5\t\6\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7l\3\2\2\2\u01e8\u01ea\t\6\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ef\7\60\2\2\u01ee\u01f0\t\6\2\2\u01ef\u01ee\3"+
		"\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01fc\3\2\2\2\u01f3\u01f5\t\7\2\2\u01f4\u01f6\t\b\2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\t\6\2\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01f3\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"n\3\2\2\2\u01fe\u0200\t\t\2\2\u01ff\u01fe\3\2\2\2\u0200\u0201\3\2\2\2"+
		"\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204"+
		"\b8\3\2\u0204p\3\2\2\2\u0205\u0209\7%\2\2\u0206\u0208\n\n\2\2\u0207\u0206"+
		"\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\b9\3\2\u020dr\3\2\2\2\30"+
		"\2\u00e7\u00fe\u010b\u011a\u012b\u013c\u0150\u016b\u0191\u019e\u01a9\u01d8"+
		"\u01de\u01e6\u01eb\u01f1\u01f5\u01fa\u01fc\u0201\u0209\4\3\65\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}