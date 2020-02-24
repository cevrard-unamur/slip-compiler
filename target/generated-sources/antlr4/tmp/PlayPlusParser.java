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
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17, DASH=18, IMPORT=19, MAPFILE=20, 
		LPAR=21, RPAR=22, COMMA=23, SEMICOLON=24, RBRA=25, LBRA=26, AS=27, EQUAL=28, 
		QUOTE=29, SINGLE_QUOTE=30, ASSIGN=31, MAIN=32, FUNCTION=33, VOID=34, DO=35, 
		END=36, CONST=37, ENUM=38, PLUS=39, MINUS=40, MULTI=41, DIV=42, MOD=43, 
		TRUE=44, FALSE=45, AND=46, OR=47, NOT=48, LESS=49, LESS_EQUAL=50, GREAT=51, 
		GREAT_EQUAL=52, NOT_EQUAL=53, LEFT=54, RIGHT=55, UP=56, DOWN=57, JUMP=58, 
		FIGHT=59, DIG=60, SCALAR=61, RECORD=62, ID=63, STRING=64, CHAR=65;
	public static final int
		RULE_root = 0, RULE_map = 1, RULE_mapDescription = 2, RULE_mapSymbols = 3, 
		RULE_programme = 4, RULE_mapImport = 5, RULE_mainFunction = 6, RULE_instruction = 7, 
		RULE_globalVariable = 8, RULE_variableDeclaration = 9, RULE_variableType = 10, 
		RULE_arrayType = 11, RULE_structure = 12, RULE_initVariable = 13, RULE_initArray = 14, 
		RULE_constDeclaration = 15, RULE_enumDeclaration = 16, RULE_rightExpr = 17, 
		RULE_leftExpr = 18, RULE_assignation = 19, RULE_actionType = 20, RULE_dig = 21, 
		RULE_fight = 22;
	public static final String[] ruleNames = {
		"root", "map", "mapDescription", "mapSymbols", "programme", "mapImport", 
		"mainFunction", "instruction", "globalVariable", "variableDeclaration", 
		"variableType", "arrayType", "structure", "initVariable", "initArray", 
		"constDeclaration", "enumDeclaration", "rightExpr", "leftExpr", "assignation", 
		"actionType", "dig", "fight"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'", null, null, null, null, null, "'#'", "'import'", 
		null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", 
		"'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", "'const'", 
		"'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", 
		"'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", "'right'", 
		"'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "DASH", "IMPORT", "MAPFILE", "LPAR", 
		"RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", 
		"SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", 
		"ENUM", "PLUS", "MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", 
		"OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", 
		"ID", "STRING", "CHAR"
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
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				map();
				}
				break;
			case DASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(50);
				mapDescription();
				}
				}
				setState(55);
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
			setState(56);
			match(MAP);
			setState(57);
			match(COLON);
			setState(58);
			match(NUMBER);
			setState(59);
			match(NUMBER);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				mapSymbols();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0) );
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(65);
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
			setState(68);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			mapImport();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				globalVariable();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			mainFunction();
			setState(78);
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
		public TerminalNode DASH() { return getToken(PlayPlusParser.DASH, 0); }
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
			setState(80);
			match(DASH);
			setState(81);
			match(IMPORT);
			setState(82);
			match(QUOTE);
			setState(83);
			match(MAPFILE);
			setState(84);
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
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
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
			setState(86);
			match(MAIN);
			setState(87);
			match(AS);
			setState(88);
			match(FUNCTION);
			setState(89);
			match(LPAR);
			setState(90);
			match(RPAR);
			setState(91);
			match(COLON);
			setState(92);
			match(VOID);
			setState(93);
			match(DO);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					instruction();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			{
			setState(100);
			dig();
			setState(101);
			match(SEMICOLON);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(103);
				instruction();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		enterRule(_localctx, 14, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(112);
				assignation();
				}
				break;
			case 3:
				{
				{
				setState(113);
				actionType();
				setState(114);
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
		enterRule(_localctx, 16, RULE_globalVariable);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				variableDeclaration();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				constDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				enumDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
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
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(133);
				match(EQUAL);
				setState(134);
				initVariable();
				}
			}

			setState(137);
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
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableType);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(SCALAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				structure();
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
		enterRule(_localctx, 22, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SCALAR);
			setState(145);
			match(LBRA);
			setState(146);
			match(NUMBER);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				match(NUMBER);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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

	public static class StructureContext extends ParserRuleContext {
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
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
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

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(AS);
			setState(158);
			match(RECORD);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				variableDeclaration();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(164);
			match(END);
			setState(165);
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
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public InitArrayContext initArray() {
			return getRuleContext(InitArrayContext.class,0);
		}
		public InitVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInitVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initVariable);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(FALSE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(CHAR);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
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
		enterRule(_localctx, 28, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(LPAR);
			setState(176);
			initVariable();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					initVariable();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(186);
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
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CONST);
			setState(189);
			match(ID);
			setState(190);
			match(AS);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(191);
				variableType();
				}
				break;
			case 2:
				{
				setState(192);
				structure();
				}
				break;
			}
			setState(195);
			match(EQUAL);
			setState(196);
			initVariable();
			setState(197);
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
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ENUM);
			setState(200);
			match(ID);
			setState(201);
			match(EQUAL);
			setState(202);
			match(LPAR);
			setState(203);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				match(ID);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RPAR);
			setState(212);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_rightExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(215);
				match(NOT);
				setState(216);
				rightExpr(23);
				}
				break;
			case 2:
				{
				setState(217);
				match(MINUS);
				setState(218);
				rightExpr(14);
				}
				break;
			case 3:
				{
				setState(219);
				leftExpr(0);
				}
				break;
			case 4:
				{
				setState(220);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(221);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(222);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(223);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(224);
				match(CHAR);
				}
				break;
			case 9:
				{
				setState(225);
				match(ID);
				setState(226);
				match(LPAR);
				setState(227);
				rightExpr(0);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(228);
						match(COMMA);
						setState(229);
						rightExpr(0);
						}
						}
						setState(234);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(237);
				match(RPAR);
				}
				break;
			case 10:
				{
				setState(239);
				match(LPAR);
				setState(240);
				rightExpr(0);
				setState(241);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(284);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(245);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(246);
						match(AND);
						setState(247);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(248);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(249);
						match(OR);
						setState(250);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(251);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(252);
						match(EQUAL);
						setState(253);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(254);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(255);
						match(LESS);
						setState(256);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(257);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(258);
						match(LESS_EQUAL);
						setState(259);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(260);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(261);
						match(GREAT);
						setState(262);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(263);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(264);
						match(GREAT_EQUAL);
						setState(265);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(266);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(267);
						match(NOT_EQUAL);
						setState(268);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(269);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(270);
						match(PLUS);
						setState(271);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(272);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(273);
						match(MINUS);
						setState(274);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(275);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(276);
						match(MULTI);
						setState(277);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(279);
						match(DIV);
						setState(280);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(281);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(282);
						match(MOD);
						setState(283);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
		public LeftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftExpr(this);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(290);
				match(ID);
				}
				break;
			case 2:
				{
				setState(291);
				match(ID);
				setState(292);
				match(LBRA);
				setState(293);
				rightExpr(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(294);
					match(COMMA);
					setState(295);
					rightExpr(0);
					}
				}

				setState(298);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
					setState(302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(303);
					matchWildcard();
					setState(304);
					match(ID);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 38, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			leftExpr(0);
			setState(311);
			match(ASSIGN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
				{
				setState(312);
				rightExpr(0);
				}
			}

			setState(315);
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
		public TerminalNode LEFT() { return getToken(PlayPlusParser.LEFT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(PlayPlusParser.RIGHT, 0); }
		public TerminalNode UP() { return getToken(PlayPlusParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(PlayPlusParser.DOWN, 0); }
		public TerminalNode JUMP() { return getToken(PlayPlusParser.JUMP, 0); }
		public FightContext fight() {
			return getRuleContext(FightContext.class,0);
		}
		public DigContext dig() {
			return getRuleContext(DigContext.class,0);
		}
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionType);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(LEFT);
				setState(318);
				match(LPAR);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(319);
					rightExpr(0);
					}
				}

				setState(322);
				match(RPAR);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(RIGHT);
				setState(324);
				match(LPAR);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(325);
					rightExpr(0);
					}
				}

				setState(328);
				match(RPAR);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(UP);
				setState(330);
				match(LPAR);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(331);
					rightExpr(0);
					}
				}

				setState(334);
				match(RPAR);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(DOWN);
				setState(336);
				match(LPAR);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(337);
					rightExpr(0);
					}
				}

				setState(340);
				match(RPAR);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(JUMP);
				setState(342);
				match(LPAR);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(343);
					rightExpr(0);
					}
				}

				setState(346);
				match(RPAR);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				fight();
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				dig();
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

	public static class DigContext extends ParserRuleContext {
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public DigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dig; }
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

	public final DigContext dig() throws RecognitionException {
		DigContext _localctx = new DigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(DIG);
			setState(352);
			match(LPAR);
			setState(353);
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

	public static class FightContext extends ParserRuleContext {
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public FightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fight; }
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

	public final FightContext fight() throws RecognitionException {
		FightContext _localctx = new FightContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(FIGHT);
			setState(356);
			match(LPAR);
			setState(357);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u016a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\6\4@\n\4\r"+
		"\4\16\4A\3\4\5\4E\n\4\3\5\3\5\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb"+
		"\n\b\f\b\16\be\13\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\tw\n\t\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\13\7\13\u0081"+
		"\n\13\f\13\16\13\u0084\13\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u0091\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u0098\n\r\f\r"+
		"\16\r\u009b\13\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u00a3\n\16\r\16\16\16"+
		"\u00a4\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3"+
		"\20\3\20\3\20\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\5\20\u00bb\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4"+
		"\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13\23"+
		"\5\23\u00ee\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u011f\n\23\f\23"+
		"\16\23\u0122\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012b\n\24"+
		"\3\24\3\24\5\24\u012f\n\24\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16\24\u0137"+
		"\13\24\3\25\3\25\3\25\5\25\u013c\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u0143"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0149\n\26\3\26\3\26\3\26\3\26\5\26\u014f"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u0155\n\26\3\26\3\26\3\26\3\26\5\26\u015b"+
		"\n\26\3\26\3\26\3\26\5\26\u0160\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\2\4$&\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\3\4\2\4\r\20\21\u0193\2\62\3\2\2\2\4\67\3\2\2\2\6:\3\2\2\2\bF\3\2\2\2"+
		"\nH\3\2\2\2\fR\3\2\2\2\16X\3\2\2\2\20v\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2"+
		"\26\u0090\3\2\2\2\30\u0092\3\2\2\2\32\u009e\3\2\2\2\34\u00af\3\2\2\2\36"+
		"\u00b1\3\2\2\2 \u00be\3\2\2\2\"\u00c9\3\2\2\2$\u00f5\3\2\2\2&\u012e\3"+
		"\2\2\2(\u0138\3\2\2\2*\u015f\3\2\2\2,\u0161\3\2\2\2.\u0165\3\2\2\2\60"+
		"\63\5\4\3\2\61\63\5\n\6\2\62\60\3\2\2\2\62\61\3\2\2\2\63\3\3\2\2\2\64"+
		"\66\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2"+
		"\2\29\67\3\2\2\2:;\7\3\2\2;<\7\16\2\2<=\7\17\2\2=?\7\17\2\2>@\5\b\5\2"+
		"?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\7\2\2\3DC\3\2\2\2"+
		"DE\3\2\2\2E\7\3\2\2\2FG\t\2\2\2G\t\3\2\2\2HL\5\f\7\2IK\5\22\n\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\16\b\2PQ\7"+
		"\2\2\3Q\13\3\2\2\2RS\7\24\2\2ST\7\25\2\2TU\7\37\2\2UV\7\26\2\2VW\7\37"+
		"\2\2W\r\3\2\2\2XY\7\"\2\2YZ\7\35\2\2Z[\7#\2\2[\\\7\27\2\2\\]\7\30\2\2"+
		"]^\7\16\2\2^_\7$\2\2_c\7%\2\2`b\5\20\t\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5,\27\2gh\7\32\2\2hl\3\2\2\2ik\5\20\t"+
		"\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7&\2"+
		"\2p\17\3\2\2\2qw\5\24\13\2rw\5(\25\2st\5*\26\2tu\7\32\2\2uw\3\2\2\2vq"+
		"\3\2\2\2vr\3\2\2\2vs\3\2\2\2w\21\3\2\2\2x|\5\24\13\2y|\5 \21\2z|\5\"\22"+
		"\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\23\3\2\2\2}\u0082\7A\2\2~\177\7\31\2"+
		"\2\177\u0081\7A\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7\35\2\2\u0086\u0089\5\26\f\2\u0087\u0088\7\36\2\2\u0088\u008a"+
		"\5\34\17\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\7\32\2\2\u008c\25\3\2\2\2\u008d\u0091\7?\2\2\u008e\u0091"+
		"\5\30\r\2\u008f\u0091\5\32\16\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094"+
		"\7\34\2\2\u0094\u0099\7\17\2\2\u0095\u0096\7\31\2\2\u0096\u0098\7\17\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\33\2\2"+
		"\u009d\31\3\2\2\2\u009e\u009f\7A\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a2"+
		"\7@\2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\7&\2\2\u00a7\u00a8\7\32\2\2\u00a8\33\3\2\2\2\u00a9\u00b0\7.\2\2\u00aa"+
		"\u00b0\7/\2\2\u00ab\u00b0\7\17\2\2\u00ac\u00b0\7B\2\2\u00ad\u00b0\7C\2"+
		"\2\u00ae\u00b0\5\36\20\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00ba\5\34\17\2\u00b3"+
		"\u00b4\7\31\2\2\u00b4\u00b6\5\34\17\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\7\30\2\2\u00bd\37\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf\u00c0"+
		"\7A\2\2\u00c0\u00c3\7\35\2\2\u00c1\u00c4\5\26\f\2\u00c2\u00c4\5\32\16"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\7\36\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\32\2\2\u00c8!\3\2\2\2\u00c9"+
		"\u00ca\7(\2\2\u00ca\u00cb\7A\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\27"+
		"\2\2\u00cd\u00d2\7A\2\2\u00ce\u00cf\7\31\2\2\u00cf\u00d1\7A\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\30\2\2\u00d6"+
		"\u00d7\7\32\2\2\u00d7#\3\2\2\2\u00d8\u00d9\b\23\1\2\u00d9\u00da\7\62\2"+
		"\2\u00da\u00f6\5$\23\31\u00db\u00dc\7*\2\2\u00dc\u00f6\5$\23\20\u00dd"+
		"\u00f6\5&\24\2\u00de\u00f6\7\17\2\2\u00df\u00f6\7.\2\2\u00e0\u00f6\7/"+
		"\2\2\u00e1\u00f6\7B\2\2\u00e2\u00f6\7C\2\2\u00e3\u00e4\7A\2\2\u00e4\u00e5"+
		"\7\27\2\2\u00e5\u00ed\5$\23\2\u00e6\u00e7\7\31\2\2\u00e7\u00e9\5$\23\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f6\3"+
		"\2\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f3\5$\23\2\u00f3\u00f4\7\30\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00d8\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00dd\3\2"+
		"\2\2\u00f5\u00de\3\2\2\2\u00f5\u00df\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5"+
		"\u00e1\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00f1\3\2"+
		"\2\2\u00f6\u0120\3\2\2\2\u00f7\u00f8\f\30\2\2\u00f8\u00f9\7\60\2\2\u00f9"+
		"\u011f\5$\23\31\u00fa\u00fb\f\27\2\2\u00fb\u00fc\7\61\2\2\u00fc\u011f"+
		"\5$\23\30\u00fd\u00fe\f\26\2\2\u00fe\u00ff\7\36\2\2\u00ff\u011f\5$\23"+
		"\27\u0100\u0101\f\25\2\2\u0101\u0102\7\63\2\2\u0102\u011f\5$\23\26\u0103"+
		"\u0104\f\24\2\2\u0104\u0105\7\64\2\2\u0105\u011f\5$\23\25\u0106\u0107"+
		"\f\23\2\2\u0107\u0108\7\65\2\2\u0108\u011f\5$\23\24\u0109\u010a\f\22\2"+
		"\2\u010a\u010b\7\66\2\2\u010b\u011f\5$\23\23\u010c\u010d\f\21\2\2\u010d"+
		"\u010e\7\67\2\2\u010e\u011f\5$\23\22\u010f\u0110\f\17\2\2\u0110\u0111"+
		"\7)\2\2\u0111\u011f\5$\23\20\u0112\u0113\f\16\2\2\u0113\u0114\7*\2\2\u0114"+
		"\u011f\5$\23\17\u0115\u0116\f\r\2\2\u0116\u0117\7+\2\2\u0117\u011f\5$"+
		"\23\16\u0118\u0119\f\f\2\2\u0119\u011a\7,\2\2\u011a\u011f\5$\23\r\u011b"+
		"\u011c\f\13\2\2\u011c\u011d\7-\2\2\u011d\u011f\5$\23\f\u011e\u00f7\3\2"+
		"\2\2\u011e\u00fa\3\2\2\2\u011e\u00fd\3\2\2\2\u011e\u0100\3\2\2\2\u011e"+
		"\u0103\3\2\2\2\u011e\u0106\3\2\2\2\u011e\u0109\3\2\2\2\u011e\u010c\3\2"+
		"\2\2\u011e\u010f\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0115\3\2\2\2\u011e"+
		"\u0118\3\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121%\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124"+
		"\b\24\1\2\u0124\u012f\7A\2\2\u0125\u0126\7A\2\2\u0126\u0127\7\34\2\2\u0127"+
		"\u012a\5$\23\2\u0128\u0129\7\31\2\2\u0129\u012b\5$\23\2\u012a\u0128\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\33\2\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0125\3\2\2\2\u012f\u0135\3\2"+
		"\2\2\u0130\u0131\f\3\2\2\u0131\u0132\13\2\2\2\u0132\u0134\7A\2\2\u0133"+
		"\u0130\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\'\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\5&\24\2\u0139\u013b"+
		"\7!\2\2\u013a\u013c\5$\23\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\7\32\2\2\u013e)\3\2\2\2\u013f\u0140\78\2\2"+
		"\u0140\u0142\7\27\2\2\u0141\u0143\5$\23\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0160\7\30\2\2\u0145\u0146\79\2\2\u0146"+
		"\u0148\7\27\2\2\u0147\u0149\5$\23\2\u0148\u0147\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\u014a\3\2\2\2\u014a\u0160\7\30\2\2\u014b\u014c\7:\2\2\u014c"+
		"\u014e\7\27\2\2\u014d\u014f\5$\23\2\u014e\u014d\3\2\2\2\u014e\u014f\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0160\7\30\2\2\u0151\u0152\7;\2\2\u0152"+
		"\u0154\7\27\2\2\u0153\u0155\5$\23\2\u0154\u0153\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\3\2\2\2\u0156\u0160\7\30\2\2\u0157\u0158\7<\2\2\u0158"+
		"\u015a\7\27\2\2\u0159\u015b\5$\23\2\u015a\u0159\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u0160\7\30\2\2\u015d\u0160\5.\30\2\u015e"+
		"\u0160\5,\27\2\u015f\u013f\3\2\2\2\u015f\u0145\3\2\2\2\u015f\u014b\3\2"+
		"\2\2\u015f\u0151\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160+\3\2\2\2\u0161\u0162\7>\2\2\u0162\u0163\7\27\2\2"+
		"\u0163\u0164\7\30\2\2\u0164-\3\2\2\2\u0165\u0166\7=\2\2\u0166\u0167\7"+
		"\27\2\2\u0167\u0168\7\30\2\2\u0168/\3\2\2\2$\62\67ADLclv{\u0082\u0089"+
		"\u0090\u0099\u00a4\u00af\u00b7\u00ba\u00c3\u00d2\u00ea\u00ed\u00f5\u011e"+
		"\u0120\u012a\u012e\u0135\u013b\u0142\u0148\u014e\u0154\u015a\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}