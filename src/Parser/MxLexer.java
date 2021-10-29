// Generated from D:/workspace/java/Compiler_Mx/src/Parser\Mx.g4 by ANTLR 4.9.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INTEGERCONST=2, STRINGCONST=3, BOOLCONST=4, NULLCONST=5, INT=6, 
		BOOL=7, STRING=8, NULL=9, VOID=10, TRUE=11, FALSE=12, IF=13, ELSE=14, 
		FOR=15, WHILE=16, BREAK=17, RETURN=18, NEW=19, CLASS=20, THIS=21, CONTINUE=22, 
		DOT=23, LEFTPAREN=24, RIGHTPAREN=25, LEFTBRACKET=26, RIGHTBRACKET=27, 
		LEFTBRACE=28, RIGHTBRACE=29, LESS=30, GREATER=31, LESSEQUAL=32, GREATEREQUAL=33, 
		EQUAL=34, NOTEQUAL=35, LEFTSHIFT=36, RIGHTSHIFT=37, SELFPLUS=38, SELFMINUS=39, 
		PLUS=40, MINUS=41, MUL=42, DIV=43, MOD=44, TILDE=45, AND=46, OR=47, CARET=48, 
		NOT=49, ANDAND=50, OROR=51, COLON=52, SEMI=53, COMMA=54, ASSIGN=55, BACKSLASH=56, 
		DBQUOTATION=57, IDENTIFIER=58, SPACE=59, NEWLINE=60, LINECOMMENT=61, BLOCKCOMMENT=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INTEGERCONST", "STRINGCONST", "BOOLCONST", "NULLCONST", "INT", 
			"BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "RETURN", "NEW", "CLASS", "THIS", "CONTINUE", "DOT", 
			"LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", 
			"RIGHTBRACE", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "EQUAL", 
			"NOTEQUAL", "LEFTSHIFT", "RIGHTSHIFT", "SELFPLUS", "SELFMINUS", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "TILDE", "AND", "OR", "CARET", "NOT", "ANDAND", 
			"OROR", "COLON", "SEMI", "COMMA", "ASSIGN", "BACKSLASH", "DBQUOTATION", 
			"IDENTIFIER", "SPACE", "NEWLINE", "LINECOMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", null, null, null, null, "'int'", "'bool'", "'string'", 
			"'null'", "'void'", "'true'", "'false'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'return'", "'new'", "'class'", "'this'", "'continue'", "'.'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'<<'", "'>>'", "'++'", "'--'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'~'", "'&'", "'|'", "'^'", "'!'", "'&&'", "'||'", "':'", 
			"';'", "','", "'='", "'\\\\'", "'\\\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INTEGERCONST", "STRINGCONST", "BOOLCONST", "NULLCONST", 
			"INT", "BOOL", "STRING", "NULL", "VOID", "TRUE", "FALSE", "IF", "ELSE", 
			"FOR", "WHILE", "BREAK", "RETURN", "NEW", "CLASS", "THIS", "CONTINUE", 
			"DOT", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", "LEFTBRACE", 
			"RIGHTBRACE", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "EQUAL", 
			"NOTEQUAL", "LEFTSHIFT", "RIGHTSHIFT", "SELFPLUS", "SELFMINUS", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "TILDE", "AND", "OR", "CARET", "NOT", "ANDAND", 
			"OROR", "COLON", "SEMI", "COMMA", "ASSIGN", "BACKSLASH", "DBQUOTATION", 
			"IDENTIFIER", "SPACE", "NEWLINE", "LINECOMMENT", "BLOCKCOMMENT"
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


	public MxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13\3\3\3"+
		"\5\3\u008b\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0095\n\4\f\4\16\4"+
		"\u0098\13\4\3\4\3\4\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\7;\u0152\n;\f;\16;\u0155\13;\3"+
		"<\6<\u0158\n<\r<\16<\u0159\3<\3<\3=\3=\5=\u0160\n=\3=\5=\u0163\n=\3=\3"+
		"=\3>\3>\3>\3>\7>\u016b\n>\f>\16>\u016e\13>\3>\3>\3?\3?\3?\3?\7?\u0176"+
		"\n?\f?\16?\u0179\13?\3?\3?\3?\3?\3?\4\u0096\u0177\2@\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\3\2"+
		"\b\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\2\u018b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u008a\3\2\2\2\7\u008c\3"+
		"\2\2\2\t\u009d\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a5\3\2\2"+
		"\2\21\u00aa\3\2\2\2\23\u00b1\3\2\2\2\25\u00b6\3\2\2\2\27\u00bb\3\2\2\2"+
		"\31\u00c0\3\2\2\2\33\u00c6\3\2\2\2\35\u00c9\3\2\2\2\37\u00ce\3\2\2\2!"+
		"\u00d2\3\2\2\2#\u00d8\3\2\2\2%\u00de\3\2\2\2\'\u00e5\3\2\2\2)\u00e9\3"+
		"\2\2\2+\u00ef\3\2\2\2-\u00f4\3\2\2\2/\u00fd\3\2\2\2\61\u00ff\3\2\2\2\63"+
		"\u0101\3\2\2\2\65\u0103\3\2\2\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u0109"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0112\3\2\2\2E"+
		"\u0115\3\2\2\2G\u0118\3\2\2\2I\u011b\3\2\2\2K\u011e\3\2\2\2M\u0121\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2\2\2U\u012b\3\2\2\2W\u012d"+
		"\3\2\2\2Y\u012f\3\2\2\2[\u0131\3\2\2\2]\u0133\3\2\2\2_\u0135\3\2\2\2a"+
		"\u0137\3\2\2\2c\u0139\3\2\2\2e\u013b\3\2\2\2g\u013e\3\2\2\2i\u0141\3\2"+
		"\2\2k\u0143\3\2\2\2m\u0145\3\2\2\2o\u0147\3\2\2\2q\u0149\3\2\2\2s\u014c"+
		"\3\2\2\2u\u014f\3\2\2\2w\u0157\3\2\2\2y\u0162\3\2\2\2{\u0166\3\2\2\2}"+
		"\u0171\3\2\2\2\177\u0080\7/\2\2\u0080\u0081\7@\2\2\u0081\4\3\2\2\2\u0082"+
		"\u0086\t\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008b\7\62\2\2\u008a\u0082\3\2\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\6\3\2\2\2\u008c\u0096\7$\2\2\u008d\u008e\7^\2\2\u008e\u0095"+
		"\7p\2\2\u008f\u0090\7^\2\2\u0090\u0095\7^\2\2\u0091\u0092\7^\2\2\u0092"+
		"\u0095\7$\2\2\u0093\u0095\13\2\2\2\u0094\u008d\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7$\2\2\u009a\b\3\2\2\2\u009b\u009e\5\27\f\2\u009c\u009e"+
		"\5\31\r\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\n\3\2\2\2\u009f"+
		"\u00a0\5\23\n\2\u00a0\f\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7"+
		"q\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7n\2\2\u00a9\20\3\2\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\u00b0\7i\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7w\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7n\2\2\u00b5\24\3\2\2\2\u00b6"+
		"\u00b7\7x\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7f\2\2"+
		"\u00ba\26\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7"+
		"w\2\2\u00be\u00bf\7g\2\2\u00bf\30\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\32\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7h\2\2\u00c8\34\3\2\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\36\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"t\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7y\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7\"\3\2\2\2\u00d8\u00d9"+
		"\7d\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7m\2\2\u00dd$\3\2\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7p\2\2"+
		"\u00e4&\3\2\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7y\2"+
		"\2\u00e8(\3\2\2\2\u00e9\u00ea\7e\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7"+
		"c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7u\2\2\u00ee*\3\2\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3"+
		",\3\2\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7p\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7w\2\2"+
		"\u00fb\u00fc\7g\2\2\u00fc.\3\2\2\2\u00fd\u00fe\7\60\2\2\u00fe\60\3\2\2"+
		"\2\u00ff\u0100\7*\2\2\u0100\62\3\2\2\2\u0101\u0102\7+\2\2\u0102\64\3\2"+
		"\2\2\u0103\u0104\7]\2\2\u0104\66\3\2\2\2\u0105\u0106\7_\2\2\u01068\3\2"+
		"\2\2\u0107\u0108\7}\2\2\u0108:\3\2\2\2\u0109\u010a\7\177\2\2\u010a<\3"+
		"\2\2\2\u010b\u010c\7>\2\2\u010c>\3\2\2\2\u010d\u010e\7@\2\2\u010e@\3\2"+
		"\2\2\u010f\u0110\7>\2\2\u0110\u0111\7?\2\2\u0111B\3\2\2\2\u0112\u0113"+
		"\7@\2\2\u0113\u0114\7?\2\2\u0114D\3\2\2\2\u0115\u0116\7?\2\2\u0116\u0117"+
		"\7?\2\2\u0117F\3\2\2\2\u0118\u0119\7#\2\2\u0119\u011a\7?\2\2\u011aH\3"+
		"\2\2\2\u011b\u011c\7>\2\2\u011c\u011d\7>\2\2\u011dJ\3\2\2\2\u011e\u011f"+
		"\7@\2\2\u011f\u0120\7@\2\2\u0120L\3\2\2\2\u0121\u0122\7-\2\2\u0122\u0123"+
		"\7-\2\2\u0123N\3\2\2\2\u0124\u0125\7/\2\2\u0125\u0126\7/\2\2\u0126P\3"+
		"\2\2\2\u0127\u0128\7-\2\2\u0128R\3\2\2\2\u0129\u012a\7/\2\2\u012aT\3\2"+
		"\2\2\u012b\u012c\7,\2\2\u012cV\3\2\2\2\u012d\u012e\7\61\2\2\u012eX\3\2"+
		"\2\2\u012f\u0130\7\'\2\2\u0130Z\3\2\2\2\u0131\u0132\7\u0080\2\2\u0132"+
		"\\\3\2\2\2\u0133\u0134\7(\2\2\u0134^\3\2\2\2\u0135\u0136\7~\2\2\u0136"+
		"`\3\2\2\2\u0137\u0138\7`\2\2\u0138b\3\2\2\2\u0139\u013a\7#\2\2\u013ad"+
		"\3\2\2\2\u013b\u013c\7(\2\2\u013c\u013d\7(\2\2\u013df\3\2\2\2\u013e\u013f"+
		"\7~\2\2\u013f\u0140\7~\2\2\u0140h\3\2\2\2\u0141\u0142\7<\2\2\u0142j\3"+
		"\2\2\2\u0143\u0144\7=\2\2\u0144l\3\2\2\2\u0145\u0146\7.\2\2\u0146n\3\2"+
		"\2\2\u0147\u0148\7?\2\2\u0148p\3\2\2\2\u0149\u014a\7^\2\2\u014a\u014b"+
		"\7^\2\2\u014br\3\2\2\2\u014c\u014d\7^\2\2\u014d\u014e\7$\2\2\u014et\3"+
		"\2\2\2\u014f\u0153\t\4\2\2\u0150\u0152\t\5\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154v\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0158\t\6\2\2\u0157\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b<\2\2\u015cx\3\2\2\2\u015d\u015f\7\17\2\2\u015e\u0160\7\f\2\2"+
		"\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0163"+
		"\7\f\2\2\u0162\u015d\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\b=\2\2\u0165z\3\2\2\2\u0166\u0167\7\61\2\2\u0167\u0168\7\61\2\2"+
		"\u0168\u016c\3\2\2\2\u0169\u016b\n\7\2\2\u016a\u0169\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0170\b>\2\2\u0170|\3\2\2\2\u0171\u0172\7\61\2\2"+
		"\u0172\u0173\7,\2\2\u0173\u0177\3\2\2\2\u0174\u0176\13\2\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7,\2\2\u017b\u017c\7\61"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b?\2\2\u017e~\3\2\2\2\16\2\u0086"+
		"\u008a\u0094\u0096\u009d\u0153\u0159\u015f\u0162\u016c\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}