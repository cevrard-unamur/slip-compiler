// Generated from tmp/Language.g4 by ANTLR 4.6
package tmp;
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
		IMPORT=1, MAPFILE=2, LPAR=3, RPAR=4, COMMA=5, SEMICOLON=6, RBRA=7, LBRA=8, 
		AS=9, EQUAL=10, QUOTE=11, SINGLE_QUOTE=12, ASSIGN=13, MAIN=14, FUNCTION=15, 
		VOID=16, DO=17, END=18, CONST=19, ENUM=20, PLUS=21, MINUS=22, MULTI=23, 
		DIV=24, MOD=25, TRUE=26, FALSE=27, AND=28, OR=29, NOT=30, LESS=31, LESS_EQUAL=32, 
		GREAT=33, GREAT_EQUAL=34, NOT_EQUAL=35, IF=36, WHILE=37, TO=38, UNTIL=39, 
		THEN=40, ELSE=41, REPEAT=42, FOR=43, LEFT=44, RIGHT=45, UP=46, DOWN=47, 
		JUMP=48, FIGHT=49, DIG=50, SCALAR=51, RECORD=52, ID=53, STRING=54, CHAR=55, 
		COLON=56, NUMBER=57, COMMENT_MULTILINE=58, COMMENT_SINGLELINE=59, NEWLINE=60, 
		WS=61;
	public static final int
		RULE_prog = 0, RULE_mapImport = 1, RULE_mainFunction = 2, RULE_funct = 3, 
		RULE_argumentList = 4, RULE_argument = 5, RULE_inst = 6, RULE_functionInst = 7, 
		RULE_globalVariable = 8, RULE_variableDeclaration = 9, RULE_variableType = 10, 
		RULE_arrayType = 11, RULE_structureType = 12, RULE_initVariable = 13, 
		RULE_initArray = 14, RULE_constDeclaration = 15, RULE_enumDeclaration = 16, 
		RULE_rightExpr = 17, RULE_leftExpr = 18, RULE_assignation = 19, RULE_actionType = 20, 
		RULE_digInstruction = 21, RULE_fightInstruction = 22, RULE_ifBlock = 23, 
		RULE_whileBlock = 24, RULE_repeatBlock = 25, RULE_forBlock = 26;
	public static final String[] ruleNames = {
		"prog", "mapImport", "mainFunction", "funct", "argumentList", "argument", 
		"inst", "functionInst", "globalVariable", "variableDeclaration", "variableType", 
		"arrayType", "structureType", "initVariable", "initArray", "constDeclaration", 
		"enumDeclaration", "rightExpr", "leftExpr", "assignation", "actionType", 
		"digInstruction", "fightInstruction", "ifBlock", "whileBlock", "repeatBlock", 
		"forBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", 
		"'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", 
		"'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'if'", 
		"'while'", "'to'", "'until'", "'then'", "'else'", "'repeat'", "'for'", 
		"'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, 
		"'record'", null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
		"REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS"
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
		public FunctContext funct() {
			return getRuleContext(FunctContext.class,0);
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
			int _alt;
			_localctx = new ProgrammeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			mapImport();
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					globalVariable();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(61);
				funct();
				}
			}

			setState(64);
			mainFunction();
			setState(65);
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
			setState(67);
			match(IMPORT);
			setState(68);
			match(QUOTE);
			setState(69);
			match(MAPFILE);
			setState(70);
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
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
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
		int _la;
		try {
			int _alt;
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(MAIN);
			setState(73);
			match(AS);
			setState(74);
			match(FUNCTION);
			setState(75);
			match(LPAR);
			setState(76);
			match(RPAR);
			setState(77);
			match(COLON);
			setState(78);
			match(VOID);
			setState(79);
			match(DO);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					inst();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			{
			setState(86);
			digInstruction();
			setState(87);
			match(SEMICOLON);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(89);
				inst();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
	public static class FunctionContext extends FunctContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode AS() { return getToken(LanguageParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(LanguageParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public TerminalNode DO() { return getToken(LanguageParser.DO, 0); }
		public TerminalNode END() { return getToken(LanguageParser.END, 0); }
		public TerminalNode SCALAR() { return getToken(LanguageParser.SCALAR, 0); }
		public TerminalNode VOID() { return getToken(LanguageParser.VOID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public List<FunctionInstContext> functionInst() {
			return getRuleContexts(FunctionInstContext.class);
		}
		public FunctionInstContext functionInst(int i) {
			return getRuleContext(FunctionInstContext.class,i);
		}
		public FunctionContext(FunctContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funct);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(AS);
			setState(99);
			match(FUNCTION);
			setState(100);
			match(LPAR);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(101);
				argumentList();
				}
			}

			setState(104);
			match(RPAR);
			setState(105);
			match(COLON);
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(107);
			match(DO);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				functionInst();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(113);
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
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			argument();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				argument();
				}
				}
				setState(122);
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
		enterRule(_localctx, 10, RULE_argument);
		int _la;
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				match(ID);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(AS);
			setState(132);
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
	public static class InstructionContext extends InstContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public RepeatBlockContext repeatBlock() {
			return getRuleContext(RepeatBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public InstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inst);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				assignation();
				}
				break;
			case 3:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(136);
				actionType();
				setState(137);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				ifBlock();
				}
				break;
			case 5:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				whileBlock();
				}
				break;
			case 6:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				repeatBlock();
				}
				break;
			case 7:
				_localctx = new InstructionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				forBlock();
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
		public List<StructureTypeContext> structureType() {
			return getRuleContexts(StructureTypeContext.class);
		}
		public StructureTypeContext structureType(int i) {
			return getRuleContext(StructureTypeContext.class,i);
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
		enterRule(_localctx, 14, RULE_functionInst);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(145);
					enumDeclaration();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(151);
					constDeclaration();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(157);
						structureType();
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			setState(166); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(165);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
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
	public static class GlobalVariableDeclarationContext extends GlobalVariableContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public GlobalVariableDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalEnumDeclarationContext extends GlobalVariableContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GlobalEnumDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalConstantDeclarationContext extends GlobalVariableContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public GlobalConstantDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalStructureDeclarationContext extends GlobalVariableContext {
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
		}
		public GlobalStructureDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalStructureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalStructureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalStructureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_globalVariable);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new GlobalVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new GlobalConstantDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				constDeclaration();
				}
				break;
			case 3:
				_localctx = new GlobalEnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				enumDeclaration();
				}
				break;
			case 4:
				_localctx = new GlobalStructureDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				structureType();
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
	public static class VariableContext extends VariableDeclarationContext {
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
		public VariableContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177);
				match(COMMA);
				setState(178);
				match(ID);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(AS);
			setState(185);
			variableType();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(186);
				match(EQUAL);
				setState(187);
				initVariable();
				}
			}

			setState(190);
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
	public static class ScalarContext extends VariableTypeContext {
		public TerminalNode SCALAR() { return getToken(LanguageParser.SCALAR, 0); }
		public ScalarContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends VariableTypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayContext(VariableTypeContext ctx) { copyFrom(ctx); }
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
	public static class StructureContext extends VariableTypeContext {
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
		}
		public StructureContext(VariableTypeContext ctx) { copyFrom(ctx); }
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

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableType);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				arrayType();
				}
				break;
			case 3:
				_localctx = new StructureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				structureType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDefinitionContext extends ArrayTypeContext {
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
		public ArrayDefinitionContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		int _la;
		try {
			_localctx = new ArrayDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(SCALAR);
			setState(198);
			match(LBRA);
			setState(199);
			match(NUMBER);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				match(NUMBER);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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

	public static class StructureTypeContext extends ParserRuleContext {
		public StructureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureType; }
	 
		public StructureTypeContext() { }
		public void copyFrom(StructureTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructureDefinitionContext extends StructureTypeContext {
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
		public StructureDefinitionContext(StructureTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStructureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStructureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStructureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureTypeContext structureType() throws RecognitionException {
		StructureTypeContext _localctx = new StructureTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_structureType);
		int _la;
		try {
			_localctx = new StructureDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(ID);
			setState(210);
			match(AS);
			setState(211);
			match(RECORD);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				variableDeclaration();
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(217);
			match(END);
			setState(218);
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
		enterRule(_localctx, 26, RULE_initVariable);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				initArray();
				}
				break;
			case 2:
				_localctx = new RightInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
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
		enterRule(_localctx, 28, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LPAR);
			setState(225);
			initVariable();
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(226);
					match(COMMA);
					setState(227);
					initVariable();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(235);
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
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
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
		enterRule(_localctx, 30, RULE_constDeclaration);
		try {
			_localctx = new ConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(CONST);
			setState(238);
			match(ID);
			setState(239);
			match(AS);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(240);
				variableType();
				}
				break;
			case 2:
				{
				setState(241);
				structureType();
				}
				break;
			}
			setState(244);
			match(EQUAL);
			setState(245);
			initVariable();
			setState(246);
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
		enterRule(_localctx, 32, RULE_enumDeclaration);
		int _la;
		try {
			_localctx = new EnumerationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ENUM);
			setState(249);
			match(ID);
			setState(250);
			match(EQUAL);
			setState(251);
			match(LPAR);
			setState(252);
			match(ID);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				match(ID);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(RPAR);
			setState(261);
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
	public static class MinusNumbersExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public MinusNumbersExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMinusNumbersExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMinusNumbersExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMinusNumbersExpression(this);
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
	public static class DivideNumbersExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public DivideNumbersExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDivideNumbersExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDivideNumbersExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDivideNumbersExpression(this);
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
	public static class BooleanEqualExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public BooleanEqualExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanEqualExpression(this);
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
	public static class BooleanOrExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public BooleanOrExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanGreatExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode GREAT() { return getToken(LanguageParser.GREAT, 0); }
		public BooleanGreatExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanGreatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanGreatExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanGreatExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLessExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(LanguageParser.LESS, 0); }
		public BooleanLessExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanLessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanLessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusNumberExpressionContext extends RightExprContext {
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public MinusNumberExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMinusNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMinusNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMinusNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanNotEqualExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(LanguageParser.NOT_EQUAL, 0); }
		public BooleanNotEqualExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanNotEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanNotEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanNotEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLessEqualExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(LanguageParser.LESS_EQUAL, 0); }
		public BooleanLessEqualExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanLessEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanLessEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanLessEqualExpression(this);
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
	public static class AddNumbersExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LanguageParser.PLUS, 0); }
		public AddNumbersExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAddNumbersExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAddNumbersExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAddNumbersExpression(this);
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
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
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
	public static class BooleanGreatEqualExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode GREAT_EQUAL() { return getToken(LanguageParser.GREAT_EQUAL, 0); }
		public BooleanGreatEqualExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanGreatEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanGreatEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanGreatEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModNumbersExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(LanguageParser.MOD, 0); }
		public ModNumbersExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterModNumbersExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitModNumbersExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitModNumbersExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyNumbersExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(LanguageParser.MULTI, 0); }
		public MultiplyNumbersExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMultiplyNumbersExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMultiplyNumbersExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMultiplyNumbersExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAndExpressionContext extends RightExprContext {
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public BooleanAndExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBooleanAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBooleanAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBooleanAndExpression(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_rightExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				match(NOT);
				setState(265);
				rightExpr(23);
				}
				break;
			case 2:
				{
				_localctx = new MinusNumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(MINUS);
				setState(267);
				rightExpr(14);
				}
				break;
			case 3:
				{
				_localctx = new LeftExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				leftExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(ID);
				setState(275);
				match(LPAR);
				setState(276);
				rightExpr(0);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(277);
						match(COMMA);
						setState(278);
						rightExpr(0);
						}
						}
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(286);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(LPAR);
				setState(289);
				rightExpr(0);
				setState(290);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanAndExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(294);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(295);
						match(AND);
						setState(296);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new BooleanOrExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(297);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(298);
						match(OR);
						setState(299);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new BooleanEqualExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(300);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(301);
						match(EQUAL);
						setState(302);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new BooleanLessExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(303);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(304);
						match(LESS);
						setState(305);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new BooleanLessEqualExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(306);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(307);
						match(LESS_EQUAL);
						setState(308);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new BooleanGreatExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(309);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(310);
						match(GREAT);
						setState(311);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new BooleanGreatEqualExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(312);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(313);
						match(GREAT_EQUAL);
						setState(314);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new BooleanNotEqualExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(315);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(316);
						match(NOT_EQUAL);
						setState(317);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new AddNumbersExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(318);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(319);
						match(PLUS);
						setState(320);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new MinusNumbersExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(321);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(322);
						match(MINUS);
						setState(323);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new MultiplyNumbersExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(324);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(325);
						match(MULTI);
						setState(326);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new DivideNumbersExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(327);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(328);
						match(DIV);
						setState(329);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new ModNumbersExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(330);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(331);
						match(MOD);
						setState(332);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_leftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(339);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(ID);
				setState(341);
				match(LBRA);
				setState(342);
				rightExpr(0);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(343);
					match(COMMA);
					setState(344);
					rightExpr(0);
					}
				}

				setState(347);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftPropertyContext(new LeftExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					matchWildcard();
					setState(353);
					match(ID);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode SEMICOLON() { return getToken(LanguageParser.SEMICOLON, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			leftExpr(0);
			setState(360);
			match(ASSIGN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
				{
				setState(361);
				rightExpr(0);
				}
			}

			setState(364);
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
	public static class DigTypeContext extends ActionTypeContext {
		public DigInstructionContext digInstruction() {
			return getRuleContext(DigInstructionContext.class,0);
		}
		public DigTypeContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDigType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDigType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDigType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftContext extends ActionTypeContext {
		public TerminalNode LEFT() { return getToken(LanguageParser.LEFT, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public LeftContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightContext extends ActionTypeContext {
		public TerminalNode RIGHT() { return getToken(LanguageParser.RIGHT, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public RightContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpContext extends ActionTypeContext {
		public TerminalNode UP() { return getToken(LanguageParser.UP, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public UpContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DownContext extends ActionTypeContext {
		public TerminalNode DOWN() { return getToken(LanguageParser.DOWN, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public DownContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitDown(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FightTypeContext extends ActionTypeContext {
		public FightInstructionContext fightInstruction() {
			return getRuleContext(FightInstructionContext.class,0);
		}
		public FightTypeContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFightType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFightType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFightType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpContext extends ActionTypeContext {
		public TerminalNode JUMP() { return getToken(LanguageParser.JUMP, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public JumpContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionType);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(LEFT);
				setState(367);
				match(LPAR);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(368);
					rightExpr(0);
					}
				}

				setState(371);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(RIGHT);
				setState(373);
				match(LPAR);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(374);
					rightExpr(0);
					}
				}

				setState(377);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(UP);
				setState(379);
				match(LPAR);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(380);
					rightExpr(0);
					}
				}

				setState(383);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(DOWN);
				setState(385);
				match(LPAR);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(386);
					rightExpr(0);
					}
				}

				setState(389);
				match(RPAR);
				}
				break;
			case JUMP:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(JUMP);
				setState(391);
				match(LPAR);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(392);
					rightExpr(0);
					}
				}

				setState(395);
				match(RPAR);
				}
				break;
			case FIGHT:
				_localctx = new FightTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
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
		public DigInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digInstruction; }
	 
		public DigInstructionContext() { }
		public void copyFrom(DigInstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DigContext extends DigInstructionContext {
		public TerminalNode DIG() { return getToken(LanguageParser.DIG, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public DigContext(DigInstructionContext ctx) { copyFrom(ctx); }
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

	public final DigInstructionContext digInstruction() throws RecognitionException {
		DigInstructionContext _localctx = new DigInstructionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_digInstruction);
		try {
			_localctx = new DigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DIG);
			setState(401);
			match(LPAR);
			setState(402);
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
		public FightInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fightInstruction; }
	 
		public FightInstructionContext() { }
		public void copyFrom(FightInstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FightContext extends FightInstructionContext {
		public TerminalNode FIGHT() { return getToken(LanguageParser.FIGHT, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public FightContext(FightInstructionContext ctx) { copyFrom(ctx); }
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

	public final FightInstructionContext fightInstruction() throws RecognitionException {
		FightInstructionContext _localctx = new FightInstructionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fightInstruction);
		try {
			_localctx = new FightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(FIGHT);
			setState(405);
			match(LPAR);
			setState(406);
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
		enterRule(_localctx, 46, RULE_ifBlock);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(IF);
			setState(409);
			match(LPAR);
			setState(410);
			rightExpr(0);
			setState(411);
			match(RPAR);
			setState(412);
			match(THEN);
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				inst();
				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(418);
				match(ELSE);
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(419);
					inst();
					}
					}
					setState(422); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
				}
			}

			setState(426);
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
		enterRule(_localctx, 48, RULE_whileBlock);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(WHILE);
			setState(429);
			match(LPAR);
			setState(430);
			rightExpr(0);
			setState(431);
			match(RPAR);
			setState(432);
			match(DO);
			setState(434); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				inst();
				}
				}
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(438);
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
		enterRule(_localctx, 50, RULE_repeatBlock);
		int _la;
		try {
			_localctx = new RepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(REPEAT);
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441);
				inst();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(446);
			match(UNTIL);
			setState(447);
			match(LPAR);
			setState(448);
			rightExpr(0);
			setState(449);
			match(RPAR);
			setState(450);
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
		enterRule(_localctx, 52, RULE_forBlock);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(FOR);
			setState(453);
			match(ID);
			setState(454);
			match(ASSIGN);
			setState(455);
			rightExpr(0);
			setState(456);
			match(TO);
			setState(457);
			rightExpr(0);
			setState(458);
			match(DO);
			setState(460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(459);
				inst();
				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(464);
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
		case 17:
			return rightExpr_sempred((RightExprContext)_localctx, predIndex);
		case 18:
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
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
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
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u01d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\5\2"+
		"A\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\5\3\5\3\5\6\5p\n\5\r\5\16"+
		"\5q\3\5\3\5\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\7\3\7\3\7\7\7\u0081"+
		"\n\7\f\7\16\7\u0084\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0092\n\b\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\7\t\u009b\n"+
		"\t\f\t\16\t\u009e\13\t\3\t\7\t\u00a1\n\t\f\t\16\t\u00a4\13\t\5\t\u00a6"+
		"\n\t\3\t\6\t\u00a9\n\t\r\t\16\t\u00aa\3\n\3\n\3\n\3\n\5\n\u00b1\n\n\3"+
		"\13\3\13\3\13\7\13\u00b6\n\13\f\13\16\13\u00b9\13\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00bf\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r\3\r\3\16\3\16\3\16\3\16\6"+
		"\16\u00d8\n\16\r\16\16\16\u00d9\3\16\3\16\3\16\3\17\3\17\5\17\u00e1\n"+
		"\17\3\20\3\20\3\20\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea\13\20\5\20\u00ec"+
		"\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f5\n\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0102\n\22\f\22\16\22\u0105"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011a\n\23\f\23\16\23\u011d\13\23"+
		"\5\23\u011f\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0127\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0150\n\23\f\23"+
		"\16\23\u0153\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015c\n\24"+
		"\3\24\3\24\5\24\u0160\n\24\3\24\3\24\3\24\7\24\u0165\n\24\f\24\16\24\u0168"+
		"\13\24\3\25\3\25\3\25\5\25\u016d\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u0174"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u017a\n\26\3\26\3\26\3\26\3\26\5\26\u0180"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0186\n\26\3\26\3\26\3\26\3\26\5\26\u018c"+
		"\n\26\3\26\3\26\3\26\5\26\u0191\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u01a1\n\31\r\31\16\31\u01a2\3"+
		"\31\3\31\6\31\u01a7\n\31\r\31\16\31\u01a8\5\31\u01ab\n\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\6\32\u01b5\n\32\r\32\16\32\u01b6\3\32\3\32"+
		"\3\33\3\33\6\33\u01bd\n\33\r\33\16\33\u01be\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01cf\n\34\r\34\16\34"+
		"\u01d0\3\34\3\34\3\34\2\4$&\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\3\4\2\22\22\65\65\u0209\28\3\2\2\2\4E\3\2\2\2"+
		"\6J\3\2\2\2\bc\3\2\2\2\nu\3\2\2\2\f}\3\2\2\2\16\u0091\3\2\2\2\20\u00a5"+
		"\3\2\2\2\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3"+
		"\2\2\2\32\u00d3\3\2\2\2\34\u00e0\3\2\2\2\36\u00e2\3\2\2\2 \u00ef\3\2\2"+
		"\2\"\u00fa\3\2\2\2$\u0126\3\2\2\2&\u015f\3\2\2\2(\u0169\3\2\2\2*\u0190"+
		"\3\2\2\2,\u0192\3\2\2\2.\u0196\3\2\2\2\60\u019a\3\2\2\2\62\u01ae\3\2\2"+
		"\2\64\u01ba\3\2\2\2\66\u01c6\3\2\2\28<\5\4\3\29;\5\22\n\2:9\3\2\2\2;>"+
		"\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\5\b\5\2@?\3\2\2\2@"+
		"A\3\2\2\2AB\3\2\2\2BC\5\6\4\2CD\7\2\2\3D\3\3\2\2\2EF\7\3\2\2FG\7\r\2\2"+
		"GH\7\4\2\2HI\7\r\2\2I\5\3\2\2\2JK\7\20\2\2KL\7\13\2\2LM\7\21\2\2MN\7\5"+
		"\2\2NO\7\6\2\2OP\7:\2\2PQ\7\22\2\2QU\7\23\2\2RT\5\16\b\2SR\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5,\27\2YZ\7\b\2\2Z^\3"+
		"\2\2\2[]\5\16\b\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2"+
		"`^\3\2\2\2ab\7\24\2\2b\7\3\2\2\2cd\7\67\2\2de\7\13\2\2ef\7\21\2\2fh\7"+
		"\5\2\2gi\5\n\6\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\6\2\2kl\7:\2\2lm\t"+
		"\2\2\2mo\7\23\2\2np\5\20\t\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r"+
		"s\3\2\2\2st\7\24\2\2t\t\3\2\2\2uz\5\f\7\2vw\7\7\2\2wy\5\f\7\2xv\3\2\2"+
		"\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\13\3\2\2\2|z\3\2\2\2}\u0082\7\67\2\2"+
		"~\177\7\7\2\2\177\u0081\7\67\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0085\u0086\7\13\2\2\u0086\u0087\5\26\f\2\u0087\r\3\2\2\2\u0088\u0092"+
		"\5\24\13\2\u0089\u0092\5(\25\2\u008a\u008b\5*\26\2\u008b\u008c\7\b\2\2"+
		"\u008c\u0092\3\2\2\2\u008d\u0092\5\60\31\2\u008e\u0092\5\62\32\2\u008f"+
		"\u0092\5\64\33\2\u0090\u0092\5\66\34\2\u0091\u0088\3\2\2\2\u0091\u0089"+
		"\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\17\3\2\2\2\u0093\u0095\5\"\22"+
		"\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u00a6\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5 \21\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a6\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5\32\16\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u0096\3\2\2\2\u00a5"+
		"\u009c\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a9\5\16\b\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b1\5\24\13"+
		"\2\u00ad\u00b1\5 \21\2\u00ae\u00b1\5\"\22\2\u00af\u00b1\5\32\16\2\u00b0"+
		"\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\23\3\2\2\2\u00b2\u00b7\7\67\2\2\u00b3\u00b4\7\7\2\2\u00b4\u00b6"+
		"\7\67\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb"+
		"\7\13\2\2\u00bb\u00be\5\26\f\2\u00bc\u00bd\7\f\2\2\u00bd\u00bf\5\34\17"+
		"\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7\b\2\2\u00c1\25\3\2\2\2\u00c2\u00c6\7\65\2\2\u00c3\u00c6\5\30\r\2\u00c4"+
		"\u00c6\5\32\16\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\7\65\2\2\u00c8\u00c9\7\n\2\2\u00c9"+
		"\u00ce\7;\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00cd\7;\2\2\u00cc\u00ca\3\2\2"+
		"\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\31\3\2\2\2\u00d3"+
		"\u00d4\7\67\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00d7\7\66\2\2\u00d6\u00d8"+
		"\5\24\13\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\24\2\2\u00dc\u00dd"+
		"\7\b\2\2\u00dd\33\3\2\2\2\u00de\u00e1\5\36\20\2\u00df\u00e1\5$\23\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\7\5\2"+
		"\2\u00e3\u00eb\5\34\17\2\u00e4\u00e5\7\7\2\2\u00e5\u00e7\5\34\17\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\37\3\2\2"+
		"\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\7\67\2\2\u00f1\u00f4\7\13\2\2\u00f2"+
		"\u00f5\5\26\f\2\u00f3\u00f5\5\32\16\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5\34\17\2"+
		"\u00f8\u00f9\7\b\2\2\u00f9!\3\2\2\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\7"+
		"\67\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\7\5\2\2\u00fe\u0103\7\67\2\2\u00ff"+
		"\u0100\7\7\2\2\u0100\u0102\7\67\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\7\6\2\2\u0107\u0108\7\b\2\2\u0108#\3\2\2\2"+
		"\u0109\u010a\b\23\1\2\u010a\u010b\7 \2\2\u010b\u0127\5$\23\31\u010c\u010d"+
		"\7\30\2\2\u010d\u0127\5$\23\20\u010e\u0127\5&\24\2\u010f\u0127\7;\2\2"+
		"\u0110\u0127\7\34\2\2\u0111\u0127\7\35\2\2\u0112\u0127\78\2\2\u0113\u0127"+
		"\79\2\2\u0114\u0115\7\67\2\2\u0115\u0116\7\5\2\2\u0116\u011e\5$\23\2\u0117"+
		"\u0118\7\7\2\2\u0118\u011a\5$\23\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\7\6\2\2\u0121\u0127\3\2\2\2\u0122\u0123\7\5\2\2\u0123"+
		"\u0124\5$\23\2\u0124\u0125\7\6\2\2\u0125\u0127\3\2\2\2\u0126\u0109\3\2"+
		"\2\2\u0126\u010c\3\2\2\2\u0126\u010e\3\2\2\2\u0126\u010f\3\2\2\2\u0126"+
		"\u0110\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0112\3\2\2\2\u0126\u0113\3\2"+
		"\2\2\u0126\u0114\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u0151\3\2\2\2\u0128"+
		"\u0129\f\30\2\2\u0129\u012a\7\36\2\2\u012a\u0150\5$\23\31\u012b\u012c"+
		"\f\27\2\2\u012c\u012d\7\37\2\2\u012d\u0150\5$\23\30\u012e\u012f\f\26\2"+
		"\2\u012f\u0130\7\f\2\2\u0130\u0150\5$\23\27\u0131\u0132\f\25\2\2\u0132"+
		"\u0133\7!\2\2\u0133\u0150\5$\23\26\u0134\u0135\f\24\2\2\u0135\u0136\7"+
		"\"\2\2\u0136\u0150\5$\23\25\u0137\u0138\f\23\2\2\u0138\u0139\7#\2\2\u0139"+
		"\u0150\5$\23\24\u013a\u013b\f\22\2\2\u013b\u013c\7$\2\2\u013c\u0150\5"+
		"$\23\23\u013d\u013e\f\21\2\2\u013e\u013f\7%\2\2\u013f\u0150\5$\23\22\u0140"+
		"\u0141\f\17\2\2\u0141\u0142\7\27\2\2\u0142\u0150\5$\23\20\u0143\u0144"+
		"\f\16\2\2\u0144\u0145\7\30\2\2\u0145\u0150\5$\23\17\u0146\u0147\f\r\2"+
		"\2\u0147\u0148\7\31\2\2\u0148\u0150\5$\23\16\u0149\u014a\f\f\2\2\u014a"+
		"\u014b\7\32\2\2\u014b\u0150\5$\23\r\u014c\u014d\f\13\2\2\u014d\u014e\7"+
		"\33\2\2\u014e\u0150\5$\23\f\u014f\u0128\3\2\2\2\u014f\u012b\3\2\2\2\u014f"+
		"\u012e\3\2\2\2\u014f\u0131\3\2\2\2\u014f\u0134\3\2\2\2\u014f\u0137\3\2"+
		"\2\2\u014f\u013a\3\2\2\2\u014f\u013d\3\2\2\2\u014f\u0140\3\2\2\2\u014f"+
		"\u0143\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014c\3\2"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"%\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b\24\1\2\u0155\u0160\7\67\2"+
		"\2\u0156\u0157\7\67\2\2\u0157\u0158\7\n\2\2\u0158\u015b\5$\23\2\u0159"+
		"\u015a\7\7\2\2\u015a\u015c\5$\23\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\t\2\2\u015e\u0160\3\2\2\2\u015f"+
		"\u0154\3\2\2\2\u015f\u0156\3\2\2\2\u0160\u0166\3\2\2\2\u0161\u0162\f\3"+
		"\2\2\u0162\u0163\13\2\2\2\u0163\u0165\7\67\2\2\u0164\u0161\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\'\3\2\2\2"+
		"\u0168\u0166\3\2\2\2\u0169\u016a\5&\24\2\u016a\u016c\7\17\2\2\u016b\u016d"+
		"\5$\23\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\7\b\2\2\u016f)\3\2\2\2\u0170\u0171\7.\2\2\u0171\u0173\7\5\2\2\u0172"+
		"\u0174\5$\23\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0191\7\6\2\2\u0176\u0177\7/\2\2\u0177\u0179\7\5\2\2\u0178"+
		"\u017a\5$\23\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b\u0191\7\6\2\2\u017c\u017d\7\60\2\2\u017d\u017f\7\5\2\2\u017e"+
		"\u0180\5$\23\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0191\7\6\2\2\u0182\u0183\7\61\2\2\u0183\u0185\7\5\2\2\u0184"+
		"\u0186\5$\23\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0191\7\6\2\2\u0188\u0189\7\62\2\2\u0189\u018b\7\5\2\2\u018a"+
		"\u018c\5$\23\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u0191\7\6\2\2\u018e\u0191\5.\30\2\u018f\u0191\5,\27\2\u0190"+
		"\u0170\3\2\2\2\u0190\u0176\3\2\2\2\u0190\u017c\3\2\2\2\u0190\u0182\3\2"+
		"\2\2\u0190\u0188\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191"+
		"+\3\2\2\2\u0192\u0193\7\64\2\2\u0193\u0194\7\5\2\2\u0194\u0195\7\6\2\2"+
		"\u0195-\3\2\2\2\u0196\u0197\7\63\2\2\u0197\u0198\7\5\2\2\u0198\u0199\7"+
		"\6\2\2\u0199/\3\2\2\2\u019a\u019b\7&\2\2\u019b\u019c\7\5\2\2\u019c\u019d"+
		"\5$\23\2\u019d\u019e\7\6\2\2\u019e\u01a0\7*\2\2\u019f\u01a1\5\16\b\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01aa\3\2\2\2\u01a4\u01a6\7+\2\2\u01a5\u01a7\5\16\b\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\7\24\2\2\u01ad\61\3\2\2\2\u01ae\u01af\7\'\2"+
		"\2\u01af\u01b0\7\5\2\2\u01b0\u01b1\5$\23\2\u01b1\u01b2\7\6\2\2\u01b2\u01b4"+
		"\7\23\2\2\u01b3\u01b5\5\16\b\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2"+
		"\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9"+
		"\7\24\2\2\u01b9\63\3\2\2\2\u01ba\u01bc\7,\2\2\u01bb\u01bd\5\16\b\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7)\2\2\u01c1\u01c2\7\5\2\2\u01c2"+
		"\u01c3\5$\23\2\u01c3\u01c4\7\6\2\2\u01c4\u01c5\7\24\2\2\u01c5\65\3\2\2"+
		"\2\u01c6\u01c7\7-\2\2\u01c7\u01c8\7\67\2\2\u01c8\u01c9\7\17\2\2\u01c9"+
		"\u01ca\5$\23\2\u01ca\u01cb\7(\2\2\u01cb\u01cc\5$\23\2\u01cc\u01ce\7\23"+
		"\2\2\u01cd\u01cf\5\16\b\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\24"+
		"\2\2\u01d3\67\3\2\2\2\60<@U^hqz\u0082\u0091\u0096\u009c\u00a2\u00a5\u00aa"+
		"\u00b0\u00b7\u00be\u00c5\u00ce\u00d9\u00e0\u00e8\u00eb\u00f4\u0103\u011b"+
		"\u011e\u0126\u014f\u0151\u015b\u015f\u0166\u016c\u0173\u0179\u017f\u0185"+
		"\u018b\u0190\u01a2\u01a8\u01aa\u01b6\u01be\u01d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}