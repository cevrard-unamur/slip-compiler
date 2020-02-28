// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
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
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17, IMPORT=18, MAPFILE=19, LPAR=20, 
		RPAR=21, COMMA=22, SEMICOLON=23, RBRA=24, LBRA=25, AS=26, EQUAL=27, QUOTE=28, 
		SINGLE_QUOTE=29, ASSIGN=30, MAIN=31, FUNCTION=32, VOID=33, DO=34, END=35, 
		CONST=36, ENUM=37, PLUS=38, MINUS=39, MULTI=40, DIV=41, MOD=42, TRUE=43, 
		FALSE=44, AND=45, OR=46, NOT=47, LESS=48, LESS_EQUAL=49, GREAT=50, GREAT_EQUAL=51, 
		NOT_EQUAL=52, LEFT=53, RIGHT=54, UP=55, DOWN=56, JUMP=57, FIGHT=58, DIG=59, 
		SCALAR=60, RECORD=61, ID=62, STRING=63, CHAR=64;
	public static final int
		RULE_root = 0, RULE_map = 1, RULE_mapDescription = 2, RULE_mapSymbols = 3, 
		RULE_programme = 4, RULE_mapImport = 5, RULE_mainFunction = 6, RULE_function = 7, 
		RULE_argumentList = 8, RULE_argument = 9, RULE_instruction = 10, RULE_functionInstruction = 11, 
		RULE_globalVariable = 12, RULE_variableDeclaration = 13, RULE_variableType = 14, 
		RULE_arrayType = 15, RULE_structureType = 16, RULE_initVariable = 17, 
		RULE_initArray = 18, RULE_constDeclaration = 19, RULE_enumDeclaration = 20, 
		RULE_rightExpr = 21, RULE_leftExpr = 22, RULE_assignation = 23, RULE_actionType = 24, 
		RULE_digInstruction = 25, RULE_fightInstruction = 26;
	public static final String[] ruleNames = {
		"root", "map", "mapDescription", "mapSymbols", "programme", "mapImport", 
		"mainFunction", "function", "argumentList", "argument", "instruction", 
		"functionInstruction", "globalVariable", "variableDeclaration", "variableType", 
		"arrayType", "structureType", "initVariable", "initArray", "constDeclaration", 
		"enumDeclaration", "rightExpr", "leftExpr", "assignation", "actionType", 
		"digInstruction", "fightInstruction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'", null, null, null, null, null, null, null, "'('", 
		"')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", "'''", "':='", 
		"'main'", "'function'", "'void'", "'do'", "'end'", "'const'", "'enum'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", "'or'", 
		"'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", "'right'", "'up'", 
		"'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "IMPORT", "MAPFILE", "LPAR", "RPAR", 
		"COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", 
		"ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", 
		"MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", 
		"LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", 
		"DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR"
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
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				map();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				programme();
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

	public static class MapContext extends ParserRuleContext {
		public List<MapDescriptionContext> mapDescription() {
			return getRuleContexts(MapDescriptionContext.class);
		}
		public MapDescriptionContext mapDescription(int i) {
			return getRuleContext(MapDescriptionContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(58);
				mapDescription();
				}
				}
				setState(63);
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

	public static class MapDescriptionContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
		public List<MapSymbolsContext> mapSymbols() {
			return getRuleContexts(MapSymbolsContext.class);
		}
		public MapSymbolsContext mapSymbols(int i) {
			return getRuleContext(MapSymbolsContext.class,i);
		}
		public MapDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDescriptionContext mapDescription() throws RecognitionException {
		MapDescriptionContext _localctx = new MapDescriptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			match(MAP);
			setState(65);
			match(COLON);
			setState(66);
			match(NUMBER);
			setState(67);
			match(NUMBER);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				mapSymbols();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0) );
			}
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				match(EOF);
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

	public static class MapSymbolsContext extends ParserRuleContext {
		public TerminalNode ROBOT() { return getToken(PlayPlusParser.ROBOT, 0); }
		public TerminalNode CHEST() { return getToken(PlayPlusParser.CHEST, 0); }
		public TerminalNode GRASS() { return getToken(PlayPlusParser.GRASS, 0); }
		public TerminalNode PALMTREE() { return getToken(PlayPlusParser.PALMTREE, 0); }
		public TerminalNode BRIDGE() { return getToken(PlayPlusParser.BRIDGE, 0); }
		public TerminalNode BUSH() { return getToken(PlayPlusParser.BUSH, 0); }
		public TerminalNode CASK() { return getToken(PlayPlusParser.CASK, 0); }
		public TerminalNode WELL() { return getToken(PlayPlusParser.WELL, 0); }
		public TerminalNode EMPTY() { return getToken(PlayPlusParser.EMPTY, 0); }
		public TerminalNode SQUELETON() { return getToken(PlayPlusParser.SQUELETON, 0); }
		public TerminalNode COMMENT_SINGLELINE() { return getToken(PlayPlusParser.COMMENT_SINGLELINE, 0); }
		public TerminalNode COMMENT_MULTILINE() { return getToken(PlayPlusParser.COMMENT_MULTILINE, 0); }
		public MapSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapSymbols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapSymbolsContext mapSymbols() throws RecognitionException {
		MapSymbolsContext _localctx = new MapSymbolsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mapSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0)) ) {
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

	public static class ProgrammeContext extends ParserRuleContext {
		public MapImportContext mapImport() {
			return getRuleContext(MapImportContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programme);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			mapImport();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					globalVariable();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(85);
				function();
				}
			}

			setState(88);
			mainFunction();
			setState(89);
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
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(PlayPlusParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PlayPlusParser.QUOTE, i);
		}
		public TerminalNode MAPFILE() { return getToken(PlayPlusParser.MAPFILE, 0); }
		public MapImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapImportContext mapImport() throws RecognitionException {
		MapImportContext _localctx = new MapImportContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mapImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IMPORT);
			setState(92);
			match(QUOTE);
			setState(93);
			match(MAPFILE);
			setState(94);
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
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public DigInstructionContext digInstruction() {
			return getRuleContext(DigInstructionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(MAIN);
			setState(97);
			match(AS);
			setState(98);
			match(FUNCTION);
			setState(99);
			match(LPAR);
			setState(100);
			match(RPAR);
			setState(101);
			match(COLON);
			setState(102);
			match(VOID);
			setState(103);
			match(DO);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					instruction();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			{
			setState(110);
			digInstruction();
			setState(111);
			match(SEMICOLON);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(113);
				instruction();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(AS);
			setState(123);
			match(FUNCTION);
			setState(124);
			match(LPAR);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(125);
				argumentList();
				}
			}

			setState(128);
			match(RPAR);
			setState(129);
			match(COLON);
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
			match(DO);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				functionInstruction();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0) );
			setState(137);
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
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			argument();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				argument();
				}
				}
				setState(146);
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
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			match(ID);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(148);
				match(COMMA);
				setState(149);
				match(ID);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(AS);
			setState(156);
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
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(158);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(159);
				assignation();
				}
				break;
			case 3:
				{
				{
				setState(160);
				actionType();
				setState(161);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunctionInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunctionInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunctionInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInstructionContext functionInstruction() throws RecognitionException {
		FunctionInstructionContext _localctx = new FunctionInstructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(165);
					enumDeclaration();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(171);
					constDeclaration();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						structureType();
						}
						} 
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			}
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_globalVariable);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				constDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				enumDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
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
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public VariableContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				match(ID);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(AS);
			setState(205);
			variableType();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(206);
				match(EQUAL);
				setState(207);
				initVariable();
				}
			}

			setState(210);
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
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public ScalarContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitScalar(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArray(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableType);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				arrayType();
				}
				break;
			case 3:
				_localctx = new StructureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
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
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode LBRA() { return getToken(PlayPlusParser.LBRA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public TerminalNode RBRA() { return getToken(PlayPlusParser.RBRA, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(SCALAR);
			setState(218);
			match(LBRA);
			setState(219);
			match(NUMBER);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				match(NUMBER);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode RECORD() { return getToken(PlayPlusParser.RECORD, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureTypeContext structureType() throws RecognitionException {
		StructureTypeContext _localctx = new StructureTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_structureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ID);
			setState(230);
			match(AS);
			setState(231);
			match(RECORD);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				variableDeclaration();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(237);
			match(END);
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
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public FalseInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFalseInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFalseInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFalseInitialisation(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringInitialisationContext extends InitVariableContext {
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public StringInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStringInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStringInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStringInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharInitialisationContext extends InitVariableContext {
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public CharInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCharInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCharInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCharInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueInitialisationContext extends InitVariableContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TrueInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterTrueInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitTrueInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitTrueInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberInitialisationContext extends InitVariableContext {
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public NumberInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNumberInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNumberInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNumberInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initVariable);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(FALSE);
				}
				break;
			case NUMBER:
				_localctx = new NumberInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new CharInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(CHAR);
				}
				break;
			case LPAR:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
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
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public List<InitVariableContext> initVariable() {
			return getRuleContexts(InitVariableContext.class);
		}
		public InitVariableContext initVariable(int i) {
			return getRuleContext(InitVariableContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public InitArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitArrayContext initArray() throws RecognitionException {
		InitArrayContext _localctx = new InitArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(LPAR);
			setState(249);
			initVariable();
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					initVariable();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(259);
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
		public TerminalNode CONST() { return getToken(PlayPlusParser.CONST, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public InitVariableContext initVariable() {
			return getRuleContext(InitVariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public StructureTypeContext structureType() {
			return getRuleContext(StructureTypeContext.class,0);
		}
		public ConstantContext(ConstDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constDeclaration);
		try {
			_localctx = new ConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(CONST);
			setState(262);
			match(ID);
			setState(263);
			match(AS);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(264);
				variableType();
				}
				break;
			case 2:
				{
				setState(265);
				structureType();
				}
				break;
			}
			setState(268);
			match(EQUAL);
			setState(269);
			initVariable();
			setState(270);
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
		public TerminalNode ENUM() { return getToken(PlayPlusParser.ENUM, 0); }
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public EnumerationContext(EnumDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDeclaration);
		int _la;
		try {
			_localctx = new EnumerationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ENUM);
			setState(273);
			match(ID);
			setState(274);
			match(EQUAL);
			setState(275);
			match(LPAR);
			setState(276);
			match(ID);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				match(ID);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			match(RPAR);
			setState(285);
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
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode LESS() { return getToken(PlayPlusParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(PlayPlusParser.LESS_EQUAL, 0); }
		public TerminalNode GREAT() { return getToken(PlayPlusParser.GREAT, 0); }
		public TerminalNode GREAT_EQUAL() { return getToken(PlayPlusParser.GREAT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PlayPlusParser.NOT_EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MULTI() { return getToken(PlayPlusParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public RightExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRightExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRightExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRightExpr(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_rightExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(288);
				match(NOT);
				setState(289);
				rightExpr(23);
				}
				break;
			case 2:
				{
				setState(290);
				match(MINUS);
				setState(291);
				rightExpr(14);
				}
				break;
			case 3:
				{
				setState(292);
				leftExpr(0);
				}
				break;
			case 4:
				{
				setState(293);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(294);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(295);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(296);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(297);
				match(CHAR);
				}
				break;
			case 9:
				{
				setState(298);
				match(ID);
				setState(299);
				match(LPAR);
				setState(300);
				rightExpr(0);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(301);
						match(COMMA);
						setState(302);
						rightExpr(0);
						}
						}
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(310);
				match(RPAR);
				}
				break;
			case 10:
				{
				setState(312);
				match(LPAR);
				setState(313);
				rightExpr(0);
				setState(314);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(318);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(319);
						match(AND);
						setState(320);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(321);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(322);
						match(OR);
						setState(323);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(324);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(325);
						match(EQUAL);
						setState(326);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(327);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(328);
						match(LESS);
						setState(329);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(330);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(331);
						match(LESS_EQUAL);
						setState(332);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(333);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(334);
						match(GREAT);
						setState(335);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(336);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(337);
						match(GREAT_EQUAL);
						setState(338);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(339);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(340);
						match(NOT_EQUAL);
						setState(341);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(342);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(343);
						match(PLUS);
						setState(344);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(345);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(346);
						match(MINUS);
						setState(347);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(348);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(349);
						match(MULTI);
						setState(350);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(351);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(352);
						match(DIV);
						setState(353);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355);
						match(MOD);
						setState(356);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(361);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public LeftPropertyContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftIdContext extends LeftExprContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public LeftIdContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftArrayContext extends LeftExprContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LBRA() { return getToken(PlayPlusParser.LBRA, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(PlayPlusParser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public LeftArrayContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftArray(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_leftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(363);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(ID);
				setState(365);
				match(LBRA);
				setState(366);
				rightExpr(0);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(367);
					match(COMMA);
					setState(368);
					rightExpr(0);
					}
				}

				setState(371);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftPropertyContext(new LeftExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
					setState(375);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(376);
					matchWildcard();
					setState(377);
					match(ID);
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public TerminalNode ASSIGN() { return getToken(PlayPlusParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			leftExpr(0);
			setState(384);
			match(ASSIGN);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
				{
				setState(385);
				rightExpr(0);
				}
			}

			setState(388);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterDig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitDig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitDig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftContext extends ActionTypeContext {
		public TerminalNode LEFT() { return getToken(PlayPlusParser.LEFT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public LeftContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightContext extends ActionTypeContext {
		public TerminalNode RIGHT() { return getToken(PlayPlusParser.RIGHT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public RightContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpContext extends ActionTypeContext {
		public TerminalNode UP() { return getToken(PlayPlusParser.UP, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public UpContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DownContext extends ActionTypeContext {
		public TerminalNode DOWN() { return getToken(PlayPlusParser.DOWN, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public DownContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitDown(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFight(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpContext extends ActionTypeContext {
		public TerminalNode JUMP() { return getToken(PlayPlusParser.JUMP, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public JumpContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterJump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitJump(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitJump(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_actionType);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(LEFT);
				setState(391);
				match(LPAR);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(392);
					rightExpr(0);
					}
				}

				setState(395);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(RIGHT);
				setState(397);
				match(LPAR);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(398);
					rightExpr(0);
					}
				}

				setState(401);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(UP);
				setState(403);
				match(LPAR);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(404);
					rightExpr(0);
					}
				}

				setState(407);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(DOWN);
				setState(409);
				match(LPAR);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(410);
					rightExpr(0);
					}
				}

				setState(413);
				match(RPAR);
				}
				break;
			case JUMP:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(JUMP);
				setState(415);
				match(LPAR);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(416);
					rightExpr(0);
					}
				}

				setState(419);
				match(RPAR);
				}
				break;
			case FIGHT:
				_localctx = new FightContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(421);
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
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public DigInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterDigInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitDigInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitDigInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigInstructionContext digInstruction() throws RecognitionException {
		DigInstructionContext _localctx = new DigInstructionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_digInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(DIG);
			setState(425);
			match(LPAR);
			setState(426);
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
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public FightInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fightInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFightInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFightInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFightInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FightInstructionContext fightInstruction() throws RecognitionException {
		FightInstructionContext _localctx = new FightInstructionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fightInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(FIGHT);
			setState(429);
			match(LPAR);
			setState(430);
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
		case 21:
			return rightExpr_sempred((RightExprContext)_localctx, predIndex);
		case 22:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u01b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\4\3\4\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\4\5\4M\n\4\3\5\3\5\3\6"+
		"\3\6\7\6S\n\6\f\6\16\6V\13\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3"+
		"\b\3\b\3\b\7\bu\n\b\f\b\16\bx\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0081"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\6\t\u0088\n\t\r\t\16\t\u0089\3\t\3\t\3\n\3\n"+
		"\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n\3\13\3\13\3\13\7\13\u0099\n\13"+
		"\f\13\16\13\u009c\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n"+
		"\f\3\r\7\r\u00a9\n\r\f\r\16\r\u00ac\13\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2"+
		"\13\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\5\r\u00ba\n\r\3\r\6\r\u00bd"+
		"\n\r\r\r\16\r\u00be\3\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17"+
		"\7\17\u00ca\n\17\f\17\16\17\u00cd\13\17\3\17\3\17\3\17\3\17\5\17\u00d3"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u00da\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u00e1\n\21\f\21\16\21\u00e4\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\6\22\u00ec\n\22\r\22\16\22\u00ed\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\7\24\u00ff\n\24\f\24\16\24"+
		"\u0102\13\24\5\24\u0104\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u010d"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011a"+
		"\n\26\f\26\16\26\u011d\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0132\n\27"+
		"\f\27\16\27\u0135\13\27\5\27\u0137\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u013f\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0168\n\27\f\27\16\27\u016b\13\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0174\n\30\3\30\3\30\5\30\u0178\n\30\3\30\3\30\3\30\7\30\u017d"+
		"\n\30\f\30\16\30\u0180\13\30\3\31\3\31\3\31\5\31\u0185\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\5\32\u018c\n\32\3\32\3\32\3\32\3\32\5\32\u0192\n\32\3"+
		"\32\3\32\3\32\3\32\5\32\u0198\n\32\3\32\3\32\3\32\3\32\5\32\u019e\n\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01a4\n\32\3\32\3\32\3\32\5\32\u01a9\n\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\2\4,.\35\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\4\2\4\r\20\21\4\2##>>\u01e5"+
		"\2:\3\2\2\2\4?\3\2\2\2\6B\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\f]\3\2\2\2\16"+
		"b\3\2\2\2\20{\3\2\2\2\22\u008d\3\2\2\2\24\u0095\3\2\2\2\26\u00a5\3\2\2"+
		"\2\30\u00b9\3\2\2\2\32\u00c4\3\2\2\2\34\u00c6\3\2\2\2\36\u00d9\3\2\2\2"+
		" \u00db\3\2\2\2\"\u00e7\3\2\2\2$\u00f8\3\2\2\2&\u00fa\3\2\2\2(\u0107\3"+
		"\2\2\2*\u0112\3\2\2\2,\u013e\3\2\2\2.\u0177\3\2\2\2\60\u0181\3\2\2\2\62"+
		"\u01a8\3\2\2\2\64\u01aa\3\2\2\2\66\u01ae\3\2\2\28;\5\4\3\29;\5\n\6\2:"+
		"8\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<>\5\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\3\2\2CD\7\16\2\2DE\7\17\2\2EG\7\17"+
		"\2\2FH\5\b\5\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KM\7\2"+
		"\2\3LK\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NO\t\2\2\2O\t\3\2\2\2PT\5\f\7\2QS\5"+
		"\32\16\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2W"+
		"Y\5\20\t\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\16\b\2[\\\7\2\2\3\\\13\3"+
		"\2\2\2]^\7\24\2\2^_\7\36\2\2_`\7\25\2\2`a\7\36\2\2a\r\3\2\2\2bc\7!\2\2"+
		"cd\7\34\2\2de\7\"\2\2ef\7\26\2\2fg\7\27\2\2gh\7\16\2\2hi\7#\2\2im\7$\2"+
		"\2jl\5\26\f\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pq\5\64\33\2qr\7\31\2\2rv\3\2\2\2su\5\26\f\2ts\3\2\2\2ux\3\2\2\2v"+
		"t\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7%\2\2z\17\3\2\2\2{|\7@\2\2"+
		"|}\7\34\2\2}~\7\"\2\2~\u0080\7\26\2\2\177\u0081\5\22\n\2\u0080\177\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\27\2\2\u0083"+
		"\u0084\7\16\2\2\u0084\u0085\t\3\2\2\u0085\u0087\7$\2\2\u0086\u0088\5\30"+
		"\r\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7%\2\2\u008c\21\3\2\2\2"+
		"\u008d\u0092\5\24\13\2\u008e\u008f\7\30\2\2\u008f\u0091\5\24\13\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\23\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009a\7@\2\2\u0096\u0097"+
		"\7\30\2\2\u0097\u0099\7@\2\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\7\34\2\2\u009e\u009f\5\36\20\2\u009f\25\3\2\2\2\u00a0"+
		"\u00a6\5\34\17\2\u00a1\u00a6\5\60\31\2\u00a2\u00a3\5\62\32\2\u00a3\u00a4"+
		"\7\31\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2"+
		"\u00a5\u00a2\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a9\5*\26\2\u00a8\u00a7"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ba\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5(\25\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00ba\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\5\"\22\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00b0\3\2"+
		"\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00bd\5\26\f\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00c5\5\34\17\2\u00c1"+
		"\u00c5\5(\25\2\u00c2\u00c5\5*\26\2\u00c3\u00c5\5\"\22\2\u00c4\u00c0\3"+
		"\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\33\3\2\2\2\u00c6\u00cb\7@\2\2\u00c7\u00c8\7\30\2\2\u00c8\u00ca\7@\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\34\2\2"+
		"\u00cf\u00d2\5\36\20\2\u00d0\u00d1\7\35\2\2\u00d1\u00d3\5$\23\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\31"+
		"\2\2\u00d5\35\3\2\2\2\u00d6\u00da\7>\2\2\u00d7\u00da\5 \21\2\u00d8\u00da"+
		"\5\"\22\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00da\37\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00e2"+
		"\7\17\2\2\u00de\u00df\7\30\2\2\u00df\u00e1\7\17\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6!\3\2\2\2\u00e7"+
		"\u00e8\7@\2\2\u00e8\u00e9\7\34\2\2\u00e9\u00eb\7?\2\2\u00ea\u00ec\5\34"+
		"\17\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7%\2\2\u00f0\u00f1\7\31"+
		"\2\2\u00f1#\3\2\2\2\u00f2\u00f9\7-\2\2\u00f3\u00f9\7.\2\2\u00f4\u00f9"+
		"\7\17\2\2\u00f5\u00f9\7A\2\2\u00f6\u00f9\7B\2\2\u00f7\u00f9\5&\24\2\u00f8"+
		"\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb"+
		"\7\26\2\2\u00fb\u0103\5$\23\2\u00fc\u00fd\7\30\2\2\u00fd\u00ff\5$\23\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\27\2\2\u0106\'\3\2\2"+
		"\2\u0107\u0108\7&\2\2\u0108\u0109\7@\2\2\u0109\u010c\7\34\2\2\u010a\u010d"+
		"\5\36\20\2\u010b\u010d\5\"\22\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010f\7\35\2\2\u010f\u0110\5$\23\2\u0110"+
		"\u0111\7\31\2\2\u0111)\3\2\2\2\u0112\u0113\7\'\2\2\u0113\u0114\7@\2\2"+
		"\u0114\u0115\7\35\2\2\u0115\u0116\7\26\2\2\u0116\u011b\7@\2\2\u0117\u0118"+
		"\7\30\2\2\u0118\u011a\7@\2\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u011f\7\27\2\2\u011f\u0120\7\31\2\2\u0120+\3\2\2\2\u0121\u0122"+
		"\b\27\1\2\u0122\u0123\7\61\2\2\u0123\u013f\5,\27\31\u0124\u0125\7)\2\2"+
		"\u0125\u013f\5,\27\20\u0126\u013f\5.\30\2\u0127\u013f\7\17\2\2\u0128\u013f"+
		"\7-\2\2\u0129\u013f\7.\2\2\u012a\u013f\7A\2\2\u012b\u013f\7B\2\2\u012c"+
		"\u012d\7@\2\2\u012d\u012e\7\26\2\2\u012e\u0136\5,\27\2\u012f\u0130\7\30"+
		"\2\2\u0130\u0132\5,\27\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0133\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\7\27\2\2\u0139\u013f\3\2\2\2\u013a\u013b\7\26\2\2\u013b\u013c\5"+
		",\27\2\u013c\u013d\7\27\2\2\u013d\u013f\3\2\2\2\u013e\u0121\3\2\2\2\u013e"+
		"\u0124\3\2\2\2\u013e\u0126\3\2\2\2\u013e\u0127\3\2\2\2\u013e\u0128\3\2"+
		"\2\2\u013e\u0129\3\2\2\2\u013e\u012a\3\2\2\2\u013e\u012b\3\2\2\2\u013e"+
		"\u012c\3\2\2\2\u013e\u013a\3\2\2\2\u013f\u0169\3\2\2\2\u0140\u0141\f\30"+
		"\2\2\u0141\u0142\7/\2\2\u0142\u0168\5,\27\31\u0143\u0144\f\27\2\2\u0144"+
		"\u0145\7\60\2\2\u0145\u0168\5,\27\30\u0146\u0147\f\26\2\2\u0147\u0148"+
		"\7\35\2\2\u0148\u0168\5,\27\27\u0149\u014a\f\25\2\2\u014a\u014b\7\62\2"+
		"\2\u014b\u0168\5,\27\26\u014c\u014d\f\24\2\2\u014d\u014e\7\63\2\2\u014e"+
		"\u0168\5,\27\25\u014f\u0150\f\23\2\2\u0150\u0151\7\64\2\2\u0151\u0168"+
		"\5,\27\24\u0152\u0153\f\22\2\2\u0153\u0154\7\65\2\2\u0154\u0168\5,\27"+
		"\23\u0155\u0156\f\21\2\2\u0156\u0157\7\66\2\2\u0157\u0168\5,\27\22\u0158"+
		"\u0159\f\17\2\2\u0159\u015a\7(\2\2\u015a\u0168\5,\27\20\u015b\u015c\f"+
		"\16\2\2\u015c\u015d\7)\2\2\u015d\u0168\5,\27\17\u015e\u015f\f\r\2\2\u015f"+
		"\u0160\7*\2\2\u0160\u0168\5,\27\16\u0161\u0162\f\f\2\2\u0162\u0163\7+"+
		"\2\2\u0163\u0168\5,\27\r\u0164\u0165\f\13\2\2\u0165\u0166\7,\2\2\u0166"+
		"\u0168\5,\27\f\u0167\u0140\3\2\2\2\u0167\u0143\3\2\2\2\u0167\u0146\3\2"+
		"\2\2\u0167\u0149\3\2\2\2\u0167\u014c\3\2\2\2\u0167\u014f\3\2\2\2\u0167"+
		"\u0152\3\2\2\2\u0167\u0155\3\2\2\2\u0167\u0158\3\2\2\2\u0167\u015b\3\2"+
		"\2\2\u0167\u015e\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0164\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a-\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\u016c\u016d\b\30\1\2\u016d\u0178\7@\2\2\u016e\u016f"+
		"\7@\2\2\u016f\u0170\7\33\2\2\u0170\u0173\5,\27\2\u0171\u0172\7\30\2\2"+
		"\u0172\u0174\5,\27\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\7\32\2\2\u0176\u0178\3\2\2\2\u0177\u016c\3\2\2\2"+
		"\u0177\u016e\3\2\2\2\u0178\u017e\3\2\2\2\u0179\u017a\f\3\2\2\u017a\u017b"+
		"\13\2\2\2\u017b\u017d\7@\2\2\u017c\u0179\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f/\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0181\u0182\5.\30\2\u0182\u0184\7 \2\2\u0183\u0185\5,\27\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\31\2\2"+
		"\u0187\61\3\2\2\2\u0188\u0189\7\67\2\2\u0189\u018b\7\26\2\2\u018a\u018c"+
		"\5,\27\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u01a9\7\27\2\2\u018e\u018f\78\2\2\u018f\u0191\7\26\2\2\u0190\u0192\5"+
		",\27\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u01a9\7\27\2\2\u0194\u0195\79\2\2\u0195\u0197\7\26\2\2\u0196\u0198\5"+
		",\27\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u01a9\7\27\2\2\u019a\u019b\7:\2\2\u019b\u019d\7\26\2\2\u019c\u019e\5"+
		",\27\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a9\7\27\2\2\u01a0\u01a1\7;\2\2\u01a1\u01a3\7\26\2\2\u01a2\u01a4\5"+
		",\27\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a9\7\27\2\2\u01a6\u01a9\5\66\34\2\u01a7\u01a9\5\64\33\2\u01a8\u0188"+
		"\3\2\2\2\u01a8\u018e\3\2\2\2\u01a8\u0194\3\2\2\2\u01a8\u019a\3\2\2\2\u01a8"+
		"\u01a0\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\63\3\2\2"+
		"\2\u01aa\u01ab\7=\2\2\u01ab\u01ac\7\26\2\2\u01ac\u01ad\7\27\2\2\u01ad"+
		"\65\3\2\2\2\u01ae\u01af\7<\2\2\u01af\u01b0\7\26\2\2\u01b0\u01b1\7\27\2"+
		"\2\u01b1\67\3\2\2\2.:?ILTXmv\u0080\u0089\u0092\u009a\u00a5\u00aa\u00b0"+
		"\u00b6\u00b9\u00be\u00c4\u00cb\u00d2\u00d9\u00e2\u00ed\u00f8\u0100\u0103"+
		"\u010c\u011b\u0133\u0136\u013e\u0167\u0169\u0173\u0177\u017e\u0184\u018b"+
		"\u0191\u0197\u019d\u01a3\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}