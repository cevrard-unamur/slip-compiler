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
		GREAT=33, GREAT_EQUAL=34, NOT_EQUAL=35, LEFT=36, RIGHT=37, UP=38, DOWN=39, 
		JUMP=40, FIGHT=41, DIG=42, SCALAR=43, RECORD=44, ID=45, STRING=46, CHAR=47, 
		COLON=48, NUMBER=49, COMMENT_MULTILINE=50, COMMENT_SINGLELINE=51, NEWLINE=52, 
		WS=53;
	public static final int
		RULE_programme = 0, RULE_mapImport = 1, RULE_mainFunction = 2, RULE_function = 3, 
		RULE_argumentList = 4, RULE_argument = 5, RULE_instruction = 6, RULE_functionInstruction = 7, 
		RULE_globalVariable = 8, RULE_variableDeclaration = 9, RULE_variableType = 10, 
		RULE_arrayType = 11, RULE_structureType = 12, RULE_initVariable = 13, 
		RULE_initArray = 14, RULE_constDeclaration = 15, RULE_enumDeclaration = 16, 
		RULE_rightExpr = 17, RULE_leftExpr = 18, RULE_assignation = 19, RULE_actionType = 20, 
		RULE_digInstruction = 21, RULE_fightInstruction = 22;
	public static final String[] ruleNames = {
		"programme", "mapImport", "mainFunction", "function", "argumentList", 
		"argument", "instruction", "functionInstruction", "globalVariable", "variableDeclaration", 
		"variableType", "arrayType", "structureType", "initVariable", "initArray", 
		"constDeclaration", "enumDeclaration", "rightExpr", "leftExpr", "assignation", 
		"actionType", "digInstruction", "fightInstruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", 
		"'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", 
		"'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", 
		"'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'", 
		null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
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
	public static class ProgrammeContext extends ParserRuleContext {
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
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

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programme);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			mapImport();
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					globalVariable();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(53);
				function();
				}
			}

			setState(56);
			mainFunction();
			setState(57);
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
		public TerminalNode IMPORT() { return getToken(LanguageParser.IMPORT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(LanguageParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LanguageParser.QUOTE, i);
		}
		public TerminalNode MAPFILE() { return getToken(LanguageParser.MAPFILE, 0); }
		public MapImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMapImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMapImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMapImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapImportContext mapImport() throws RecognitionException {
		MapImportContext _localctx = new MapImportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(IMPORT);
			setState(60);
			match(QUOTE);
			setState(61);
			match(MAPFILE);
			setState(62);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(MAIN);
			setState(65);
			match(AS);
			setState(66);
			match(FUNCTION);
			setState(67);
			match(LPAR);
			setState(68);
			match(RPAR);
			setState(69);
			match(COLON);
			setState(70);
			match(VOID);
			setState(71);
			match(DO);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					instruction();
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			{
			setState(78);
			digInstruction();
			setState(79);
			match(SEMICOLON);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(81);
				instruction();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
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

	public static class FunctionContext extends ParserRuleContext {
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
		public List<FunctionInstructionContext> functionInstruction() {
			return getRuleContexts(FunctionInstructionContext.class);
		}
		public FunctionInstructionContext functionInstruction(int i) {
			return getRuleContext(FunctionInstructionContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
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

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(90);
			match(AS);
			setState(91);
			match(FUNCTION);
			setState(92);
			match(LPAR);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(93);
				argumentList();
				}
			}

			setState(96);
			match(RPAR);
			setState(97);
			match(COLON);
			setState(98);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			match(DO);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				functionInstruction();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(105);
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
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			argument();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				argument();
				}
				}
				setState(114);
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
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				match(ID);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(AS);
			setState(124);
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

	public static class InstructionContext extends ParserRuleContext {
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
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
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

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(126);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(127);
				assignation();
				}
				break;
			case 3:
				{
				{
				setState(128);
				actionType();
				setState(129);
				match(SEMICOLON);
				}
				}
				break;
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

	public static class FunctionInstructionContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
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
		public FunctionInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInstruction; }
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

	public final FunctionInstructionContext functionInstruction() throws RecognitionException {
		FunctionInstructionContext _localctx = new FunctionInstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(133);
					enumDeclaration();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(139);
					constDeclaration();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						structureType();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
			setState(154); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); 
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
		}
		public GlobalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterGlobalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitGlobalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitGlobalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_globalVariable);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
			setState(164);
			match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				match(ID);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(AS);
			setState(173);
			variableType();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(174);
				match(EQUAL);
				setState(175);
				initVariable();
				}
			}

			setState(178);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				arrayType();
				}
				break;
			case 3:
				_localctx = new StructureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
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

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(SCALAR);
			setState(186);
			match(LBRA);
			setState(187);
			match(NUMBER);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				match(NUMBER);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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
		public StructureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureType; }
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

	public final StructureTypeContext structureType() throws RecognitionException {
		StructureTypeContext _localctx = new StructureTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_structureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			match(AS);
			setState(199);
			match(RECORD);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				variableDeclaration();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(205);
			match(END);
			setState(206);
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
	public static class FalseInitialisationContext extends InitVariableContext {
		public TerminalNode FALSE() { return getToken(LanguageParser.FALSE, 0); }
		public FalseInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFalseInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFalseInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFalseInitialisation(this);
			else return visitor.visitChildren(this);
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
	public static class StringInitialisationContext extends InitVariableContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStringInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStringInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStringInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharInitialisationContext extends InitVariableContext {
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public CharInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCharInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCharInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCharInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueInitialisationContext extends InitVariableContext {
		public TerminalNode TRUE() { return getToken(LanguageParser.TRUE, 0); }
		public TrueInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTrueInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTrueInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTrueInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberInitialisationContext extends InitVariableContext {
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public NumberInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterNumberInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitNumberInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitNumberInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initVariable);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(FALSE);
				}
				break;
			case NUMBER:
				_localctx = new NumberInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(CHAR);
				}
				break;
			case LPAR:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				initArray();
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
			setState(216);
			match(LPAR);
			setState(217);
			initVariable();
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					initVariable();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(227);
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
			setState(229);
			match(CONST);
			setState(230);
			match(ID);
			setState(231);
			match(AS);
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(232);
				variableType();
				}
				break;
			case 2:
				{
				setState(233);
				structureType();
				}
				break;
			}
			setState(236);
			match(EQUAL);
			setState(237);
			initVariable();
			setState(238);
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
			setState(240);
			match(ENUM);
			setState(241);
			match(ID);
			setState(242);
			match(EQUAL);
			setState(243);
			match(LPAR);
			setState(244);
			match(ID);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				match(ID);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RPAR);
			setState(253);
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
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(LanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LanguageParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(LanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LanguageParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public TerminalNode AND() { return getToken(LanguageParser.AND, 0); }
		public TerminalNode OR() { return getToken(LanguageParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public TerminalNode LESS() { return getToken(LanguageParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(LanguageParser.LESS_EQUAL, 0); }
		public TerminalNode GREAT() { return getToken(LanguageParser.GREAT, 0); }
		public TerminalNode GREAT_EQUAL() { return getToken(LanguageParser.GREAT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LanguageParser.NOT_EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(LanguageParser.PLUS, 0); }
		public TerminalNode MULTI() { return getToken(LanguageParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LanguageParser.MOD, 0); }
		public RightExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRightExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRightExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRightExpr(this);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(256);
				match(NOT);
				setState(257);
				rightExpr(23);
				}
				break;
			case 2:
				{
				setState(258);
				match(MINUS);
				setState(259);
				rightExpr(14);
				}
				break;
			case 3:
				{
				setState(260);
				leftExpr(0);
				}
				break;
			case 4:
				{
				setState(261);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(262);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(263);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(264);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(265);
				match(CHAR);
				}
				break;
			case 9:
				{
				setState(266);
				match(ID);
				setState(267);
				match(LPAR);
				setState(268);
				rightExpr(0);
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(269);
						match(COMMA);
						setState(270);
						rightExpr(0);
						}
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(278);
				match(RPAR);
				}
				break;
			case 10:
				{
				setState(280);
				match(LPAR);
				setState(281);
				rightExpr(0);
				setState(282);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(286);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(287);
						match(AND);
						setState(288);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(289);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(290);
						match(OR);
						setState(291);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(292);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(293);
						match(EQUAL);
						setState(294);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(295);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(296);
						match(LESS);
						setState(297);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(298);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(299);
						match(LESS_EQUAL);
						setState(300);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(301);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(302);
						match(GREAT);
						setState(303);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(304);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(305);
						match(GREAT_EQUAL);
						setState(306);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(307);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(308);
						match(NOT_EQUAL);
						setState(309);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(310);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(311);
						match(PLUS);
						setState(312);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(313);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(314);
						match(MINUS);
						setState(315);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(316);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(317);
						match(MULTI);
						setState(318);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(319);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(320);
						match(DIV);
						setState(321);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(322);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(323);
						match(MOD);
						setState(324);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(329);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(ID);
				setState(333);
				match(LBRA);
				setState(334);
				rightExpr(0);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(335);
					match(COMMA);
					setState(336);
					rightExpr(0);
					}
				}

				setState(339);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
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
					setState(343);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(344);
					matchWildcard();
					setState(345);
					match(ID);
					}
					} 
				}
				setState(350);
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
			setState(351);
			leftExpr(0);
			setState(352);
			match(ASSIGN);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
				{
				setState(353);
				rightExpr(0);
				}
			}

			setState(356);
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
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(LEFT);
				setState(359);
				match(LPAR);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(360);
					rightExpr(0);
					}
				}

				setState(363);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(RIGHT);
				setState(365);
				match(LPAR);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(366);
					rightExpr(0);
					}
				}

				setState(369);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(UP);
				setState(371);
				match(LPAR);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(372);
					rightExpr(0);
					}
				}

				setState(375);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(DOWN);
				setState(377);
				match(LPAR);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(378);
					rightExpr(0);
					}
				}

				setState(381);
				match(RPAR);
				}
				break;
			case JUMP:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(JUMP);
				setState(383);
				match(LPAR);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER))) != 0)) {
					{
					setState(384);
					rightExpr(0);
					}
				}

				setState(387);
				match(RPAR);
				}
				break;
			case FIGHT:
				_localctx = new FightContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(388);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(389);
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
		enterRule(_localctx, 42, RULE_digInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(DIG);
			setState(393);
			match(LPAR);
			setState(394);
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
		enterRule(_localctx, 44, RULE_fightInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(FIGHT);
			setState(397);
			match(LPAR);
			setState(398);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u0193\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\5\29\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4"+
		"\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5a\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\3\6\3\6\3\6\7\6q\n\6\f"+
		"\6\16\6t\13\6\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0086\n\b\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\7"+
		"\t\u008f\n\t\f\t\16\t\u0092\13\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t"+
		"\5\t\u009a\n\t\3\t\6\t\u009d\n\t\r\t\16\t\u009e\3\n\3\n\3\n\3\n\5\n\u00a5"+
		"\n\n\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16\13\u00ad\13\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b3\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00c1\n\r\f\r\16\r\u00c4\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\6\16\u00cc\n\16\r\16\16\16\u00cd\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\7\20\u00df\n\20\f\20\16"+
		"\20\u00e2\13\20\5\20\u00e4\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ed\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00fa\n\22\f\22\16\22\u00fd\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0112"+
		"\n\23\f\23\16\23\u0115\13\23\5\23\u0117\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u011f\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0148\n\23\f\23\16\23\u014b\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0154\n\24\3\24\3\24\5\24\u0158\n\24\3\24\3\24\3\24\7"+
		"\24\u015d\n\24\f\24\16\24\u0160\13\24\3\25\3\25\3\25\5\25\u0165\n\25\3"+
		"\25\3\25\3\26\3\26\3\26\5\26\u016c\n\26\3\26\3\26\3\26\3\26\5\26\u0172"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0178\n\26\3\26\3\26\3\26\3\26\5\26\u017e"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0184\n\26\3\26\3\26\3\26\5\26\u0189\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\2\4$&\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\4\2\22\22--\u01c5\2\60\3\2\2"+
		"\2\4=\3\2\2\2\6B\3\2\2\2\b[\3\2\2\2\nm\3\2\2\2\fu\3\2\2\2\16\u0085\3\2"+
		"\2\2\20\u0099\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00b9\3\2\2"+
		"\2\30\u00bb\3\2\2\2\32\u00c7\3\2\2\2\34\u00d8\3\2\2\2\36\u00da\3\2\2\2"+
		" \u00e7\3\2\2\2\"\u00f2\3\2\2\2$\u011e\3\2\2\2&\u0157\3\2\2\2(\u0161\3"+
		"\2\2\2*\u0188\3\2\2\2,\u018a\3\2\2\2.\u018e\3\2\2\2\60\64\5\4\3\2\61\63"+
		"\5\22\n\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658"+
		"\3\2\2\2\66\64\3\2\2\2\679\5\b\5\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\5"+
		"\6\4\2;<\7\2\2\3<\3\3\2\2\2=>\7\3\2\2>?\7\r\2\2?@\7\4\2\2@A\7\r\2\2A\5"+
		"\3\2\2\2BC\7\20\2\2CD\7\13\2\2DE\7\21\2\2EF\7\5\2\2FG\7\6\2\2GH\7\62\2"+
		"\2HI\7\22\2\2IM\7\23\2\2JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\5,\27\2QR\7\b\2\2RV\3\2\2\2SU\5\16\b\2TS"+
		"\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\24\2\2"+
		"Z\7\3\2\2\2[\\\7/\2\2\\]\7\13\2\2]^\7\21\2\2^`\7\5\2\2_a\5\n\6\2`_\3\2"+
		"\2\2`a\3\2\2\2ab\3\2\2\2bc\7\6\2\2cd\7\62\2\2de\t\2\2\2eg\7\23\2\2fh\5"+
		"\20\t\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\24\2\2l"+
		"\t\3\2\2\2mr\5\f\7\2no\7\7\2\2oq\5\f\7\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2s\13\3\2\2\2tr\3\2\2\2uz\7/\2\2vw\7\7\2\2wy\7/\2\2xv\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\13\2\2~\177\5\26"+
		"\f\2\177\r\3\2\2\2\u0080\u0086\5\24\13\2\u0081\u0086\5(\25\2\u0082\u0083"+
		"\5*\26\2\u0083\u0084\7\b\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0086\17\3\2\2\2\u0087\u0089\5\"\22"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u009a\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5 \21\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u009a\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\32\16\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008a\3\2\2\2\u0099"+
		"\u0090\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u009d\5\16\b\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a5\5\24\13"+
		"\2\u00a1\u00a5\5 \21\2\u00a2\u00a5\5\"\22\2\u00a3\u00a5\5\32\16\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\23\3\2\2\2\u00a6\u00ab\7/\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00aa"+
		"\7/\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\13"+
		"\2\2\u00af\u00b2\5\26\f\2\u00b0\u00b1\7\f\2\2\u00b1\u00b3\5\34\17\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\b"+
		"\2\2\u00b5\25\3\2\2\2\u00b6\u00ba\7-\2\2\u00b7\u00ba\5\30\r\2\u00b8\u00ba"+
		"\5\32\16\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\27\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00c2\7"+
		"\63\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c1\7\63\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\t\2\2\u00c6\31\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00cb\7.\2\2\u00ca\u00cc\5\24\13\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d1\7\b\2\2"+
		"\u00d1\33\3\2\2\2\u00d2\u00d9\7\34\2\2\u00d3\u00d9\7\35\2\2\u00d4\u00d9"+
		"\7\63\2\2\u00d5\u00d9\7\60\2\2\u00d6\u00d9\7\61\2\2\u00d7\u00d9\5\36\20"+
		"\2\u00d8\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\35\3\2\2\2\u00da"+
		"\u00db\7\5\2\2\u00db\u00e3\5\34\17\2\u00dc\u00dd\7\7\2\2\u00dd\u00df\5"+
		"\34\17\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e0\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\6\2\2\u00e6"+
		"\37\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ec\7\13\2"+
		"\2\u00ea\u00ed\5\26\f\2\u00eb\u00ed\5\32\16\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\5\34"+
		"\17\2\u00f0\u00f1\7\b\2\2\u00f1!\3\2\2\2\u00f2\u00f3\7\26\2\2\u00f3\u00f4"+
		"\7/\2\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\7\5\2\2\u00f6\u00fb\7/\2\2\u00f7"+
		"\u00f8\7\7\2\2\u00f8\u00fa\7/\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\7\b\2\2\u0100#\3\2\2\2"+
		"\u0101\u0102\b\23\1\2\u0102\u0103\7 \2\2\u0103\u011f\5$\23\31\u0104\u0105"+
		"\7\30\2\2\u0105\u011f\5$\23\20\u0106\u011f\5&\24\2\u0107\u011f\7\63\2"+
		"\2\u0108\u011f\7\34\2\2\u0109\u011f\7\35\2\2\u010a\u011f\7\60\2\2\u010b"+
		"\u011f\7\61\2\2\u010c\u010d\7/\2\2\u010d\u010e\7\5\2\2\u010e\u0116\5$"+
		"\23\2\u010f\u0110\7\7\2\2\u0110\u0112\5$\23\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7\6\2\2\u0119\u011f\3\2\2\2\u011a\u011b\7\5"+
		"\2\2\u011b\u011c\5$\23\2\u011c\u011d\7\6\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0101\3\2\2\2\u011e\u0104\3\2\2\2\u011e\u0106\3\2\2\2\u011e\u0107\3\2"+
		"\2\2\u011e\u0108\3\2\2\2\u011e\u0109\3\2\2\2\u011e\u010a\3\2\2\2\u011e"+
		"\u010b\3\2\2\2\u011e\u010c\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0149\3\2"+
		"\2\2\u0120\u0121\f\30\2\2\u0121\u0122\7\36\2\2\u0122\u0148\5$\23\31\u0123"+
		"\u0124\f\27\2\2\u0124\u0125\7\37\2\2\u0125\u0148\5$\23\30\u0126\u0127"+
		"\f\26\2\2\u0127\u0128\7\f\2\2\u0128\u0148\5$\23\27\u0129\u012a\f\25\2"+
		"\2\u012a\u012b\7!\2\2\u012b\u0148\5$\23\26\u012c\u012d\f\24\2\2\u012d"+
		"\u012e\7\"\2\2\u012e\u0148\5$\23\25\u012f\u0130\f\23\2\2\u0130\u0131\7"+
		"#\2\2\u0131\u0148\5$\23\24\u0132\u0133\f\22\2\2\u0133\u0134\7$\2\2\u0134"+
		"\u0148\5$\23\23\u0135\u0136\f\21\2\2\u0136\u0137\7%\2\2\u0137\u0148\5"+
		"$\23\22\u0138\u0139\f\17\2\2\u0139\u013a\7\27\2\2\u013a\u0148\5$\23\20"+
		"\u013b\u013c\f\16\2\2\u013c\u013d\7\30\2\2\u013d\u0148\5$\23\17\u013e"+
		"\u013f\f\r\2\2\u013f\u0140\7\31\2\2\u0140\u0148\5$\23\16\u0141\u0142\f"+
		"\f\2\2\u0142\u0143\7\32\2\2\u0143\u0148\5$\23\r\u0144\u0145\f\13\2\2\u0145"+
		"\u0146\7\33\2\2\u0146\u0148\5$\23\f\u0147\u0120\3\2\2\2\u0147\u0123\3"+
		"\2\2\2\u0147\u0126\3\2\2\2\u0147\u0129\3\2\2\2\u0147\u012c\3\2\2\2\u0147"+
		"\u012f\3\2\2\2\u0147\u0132\3\2\2\2\u0147\u0135\3\2\2\2\u0147\u0138\3\2"+
		"\2\2\u0147\u013b\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a%\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\b\24\1\2\u014d\u0158"+
		"\7/\2\2\u014e\u014f\7/\2\2\u014f\u0150\7\n\2\2\u0150\u0153\5$\23\2\u0151"+
		"\u0152\7\7\2\2\u0152\u0154\5$\23\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\t\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u014c\3\2\2\2\u0157\u014e\3\2\2\2\u0158\u015e\3\2\2\2\u0159\u015a\f\3"+
		"\2\2\u015a\u015b\13\2\2\2\u015b\u015d\7/\2\2\u015c\u0159\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\'\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0161\u0162\5&\24\2\u0162\u0164\7\17\2\2\u0163\u0165"+
		"\5$\23\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\7\b\2\2\u0167)\3\2\2\2\u0168\u0169\7&\2\2\u0169\u016b\7\5\2\2\u016a"+
		"\u016c\5$\23\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u0189\7\6\2\2\u016e\u016f\7\'\2\2\u016f\u0171\7\5\2\2\u0170"+
		"\u0172\5$\23\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0189\7\6\2\2\u0174\u0175\7(\2\2\u0175\u0177\7\5\2\2\u0176"+
		"\u0178\5$\23\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u0189\7\6\2\2\u017a\u017b\7)\2\2\u017b\u017d\7\5\2\2\u017c"+
		"\u017e\5$\23\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0189\7\6\2\2\u0180\u0181\7*\2\2\u0181\u0183\7\5\2\2\u0182"+
		"\u0184\5$\23\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0189\7\6\2\2\u0186\u0189\5.\30\2\u0187\u0189\5,\27\2\u0188"+
		"\u0168\3\2\2\2\u0188\u016e\3\2\2\2\u0188\u0174\3\2\2\2\u0188\u017a\3\2"+
		"\2\2\u0188\u0180\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"+\3\2\2\2\u018a\u018b\7,\2\2\u018b\u018c\7\5\2\2\u018c\u018d\7\6\2\2\u018d"+
		"-\3\2\2\2\u018e\u018f\7+\2\2\u018f\u0190\7\5\2\2\u0190\u0191\7\6\2\2\u0191"+
		"/\3\2\2\2*\648MV`irz\u0085\u008a\u0090\u0096\u0099\u009e\u00a4\u00ab\u00b2"+
		"\u00b9\u00c2\u00cd\u00d8\u00e0\u00e3\u00ec\u00fb\u0113\u0116\u011e\u0147"+
		"\u0149\u0153\u0157\u015e\u0164\u016b\u0171\u0177\u017d\u0183\u0188";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}