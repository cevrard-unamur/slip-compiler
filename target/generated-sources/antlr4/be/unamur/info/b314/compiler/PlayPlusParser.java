// Generated from be/unamur/info/b314/compiler/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
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
		RULE_root = 0, RULE_map = 1, RULE_mapSymbols = 2, RULE_programme = 3, 
		RULE_mapImport = 4, RULE_mainFunction = 5, RULE_instruction = 6, RULE_globalVariable = 7, 
		RULE_variableDeclaration = 8, RULE_variableType = 9, RULE_arrayType = 10, 
		RULE_structure = 11, RULE_initVariable = 12, RULE_initArray = 13, RULE_constDeclaration = 14, 
		RULE_enumDeclaration = 15, RULE_rightExpr = 16, RULE_leftExpr = 17, RULE_assignation = 18, 
		RULE_actionType = 19, RULE_dig = 20, RULE_fight = 21;
	public static final String[] ruleNames = {
		"root", "map", "mapSymbols", "programme", "mapImport", "mainFunction", 
		"instruction", "globalVariable", "variableDeclaration", "variableType", 
		"arrayType", "structure", "initVariable", "initArray", "constDeclaration", 
		"enumDeclaration", "rightExpr", "leftExpr", "assignation", "actionType", 
		"dig", "fight"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'", null, null, null, null, null, "'#import'", null, 
		"'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", "'''", 
		"':='", "'main'", "'function'", "'void'", "'do'", "'end'", "'const'", 
		"'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", 
		"'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", "'right'", 
		"'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				map();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public List<MapSymbolsContext> mapSymbols() {
			return getRuleContexts(MapSymbolsContext.class);
		}
		public MapSymbolsContext mapSymbols(int i) {
			return getRuleContext(MapSymbolsContext.class,i);
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
			setState(48);
			match(MAP);
			setState(49);
			match(COLON);
			setState(50);
			match(NUMBER);
			setState(51);
			match(NUMBER);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON))) != 0)) {
				{
				{
				setState(52);
				mapSymbols();
				}
				}
				setState(57);
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
		enterRule(_localctx, 4, RULE_mapSymbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON))) != 0)) ) {
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
		public List<TerminalNode> COMMENT_MULTILINE() { return getTokens(PlayPlusParser.COMMENT_MULTILINE); }
		public TerminalNode COMMENT_MULTILINE(int i) {
			return getToken(PlayPlusParser.COMMENT_MULTILINE, i);
		}
		public List<TerminalNode> COMMENT_SINGLELINE() { return getTokens(PlayPlusParser.COMMENT_SINGLELINE); }
		public TerminalNode COMMENT_SINGLELINE(int i) {
			return getToken(PlayPlusParser.COMMENT_SINGLELINE, i);
		}
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
		enterRule(_localctx, 6, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			mapImport();
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_MULTILINE) {
					{
					{
					setState(61);
					match(COMMENT_MULTILINE);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SINGLELINE) {
					{
					{
					setState(67);
					match(COMMENT_SINGLELINE);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << ENUM) | (1L << ID))) != 0)) {
					{
					{
					setState(73);
					globalVariable();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(81);
			mainFunction();
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
		enterRule(_localctx, 8, RULE_mapImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IMPORT);
			setState(84);
			match(QUOTE);
			setState(85);
			match(MAPFILE);
			setState(86);
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
		enterRule(_localctx, 10, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(MAIN);
			setState(89);
			match(AS);
			setState(90);
			match(FUNCTION);
			setState(91);
			match(LPAR);
			setState(92);
			match(RPAR);
			setState(93);
			match(COLON);
			setState(94);
			match(VOID);
			setState(95);
			match(DO);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					instruction();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			{
			setState(102);
			dig();
			setState(103);
			match(SEMICOLON);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << UP) | (1L << DOWN) | (1L << JUMP) | (1L << FIGHT) | (1L << DIG) | (1L << ID))) != 0)) {
				{
				{
				setState(105);
				instruction();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
		enterRule(_localctx, 12, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(113);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(114);
				assignation();
				}
				break;
			case 3:
				{
				{
				setState(115);
				actionType();
				setState(116);
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
		enterRule(_localctx, 14, RULE_globalVariable);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variableDeclaration();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				constDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				match(ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(AS);
			setState(134);
			variableType();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(135);
				match(EQUAL);
				setState(136);
				initVariable();
				}
			}

			setState(139);
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
		enterRule(_localctx, 18, RULE_variableType);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(SCALAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				arrayType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
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
		enterRule(_localctx, 20, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(SCALAR);
			setState(147);
			match(LBRA);
			setState(148);
			match(NUMBER);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(149);
				match(COMMA);
				setState(150);
				match(NUMBER);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
		enterRule(_localctx, 22, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(159);
			match(AS);
			setState(160);
			match(RECORD);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				variableDeclaration();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(166);
			match(END);
			setState(167);
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
		enterRule(_localctx, 24, RULE_initVariable);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(FALSE);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(CHAR);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
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
		enterRule(_localctx, 26, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LPAR);
			setState(178);
			initVariable();
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					initVariable();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(188);
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
		enterRule(_localctx, 28, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONST);
			setState(191);
			match(ID);
			setState(192);
			match(AS);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(193);
				variableType();
				}
				break;
			case 2:
				{
				setState(194);
				structure();
				}
				break;
			}
			setState(197);
			match(EQUAL);
			setState(198);
			initVariable();
			setState(199);
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
		enterRule(_localctx, 30, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ENUM);
			setState(202);
			match(ID);
			setState(203);
			match(EQUAL);
			setState(204);
			match(LPAR);
			setState(205);
			match(ID);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				match(ID);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RPAR);
			setState(214);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_rightExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(217);
				match(NOT);
				setState(218);
				rightExpr(23);
				}
				break;
			case 2:
				{
				setState(219);
				match(MINUS);
				setState(220);
				rightExpr(14);
				}
				break;
			case 3:
				{
				setState(221);
				leftExpr(0);
				}
				break;
			case 4:
				{
				setState(222);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(223);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(224);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(225);
				match(STRING);
				}
				break;
			case 8:
				{
				setState(226);
				match(CHAR);
				}
				break;
			case 9:
				{
				setState(227);
				match(ID);
				setState(228);
				match(LPAR);
				setState(229);
				rightExpr(0);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(230);
						match(COMMA);
						setState(231);
						rightExpr(0);
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(239);
				match(RPAR);
				}
				break;
			case 10:
				{
				setState(241);
				match(LPAR);
				setState(242);
				rightExpr(0);
				setState(243);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(247);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(248);
						match(AND);
						setState(249);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(250);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(251);
						match(OR);
						setState(252);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(253);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(254);
						match(EQUAL);
						setState(255);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(256);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(257);
						match(LESS);
						setState(258);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(259);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(260);
						match(LESS_EQUAL);
						setState(261);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(262);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(263);
						match(GREAT);
						setState(264);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(265);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(266);
						match(GREAT_EQUAL);
						setState(267);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(268);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(269);
						match(NOT_EQUAL);
						setState(270);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(271);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(272);
						match(PLUS);
						setState(273);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(274);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(275);
						match(MINUS);
						setState(276);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(277);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(278);
						match(MULTI);
						setState(279);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(280);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(281);
						match(DIV);
						setState(282);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new RightExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(283);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(284);
						match(MOD);
						setState(285);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_leftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(292);
				match(ID);
				}
				break;
			case 2:
				{
				setState(293);
				match(ID);
				setState(294);
				match(LBRA);
				setState(295);
				rightExpr(0);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(296);
					match(COMMA);
					setState(297);
					rightExpr(0);
					}
				}

				setState(300);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
					setState(304);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(305);
					matchWildcard();
					setState(306);
					match(ID);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 36, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			leftExpr(0);
			setState(313);
			match(ASSIGN);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
				{
				setState(314);
				rightExpr(0);
				}
			}

			setState(317);
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
		enterRule(_localctx, 38, RULE_actionType);
		int _la;
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(LEFT);
				setState(320);
				match(LPAR);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(321);
					rightExpr(0);
					}
				}

				setState(324);
				match(RPAR);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(RIGHT);
				setState(326);
				match(LPAR);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(327);
					rightExpr(0);
					}
				}

				setState(330);
				match(RPAR);
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(UP);
				setState(332);
				match(LPAR);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(333);
					rightExpr(0);
					}
				}

				setState(336);
				match(RPAR);
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(DOWN);
				setState(338);
				match(LPAR);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(339);
					rightExpr(0);
					}
				}

				setState(342);
				match(RPAR);
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(JUMP);
				setState(344);
				match(LPAR);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (NUMBER - 13)) | (1L << (LPAR - 13)) | (1L << (MINUS - 13)) | (1L << (TRUE - 13)) | (1L << (FALSE - 13)) | (1L << (NOT - 13)) | (1L << (ID - 13)) | (1L << (STRING - 13)) | (1L << (CHAR - 13)))) != 0)) {
					{
					setState(345);
					rightExpr(0);
					}
				}

				setState(348);
				match(RPAR);
				}
				break;
			case FIGHT:
				enterOuterAlt(_localctx, 6);
				{
				setState(349);
				fight();
				}
				break;
			case DIG:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
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
		enterRule(_localctx, 40, RULE_dig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(DIG);
			setState(354);
			match(LPAR);
			setState(355);
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
		enterRule(_localctx, 42, RULE_fight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FIGHT);
			setState(358);
			match(LPAR);
			setState(359);
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
		case 16:
			return rightExpr_sempred((RightExprContext)_localctx, predIndex);
		case 17:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\5\3\5\7\5A\n\5"+
		"\f\5\16\5D\13\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\7\5M\n\5\f\5\16\5P\13"+
		"\5\5\5R\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\by\n\b\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\n"+
		"\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u009a\n\f\f"+
		"\f\16\f\u009d\13\f\3\f\3\f\3\r\3\r\3\r\3\r\6\r\u00a5\n\r\r\r\16\r\u00a6"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3"+
		"\17\3\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13\17\5\17\u00bd\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00eb\n\22\f\22\16\22\u00ee\13\22\5\22"+
		"\u00f0\n\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f8\n\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0121\n\22\f\22\16\22"+
		"\u0124\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012d\n\23\3\23\3"+
		"\23\5\23\u0131\n\23\3\23\3\23\3\23\7\23\u0136\n\23\f\23\16\23\u0139\13"+
		"\23\3\24\3\24\3\24\5\24\u013e\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u0145"+
		"\n\25\3\25\3\25\3\25\3\25\5\25\u014b\n\25\3\25\3\25\3\25\3\25\5\25\u0151"+
		"\n\25\3\25\3\25\3\25\3\25\5\25\u0157\n\25\3\25\3\25\3\25\3\25\5\25\u015d"+
		"\n\25\3\25\3\25\3\25\5\25\u0162\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\2\4\"$\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\3\3\2\4\r\u0199\2\60\3\2\2\2\4\62\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nU\3"+
		"\2\2\2\fZ\3\2\2\2\16x\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24\u0092\3\2"+
		"\2\2\26\u0094\3\2\2\2\30\u00a0\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3\3\2\2"+
		"\2\36\u00c0\3\2\2\2 \u00cb\3\2\2\2\"\u00f7\3\2\2\2$\u0130\3\2\2\2&\u013a"+
		"\3\2\2\2(\u0161\3\2\2\2*\u0163\3\2\2\2,\u0167\3\2\2\2.\61\5\4\3\2/\61"+
		"\5\b\5\2\60.\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\7\3\2\2\63\64\7\16"+
		"\2\2\64\65\7\17\2\2\659\7\17\2\2\668\5\6\4\2\67\66\3\2\2\28;\3\2\2\29"+
		"\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3\2\2\2<=\t\2\2\2=\7\3\2\2\2>Q\5\n"+
		"\6\2?A\7\20\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CR\3\2\2\2DB\3"+
		"\2\2\2EG\7\21\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IR\3\2\2\2JH"+
		"\3\2\2\2KM\5\20\t\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2QB\3\2\2\2QH\3\2\2\2QN\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\5\f\7\2"+
		"T\t\3\2\2\2UV\7\24\2\2VW\7\36\2\2WX\7\25\2\2XY\7\36\2\2Y\13\3\2\2\2Z["+
		"\7!\2\2[\\\7\34\2\2\\]\7\"\2\2]^\7\26\2\2^_\7\27\2\2_`\7\16\2\2`a\7#\2"+
		"\2ae\7$\2\2bd\5\16\b\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2"+
		"\2ge\3\2\2\2hi\5*\26\2ij\7\31\2\2jn\3\2\2\2km\5\16\b\2lk\3\2\2\2mp\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7%\2\2r\r\3\2\2\2sy\5\22"+
		"\n\2ty\5&\24\2uv\5(\25\2vw\7\31\2\2wy\3\2\2\2xs\3\2\2\2xt\3\2\2\2xu\3"+
		"\2\2\2y\17\3\2\2\2z~\5\22\n\2{~\5\36\20\2|~\5 \21\2}z\3\2\2\2}{\3\2\2"+
		"\2}|\3\2\2\2~\21\3\2\2\2\177\u0084\7@\2\2\u0080\u0081\7\30\2\2\u0081\u0083"+
		"\7@\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\34"+
		"\2\2\u0088\u008b\5\24\13\2\u0089\u008a\7\35\2\2\u008a\u008c\5\32\16\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\7\31\2\2\u008e\23\3\2\2\2\u008f\u0093\7>\2\2\u0090\u0093\5\26\f\2\u0091"+
		"\u0093\5\30\r\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\25\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7\33\2\2\u0096"+
		"\u009b\7\17\2\2\u0097\u0098\7\30\2\2\u0098\u009a\7\17\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\32\2\2\u009f\27\3\2\2"+
		"\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7\34\2\2\u00a2\u00a4\7?\2\2\u00a3\u00a5"+
		"\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9\u00aa"+
		"\7\31\2\2\u00aa\31\3\2\2\2\u00ab\u00b2\7-\2\2\u00ac\u00b2\7.\2\2\u00ad"+
		"\u00b2\7\17\2\2\u00ae\u00b2\7A\2\2\u00af\u00b2\7B\2\2\u00b0\u00b2\5\34"+
		"\17\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2"+
		"\2\u00b3\u00b4\7\26\2\2\u00b4\u00bc\5\32\16\2\u00b5\u00b6\7\30\2\2\u00b6"+
		"\u00b8\5\32\16\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\27"+
		"\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c5"+
		"\7\34\2\2\u00c3\u00c6\5\24\13\2\u00c4\u00c6\5\30\r\2\u00c5\u00c3\3\2\2"+
		"\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\35\2\2\u00c8"+
		"\u00c9\5\32\16\2\u00c9\u00ca\7\31\2\2\u00ca\37\3\2\2\2\u00cb\u00cc\7\'"+
		"\2\2\u00cc\u00cd\7@\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00cf\7\26\2\2\u00cf"+
		"\u00d4\7@\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d3\7@\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9\7"+
		"\31\2\2\u00d9!\3\2\2\2\u00da\u00db\b\22\1\2\u00db\u00dc\7\61\2\2\u00dc"+
		"\u00f8\5\"\22\31\u00dd\u00de\7)\2\2\u00de\u00f8\5\"\22\20\u00df\u00f8"+
		"\5$\23\2\u00e0\u00f8\7\17\2\2\u00e1\u00f8\7-\2\2\u00e2\u00f8\7.\2\2\u00e3"+
		"\u00f8\7A\2\2\u00e4\u00f8\7B\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\7\26\2"+
		"\2\u00e7\u00ef\5\"\22\2\u00e8\u00e9\7\30\2\2\u00e9\u00eb\5\"\22\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f8\3"+
		"\2\2\2\u00f3\u00f4\7\26\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\27\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00da\3\2\2\2\u00f7\u00dd\3\2\2\2\u00f7\u00df"+
		"\3\2\2\2\u00f7\u00e0\3\2\2\2\u00f7\u00e1\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7"+
		"\u00e3\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e5\3\2\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f8\u0122\3\2\2\2\u00f9\u00fa\f\30\2\2\u00fa\u00fb\7/\2\2\u00fb"+
		"\u0121\5\"\22\31\u00fc\u00fd\f\27\2\2\u00fd\u00fe\7\60\2\2\u00fe\u0121"+
		"\5\"\22\30\u00ff\u0100\f\26\2\2\u0100\u0101\7\35\2\2\u0101\u0121\5\"\22"+
		"\27\u0102\u0103\f\25\2\2\u0103\u0104\7\62\2\2\u0104\u0121\5\"\22\26\u0105"+
		"\u0106\f\24\2\2\u0106\u0107\7\63\2\2\u0107\u0121\5\"\22\25\u0108\u0109"+
		"\f\23\2\2\u0109\u010a\7\64\2\2\u010a\u0121\5\"\22\24\u010b\u010c\f\22"+
		"\2\2\u010c\u010d\7\65\2\2\u010d\u0121\5\"\22\23\u010e\u010f\f\21\2\2\u010f"+
		"\u0110\7\66\2\2\u0110\u0121\5\"\22\22\u0111\u0112\f\17\2\2\u0112\u0113"+
		"\7(\2\2\u0113\u0121\5\"\22\20\u0114\u0115\f\16\2\2\u0115\u0116\7)\2\2"+
		"\u0116\u0121\5\"\22\17\u0117\u0118\f\r\2\2\u0118\u0119\7*\2\2\u0119\u0121"+
		"\5\"\22\16\u011a\u011b\f\f\2\2\u011b\u011c\7+\2\2\u011c\u0121\5\"\22\r"+
		"\u011d\u011e\f\13\2\2\u011e\u011f\7,\2\2\u011f\u0121\5\"\22\f\u0120\u00f9"+
		"\3\2\2\2\u0120\u00fc\3\2\2\2\u0120\u00ff\3\2\2\2\u0120\u0102\3\2\2\2\u0120"+
		"\u0105\3\2\2\2\u0120\u0108\3\2\2\2\u0120\u010b\3\2\2\2\u0120\u010e\3\2"+
		"\2\2\u0120\u0111\3\2\2\2\u0120\u0114\3\2\2\2\u0120\u0117\3\2\2\2\u0120"+
		"\u011a\3\2\2\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123#\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126"+
		"\b\23\1\2\u0126\u0131\7@\2\2\u0127\u0128\7@\2\2\u0128\u0129\7\33\2\2\u0129"+
		"\u012c\5\"\22\2\u012a\u012b\7\30\2\2\u012b\u012d\5\"\22\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\32\2\2"+
		"\u012f\u0131\3\2\2\2\u0130\u0125\3\2\2\2\u0130\u0127\3\2\2\2\u0131\u0137"+
		"\3\2\2\2\u0132\u0133\f\3\2\2\u0133\u0134\13\2\2\2\u0134\u0136\7@\2\2\u0135"+
		"\u0132\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138%\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\5$\23\2\u013b\u013d"+
		"\7 \2\2\u013c\u013e\5\"\22\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7\31\2\2\u0140\'\3\2\2\2\u0141\u0142\7\67\2"+
		"\2\u0142\u0144\7\26\2\2\u0143\u0145\5\"\22\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0162\7\27\2\2\u0147\u0148\7"+
		"8\2\2\u0148\u014a\7\26\2\2\u0149\u014b\5\"\22\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0162\7\27\2\2\u014d\u014e\7"+
		"9\2\2\u014e\u0150\7\26\2\2\u014f\u0151\5\"\22\2\u0150\u014f\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0162\7\27\2\2\u0153\u0154\7"+
		":\2\2\u0154\u0156\7\26\2\2\u0155\u0157\5\"\22\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0162\7\27\2\2\u0159\u015a\7"+
		";\2\2\u015a\u015c\7\26\2\2\u015b\u015d\5\"\22\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\7\27\2\2\u015f\u0162\5"+
		",\27\2\u0160\u0162\5*\26\2\u0161\u0141\3\2\2\2\u0161\u0147\3\2\2\2\u0161"+
		"\u014d\3\2\2\2\u0161\u0153\3\2\2\2\u0161\u0159\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0160\3\2\2\2\u0162)\3\2\2\2\u0163\u0164\7=\2\2\u0164\u0165"+
		"\7\26\2\2\u0165\u0166\7\27\2\2\u0166+\3\2\2\2\u0167\u0168\7<\2\2\u0168"+
		"\u0169\7\26\2\2\u0169\u016a\7\27\2\2\u016a-\3\2\2\2%\609BHNQenx}\u0084"+
		"\u008b\u0092\u009b\u00a6\u00b1\u00b9\u00bc\u00c5\u00d4\u00ec\u00ef\u00f7"+
		"\u0120\u0122\u012c\u0130\u0137\u013d\u0144\u014a\u0150\u0156\u015c\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}