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
		T__0=1, MAP=2, ROBOT=3, CHEST=4, GRASS=5, PALMTREE=6, BRIDGE=7, BUSH=8, 
		CASK=9, WELL=10, EMPTY=11, SQUELETON=12, COLON=13, NUMBER=14, COMMENT_MULTILINE=15, 
		COMMENT_SINGLELINE=16, NEWLINE=17, WS=18, IMPORT=19, MAPFILE=20, LPAR=21, 
		RPAR=22, COMMA=23, SEMICOLON=24, RBRA=25, LBRA=26, AS=27, EQUAL=28, QUOTE=29, 
		SINGLE_QUOTE=30, ASSIGN=31, MAIN=32, FUNCTION=33, VOID=34, DO=35, END=36, 
		CONST=37, ENUM=38, PLUS=39, MINUS=40, MULTI=41, DIV=42, MOD=43, TRUE=44, 
		FALSE=45, AND=46, OR=47, NOT=48, LESS=49, LESS_EQUAL=50, GREAT=51, GREAT_EQUAL=52, 
		NOT_EQUAL=53, IF=54, WHILE=55, TO=56, UNTIL=57, THEN=58, ELSE=59, REPEAT=60, 
		FOR=61, LEFT=62, RIGHT=63, UP=64, DOWN=65, JUMP=66, FIGHT=67, DIG=68, 
		SCALAR=69, RECORD=70, ID=71, STRING=72, CHAR=73;
	public static final int
		RULE_root = 0, RULE_map = 1, RULE_mapStructure = 2, RULE_mapSymbols = 3, 
		RULE_prog = 4, RULE_mapImport = 5, RULE_mainFunction = 6, RULE_mainFunctionInstruction = 7, 
		RULE_funct = 8, RULE_returnType = 9, RULE_argumentList = 10, RULE_argument = 11, 
		RULE_inst = 12, RULE_functionInst = 13, RULE_globalVariable = 14, RULE_variableDeclaration = 15, 
		RULE_variableType = 16, RULE_arrayDeclaration = 17, RULE_structureDeclaration = 18, 
		RULE_initVariable = 19, RULE_initArray = 20, RULE_constDeclaration = 21, 
		RULE_enumDeclaration = 22, RULE_rightExpr = 23, RULE_leftExpr = 24, RULE_assignation = 25, 
		RULE_actionType = 26, RULE_digInstruction = 27, RULE_fightInstruction = 28, 
		RULE_ifBlock = 29, RULE_whileBlock = 30, RULE_repeatBlock = 31, RULE_forBlock = 32;
	public static final String[] ruleNames = {
		"root", "map", "mapStructure", "mapSymbols", "prog", "mapImport", "mainFunction", 
		"mainFunctionInstruction", "funct", "returnType", "argumentList", "argument", 
		"inst", "functionInst", "globalVariable", "variableDeclaration", "variableType", 
		"arrayDeclaration", "structureDeclaration", "initVariable", "initArray", 
		"constDeclaration", "enumDeclaration", "rightExpr", "leftExpr", "assignation", 
		"actionType", "digInstruction", "fightInstruction", "ifBlock", "whileBlock", 
		"repeatBlock", "forBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", 
		"'S'", "'_'", "'Q'", "':'", null, null, null, null, null, null, null, 
		"'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", "'''", 
		"':='", "'main'", "'function'", "'void'", "'do'", "'end'", "'const'", 
		"'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", 
		"'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'if'", "'while'", 
		"'to'", "'until'", "'then'", "'else'", "'repeat'", "'for'", "'left'", 
		"'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "IMPORT", "MAPFILE", "LPAR", "RPAR", 
		"COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", 
		"ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", "ENUM", "PLUS", 
		"MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", 
		"LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", 
		"UNTIL", "THEN", "ELSE", "REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", 
		"JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR"
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
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				map();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				prog();
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
		public List<MapStructureContext> mapStructure() {
			return getRuleContexts(MapStructureContext.class);
		}
		public MapStructureContext mapStructure(int i) {
			return getRuleContext(MapStructureContext.class,i);
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(70);
				mapStructure();
				}
				}
				setState(75);
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

	public static class MapStructureContext extends ParserRuleContext {
		public MapStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapStructure; }
	 
		public MapStructureContext() { }
		public void copyFrom(MapStructureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapDescriptionContext extends MapStructureContext {
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
		public MapDescriptionContext(MapStructureContext ctx) { copyFrom(ctx); }
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

	public final MapStructureContext mapStructure() throws RecognitionException {
		MapStructureContext _localctx = new MapStructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapStructure);
		int _la;
		try {
			_localctx = new MapDescriptionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			match(MAP);
			setState(77);
			match(COLON);
			setState(78);
			match(NUMBER);
			setState(79);
			match(NUMBER);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				mapSymbols();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0) );
			}
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
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
		public MapSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSymbols; }
	 
		public MapSymbolsContext() { }
		public void copyFrom(MapSymbolsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RobotContext extends MapSymbolsContext {
		public TerminalNode ROBOT() { return getToken(PlayPlusParser.ROBOT, 0); }
		public RobotContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRobot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRobot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PalmtreeContext extends MapSymbolsContext {
		public TerminalNode PALMTREE() { return getToken(PlayPlusParser.PALMTREE, 0); }
		public PalmtreeContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterPalmtree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitPalmtree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitPalmtree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChestContext extends MapSymbolsContext {
		public TerminalNode CHEST() { return getToken(PlayPlusParser.CHEST, 0); }
		public ChestContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterChest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitChest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitChest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentMultiContext extends MapSymbolsContext {
		public TerminalNode COMMENT_MULTILINE() { return getToken(PlayPlusParser.COMMENT_MULTILINE, 0); }
		public CommentMultiContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCommentMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCommentMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCommentMulti(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrassContext extends MapSymbolsContext {
		public TerminalNode GRASS() { return getToken(PlayPlusParser.GRASS, 0); }
		public GrassContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGrass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGrass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGrass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BushContext extends MapSymbolsContext {
		public TerminalNode BUSH() { return getToken(PlayPlusParser.BUSH, 0); }
		public BushContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBush(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaskContext extends MapSymbolsContext {
		public TerminalNode CASK() { return getToken(PlayPlusParser.CASK, 0); }
		public CaskContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCask(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WellContext extends MapSymbolsContext {
		public TerminalNode WELL() { return getToken(PlayPlusParser.WELL, 0); }
		public WellContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqueletonContext extends MapSymbolsContext {
		public TerminalNode SQUELETON() { return getToken(PlayPlusParser.SQUELETON, 0); }
		public SqueletonContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSqueleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSqueleton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSqueleton(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BridgeContext extends MapSymbolsContext {
		public TerminalNode BRIDGE() { return getToken(PlayPlusParser.BRIDGE, 0); }
		public BridgeContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBridge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBridge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends MapSymbolsContext {
		public TerminalNode EMPTY() { return getToken(PlayPlusParser.EMPTY, 0); }
		public EmptyContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentSingleContext extends MapSymbolsContext {
		public TerminalNode COMMENT_SINGLELINE() { return getToken(PlayPlusParser.COMMENT_SINGLELINE, 0); }
		public CommentSingleContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCommentSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCommentSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCommentSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapSymbolsContext mapSymbols() throws RecognitionException {
		MapSymbolsContext _localctx = new MapSymbolsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mapSymbols);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROBOT:
				_localctx = new RobotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(ROBOT);
				}
				break;
			case CHEST:
				_localctx = new ChestContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(CHEST);
				}
				break;
			case GRASS:
				_localctx = new GrassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(GRASS);
				}
				break;
			case PALMTREE:
				_localctx = new PalmtreeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(PALMTREE);
				}
				break;
			case BRIDGE:
				_localctx = new BridgeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				match(BRIDGE);
				}
				break;
			case BUSH:
				_localctx = new BushContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(BUSH);
				}
				break;
			case CASK:
				_localctx = new CaskContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(CASK);
				}
				break;
			case WELL:
				_localctx = new WellContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(WELL);
				}
				break;
			case EMPTY:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				match(EMPTY);
				}
				break;
			case SQUELETON:
				_localctx = new SqueletonContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				match(SQUELETON);
				}
				break;
			case COMMENT_SINGLELINE:
				_localctx = new CommentSingleContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(98);
				match(COMMENT_SINGLELINE);
				}
				break;
			case COMMENT_MULTILINE:
				_localctx = new CommentMultiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(99);
				match(COMMENT_MULTILINE);
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
		public TerminalNode EOF() { return getToken(PlayPlusParser.EOF, 0); }
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

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prog);
		int _la;
		try {
			_localctx = new ProgrammeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			mapImport();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (CONST - 37)) | (1L << (ENUM - 37)) | (1L << (ID - 37)))) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(103);
					globalVariable();
					}
					break;
				case 2:
					{
					setState(104);
					funct();
					}
					break;
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			mainFunction();
			setState(111);
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
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(PlayPlusParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PlayPlusParser.QUOTE, i);
		}
		public TerminalNode MAPFILE() { return getToken(PlayPlusParser.MAPFILE, 0); }
		public MapImportationContext(MapImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapImportation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapImportation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapImportation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapImportContext mapImport() throws RecognitionException {
		MapImportContext _localctx = new MapImportContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mapImport);
		try {
			_localctx = new MapImportationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IMPORT);
			setState(114);
			match(QUOTE);
			setState(115);
			match(MAPFILE);
			setState(116);
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
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public MainFunctionInstructionContext mainFunctionInstruction() {
			return getRuleContext(MainFunctionInstructionContext.class,0);
		}
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public MainContext(MainFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		try {
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(MAIN);
			setState(119);
			match(AS);
			setState(120);
			match(FUNCTION);
			setState(121);
			match(LPAR);
			setState(122);
			match(RPAR);
			setState(123);
			match(COLON);
			setState(124);
			match(VOID);
			setState(125);
			match(DO);
			setState(126);
			mainFunctionInstruction();
			setState(127);
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
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public MainInstructionContext(MainFunctionInstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionInstructionContext mainFunctionInstruction() throws RecognitionException {
		MainFunctionInstructionContext _localctx = new MainFunctionInstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainFunctionInstruction);
		int _la;
		try {
			int _alt;
			_localctx = new MainInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					inst();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			{
			setState(135);
			digInstruction();
			setState(136);
			match(SEMICOLON);
			}
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0)) {
				{
				{
				setState(138);
				inst();
				}
				}
				setState(143);
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
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funct);
		int _la;
		try {
			_localctx = new FunctionDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(AS);
			setState(146);
			match(FUNCTION);
			setState(147);
			match(LPAR);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(148);
				argumentList();
				}
			}

			setState(151);
			match(RPAR);
			setState(152);
			match(COLON);
			setState(153);
			returnType();
			setState(154);
			match(DO);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				functionInst();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (CONST - 37)) | (1L << (ENUM - 37)) | (1L << (IF - 37)) | (1L << (WHILE - 37)) | (1L << (REPEAT - 37)) | (1L << (FOR - 37)) | (1L << (LEFT - 37)) | (1L << (RIGHT - 37)) | (1L << (UP - 37)) | (1L << (DOWN - 37)) | (1L << (JUMP - 37)) | (1L << (FIGHT - 37)) | (1L << (DIG - 37)) | (1L << (ID - 37)))) != 0) );
			setState(160);
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
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public FunctionParametersContext(ArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentList);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			argument();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				argument();
				}
				}
				setState(171);
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
		public FunctionParameterContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		int _la;
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			match(ID);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				match(ID);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(AS);
			setState(181);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableInstruction(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRepeatInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRepeatInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRepeatInstruction(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWhileInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWhileInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWhileInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionInstructionContext extends InstContext {
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public ActionInstructionContext(InstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionInstruction(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfInstruction(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterForInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitForInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitForInstruction(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAssignationInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAssignationInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAssignationInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inst);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VariableInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new AssignationInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				assignation();
				}
				break;
			case 3:
				_localctx = new ActionInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(185);
				actionType();
				setState(186);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				ifBlock();
				}
				break;
			case 5:
				_localctx = new WhileInstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				whileBlock();
				}
				break;
			case 6:
				_localctx = new RepeatInstructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				repeatBlock();
				}
				break;
			case 7:
				_localctx = new ForInstructionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
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
		public List<StructureDeclarationContext> structureDeclaration() {
			return getRuleContexts(StructureDeclarationContext.class);
		}
		public StructureDeclarationContext structureDeclaration(int i) {
			return getRuleContext(StructureDeclarationContext.class,i);
		}
		public FunctionInstructionContext(FunctionInstContext ctx) { copyFrom(ctx); }
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

	public final FunctionInstContext functionInst() throws RecognitionException {
		FunctionInstContext _localctx = new FunctionInstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionInst);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(194);
					enumDeclaration();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(200);
					constDeclaration();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(206);
						structureDeclaration();
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			}
			setState(215); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(214);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_globalVariable);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				constDeclaration();
				}
				break;
			case 3:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				enumDeclaration();
				}
				break;
			case 4:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
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
		public VariableDefinitionContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			match(ID);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				match(ID);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(AS);
			setState(234);
			variableType();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(235);
				match(EQUAL);
				setState(236);
				initVariable();
				}
			}

			setState(239);
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
	public static class StructureTypeContext extends VariableTypeContext {
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
		}
		public StructureTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
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
	public static class ScalarTypeContext extends VariableTypeContext {
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public ScalarTypeContext(VariableTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variableType);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				arrayDeclaration();
				}
				break;
			case 3:
				_localctx = new StructureTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
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
		public ArrayContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
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

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDeclaration);
		int _la;
		try {
			_localctx = new ArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(SCALAR);
			setState(247);
			match(LBRA);
			setState(248);
			match(NUMBER);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				match(NUMBER);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
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
		public List<StructureDeclarationContext> structureDeclaration() {
			return getRuleContexts(StructureDeclarationContext.class);
		}
		public StructureDeclarationContext structureDeclaration(int i) {
			return getRuleContext(StructureDeclarationContext.class,i);
		}
		public StructureContext(StructureDeclarationContext ctx) { copyFrom(ctx); }
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

	public final StructureDeclarationContext structureDeclaration() throws RecognitionException {
		StructureDeclarationContext _localctx = new StructureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structureDeclaration);
		int _la;
		try {
			_localctx = new StructureContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			setState(259);
			match(AS);
			setState(260);
			match(RECORD);
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(261);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(262);
					structureDeclaration();
					}
					break;
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(267);
			match(END);
			setState(268);
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
	public static class RightInitialisationContext extends InitVariableContext {
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public RightInitialisationContext(InitVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRightInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRightInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRightInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVariableContext initVariable() throws RecognitionException {
		InitVariableContext _localctx = new InitVariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initVariable);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				initArray();
				}
				break;
			case 2:
				_localctx = new RightInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
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
		enterRule(_localctx, 40, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(LPAR);
			setState(275);
			initVariable();
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(276);
					match(COMMA);
					setState(277);
					initVariable();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(285);
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
		public StructureDeclarationContext structureDeclaration() {
			return getRuleContext(StructureDeclarationContext.class,0);
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
		enterRule(_localctx, 42, RULE_constDeclaration);
		try {
			_localctx = new ConstantContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(CONST);
			setState(288);
			match(ID);
			setState(289);
			match(AS);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(290);
				variableType();
				}
				break;
			case 2:
				{
				setState(291);
				structureDeclaration();
				}
				break;
			}
			setState(294);
			match(EQUAL);
			setState(295);
			initVariable();
			setState(296);
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
		enterRule(_localctx, 44, RULE_enumDeclaration);
		int _la;
		try {
			_localctx = new EnumerationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ENUM);
			setState(299);
			match(ID);
			setState(300);
			match(EQUAL);
			setState(301);
			match(LPAR);
			setState(302);
			match(ID);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(303);
				match(COMMA);
				setState(304);
				match(ID);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(RPAR);
			setState(311);
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
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public NegativeIntegerExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNegativeIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNegativeIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNegativeIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends RightExprContext {
		public TerminalNode STRING() { return getToken(PlayPlusParser.STRING, 0); }
		public StringContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitString(this);
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
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public BoolExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBoolExpression(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFalseContext extends RightExprContext {
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public BooleanFalseContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBooleanFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBooleanFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBooleanFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends RightExprContext {
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public NotExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNotExpression(this);
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
		public TerminalNode MULTI() { return getToken(PlayPlusParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public IntegerExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIntegerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIntegerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIntegerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends RightExprContext {
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public NumberContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesExpressionContext extends RightExprContext {
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public ParenthesesExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitParenthesesExpression(this);
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
		public TerminalNode EQUAL() { return getToken(PlayPlusParser.EQUAL, 0); }
		public TerminalNode LESS() { return getToken(PlayPlusParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(PlayPlusParser.LESS_EQUAL, 0); }
		public TerminalNode GREAT() { return getToken(PlayPlusParser.GREAT, 0); }
		public TerminalNode GREAT_EQUAL() { return getToken(PlayPlusParser.GREAT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PlayPlusParser.NOT_EQUAL, 0); }
		public CompExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTrueContext extends RightExprContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public BooleanTrueContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterBooleanTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitBooleanTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitBooleanTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends RightExprContext {
		public TerminalNode CHAR() { return getToken(PlayPlusParser.CHAR, 0); }
		public CharContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends RightExprContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public FunctionCallExpressionContext(RightExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_rightExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(314);
				match(LPAR);
				setState(315);
				rightExpr(0);
				setState(316);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new NegativeIntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(MINUS);
				setState(319);
				rightExpr(17);
				}
				break;
			case 3:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(NOT);
				setState(321);
				rightExpr(8);
				}
				break;
			case 4:
				{
				_localctx = new LeftExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				leftExpr(0);
				}
				break;
			case 5:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(STRING);
				}
				break;
			case 9:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(CHAR);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(ID);
				setState(329);
				match(LPAR);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(330);
					rightExpr(0);
					setState(335);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(331);
						match(COMMA);
						setState(332);
						rightExpr(0);
						}
						}
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(340);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(343);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(344);
						match(MULTI);
						setState(345);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(346);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(347);
						match(DIV);
						setState(348);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(349);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(350);
						match(MOD);
						setState(351);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(352);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(353);
						match(PLUS);
						setState(354);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(355);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(356);
						match(MINUS);
						setState(357);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(358);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(359);
						match(EQUAL);
						setState(360);
						rightExpr(17);
						}
						break;
					case 7:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(361);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(362);
						match(LESS);
						setState(363);
						rightExpr(16);
						}
						break;
					case 8:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(364);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(365);
						match(LESS_EQUAL);
						setState(366);
						rightExpr(15);
						}
						break;
					case 9:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(367);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(368);
						match(GREAT);
						setState(369);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(370);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(371);
						match(GREAT_EQUAL);
						setState(372);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(373);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(374);
						match(NOT_EQUAL);
						setState(375);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(376);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(377);
						match(AND);
						setState(378);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(379);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(380);
						match(OR);
						setState(381);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(386);
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
	public static class LeftPropertyArrayContext extends LeftExprContext {
		public LeftExprContext leftExpr() {
			return getRuleContext(LeftExprContext.class,0);
		}
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
		public LeftPropertyArrayContext(LeftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterLeftPropertyArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitLeftPropertyArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitLeftPropertyArray(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_leftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(388);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				match(ID);
				setState(390);
				match(LBRA);
				setState(391);
				rightExpr(0);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(392);
					match(COMMA);
					setState(393);
					rightExpr(0);
					}
				}

				setState(396);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new LeftPropertyContext(new LeftExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
						setState(400);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(401);
						match(T__0);
						setState(402);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new LeftPropertyArrayContext(new LeftExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
						setState(403);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(404);
						match(T__0);
						setState(405);
						match(ID);
						setState(406);
						match(LBRA);
						setState(407);
						rightExpr(0);
						setState(410);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(408);
							match(COMMA);
							setState(409);
							rightExpr(0);
							}
						}

						setState(412);
						match(RBRA);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 50, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			leftExpr(0);
			setState(420);
			match(ASSIGN);
			setState(421);
			rightExpr(0);
			setState(422);
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
	public static class ActionContext extends ActionTypeContext {
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
		public ActionContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAction(this);
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

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actionType);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(LEFT);
				setState(425);
				match(LPAR);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(426);
					rightExpr(0);
					}
				}

				setState(429);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(RIGHT);
				setState(431);
				match(LPAR);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(432);
					rightExpr(0);
					}
				}

				setState(435);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				match(UP);
				setState(437);
				match(LPAR);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(438);
					rightExpr(0);
					}
				}

				setState(441);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				match(DOWN);
				setState(443);
				match(LPAR);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(444);
					rightExpr(0);
					}
				}

				setState(447);
				match(RPAR);
				}
				break;
			case JUMP:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(JUMP);
				setState(449);
				match(LPAR);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(450);
					rightExpr(0);
					}
				}

				setState(453);
				match(RPAR);
				}
				break;
			case FIGHT:
				_localctx = new FightContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
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
		enterRule(_localctx, 54, RULE_digInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(DIG);
			setState(459);
			match(LPAR);
			setState(460);
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
		enterRule(_localctx, 56, RULE_fightInstruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(FIGHT);
			setState(463);
			match(LPAR);
			setState(464);
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
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public IfContext(IfBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifBlock);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(IF);
			setState(467);
			match(LPAR);
			setState(468);
			rightExpr(0);
			setState(469);
			match(RPAR);
			setState(470);
			match(THEN);
			setState(472); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				inst();
				}
				}
				setState(474); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(476);
				match(ELSE);
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477);
					inst();
					}
					}
					setState(480); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
				}
			}

			setState(484);
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
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public WhileContext(WhileBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileBlock);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(WHILE);
			setState(487);
			match(LPAR);
			setState(488);
			rightExpr(0);
			setState(489);
			match(RPAR);
			setState(490);
			match(DO);
			setState(492); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				inst();
				}
				}
				setState(494); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(496);
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
		public TerminalNode REPEAT() { return getToken(PlayPlusParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(PlayPlusParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public RightExprContext rightExpr() {
			return getRuleContext(RightExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public RepeatContext(RepeatBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatBlockContext repeatBlock() throws RecognitionException {
		RepeatBlockContext _localctx = new RepeatBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repeatBlock);
		int _la;
		try {
			_localctx = new RepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(REPEAT);
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				inst();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(504);
			match(UNTIL);
			setState(505);
			match(LPAR);
			setState(506);
			rightExpr(0);
			setState(507);
			match(RPAR);
			setState(508);
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
		public TerminalNode FOR() { return getToken(PlayPlusParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PlayPlusParser.ASSIGN, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(PlayPlusParser.TO, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public ForContext(ForBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forBlock);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(FOR);
			setState(511);
			match(ID);
			setState(512);
			match(ASSIGN);
			setState(513);
			rightExpr(0);
			setState(514);
			match(TO);
			setState(515);
			rightExpr(0);
			setState(516);
			match(DO);
			setState(518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(517);
				inst();
				}
				}
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(522);
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
		case 23:
			return rightExpr_sempred((RightExprContext)_localctx, predIndex);
		case 24:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u020f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\5\2G\n\2\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4T\n\4\r\4\16\4U\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\7\t\u0085\n\t\f\t\16\t\u0088\13\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t"+
		"\16\t\u0091\13\t\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u009f\n\n\r\n\16\n\u00a0\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7\f\u00aa"+
		"\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5\13\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c3\n"+
		"\16\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\17\7\17\u00cc\n\17\f"+
		"\17\16\17\u00cf\13\17\3\17\7\17\u00d2\n\17\f\17\16\17\u00d5\13\17\5\17"+
		"\u00d7\n\17\3\17\6\17\u00da\n\17\r\17\16\17\u00db\3\20\3\20\3\20\3\20"+
		"\5\20\u00e2\n\20\3\21\3\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\21\3\21\3\22\3\22\3\22\5\22\u00f7"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u00fe\n\23\f\23\16\23\u0101\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u010a\n\24\r\24\16\24\u010b\3"+
		"\24\3\24\3\24\3\25\3\25\5\25\u0113\n\25\3\26\3\26\3\26\3\26\7\26\u0119"+
		"\n\26\f\26\16\26\u011c\13\26\5\26\u011e\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0127\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0134\n\30\f\30\16\30\u0137\13\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u0150\n\31\f\31\16\31\u0153\13\31\5\31"+
		"\u0155\n\31\3\31\5\31\u0158\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u0181\n\31\f\31\16\31\u0184\13\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u018d\n\32\3\32\3\32\5\32\u0191\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019d\n\32\3\32\3\32"+
		"\7\32\u01a1\n\32\f\32\16\32\u01a4\13\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\5\34\u01ae\n\34\3\34\3\34\3\34\3\34\5\34\u01b4\n\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01ba\n\34\3\34\3\34\3\34\3\34\5\34\u01c0\n\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01c6\n\34\3\34\3\34\3\34\5\34\u01cb\n\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u01db"+
		"\n\37\r\37\16\37\u01dc\3\37\3\37\6\37\u01e1\n\37\r\37\16\37\u01e2\5\37"+
		"\u01e5\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \6 \u01ef\n \r \16 \u01f0\3 \3"+
		" \3!\3!\6!\u01f7\n!\r!\16!\u01f8\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\6\"\u0209\n\"\r\"\16\"\u020a\3\"\3\"\3\"\2\4\60\62#\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\3\4\2$"+
		"$GG\u024e\2F\3\2\2\2\4K\3\2\2\2\6N\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fs\3"+
		"\2\2\2\16x\3\2\2\2\20\u0086\3\2\2\2\22\u0092\3\2\2\2\24\u00a4\3\2\2\2"+
		"\26\u00a6\3\2\2\2\30\u00ae\3\2\2\2\32\u00c2\3\2\2\2\34\u00d6\3\2\2\2\36"+
		"\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00f6\3\2\2\2$\u00f8\3\2\2\2&\u0104\3"+
		"\2\2\2(\u0112\3\2\2\2*\u0114\3\2\2\2,\u0121\3\2\2\2.\u012c\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u0190\3\2\2\2\64\u01a5\3\2\2\2\66\u01ca\3\2\2\28\u01cc"+
		"\3\2\2\2:\u01d0\3\2\2\2<\u01d4\3\2\2\2>\u01e8\3\2\2\2@\u01f4\3\2\2\2B"+
		"\u0200\3\2\2\2DG\5\4\3\2EG\5\n\6\2FD\3\2\2\2FE\3\2\2\2G\3\3\2\2\2HJ\5"+
		"\6\4\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2\2\2NO"+
		"\7\4\2\2OP\7\17\2\2PQ\7\20\2\2QS\7\20\2\2RT\5\b\5\2SR\3\2\2\2TU\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\7\2\2\3XW\3\2\2\2XY\3\2\2\2Y\7\3\2"+
		"\2\2Zg\7\5\2\2[g\7\6\2\2\\g\7\7\2\2]g\7\b\2\2^g\7\t\2\2_g\7\n\2\2`g\7"+
		"\13\2\2ag\7\f\2\2bg\7\r\2\2cg\7\16\2\2dg\7\22\2\2eg\7\21\2\2fZ\3\2\2\2"+
		"f[\3\2\2\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2"+
		"\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hm\5\f\7\2il\5\36"+
		"\20\2jl\5\22\n\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3"+
		"\2\2\2om\3\2\2\2pq\5\16\b\2qr\7\2\2\3r\13\3\2\2\2st\7\25\2\2tu\7\37\2"+
		"\2uv\7\26\2\2vw\7\37\2\2w\r\3\2\2\2xy\7\"\2\2yz\7\35\2\2z{\7#\2\2{|\7"+
		"\27\2\2|}\7\30\2\2}~\7\17\2\2~\177\7$\2\2\177\u0080\7%\2\2\u0080\u0081"+
		"\5\20\t\2\u0081\u0082\7&\2\2\u0082\17\3\2\2\2\u0083\u0085\5\32\16\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\58\35\2\u008a"+
		"\u008b\7\32\2\2\u008b\u008f\3\2\2\2\u008c\u008e\5\32\16\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\21\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7I\2\2\u0093\u0094\7\35\2"+
		"\2\u0094\u0095\7#\2\2\u0095\u0097\7\27\2\2\u0096\u0098\5\26\f\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\30"+
		"\2\2\u009a\u009b\7\17\2\2\u009b\u009c\5\24\13\2\u009c\u009e\7%\2\2\u009d"+
		"\u009f\5\34\17\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7&\2\2\u00a3"+
		"\23\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\25\3\2\2\2\u00a6\u00ab\5\30\r\2"+
		"\u00a7\u00a8\7\31\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b3\7I\2\2\u00af\u00b0\7\31\2\2\u00b0\u00b2\7I"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\35"+
		"\2\2\u00b7\u00b8\5\"\22\2\u00b8\31\3\2\2\2\u00b9\u00c3\5 \21\2\u00ba\u00c3"+
		"\5\64\33\2\u00bb\u00bc\5\66\34\2\u00bc\u00bd\7\32\2\2\u00bd\u00c3\3\2"+
		"\2\2\u00be\u00c3\5<\37\2\u00bf\u00c3\5> \2\u00c0\u00c3\5@!\2\u00c1\u00c3"+
		"\5B\"\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\33\3\2\2\2\u00c4\u00c6\5.\30\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d7\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cc\5,\27\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d7\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d2\5&\24\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d3\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\5\32\16\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\35\3\2\2\2\u00dd\u00e2\5 \21\2\u00de\u00e2\5,\27\2\u00df\u00e2"+
		"\5.\30\2\u00e0\u00e2\5&\24\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\37\3\2\2\2\u00e3\u00e8\7I\2\2"+
		"\u00e4\u00e5\7\31\2\2\u00e5\u00e7\7I\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\35\2\2\u00ec\u00ef\5\"\22\2\u00ed\u00ee\7"+
		"\36\2\2\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\7\32\2\2\u00f2!\3\2\2\2\u00f3\u00f7\7G\2\2"+
		"\u00f4\u00f7\5$\23\2\u00f5\u00f7\5&\24\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa"+
		"\7\34\2\2\u00fa\u00ff\7\20\2\2\u00fb\u00fc\7\31\2\2\u00fc\u00fe\7\20\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\33\2\2"+
		"\u0103%\3\2\2\2\u0104\u0105\7I\2\2\u0105\u0106\7\35\2\2\u0106\u0109\7"+
		"H\2\2\u0107\u010a\5 \21\2\u0108\u010a\5&\24\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7&\2\2\u010e\u010f\7\32\2\2\u010f"+
		"\'\3\2\2\2\u0110\u0113\5*\26\2\u0111\u0113\5\60\31\2\u0112\u0110\3\2\2"+
		"\2\u0112\u0111\3\2\2\2\u0113)\3\2\2\2\u0114\u0115\7\27\2\2\u0115\u011d"+
		"\5(\25\2\u0116\u0117\7\31\2\2\u0117\u0119\5(\25\2\u0118\u0116\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\7\30\2\2\u0120+\3\2\2\2\u0121\u0122\7\'\2\2"+
		"\u0122\u0123\7I\2\2\u0123\u0126\7\35\2\2\u0124\u0127\5\"\22\2\u0125\u0127"+
		"\5&\24\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\7\36\2\2\u0129\u012a\5(\25\2\u012a\u012b\7\32\2\2\u012b-\3\2\2"+
		"\2\u012c\u012d\7(\2\2\u012d\u012e\7I\2\2\u012e\u012f\7\36\2\2\u012f\u0130"+
		"\7\27\2\2\u0130\u0135\7I\2\2\u0131\u0132\7\31\2\2\u0132\u0134\7I\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\30\2\2\u0139"+
		"\u013a\7\32\2\2\u013a/\3\2\2\2\u013b\u013c\b\31\1\2\u013c\u013d\7\27\2"+
		"\2\u013d\u013e\5\60\31\2\u013e\u013f\7\30\2\2\u013f\u0158\3\2\2\2\u0140"+
		"\u0141\7*\2\2\u0141\u0158\5\60\31\23\u0142\u0143\7\62\2\2\u0143\u0158"+
		"\5\60\31\n\u0144\u0158\5\62\32\2\u0145\u0158\7\20\2\2\u0146\u0158\7.\2"+
		"\2\u0147\u0158\7/\2\2\u0148\u0158\7J\2\2\u0149\u0158\7K\2\2\u014a\u014b"+
		"\7I\2\2\u014b\u0154\7\27\2\2\u014c\u0151\5\60\31\2\u014d\u014e\7\31\2"+
		"\2\u014e\u0150\5\60\31\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u014c\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\7\30\2\2\u0157\u013b\3\2\2\2\u0157\u0140\3\2\2\2\u0157\u0142\3"+
		"\2\2\2\u0157\u0144\3\2\2\2\u0157\u0145\3\2\2\2\u0157\u0146\3\2\2\2\u0157"+
		"\u0147\3\2\2\2\u0157\u0148\3\2\2\2\u0157\u0149\3\2\2\2\u0157\u014a\3\2"+
		"\2\2\u0158\u0182\3\2\2\2\u0159\u015a\f\30\2\2\u015a\u015b\7+\2\2\u015b"+
		"\u0181\5\60\31\31\u015c\u015d\f\27\2\2\u015d\u015e\7,\2\2\u015e\u0181"+
		"\5\60\31\30\u015f\u0160\f\26\2\2\u0160\u0161\7-\2\2\u0161\u0181\5\60\31"+
		"\27\u0162\u0163\f\25\2\2\u0163\u0164\7)\2\2\u0164\u0181\5\60\31\26\u0165"+
		"\u0166\f\24\2\2\u0166\u0167\7*\2\2\u0167\u0181\5\60\31\25\u0168\u0169"+
		"\f\22\2\2\u0169\u016a\7\36\2\2\u016a\u0181\5\60\31\23\u016b\u016c\f\21"+
		"\2\2\u016c\u016d\7\63\2\2\u016d\u0181\5\60\31\22\u016e\u016f\f\20\2\2"+
		"\u016f\u0170\7\64\2\2\u0170\u0181\5\60\31\21\u0171\u0172\f\17\2\2\u0172"+
		"\u0173\7\65\2\2\u0173\u0181\5\60\31\20\u0174\u0175\f\16\2\2\u0175\u0176"+
		"\7\66\2\2\u0176\u0181\5\60\31\17\u0177\u0178\f\r\2\2\u0178\u0179\7\67"+
		"\2\2\u0179\u0181\5\60\31\16\u017a\u017b\f\f\2\2\u017b\u017c\7\60\2\2\u017c"+
		"\u0181\5\60\31\r\u017d\u017e\f\13\2\2\u017e\u017f\7\61\2\2\u017f\u0181"+
		"\5\60\31\f\u0180\u0159\3\2\2\2\u0180\u015c\3\2\2\2\u0180\u015f\3\2\2\2"+
		"\u0180\u0162\3\2\2\2\u0180\u0165\3\2\2\2\u0180\u0168\3\2\2\2\u0180\u016b"+
		"\3\2\2\2\u0180\u016e\3\2\2\2\u0180\u0171\3\2\2\2\u0180\u0174\3\2\2\2\u0180"+
		"\u0177\3\2\2\2\u0180\u017a\3\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\61\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0185\u0186\b\32\1\2\u0186\u0191\7I\2\2\u0187\u0188\7I\2\2\u0188"+
		"\u0189\7\34\2\2\u0189\u018c\5\60\31\2\u018a\u018b\7\31\2\2\u018b\u018d"+
		"\5\60\31\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018f\7\33\2\2\u018f\u0191\3\2\2\2\u0190\u0185\3\2\2\2\u0190\u0187"+
		"\3\2\2\2\u0191\u01a2\3\2\2\2\u0192\u0193\f\4\2\2\u0193\u0194\7\3\2\2\u0194"+
		"\u01a1\7I\2\2\u0195\u0196\f\3\2\2\u0196\u0197\7\3\2\2\u0197\u0198\7I\2"+
		"\2\u0198\u0199\7\34\2\2\u0199\u019c\5\60\31\2\u019a\u019b\7\31\2\2\u019b"+
		"\u019d\5\60\31\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019e\u019f\7\33\2\2\u019f\u01a1\3\2\2\2\u01a0\u0192\3\2\2\2\u01a0"+
		"\u0195\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\63\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\5\62\32\2\u01a6"+
		"\u01a7\7!\2\2\u01a7\u01a8\5\60\31\2\u01a8\u01a9\7\32\2\2\u01a9\65\3\2"+
		"\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ad\7\27\2\2\u01ac\u01ae\5\60\31\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01cb\7\30"+
		"\2\2\u01b0\u01b1\7A\2\2\u01b1\u01b3\7\27\2\2\u01b2\u01b4\5\60\31\2\u01b3"+
		"\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01cb\7\30"+
		"\2\2\u01b6\u01b7\7B\2\2\u01b7\u01b9\7\27\2\2\u01b8\u01ba\5\60\31\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01cb\7\30"+
		"\2\2\u01bc\u01bd\7C\2\2\u01bd\u01bf\7\27\2\2\u01be\u01c0\5\60\31\2\u01bf"+
		"\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01cb\7\30"+
		"\2\2\u01c2\u01c3\7D\2\2\u01c3\u01c5\7\27\2\2\u01c4\u01c6\5\60\31\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\7\30"+
		"\2\2\u01c8\u01cb\5:\36\2\u01c9\u01cb\58\35\2\u01ca\u01aa\3\2\2\2\u01ca"+
		"\u01b0\3\2\2\2\u01ca\u01b6\3\2\2\2\u01ca\u01bc\3\2\2\2\u01ca\u01c2\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\67\3\2\2\2\u01cc\u01cd"+
		"\7F\2\2\u01cd\u01ce\7\27\2\2\u01ce\u01cf\7\30\2\2\u01cf9\3\2\2\2\u01d0"+
		"\u01d1\7E\2\2\u01d1\u01d2\7\27\2\2\u01d2\u01d3\7\30\2\2\u01d3;\3\2\2\2"+
		"\u01d4\u01d5\78\2\2\u01d5\u01d6\7\27\2\2\u01d6\u01d7\5\60\31\2\u01d7\u01d8"+
		"\7\30\2\2\u01d8\u01da\7<\2\2\u01d9\u01db\5\32\16\2\u01da\u01d9\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e4"+
		"\3\2\2\2\u01de\u01e0\7=\2\2\u01df\u01e1\5\32\16\2\u01e0\u01df\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\7&\2\2\u01e7=\3\2\2\2\u01e8\u01e9\79\2\2\u01e9\u01ea\7\27\2\2\u01ea"+
		"\u01eb\5\60\31\2\u01eb\u01ec\7\30\2\2\u01ec\u01ee\7%\2\2\u01ed\u01ef\5"+
		"\32\16\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7&\2\2\u01f3?\3\2\2\2\u01f4"+
		"\u01f6\7>\2\2\u01f5\u01f7\5\32\16\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3"+
		"\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fb\7;\2\2\u01fb\u01fc\7\27\2\2\u01fc\u01fd\5\60\31\2\u01fd\u01fe\7"+
		"\30\2\2\u01fe\u01ff\7&\2\2\u01ffA\3\2\2\2\u0200\u0201\7?\2\2\u0201\u0202"+
		"\7I\2\2\u0202\u0203\7!\2\2\u0203\u0204\5\60\31\2\u0204\u0205\7:\2\2\u0205"+
		"\u0206\5\60\31\2\u0206\u0208\7%\2\2\u0207\u0209\5\32\16\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\7&\2\2\u020dC\3\2\2\2\67FKUXfkm\u0086\u008f"+
		"\u0097\u00a0\u00ab\u00b3\u00c2\u00c7\u00cd\u00d3\u00d6\u00db\u00e1\u00e8"+
		"\u00ef\u00f6\u00ff\u0109\u010b\u0112\u011a\u011d\u0126\u0135\u0151\u0154"+
		"\u0157\u0180\u0182\u018c\u0190\u019c\u01a0\u01a2\u01ad\u01b3\u01b9\u01bf"+
		"\u01c5\u01ca\u01dc\u01e2\u01e4\u01f0\u01f8\u020a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}