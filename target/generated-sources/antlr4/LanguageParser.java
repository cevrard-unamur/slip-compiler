// Generated from Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IMPORT=2, MAPFILE=3, LPAR=4, RPAR=5, COMMA=6, SEMICOLON=7, RBRA=8, 
		LBRA=9, AS=10, EQUAL=11, QUOTE=12, SINGLE_QUOTE=13, ASSIGN=14, MAIN=15, 
		FUNCTION=16, VOID=17, DO=18, END=19, CONST=20, ENUM=21, PLUS=22, MINUS=23, 
		MULTI=24, DIV=25, MOD=26, TRUE=27, FALSE=28, AND=29, OR=30, NOT=31, LESS=32, 
		LESS_EQUAL=33, GREAT=34, GREAT_EQUAL=35, NOT_EQUAL=36, IF=37, WHILE=38, 
		TO=39, UNTIL=40, THEN=41, ELSE=42, REPEAT=43, FOR=44, LEFT=45, RIGHT=46, 
		UP=47, DOWN=48, JUMP=49, FIGHT=50, DIG=51, SCALAR=52, RECORD=53, ID=54, 
		STRING=55, CHAR=56, COLON=57, NUMBER=58, COMMENT_MULTILINE=59, COMMENT_SINGLELINE=60, 
		NEWLINE=61, WS=62;
	public static final int
		RULE_prog = 0, RULE_mapImport = 1, RULE_mainFunction = 2, RULE_mainFunctionInstruction = 3, 
		RULE_funct = 4, RULE_returnType = 5, RULE_argumentList = 6, RULE_argument = 7, 
		RULE_inst = 8, RULE_functionInst = 9, RULE_globalVariable = 10, RULE_variableDeclaration = 11, 
		RULE_variableType = 12, RULE_arrayDeclaration = 13, RULE_structureDeclaration = 14, 
		RULE_initVariable = 15, RULE_initArray = 16, RULE_constDeclaration = 17, 
		RULE_enumDeclaration = 18, RULE_rightExpr = 19, RULE_functionCall = 20, 
		RULE_leftExpr = 21, RULE_assignation = 22, RULE_actionType = 23, RULE_digInstruction = 24, 
		RULE_fightInstruction = 25, RULE_ifBlock = 26, RULE_whileBlock = 27, RULE_repeatBlock = 28, 
		RULE_forBlock = 29;
	public static final String[] ruleNames = {
		"prog", "mapImport", "mainFunction", "mainFunctionInstruction", "funct", 
		"returnType", "argumentList", "argument", "inst", "functionInst", "globalVariable", 
		"variableDeclaration", "variableType", "arrayDeclaration", "structureDeclaration", 
		"initVariable", "initArray", "constDeclaration", "enumDeclaration", "rightExpr", 
		"functionCall", "leftExpr", "assignation", "actionType", "digInstruction", 
		"fightInstruction", "ifBlock", "whileBlock", "repeatBlock", "forBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", 
		"'='", "'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", 
		"'end'", "'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", 
		"'false'", "'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", 
		"'if'", "'while'", "'to'", "'until'", "'then'", "'else'", "'repeat'", 
		"'for'", "'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", 
		null, "'record'", null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", 
		"RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", 
		"FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", 
		"DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", 
		"GREAT", "GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", 
		"ELSE", "REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", 
		"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgrammeContext extends ProgContext {
		public MapImportContext mapImport() {
			return getRuleContext(MapImportContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public List<GlobalVariableContext> globalVariable() {
			return getRuleContexts(GlobalVariableContext.class);
		}
		public GlobalVariableContext globalVariable(int i) {
			return getRuleContext(GlobalVariableContext.class,i);
		}
		public List<FunctContext> funct() {
			return getRuleContexts(FunctContext.class);
		}
		public FunctContext funct(int i) {
			return getRuleContext(FunctContext.class,i);
		}
		public ProgrammeContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgrammeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			mapImport();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << ID))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(61);
					globalVariable();
					}
					break;
				case 2:
					{
					setState(62);
					funct();
					}
					break;
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			mainFunction();
			setState(69);
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

	public static class MapImportContext extends ParserRuleContext {
		public MapImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapImport; }
	 
		public MapImportContext() { }
		public void copyFrom(MapImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapImportationContext extends MapImportContext {
		public TerminalNode IMPORT() { return getToken(LanguageParser.IMPORT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(LanguageParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LanguageParser.QUOTE, i);
		}
		public TerminalNode MAPFILE() { return getToken(LanguageParser.MAPFILE, 0); }
		public MapImportationContext(MapImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMapImportation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMapImportation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMapImportation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapImportContext mapImport() throws RecognitionException {
		MapImportContext _localctx = new MapImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapImport);
		try {
			_localctx = new MapImportationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IMPORT);
			setState(72);
			match(QUOTE);
			setState(73);
			match(MAPFILE);
			setState(74);
			match(QUOTE);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	 
		public MainFunctionContext() { }
		public void copyFrom(MainFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainContext extends MainFunctionContext {
		public TerminalNode MAIN() { return getToken(LanguageParser.MAIN, 0); }
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(LanguageParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(LanguageParser.VOID, 0); }
		public TerminalNode DO() { return getToken(LanguageParser.DO, 0); }
		public MainFunctionInstructionContext mainFunctionInstruction() {
			return getRuleContext(MainFunctionInstructionContext.class,0);
		}
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public MainContext(MainFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(MAIN);
			setState(77);
			match(AS);
			setState(78);
			match(FUNCTION);
			setState(79);
			match(LPAR);
			setState(80);
			match(RPAR);
			setState(81);
			match(COLON);
			setState(82);
			match(VOID);
			setState(83);
			match(DO);
			setState(84);
			mainFunctionInstruction();
			setState(85);
			match(END);
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

	public static class MainFunctionInstructionContext extends ParserRuleContext {
		public MainFunctionInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionInstruction; }
	 
		public MainFunctionInstructionContext() { }
		public void copyFrom(MainFunctionInstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainInstructionContext extends MainFunctionInstructionContext {
		public DigInstructionContext digInstruction() {
			return getRuleContext(DigInstructionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public MainInstructionContext(MainFunctionInstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMainInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMainInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMainInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionInstructionContext mainFunctionInstruction() throws RecognitionException {
		MainFunctionInstructionContext _localctx = new MainFunctionInstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunctionInstruction);
		int _la;
		try {
			int _alt;
			_localctx = new MainInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					inst();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			{
			setState(93);
			digInstruction();
			setState(94);
			match(SEMICOLON);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(96);
				inst();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FunctContext extends ParserRuleContext {
		public FunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funct; }
	 
		public FunctContext() { }
		public void copyFrom(FunctContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefinitionContext extends FunctContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(LanguageParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode DO() { return getToken(LanguageParser.DO, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<FunctionInstContext> functionInst() {
			return getRuleContexts(FunctionInstContext.class);
		}
		public FunctionInstContext functionInst(int i) {
			return getRuleContext(FunctionInstContext.class,i);
		}
		public FunctionDefinitionContext(FunctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funct);
		int _la;
		try {
			_localctx = new FunctionDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(AS);
			setState(104);
			match(FUNCTION);
			setState(105);
			match(LPAR);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				argumentList();
				}
			}

			setState(109);
			match(RPAR);
			setState(110);
			match(COLON);
			setState(111);
			returnType();
			setState(112);
			match(DO);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				functionInst();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(118);
			match(END);
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
		public TerminalNode SCALAR() { return getToken(LanguageParser.SCALAR, 0); }
		public TerminalNode VOID() { return getToken(LanguageParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	 
		public ArgumentListContext() { }
		public void copyFrom(ArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParametersContext extends ArgumentListContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public FunctionParametersContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentList);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			argument();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(123);
				match(COMMA);
				setState(124);
				argument();
				}
				}
				setState(129);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionParameterContext extends ArgumentContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public FunctionParameterContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		int _la;
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			match(ID);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				match(ID);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(AS);
			setState(139);
			variableType();
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

	public static class InstContext extends ParserRuleContext {
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
	 
		public InstContext() { }
		public void copyFrom(InstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableInstructionContext extends InstContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariableInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariableInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVariableInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatInstructionContext extends InstContext {
		public RepeatBlockContext repeatBlock() {
			return getRuleContext(RepeatBlockContext.class,0);
		}
		public RepeatInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRepeatInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRepeatInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRepeatInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileInstructionContext extends InstContext {
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterWhileInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitWhileInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitWhileInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallInstructionContext extends InstContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public FunctionCallInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionCallInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionCallInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionCallInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionInstructionContext extends InstContext {
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public ActionInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterActionInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitActionInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitActionInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfInstructionContext extends InstContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIfInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIfInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIfInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInstructionContext extends InstContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public ForInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterForInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitForInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitForInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignationInstructionContext extends InstContext {
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public AssignationInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignationInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignationInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignationInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inst);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VariableInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new AssignationInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				assignation();
				}
				break;
			case 3:
				_localctx = new ActionInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(143);
				actionType();
				setState(144);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				ifBlock();
				}
				break;
			case 5:
				_localctx = new WhileInstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				whileBlock();
				}
				break;
			case 6:
				_localctx = new RepeatInstructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				repeatBlock();
				}
				break;
			case 7:
				_localctx = new ForInstructionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				forBlock();
				}
				break;
			case 8:
				_localctx = new FunctionCallInstructionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(150);
				functionCall();
				setState(151);
				match(SEMICOLON);
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

	public static class FunctionInstContext extends ParserRuleContext {
		public FunctionInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInst; }
	 
		public FunctionInstContext() { }
		public void copyFrom(FunctionInstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionInstructionContext extends FunctionInstContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public List<EnumDeclarationContext> enumDeclaration() {
			return getRuleContexts(EnumDeclarationContext.class);
		}
		public EnumDeclarationContext enumDeclaration(int i) {
			return getRuleContext(EnumDeclarationContext.class,i);
		}
		public List<ConstDeclarationContext> constDeclaration() {
			return getRuleContexts(ConstDeclarationContext.class);
		}
		public ConstDeclarationContext constDeclaration(int i) {
			return getRuleContext(ConstDeclarationContext.class,i);
		}
		public List<StructureDeclarationContext> structureDeclaration() {
			return getRuleContexts(StructureDeclarationContext.class);
		}
		public StructureDeclarationContext structureDeclaration(int i) {
			return getRuleContext(StructureDeclarationContext.class,i);
		}
		public FunctionInstructionContext(FunctionInstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInstContext functionInst() throws RecognitionException {
		FunctionInstContext _localctx = new FunctionInstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionInst);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(155);
					enumDeclaration();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(161);
					constDeclaration();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						structureDeclaration();
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GlobalVariableContext extends ParserRuleContext {
		public GlobalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariable; }
	 
		public GlobalVariableContext() { }
		public void copyFrom(GlobalVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalDeclarationContext extends GlobalVariableContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public GlobalDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalVariable);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				constDeclaration();
				}
				break;
			case 3:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				enumDeclaration();
				}
				break;
			case 4:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				structureDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDefinitionContext extends VariableDeclarationContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public VariableDefinitionContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			match(ID);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(187);
				match(COMMA);
				setState(188);
				match(ID);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(AS);
			setState(195);
			variableType();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(196);
				match(EQUAL);
				setState(197);
				initVariable();
				}
			}

			setState(200);
			match(SEMICOLON);
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

	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
	 
		public VariableTypeContext() { }
		public void copyFrom(VariableTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends VariableTypeContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructureTypeContext extends VariableTypeContext {
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public StructureTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStructureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStructureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStructureType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends VariableTypeContext {
		public TerminalNode SCALAR() { return getToken(LanguageParser.SCALAR, 0); }
		public ScalarTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableType);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				arrayDeclaration();
				}
				break;
			case 3:
				_localctx = new StructureTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				structureDeclaration();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	 
		public ArrayDeclarationContext() { }
		public void copyFrom(ArrayDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayContext extends ArrayDeclarationContext {
		public TerminalNode SCALAR() { return getToken(LanguageParser.SCALAR, 0); }
		public TerminalNode LBRA() { return getToken(LanguageParser.LBRA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(LanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LanguageParser.NUMBER, i);
		}
		public TerminalNode RBRA() { return getToken(LanguageParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public ArrayContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		int _la;
		try {
			_localctx = new ArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SCALAR);
			setState(208);
			match(LBRA);
			setState(209);
			match(NUMBER);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210);
				match(COMMA);
				setState(211);
				match(NUMBER);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RBRA);
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

	public static class StructureDeclarationContext extends ParserRuleContext {
		public StructureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureDeclaration; }
	 
		public StructureDeclarationContext() { }
		public void copyFrom(StructureDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructureContext extends StructureDeclarationContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public TerminalNode RECORD() { return getToken(LanguageParser.RECORD, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<StructureDeclarationContext> structureDeclaration() {
			return getRuleContexts(StructureDeclarationContext.class);
		}
		public StructureDeclarationContext structureDeclaration(int i) {
			return getRuleContext(StructureDeclarationContext.class,i);
		}
		public StructureContext(StructureDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structureDeclaration);
		int _la;
		try {
			_localctx = new StructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ID);
			setState(220);
			match(AS);
			setState(221);
			match(RECORD);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(222);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(223);
					structureDeclaration();
					}
					break;
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(228);
			match(END);
			setState(229);
			match(SEMICOLON);
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

	public static class InitVariableContext extends ParserRuleContext {
		public InitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVariable; }
	 
		public InitVariableContext() { }
		public void copyFrom(InitVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayInitialisationContext extends InitVariableContext {
		public InitArrayContext initArray() {
			return getRuleContext(InitArrayContext.class,0);
		}
		public ArrayInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArrayInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArrayInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArrayInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightInitialisationContext extends InitVariableContext {
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public RightInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRightInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRightInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRightInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initVariable);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				initArray();
				}
				break;
			case 2:
				_localctx = new RightInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				rightExpr(0);
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

	public static class InitArrayContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public List<InitVariableContext> initVariable() {
			return getRuleContexts(InitVariableContext.class);
		}
		public InitVariableContext initVariable(int i) {
			return getRuleContext(InitVariableContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public InitArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterInitArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitInitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitInitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitArrayContext initArray() throws RecognitionException {
		InitArrayContext _localctx = new InitArrayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LPAR);
			setState(236);
			initVariable();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(237);
					match(COMMA);
					setState(238);
					initVariable();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(246);
			match(RPAR);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
	 
		public ConstDeclarationContext() { }
		public void copyFrom(ConstDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantContext extends ConstDeclarationContext {
		public TerminalNode CONST() { return getToken(LanguageParser.CONST, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public ConstantContext(ConstDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constDeclaration);
		try {
			_localctx = new ConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CONST);
			setState(249);
			match(ID);
			setState(250);
			match(AS);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(251);
				variableType();
				}
				break;
			case 2:
				{
				setState(252);
				structureDeclaration();
				}
				break;
			}
			setState(255);
			match(EQUAL);
			setState(256);
			initVariable();
			setState(257);
			match(SEMICOLON);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	 
		public EnumDeclarationContext() { }
		public void copyFrom(EnumDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnumerationContext extends EnumDeclarationContext {
		public TerminalNode ENUM() { return getToken(LanguageParser.ENUM, 0); }
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public EnumerationContext(EnumDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumDeclaration);
		int _la;
		try {
			_localctx = new EnumerationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ENUM);
			setState(260);
			match(ID);
			setState(261);
			match(EQUAL);
			setState(262);
			match(LPAR);
			setState(263);
			match(ID);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				match(ID);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(RPAR);
			setState(272);
			match(SEMICOLON);
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

	public static class RightExprContext extends ParserRuleContext {
		public RightExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExpr; }
	 
		public RightExprContext() { }
		public void copyFrom(RightExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativeIntegerExpressionContext extends RightExprContext {
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public NegativeIntegerExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNegativeIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNegativeIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNegativeIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends RightExprContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public BoolExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftExpressionContext extends RightExprContext {
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public LeftExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFalseContext extends RightExprContext {
		public TerminalNode FALSE() { return getToken(LanguageParser.FALSE, 0); }
		public BooleanFalseContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends RightExprContext {
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public NotExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(LanguageParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LanguageParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(LanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public IntegerExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends RightExprContext {
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public NumberContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpressionContext extends RightExprContext {
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public ParenthesesExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public TerminalNode LESS() { return getToken(LanguageParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(LanguageParser.LESS_EQUAL, 0); }
		public TerminalNode GREAT() { return getToken(LanguageParser.GREAT, 0); }
		public TerminalNode GREAT_EQUAL() { return getToken(LanguageParser.GREAT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LanguageParser.NOT_EQUAL, 0); }
		public CompExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTrueContext extends RightExprContext {
		public TerminalNode TRUE() { return getToken(LanguageParser.TRUE, 0); }
		public BooleanTrueContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends RightExprContext {
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public CharContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends RightExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightExprContext rightExpr() throws RecognitionException {
		return rightExpr(0);
	}

	private RightExprContext rightExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RightExprContext _localctx = new RightExprContext(_ctx, _parentState);
		RightExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_rightExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(275);
				match(LPAR);
				setState(276);
				rightExpr(0);
				setState(277);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new NegativeIntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(MINUS);
				setState(280);
				rightExpr(17);
				}
				break;
			case 3:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(NOT);
				setState(282);
				rightExpr(8);
				}
				break;
			case 4:
				{
				_localctx = new LeftExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				leftExpr(0);
				}
				break;
			case 5:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(CHAR);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(292);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(293);
						match(MULTI);
						setState(294);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(295);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(296);
						match(DIV);
						setState(297);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(298);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(299);
						match(MOD);
						setState(300);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(301);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(302);
						match(PLUS);
						setState(303);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(304);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(305);
						match(MINUS);
						setState(306);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(307);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(308);
						match(EQUAL);
						setState(309);
						rightExpr(17);
						}
						break;
					case 7:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(310);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(311);
						match(LESS);
						setState(312);
						rightExpr(16);
						}
						break;
					case 8:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(313);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(314);
						match(LESS_EQUAL);
						setState(315);
						rightExpr(15);
						}
						break;
					case 9:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(316);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(317);
						match(GREAT);
						setState(318);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(319);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(320);
						match(GREAT_EQUAL);
						setState(321);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(322);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(323);
						match(NOT_EQUAL);
						setState(324);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(325);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(326);
						match(AND);
						setState(327);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(328);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(329);
						match(OR);
						setState(330);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(335);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ID);
			setState(337);
			match(LPAR);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
				{
				setState(338);
				rightExpr(0);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(339);
					match(COMMA);
					setState(340);
					rightExpr(0);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(348);
			match(RPAR);
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

	public static class LeftExprContext extends ParserRuleContext {
		public LeftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftExpr; }
	 
		public LeftExprContext() { }
		public void copyFrom(LeftExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeftPropertyContext extends LeftExprContext {
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public LeftPropertyContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeftProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeftProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeftProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftIdContext extends LeftExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public LeftIdContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeftId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeftId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeftId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftPropertyArrayContext extends LeftExprContext {
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LBRA() { return getToken(LanguageParser.LBRA, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(LanguageParser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public LeftPropertyArrayContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeftPropertyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeftPropertyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeftPropertyArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftArrayContext extends LeftExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LBRA() { return getToken(LanguageParser.LBRA, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(LanguageParser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public LeftArrayContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeftArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeftArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeftArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftExprContext leftExpr() throws RecognitionException {
		return leftExpr(0);
	}

	private LeftExprContext leftExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LeftExprContext _localctx = new LeftExprContext(_ctx, _parentState);
		LeftExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_leftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(351);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				match(ID);
				setState(353);
				match(LBRA);
				setState(354);
				rightExpr(0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(355);
					match(COMMA);
					setState(356);
					rightExpr(0);
					}
				}

				setState(359);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(377);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new LeftPropertyContext(new LeftExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
						setState(363);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(364);
						match(T__0);
						setState(365);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new LeftPropertyArrayContext(new LeftExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
						setState(366);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(367);
						match(T__0);
						setState(368);
						match(ID);
						setState(369);
						match(LBRA);
						setState(370);
						rightExpr(0);
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(371);
							match(COMMA);
							setState(372);
							rightExpr(0);
							}
						}

						setState(375);
						match(RBRA);
						}
						break;
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class AssignationContext extends ParserRuleContext {
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			leftExpr(0);
			setState(383);
			match(ASSIGN);
			setState(384);
			rightExpr(0);
			setState(385);
			match(SEMICOLON);
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

	public static class ActionTypeContext extends ParserRuleContext {
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
	 
		public ActionTypeContext() { }
		public void copyFrom(ActionTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DigContext extends ActionTypeContext {
		public DigInstructionContext digInstruction() {
			return getRuleContext(DigInstructionContext.class,0);
		}
		public DigContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionContext extends ActionTypeContext {
		public TerminalNode LEFT() { return getToken(LanguageParser.LEFT, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(LanguageParser.RIGHT, 0); }
		public TerminalNode UP() { return getToken(LanguageParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(LanguageParser.DOWN, 0); }
		public TerminalNode JUMP() { return getToken(LanguageParser.JUMP, 0); }
		public ActionContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FightContext extends ActionTypeContext {
		public FightInstructionContext fightInstruction() {
			return getRuleContext(FightInstructionContext.class,0);
		}
		public FightContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_actionType);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(LEFT);
				setState(388);
				match(LPAR);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(389);
					rightExpr(0);
					}
				}

				setState(392);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(RIGHT);
				setState(394);
				match(LPAR);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(395);
					rightExpr(0);
					}
				}

				setState(398);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(UP);
				setState(400);
				match(LPAR);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(401);
					rightExpr(0);
					}
				}

				setState(404);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(DOWN);
				setState(406);
				match(LPAR);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(407);
					rightExpr(0);
					}
				}

				setState(410);
				match(RPAR);
				}
				break;
			case JUMP:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(JUMP);
				setState(412);
				match(LPAR);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(413);
					rightExpr(0);
					}
				}

				setState(416);
				match(RPAR);
				}
				break;
			case FIGHT:
				_localctx = new FightContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				digInstruction();
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

	public static class DigInstructionContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(LanguageParser.DIG, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public DigInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDigInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDigInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDigInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigInstructionContext digInstruction() throws RecognitionException {
		DigInstructionContext _localctx = new DigInstructionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_digInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(DIG);
			setState(422);
			match(LPAR);
			setState(423);
			match(RPAR);
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

	public static class FightInstructionContext extends ParserRuleContext {
		public TerminalNode FIGHT() { return getToken(LanguageParser.FIGHT, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public FightInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fightInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFightInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFightInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFightInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FightInstructionContext fightInstruction() throws RecognitionException {
		FightInstructionContext _localctx = new FightInstructionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fightInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(FIGHT);
			setState(426);
			match(LPAR);
			setState(427);
			match(RPAR);
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

	public static class IfBlockContext extends ParserRuleContext {
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	 
		public IfBlockContext() { }
		public void copyFrom(IfBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends IfBlockContext {
		public TerminalNode IF() { return getToken(LanguageParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(LanguageParser.THEN, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public IfContext(IfBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifBlock);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(IF);
			setState(430);
			match(LPAR);
			setState(431);
			rightExpr(0);
			setState(432);
			match(RPAR);
			setState(433);
			match(THEN);
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434);
				inst();
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(439);
				match(ELSE);
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					inst();
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
				}
			}

			setState(447);
			match(END);
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

	public static class WhileBlockContext extends ParserRuleContext {
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	 
		public WhileBlockContext() { }
		public void copyFrom(WhileBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends WhileBlockContext {
		public TerminalNode WHILE() { return getToken(LanguageParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode DO() { return getToken(LanguageParser.DO, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public WhileContext(WhileBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_whileBlock);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(WHILE);
			setState(450);
			match(LPAR);
			setState(451);
			rightExpr(0);
			setState(452);
			match(RPAR);
			setState(453);
			match(DO);
			setState(455); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(454);
				inst();
				}
				}
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(459);
			match(END);
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

	public static class RepeatBlockContext extends ParserRuleContext {
		public RepeatBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatBlock; }
	 
		public RepeatBlockContext() { }
		public void copyFrom(RepeatBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepeatContext extends RepeatBlockContext {
		public TerminalNode REPEAT() { return getToken(LanguageParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(LanguageParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public RepeatContext(RepeatBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatBlockContext repeatBlock() throws RecognitionException {
		RepeatBlockContext _localctx = new RepeatBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_repeatBlock);
		int _la;
		try {
			_localctx = new RepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(REPEAT);
			setState(463); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(462);
				inst();
				}
				}
				setState(465); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(467);
			match(UNTIL);
			setState(468);
			match(LPAR);
			setState(469);
			rightExpr(0);
			setState(470);
			match(RPAR);
			setState(471);
			match(END);
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

	public static class ForBlockContext extends ParserRuleContext {
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	 
		public ForBlockContext() { }
		public void copyFrom(ForBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends ForBlockContext {
		public TerminalNode FOR() { return getToken(LanguageParser.FOR, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(LanguageParser.TO, 0); }
		public TerminalNode DO() { return getToken(LanguageParser.DO, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ForContext(ForBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forBlock);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(FOR);
			setState(474);
			match(ID);
			setState(475);
			match(ASSIGN);
			setState(476);
			rightExpr(0);
			setState(477);
			match(TO);
			setState(478);
			rightExpr(0);
			setState(479);
			match(DO);
			setState(481); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(480);
				inst();
				}
				}
				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(485);
			match(END);
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
		case 19:
			return rightExpr_sempred((RightExprContext)_localctx, predIndex);
		case 21:
			return leftExpr_sempred((LeftExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rightExpr_sempred(RightExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean leftExpr_sempred(LeftExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3"+
		"\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\6\6u\n\6\r\6\16\6v\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\b\u0080\n"+
		"\b\f\b\16\b\u0083\13\b\3\t\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009c\n"+
		"\n\3\13\7\13\u009f\n\13\f\13\16\13\u00a2\13\13\3\13\7\13\u00a5\n\13\f"+
		"\13\16\13\u00a8\13\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\5\13"+
		"\u00b0\n\13\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\f\3\f\3\f\3\f\5\f"+
		"\u00bb\n\f\3\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00c9\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d0\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u00e3\n\20\r\20\16\20\u00e4\3\20\3\20\3\20\3\21\3"+
		"\21\5\21\u00ec\n\21\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5"+
		"\13\22\5\22\u00f7\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0100\n"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u010d"+
		"\n\24\f\24\16\24\u0110\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0125\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u014e\n\25"+
		"\f\25\16\25\u0151\13\25\3\26\3\26\3\26\3\26\3\26\7\26\u0158\n\26\f\26"+
		"\16\26\u015b\13\26\5\26\u015d\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0168\n\27\3\27\3\27\5\27\u016c\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0178\n\27\3\27\3\27\7\27\u017c"+
		"\n\27\f\27\16\27\u017f\13\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5"+
		"\31\u0189\n\31\3\31\3\31\3\31\3\31\5\31\u018f\n\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0195\n\31\3\31\3\31\3\31\3\31\5\31\u019b\n\31\3\31\3\31\3\31\3"+
		"\31\5\31\u01a1\n\31\3\31\3\31\3\31\5\31\u01a6\n\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01b6\n\34\r\34"+
		"\16\34\u01b7\3\34\3\34\6\34\u01bc\n\34\r\34\16\34\u01bd\5\34\u01c0\n\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u01ca\n\35\r\35\16\35\u01cb"+
		"\3\35\3\35\3\36\3\36\6\36\u01d2\n\36\r\36\16\36\u01d3\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u01e4\n\37"+
		"\r\37\16\37\u01e5\3\37\3\37\3\37\2\4(, \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\4\2\23\23\66\66\u021e\2>\3\2\2\2"+
		"\4I\3\2\2\2\6N\3\2\2\2\b\\\3\2\2\2\nh\3\2\2\2\fz\3\2\2\2\16|\3\2\2\2\20"+
		"\u0084\3\2\2\2\22\u009b\3\2\2\2\24\u00af\3\2\2\2\26\u00ba\3\2\2\2\30\u00bc"+
		"\3\2\2\2\32\u00cf\3\2\2\2\34\u00d1\3\2\2\2\36\u00dd\3\2\2\2 \u00eb\3\2"+
		"\2\2\"\u00ed\3\2\2\2$\u00fa\3\2\2\2&\u0105\3\2\2\2(\u0124\3\2\2\2*\u0152"+
		"\3\2\2\2,\u016b\3\2\2\2.\u0180\3\2\2\2\60\u01a5\3\2\2\2\62\u01a7\3\2\2"+
		"\2\64\u01ab\3\2\2\2\66\u01af\3\2\2\28\u01c3\3\2\2\2:\u01cf\3\2\2\2<\u01db"+
		"\3\2\2\2>C\5\4\3\2?B\5\26\f\2@B\5\n\6\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\6\4\2GH\7\2\2\3H\3\3\2\2"+
		"\2IJ\7\4\2\2JK\7\16\2\2KL\7\5\2\2LM\7\16\2\2M\5\3\2\2\2NO\7\21\2\2OP\7"+
		"\f\2\2PQ\7\22\2\2QR\7\6\2\2RS\7\7\2\2ST\7;\2\2TU\7\23\2\2UV\7\24\2\2V"+
		"W\5\b\5\2WX\7\25\2\2X\7\3\2\2\2Y[\5\22\n\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\62\32\2`a\7\t\2\2ae\3\2\2\2b"+
		"d\5\22\n\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2"+
		"\2hi\78\2\2ij\7\f\2\2jk\7\22\2\2km\7\6\2\2ln\5\16\b\2ml\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2op\7\7\2\2pq\7;\2\2qr\5\f\7\2rt\7\24\2\2su\5\24\13\2ts\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\25\2\2y\13\3\2\2\2"+
		"z{\t\2\2\2{\r\3\2\2\2|\u0081\5\20\t\2}~\7\b\2\2~\u0080\5\20\t\2\177}\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\17\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\78\2\2\u0085\u0086\7\b\2\2"+
		"\u0086\u0088\78\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\f\2\2\u008d\u008e\5\32\16\2\u008e\21\3\2\2\2\u008f\u009c\5\30"+
		"\r\2\u0090\u009c\5.\30\2\u0091\u0092\5\60\31\2\u0092\u0093\7\t\2\2\u0093"+
		"\u009c\3\2\2\2\u0094\u009c\5\66\34\2\u0095\u009c\58\35\2\u0096\u009c\5"+
		":\36\2\u0097\u009c\5<\37\2\u0098\u0099\5*\26\2\u0099\u009a\7\t\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0090\3\2\2\2\u009b\u0091\3\2"+
		"\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009c\23\3\2\2\2\u009d\u009f\5&\24"+
		"\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00b0\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5$\23\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00b0\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5\36\20\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a0\3\2\2\2\u00af"+
		"\u00a6\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00b3\5\22\n\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00bb\5\30\r"+
		"\2\u00b7\u00bb\5$\23\2\u00b8\u00bb\5&\24\2\u00b9\u00bb\5\36\20\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\27\3\2\2\2\u00bc\u00c1\78\2\2\u00bd\u00be\7\b\2\2\u00be\u00c0"+
		"\78\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\f"+
		"\2\2\u00c5\u00c8\5\32\16\2\u00c6\u00c7\7\r\2\2\u00c7\u00c9\5 \21\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\t"+
		"\2\2\u00cb\31\3\2\2\2\u00cc\u00d0\7\66\2\2\u00cd\u00d0\5\34\17\2\u00ce"+
		"\u00d0\5\36\20\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\7\66\2\2\u00d2\u00d3\7\13\2\2\u00d3"+
		"\u00d8\7<\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d7\7<\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\n\2\2\u00dc\35\3\2\2\2\u00dd"+
		"\u00de\78\2\2\u00de\u00df\7\f\2\2\u00df\u00e2\7\67\2\2\u00e0\u00e3\5\30"+
		"\r\2\u00e1\u00e3\5\36\20\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\7\25\2\2\u00e7\u00e8\7\t\2\2\u00e8\37\3\2\2\2\u00e9\u00ec"+
		"\5\"\22\2\u00ea\u00ec\5(\25\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec!\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00f6\5 \21\2\u00ef\u00f0\7"+
		"\b\2\2\u00f0\u00f2\5 \21\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\7\7\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\78\2\2"+
		"\u00fc\u00ff\7\f\2\2\u00fd\u0100\5\32\16\2\u00fe\u0100\5\36\20\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\r"+
		"\2\2\u0102\u0103\5 \21\2\u0103\u0104\7\t\2\2\u0104%\3\2\2\2\u0105\u0106"+
		"\7\27\2\2\u0106\u0107\78\2\2\u0107\u0108\7\r\2\2\u0108\u0109\7\6\2\2\u0109"+
		"\u010e\78\2\2\u010a\u010b\7\b\2\2\u010b\u010d\78\2\2\u010c\u010a\3\2\2"+
		"\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\7\2\2\u0112\u0113\7\t\2\2\u0113"+
		"\'\3\2\2\2\u0114\u0115\b\25\1\2\u0115\u0116\7\6\2\2\u0116\u0117\5(\25"+
		"\2\u0117\u0118\7\7\2\2\u0118\u0125\3\2\2\2\u0119\u011a\7\31\2\2\u011a"+
		"\u0125\5(\25\23\u011b\u011c\7!\2\2\u011c\u0125\5(\25\n\u011d\u0125\5,"+
		"\27\2\u011e\u0125\7<\2\2\u011f\u0125\7\35\2\2\u0120\u0125\7\36\2\2\u0121"+
		"\u0125\79\2\2\u0122\u0125\7:\2\2\u0123\u0125\5*\26\2\u0124\u0114\3\2\2"+
		"\2\u0124\u0119\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u011e"+
		"\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u014f\3\2\2\2\u0126\u0127\f\30"+
		"\2\2\u0127\u0128\7\32\2\2\u0128\u014e\5(\25\31\u0129\u012a\f\27\2\2\u012a"+
		"\u012b\7\33\2\2\u012b\u014e\5(\25\30\u012c\u012d\f\26\2\2\u012d\u012e"+
		"\7\34\2\2\u012e\u014e\5(\25\27\u012f\u0130\f\25\2\2\u0130\u0131\7\30\2"+
		"\2\u0131\u014e\5(\25\26\u0132\u0133\f\24\2\2\u0133\u0134\7\31\2\2\u0134"+
		"\u014e\5(\25\25\u0135\u0136\f\22\2\2\u0136\u0137\7\r\2\2\u0137\u014e\5"+
		"(\25\23\u0138\u0139\f\21\2\2\u0139\u013a\7\"\2\2\u013a\u014e\5(\25\22"+
		"\u013b\u013c\f\20\2\2\u013c\u013d\7#\2\2\u013d\u014e\5(\25\21\u013e\u013f"+
		"\f\17\2\2\u013f\u0140\7$\2\2\u0140\u014e\5(\25\20\u0141\u0142\f\16\2\2"+
		"\u0142\u0143\7%\2\2\u0143\u014e\5(\25\17\u0144\u0145\f\r\2\2\u0145\u0146"+
		"\7&\2\2\u0146\u014e\5(\25\16\u0147\u0148\f\f\2\2\u0148\u0149\7\37\2\2"+
		"\u0149\u014e\5(\25\r\u014a\u014b\f\13\2\2\u014b\u014c\7 \2\2\u014c\u014e"+
		"\5(\25\f\u014d\u0126\3\2\2\2\u014d\u0129\3\2\2\2\u014d\u012c\3\2\2\2\u014d"+
		"\u012f\3\2\2\2\u014d\u0132\3\2\2\2\u014d\u0135\3\2\2\2\u014d\u0138\3\2"+
		"\2\2\u014d\u013b\3\2\2\2\u014d\u013e\3\2\2\2\u014d\u0141\3\2\2\2\u014d"+
		"\u0144\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u014a\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150)\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0153\78\2\2\u0153\u015c\7\6\2\2\u0154\u0159\5(\25\2\u0155"+
		"\u0156\7\b\2\2\u0156\u0158\5(\25\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\7\7\2\2\u015f+\3\2\2\2\u0160\u0161\b\27\1\2\u0161\u016c"+
		"\78\2\2\u0162\u0163\78\2\2\u0163\u0164\7\13\2\2\u0164\u0167\5(\25\2\u0165"+
		"\u0166\7\b\2\2\u0166\u0168\5(\25\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7\n\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0160\3\2\2\2\u016b\u0162\3\2\2\2\u016c\u017d\3\2\2\2\u016d\u016e\f\4"+
		"\2\2\u016e\u016f\7\3\2\2\u016f\u017c\78\2\2\u0170\u0171\f\3\2\2\u0171"+
		"\u0172\7\3\2\2\u0172\u0173\78\2\2\u0173\u0174\7\13\2\2\u0174\u0177\5("+
		"\25\2\u0175\u0176\7\b\2\2\u0176\u0178\5(\25\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\n\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u016d\3\2\2\2\u017b\u0170\3\2\2\2\u017c\u017f\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e-\3\2\2\2\u017f\u017d\3\2\2\2"+
		"\u0180\u0181\5,\27\2\u0181\u0182\7\20\2\2\u0182\u0183\5(\25\2\u0183\u0184"+
		"\7\t\2\2\u0184/\3\2\2\2\u0185\u0186\7/\2\2\u0186\u0188\7\6\2\2\u0187\u0189"+
		"\5(\25\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u01a6\7\7\2\2\u018b\u018c\7\60\2\2\u018c\u018e\7\6\2\2\u018d\u018f\5"+
		"(\25\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u01a6\7\7\2\2\u0191\u0192\7\61\2\2\u0192\u0194\7\6\2\2\u0193\u0195\5"+
		"(\25\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u01a6\7\7\2\2\u0197\u0198\7\62\2\2\u0198\u019a\7\6\2\2\u0199\u019b\5"+
		"(\25\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u01a6\7\7\2\2\u019d\u019e\7\63\2\2\u019e\u01a0\7\6\2\2\u019f\u01a1\5"+
		"(\25\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a6\7\7\2\2\u01a3\u01a6\5\64\33\2\u01a4\u01a6\5\62\32\2\u01a5\u0185"+
		"\3\2\2\2\u01a5\u018b\3\2\2\2\u01a5\u0191\3\2\2\2\u01a5\u0197\3\2\2\2\u01a5"+
		"\u019d\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\61\3\2\2"+
		"\2\u01a7\u01a8\7\65\2\2\u01a8\u01a9\7\6\2\2\u01a9\u01aa\7\7\2\2\u01aa"+
		"\63\3\2\2\2\u01ab\u01ac\7\64\2\2\u01ac\u01ad\7\6\2\2\u01ad\u01ae\7\7\2"+
		"\2\u01ae\65\3\2\2\2\u01af\u01b0\7\'\2\2\u01b0\u01b1\7\6\2\2\u01b1\u01b2"+
		"\5(\25\2\u01b2\u01b3\7\7\2\2\u01b3\u01b5\7+\2\2\u01b4\u01b6\5\22\n\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01bf\3\2\2\2\u01b9\u01bb\7,\2\2\u01ba\u01bc\5\22\n\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01c0\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c2\7\25\2\2\u01c2\67\3\2\2\2\u01c3\u01c4\7(\2"+
		"\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\5(\25\2\u01c6\u01c7\7\7\2\2\u01c7\u01c9"+
		"\7\24\2\2\u01c8\u01ca\5\22\n\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\7\25\2\2\u01ce9\3\2\2\2\u01cf\u01d1\7-\2\2\u01d0\u01d2\5\22\n\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7*\2\2\u01d6\u01d7\7\6\2\2\u01d7"+
		"\u01d8\5(\25\2\u01d8\u01d9\7\7\2\2\u01d9\u01da\7\25\2\2\u01da;\3\2\2\2"+
		"\u01db\u01dc\7.\2\2\u01dc\u01dd\78\2\2\u01dd\u01de\7\20\2\2\u01de\u01df"+
		"\5(\25\2\u01df\u01e0\7)\2\2\u01e0\u01e1\5(\25\2\u01e1\u01e3\7\24\2\2\u01e2"+
		"\u01e4\5\22\n\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e3\3"+
		"\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7\25\2\2\u01e8"+
		"=\3\2\2\2\62AC\\emv\u0081\u0089\u009b\u00a0\u00a6\u00ac\u00af\u00b4\u00ba"+
		"\u00c1\u00c8\u00cf\u00d8\u00e2\u00e4\u00eb\u00f3\u00f6\u00ff\u010e\u0124"+
		"\u014d\u014f\u0159\u015c\u0167\u016b\u0177\u017b\u017d\u0188\u018e\u0194"+
		"\u019a\u01a0\u01a5\u01b7\u01bd\u01bf\u01cb\u01d3\u01e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}