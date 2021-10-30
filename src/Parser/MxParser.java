// Generated from D:/workspace/java/Compiler_Mx/src/Parser\Mx.g4 by ANTLR 4.9.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_programBlock = 1, RULE_baseType = 2, RULE_type = 3, 
		RULE_valueDef = 4, RULE_valueDefine = 5, RULE_valueList = 6, RULE_newType = 7, 
		RULE_returnType = 8, RULE_functionParameter = 9, RULE_functionDefine = 10, 
		RULE_lambdaFunction = 11, RULE_classConstructor = 12, RULE_classDefine = 13, 
		RULE_suite = 14, RULE_statement = 15, RULE_expression = 16, RULE_primary = 17, 
		RULE_literal = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlock", "baseType", "type", "valueDef", "valueDefine", 
			"valueList", "newType", "returnType", "functionParameter", "functionDefine", 
			"lambdaFunction", "classConstructor", "classDefine", "suite", "statement", 
			"expression", "primary", "literal"
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

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxParser.EOF, 0); }
		public List<ProgramBlockContext> programBlock() {
			return getRuleContexts(ProgramBlockContext.class);
		}
		public ProgramBlockContext programBlock(int i) {
			return getRuleContext(ProgramBlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(38);
				programBlock();
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

	public static class ProgramBlockContext extends ParserRuleContext {
		public ValueDefineContext valueDefine() {
			return getRuleContext(ValueDefineContext.class,0);
		}
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public ProgramBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProgramBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProgramBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProgramBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				valueDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				classDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				functionDefine();
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(MxParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MxParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MxParser.STRING, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LEFTBRACKET() { return getToken(MxParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MxParser.RIGHTBRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(54);
			baseType();
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(56);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(57);
					match(LEFTBRACKET);
					setState(58);
					match(RIGHTBRACKET);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ValueDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MxParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterValueDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitValueDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitValueDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDefContext valueDef() throws RecognitionException {
		ValueDefContext _localctx = new ValueDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valueDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENTIFIER);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(65);
				match(ASSIGN);
				setState(66);
				expression(0);
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

	public static class ValueDefineContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ValueDefContext> valueDef() {
			return getRuleContexts(ValueDefContext.class);
		}
		public ValueDefContext valueDef(int i) {
			return getRuleContext(ValueDefContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public ValueDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterValueDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitValueDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitValueDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDefineContext valueDefine() throws RecognitionException {
		ValueDefineContext _localctx = new ValueDefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valueDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			type(0);
			setState(70);
			valueDef();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				valueDef();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(SEMI);
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

	public static class ValueListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			expression(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(81);
				match(COMMA);
				setState(82);
				expression(0);
				}
				}
				setState(87);
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

	public static class NewTypeContext extends ParserRuleContext {
		public NewTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newType; }
	 
		public NewTypeContext() { }
		public void copyFrom(NewTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectInitialContext extends NewTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public ObjectInitialContext(NewTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterObjectInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitObjectInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitObjectInitial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WrongInitialContext extends NewTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TerminalNode> LEFTBRACKET() { return getTokens(MxParser.LEFTBRACKET); }
		public TerminalNode LEFTBRACKET(int i) {
			return getToken(MxParser.LEFTBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTBRACKET() { return getTokens(MxParser.RIGHTBRACKET); }
		public TerminalNode RIGHTBRACKET(int i) {
			return getToken(MxParser.RIGHTBRACKET, i);
		}
		public WrongInitialContext(NewTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWrongInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWrongInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWrongInitial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInitialContext extends NewTypeContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TerminalNode> LEFTBRACKET() { return getTokens(MxParser.LEFTBRACKET); }
		public TerminalNode LEFTBRACKET(int i) {
			return getToken(MxParser.LEFTBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHTBRACKET() { return getTokens(MxParser.RIGHTBRACKET); }
		public TerminalNode RIGHTBRACKET(int i) {
			return getToken(MxParser.RIGHTBRACKET, i);
		}
		public ArrayInitialContext(NewTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArrayInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArrayInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeContext newType() throws RecognitionException {
		NewTypeContext _localctx = new NewTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_newType);
		int _la;
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ObjectInitialContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				baseType();
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(89);
					match(LEFTPAREN);
					setState(90);
					match(RIGHTPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ArrayInitialContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				baseType();
				setState(98); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(94);
						match(LEFTBRACKET);
						setState(95);
						expression(0);
						setState(96);
						match(RIGHTBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						match(LEFTBRACKET);
						setState(103);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new WrongInitialContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				baseType();
				setState(114); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						match(LEFTBRACKET);
						setState(111);
						expression(0);
						setState(112);
						match(RIGHTBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(116); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(118);
						match(LEFTBRACKET);
						setState(119);
						match(RIGHTBRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(124);
				match(LEFTBRACKET);
				setState(125);
				expression(0);
				setState(126);
				match(RIGHTBRACKET);
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(127);
						match(LEFTBRACKET);
						setState(129);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(128);
							expression(0);
							}
						}

						setState(131);
						match(RIGHTBRACKET);
						}
						} 
					}
					setState(136);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MxParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnType);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				type(0);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(VOID);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParser.COMMA, i);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(143);
				type(0);
				setState(144);
				match(IDENTIFIER);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					type(0);
					setState(147);
					match(IDENTIFIER);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionDefineContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			returnType();
			setState(157);
			match(IDENTIFIER);
			setState(158);
			match(LEFTPAREN);
			setState(159);
			functionParameter();
			setState(160);
			match(RIGHTPAREN);
			setState(161);
			suite();
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

	public static class LambdaFunctionContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(MxParser.LEFTBRACKET, 0); }
		public TerminalNode AND() { return getToken(MxParser.AND, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MxParser.RIGHTBRACKET, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> LEFTPAREN() { return getTokens(MxParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(MxParser.LEFTPAREN, i);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(MxParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(MxParser.RIGHTPAREN, i);
		}
		public FunctionParameterContext functionParameter() {
			return getRuleContext(FunctionParameterContext.class,0);
		}
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lambdaFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LEFTBRACKET);
			setState(164);
			match(AND);
			setState(165);
			match(RIGHTBRACKET);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTPAREN) {
				{
				setState(166);
				match(LEFTPAREN);
				setState(167);
				functionParameter();
				setState(168);
				match(RIGHTPAREN);
				}
			}

			setState(172);
			match(T__0);
			setState(173);
			suite();
			setState(174);
			match(LEFTPAREN);
			setState(175);
			valueList();
			setState(176);
			match(RIGHTPAREN);
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

	public static class ClassConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassConstructorContext classConstructor() throws RecognitionException {
		ClassConstructorContext _localctx = new ClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(LEFTPAREN);
			setState(180);
			match(RIGHTPAREN);
			setState(181);
			suite();
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

	public static class ClassDefineContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFTBRACE() { return getToken(MxParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(MxParser.RIGHTBRACE, 0); }
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public List<ValueDefineContext> valueDefine() {
			return getRuleContexts(ValueDefineContext.class);
		}
		public ValueDefineContext valueDefine(int i) {
			return getRuleContext(ValueDefineContext.class,i);
		}
		public List<ClassConstructorContext> classConstructor() {
			return getRuleContexts(ClassConstructorContext.class);
		}
		public ClassConstructorContext classConstructor(int i) {
			return getRuleContext(ClassConstructorContext.class,i);
		}
		public List<FunctionDefineContext> functionDefine() {
			return getRuleContexts(FunctionDefineContext.class);
		}
		public FunctionDefineContext functionDefine(int i) {
			return getRuleContext(FunctionDefineContext.class,i);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(CLASS);
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(LEFTBRACE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << VOID) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(186);
					valueDefine();
					}
					break;
				case 2:
					{
					setState(187);
					classConstructor();
					}
					break;
				case 3:
					{
					setState(188);
					functionDefine();
					}
					break;
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(RIGHTBRACE);
			setState(195);
			match(SEMI);
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

	public static class SuiteContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(MxParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(MxParser.RIGHTBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LEFTBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << NEW) | (1L << THIS) | (1L << CONTINUE) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << LEFTBRACE) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << SEMI) | (1L << IDENTIFIER))) != 0)) {
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
			match(RIGHTBRACE);
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
	public static class ForStmtContext extends StatementContext {
		public ExpressionContext init;
		public ExpressionContext condition;
		public ExpressionContext incr;
		public TerminalNode FOR() { return getToken(MxParser.FOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(MxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MxParser.SEMI, i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public ExpressionContext condition;
		public TerminalNode WHILE() { return getToken(MxParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtContext extends StatementContext {
		public StatementContext trueStatement;
		public StatementContext falseStatement;
		public TerminalNode IF() { return getToken(MxParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MxParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueDefStmtContext extends StatementContext {
		public ValueDefineContext valueDefine() {
			return getRuleContext(ValueDefineContext.class,0);
		}
		public ValueDefStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterValueDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitValueDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitValueDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MxParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStmtContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public EmptyStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitEmptyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StatementContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public BlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MxParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStmtContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(MxParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PureExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MxParser.SEMI, 0); }
		public PureExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPureExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPureExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPureExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				suite();
				}
				break;
			case 2:
				_localctx = new ValueDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				valueDefine();
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(IF);
				setState(209);
				match(LEFTPAREN);
				setState(210);
				expression(0);
				setState(211);
				match(RIGHTPAREN);
				setState(212);
				((IfStmtContext)_localctx).trueStatement = statement();
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(213);
					match(ELSE);
					setState(214);
					((IfStmtContext)_localctx).falseStatement = statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(RETURN);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(218);
					expression(0);
					}
				}

				setState(221);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(BREAK);
				setState(223);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(CONTINUE);
				setState(225);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(WHILE);
				setState(227);
				match(LEFTPAREN);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(228);
					((WhileStmtContext)_localctx).condition = expression(0);
					}
				}

				setState(231);
				match(RIGHTPAREN);
				setState(232);
				statement();
				}
				break;
			case 8:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(233);
				match(FOR);
				setState(234);
				match(LEFTPAREN);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(235);
					((ForStmtContext)_localctx).init = expression(0);
					}
				}

				setState(238);
				match(SEMI);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(239);
					((ForStmtContext)_localctx).condition = expression(0);
					}
				}

				setState(242);
				match(SEMI);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(243);
					((ForStmtContext)_localctx).incr = expression(0);
					}
				}

				setState(246);
				match(RIGHTPAREN);
				setState(247);
				statement();
				}
				break;
			case 9:
				_localctx = new PureExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				expression(0);
				setState(249);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public NewTypeContext newType() {
			return getRuleContext(NewTypeContext.class,0);
		}
		public NewExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExprContext extends ExpressionContext {
		public ExpressionContext name;
		public ExpressionContext index;
		public TerminalNode LEFTBRACKET() { return getToken(MxParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(MxParser.RIGHTBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(MxParser.TILDE, 0); }
		public TerminalNode NOT() { return getToken(MxParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(MxParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(MxParser.PLUS, 0); }
		public TerminalNode SELFPLUS() { return getToken(MxParser.SELFPLUS, 0); }
		public TerminalNode SELFMINUS() { return getToken(MxParser.SELFMINUS, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassExprContext extends ExpressionContext {
		public Token id;
		public Token func;
		public TerminalNode DOT() { return getToken(MxParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public ClassExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MxParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MxParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MxParser.MOD, 0); }
		public TerminalNode LEFTSHIFT() { return getToken(MxParser.LEFTSHIFT, 0); }
		public TerminalNode RIGHTSHIFT() { return getToken(MxParser.RIGHTSHIFT, 0); }
		public TerminalNode LESS() { return getToken(MxParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(MxParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(MxParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(MxParser.GREATEREQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(MxParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MxParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(MxParser.AND, 0); }
		public TerminalNode OR() { return getToken(MxParser.OR, 0); }
		public TerminalNode CARET() { return getToken(MxParser.CARET, 0); }
		public TerminalNode ANDAND() { return getToken(MxParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(MxParser.OROR, 0); }
		public TerminalNode PLUS() { return getToken(MxParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MxParser.MINUS, 0); }
		public BinaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode ASSIGN() { return getToken(MxParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public FunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				expression(8);
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SELFPLUS || _la==SELFMINUS) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				expression(7);
				}
				break;
			case 4:
				{
				_localctx = new NewExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(NEW);
				setState(261);
				newType();
				}
				break;
			case 5:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(IDENTIFIER);
				setState(263);
				match(LEFTPAREN);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(264);
					valueList();
					}
				}

				setState(267);
				match(RIGHTPAREN);
				}
				break;
			case 6:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				lambdaFunction();
				}
				break;
			case 7:
				{
				_localctx = new ClassExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				((ClassExprContext)_localctx).id = match(IDENTIFIER);
				setState(270);
				match(DOT);
				setState(271);
				((ClassExprContext)_localctx).func = match(IDENTIFIER);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(272);
					match(LEFTPAREN);
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST) | (1L << NEW) | (1L << THIS) | (1L << LEFTPAREN) | (1L << LEFTBRACKET) | (1L << SELFPLUS) | (1L << SELFMINUS) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << NOT) | (1L << IDENTIFIER))) != 0)) {
						{
						setState(273);
						valueList();
						}
					}

					setState(276);
					match(RIGHTPAREN);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new ClassExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(THIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(283);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						((BinaryExprContext)_localctx).right = expression(18);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(286);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						((BinaryExprContext)_localctx).right = expression(17);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(289);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESS || _la==LESSEQUAL) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						((BinaryExprContext)_localctx).right = expression(16);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(292);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GREATER || _la==GREATEREQUAL) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						((BinaryExprContext)_localctx).right = expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(295);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						((BinaryExprContext)_localctx).right = expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(298);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << CARET))) != 0)) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						((BinaryExprContext)_localctx).right = expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(301);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						((BinaryExprContext)_localctx).right = expression(12);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(304);
						((BinaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						((BinaryExprContext)_localctx).right = expression(11);
						}
						break;
					case 9:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						((AssignExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(307);
						match(ASSIGN);
						setState(308);
						((AssignExprContext)_localctx).right = expression(6);
						}
						break;
					case 10:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						((IndexExprContext)_localctx).name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(310);
						match(LEFTBRACKET);
						setState(311);
						((IndexExprContext)_localctx).index = expression(0);
						setState(312);
						match(RIGHTBRACKET);
						}
						break;
					case 11:
						{
						_localctx = new UnaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(315);
						((UnaryExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SELFPLUS || _la==SELFMINUS) ) {
							((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(MxParser.LEFTPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MxParser.RIGHTPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(LEFTPAREN);
				setState(322);
				expression(0);
				setState(323);
				match(RIGHTPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(IDENTIFIER);
				}
				break;
			case INTEGERCONST:
			case STRINGCONST:
			case BOOLCONST:
			case NULLCONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGERCONST() { return getToken(MxParser.INTEGERCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(MxParser.STRINGCONST, 0); }
		public TerminalNode BOOLCONST() { return getToken(MxParser.BOOLCONST, 0); }
		public TerminalNode NULLCONST() { return getToken(MxParser.NULLCONST, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONST) | (1L << STRINGCONST) | (1L << BOOLCONST) | (1L << NULLCONST))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6"+
		"\3\6\3\6\5\6F\n\6\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\6\te\n\t\r\t\16\tf\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\6\tu\n\t\r\t\16\tv\3\t\3\t\6\t{\n\t\r\t\16\t|\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0084\n\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\5\t\u008c\n\t\3"+
		"\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0098\n\13\f\13"+
		"\16\13\u009b\13\13\5\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c0\n\17\f\17\16\17"+
		"\u00c3\13\17\3\17\3\17\3\17\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00da"+
		"\n\21\3\21\3\21\5\21\u00de\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00e8\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ef\n\21\3\21\3\21\5"+
		"\21\u00f3\n\21\3\21\3\21\5\21\u00f7\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00ff\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u010c\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0115\n\22\3"+
		"\22\5\22\u0118\n\22\3\22\5\22\u011b\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u013f\n\22\f\22\16\22\u0142\13\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u014a\n\23\3\24\3\24\3\24\2\4\b\"\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\16\4\2\b\n<<\5\2*+//\63\63\3\2()\3\2,.\3\2&\'\4\2"+
		"  \"\"\4\2!!##\3\2$%\3\2\60\62\3\2\64\65\3\2*+\3\2\4\7\2\u0178\2+\3\2"+
		"\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b\67\3\2\2\2\nB\3\2\2\2\fG\3\2\2\2\16R"+
		"\3\2\2\2\20\u008b\3\2\2\2\22\u008f\3\2\2\2\24\u009c\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a5\3\2\2\2\32\u00b4\3\2\2\2\34\u00b9\3\2\2\2\36\u00c7\3\2"+
		"\2\2 \u00fe\3\2\2\2\"\u011a\3\2\2\2$\u0149\3\2\2\2&\u014b\3\2\2\2(*\5"+
		"\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7"+
		"\2\2\3/\3\3\2\2\2\60\64\5\f\7\2\61\64\5\34\17\2\62\64\5\26\f\2\63\60\3"+
		"\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\t\2\2\2\66\7\3\2"+
		"\2\2\678\b\5\1\289\5\6\4\29?\3\2\2\2:;\f\4\2\2;<\7\34\2\2<>\7\35\2\2="+
		":\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BE\7<\2\2"+
		"CD\79\2\2DF\5\"\22\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GH\5\b\5\2HM\5\n\6"+
		"\2IJ\78\2\2JL\5\n\6\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OM\3\2\2\2PQ\7\67\2\2Q\r\3\2\2\2RW\5\"\22\2ST\78\2\2TV\5\"\22\2US\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17\3\2\2\2YW\3\2\2\2Z]\5\6\4\2["+
		"\\\7\32\2\2\\^\7\33\2\2][\3\2\2\2]^\3\2\2\2^\u008c\3\2\2\2_d\5\6\4\2`"+
		"a\7\34\2\2ab\5\"\22\2bc\7\35\2\2ce\3\2\2\2d`\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gl\3\2\2\2hi\7\34\2\2ik\7\35\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m\u008c\3\2\2\2nl\3\2\2\2ot\5\6\4\2pq\7\34\2\2qr\5\"\22"+
		"\2rs\7\35\2\2su\3\2\2\2tp\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2"+
		"\2\2xy\7\34\2\2y{\7\35\2\2zx\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\177\7\34\2\2\177\u0080\5\"\22\2\u0080\u0088\7\35\2\2\u0081\u0083"+
		"\7\34\2\2\u0082\u0084\5\"\22\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\7\35\2\2\u0086\u0081\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008bZ\3\2\2\2\u008b_\3\2\2\2\u008bo\3\2\2\2\u008c\21\3"+
		"\2\2\2\u008d\u0090\5\b\5\2\u008e\u0090\7\f\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\5\b\5\2\u0092\u0099\7<\2\2"+
		"\u0093\u0094\78\2\2\u0094\u0095\5\b\5\2\u0095\u0096\7<\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0091\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\5\22\n\2\u009f\u00a0"+
		"\7<\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5\24\13\2\u00a2\u00a3\7\33\2"+
		"\2\u00a3\u00a4\5\36\20\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7"+
		"\7\60\2\2\u00a7\u00ac\7\35\2\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5\24\13"+
		"\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\36"+
		"\20\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\5\16\b\2\u00b2\u00b3\7\33\2\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\7\33\2"+
		"\2\u00b7\u00b8\5\36\20\2\u00b8\33\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb"+
		"\7<\2\2\u00bb\u00c1\7\36\2\2\u00bc\u00c0\5\f\7\2\u00bd\u00c0\5\32\16\2"+
		"\u00be\u00c0\5\26\f\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\37\2\2\u00c5\u00c6\7"+
		"\67\2\2\u00c6\35\3\2\2\2\u00c7\u00cb\7\36\2\2\u00c8\u00ca\5 \21\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\37\2\2\u00cf"+
		"\37\3\2\2\2\u00d0\u00ff\5\36\20\2\u00d1\u00ff\5\f\7\2\u00d2\u00d3\7\17"+
		"\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\33\2\2\u00d6"+
		"\u00d9\5 \21\2\u00d7\u00d8\7\20\2\2\u00d8\u00da\5 \21\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00ff\3\2\2\2\u00db\u00dd\7\24\2\2\u00dc"+
		"\u00de\5\"\22\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00ff\7\67\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00ff\7\67\2\2"+
		"\u00e2\u00e3\7\30\2\2\u00e3\u00ff\7\67\2\2\u00e4\u00e5\7\22\2\2\u00e5"+
		"\u00e7\7\32\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00ff\5 \21\2\u00eb"+
		"\u00ec\7\21\2\2\u00ec\u00ee\7\32\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7\67\2\2"+
		"\u00f1\u00f3\5\"\22\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\7\67\2\2\u00f5\u00f7\5\"\22\2\u00f6\u00f5\3\2\2\2"+
		"\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\33\2\2\u00f9\u00ff"+
		"\5 \21\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\67\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00ff\7\67\2\2\u00fe\u00d0\3\2\2\2\u00fe\u00d1\3\2\2\2\u00fe\u00d2"+
		"\3\2\2\2\u00fe\u00db\3\2\2\2\u00fe\u00e0\3\2\2\2\u00fe\u00e2\3\2\2\2\u00fe"+
		"\u00e4\3\2\2\2\u00fe\u00eb\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff!\3\2\2\2\u0100\u0101\b\22\1\2\u0101\u011b\5$\23\2\u0102\u0103"+
		"\t\3\2\2\u0103\u011b\5\"\22\n\u0104\u0105\t\4\2\2\u0105\u011b\5\"\22\t"+
		"\u0106\u0107\7\25\2\2\u0107\u011b\5\20\t\2\u0108\u0109\7<\2\2\u0109\u010b"+
		"\7\32\2\2\u010a\u010c\5\16\b\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u011b\7\33\2\2\u010e\u011b\5\30\r\2\u010f\u0110"+
		"\7<\2\2\u0110\u0111\7\31\2\2\u0111\u0117\7<\2\2\u0112\u0114\7\32\2\2\u0113"+
		"\u0115\5\16\b\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3"+
		"\2\2\2\u0116\u0118\7\33\2\2\u0117\u0112\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u011b\7\27\2\2\u011a\u0100\3\2\2\2\u011a\u0102\3"+
		"\2\2\2\u011a\u0104\3\2\2\2\u011a\u0106\3\2\2\2\u011a\u0108\3\2\2\2\u011a"+
		"\u010e\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u0140\3\2"+
		"\2\2\u011c\u011d\f\23\2\2\u011d\u011e\t\5\2\2\u011e\u013f\5\"\22\24\u011f"+
		"\u0120\f\22\2\2\u0120\u0121\t\6\2\2\u0121\u013f\5\"\22\23\u0122\u0123"+
		"\f\21\2\2\u0123\u0124\t\7\2\2\u0124\u013f\5\"\22\22\u0125\u0126\f\20\2"+
		"\2\u0126\u0127\t\b\2\2\u0127\u013f\5\"\22\21\u0128\u0129\f\17\2\2\u0129"+
		"\u012a\t\t\2\2\u012a\u013f\5\"\22\20\u012b\u012c\f\16\2\2\u012c\u012d"+
		"\t\n\2\2\u012d\u013f\5\"\22\17\u012e\u012f\f\r\2\2\u012f\u0130\t\13\2"+
		"\2\u0130\u013f\5\"\22\16\u0131\u0132\f\f\2\2\u0132\u0133\t\f\2\2\u0133"+
		"\u013f\5\"\22\r\u0134\u0135\f\b\2\2\u0135\u0136\79\2\2\u0136\u013f\5\""+
		"\22\b\u0137\u0138\f\24\2\2\u0138\u0139\7\34\2\2\u0139\u013a\5\"\22\2\u013a"+
		"\u013b\7\35\2\2\u013b\u013f\3\2\2\2\u013c\u013d\f\13\2\2\u013d\u013f\t"+
		"\4\2\2\u013e\u011c\3\2\2\2\u013e\u011f\3\2\2\2\u013e\u0122\3\2\2\2\u013e"+
		"\u0125\3\2\2\2\u013e\u0128\3\2\2\2\u013e\u012b\3\2\2\2\u013e\u012e\3\2"+
		"\2\2\u013e\u0131\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0137\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141#\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7\32\2\2\u0144\u0145"+
		"\5\"\22\2\u0145\u0146\7\33\2\2\u0146\u014a\3\2\2\2\u0147\u014a\7<\2\2"+
		"\u0148\u014a\5&\24\2\u0149\u0143\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a%\3\2\2\2\u014b\u014c\t\r\2\2\u014c\'\3\2\2\2%+\63?EMW]"+
		"flv|\u0083\u0088\u008b\u008f\u0099\u009c\u00ac\u00bf\u00c1\u00cb\u00d9"+
		"\u00dd\u00e7\u00ee\u00f2\u00f6\u00fe\u010b\u0114\u0117\u011a\u013e\u0140"+
		"\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}