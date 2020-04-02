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
		RULE_prog = 4, RULE_mapImport = 5, RULE_mainFunction = 6, RULE_funct = 7, 
		RULE_argumentList = 8, RULE_argument = 9, RULE_inst = 10, RULE_functionInst = 11, 
		RULE_globalVariable = 12, RULE_variableDeclaration = 13, RULE_variableType = 14, 
		RULE_arrayType = 15, RULE_structureType = 16, RULE_initVariable = 17, 
		RULE_initArray = 18, RULE_constDeclaration = 19, RULE_enumDeclaration = 20, 
		RULE_rightExpr = 21, RULE_leftExpr = 22, RULE_assignation = 23, RULE_actionType = 24, 
		RULE_digInstruction = 25, RULE_fightInstruction = 26, RULE_ifBlock = 27, 
		RULE_whileBlock = 28, RULE_repeatBlock = 29, RULE_forBlock = 30;
	public static final String[] ruleNames = {
		"root", "map", "mapStructure", "mapSymbols", "prog", "mapImport", "mainFunction", 
		"funct", "argumentList", "argument", "inst", "functionInst", "globalVariable", 
		"variableDeclaration", "variableType", "arrayType", "structureType", "initVariable", 
		"initArray", "constDeclaration", "enumDeclaration", "rightExpr", "leftExpr", 
		"assignation", "actionType", "digInstruction", "fightInstruction", "ifBlock", 
		"whileBlock", "repeatBlock", "forBlock"
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case MAP:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				map();
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(66);
				mapStructure();
				}
				}
				setState(71);
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
			setState(72);
			match(MAP);
			setState(73);
			match(COLON);
			setState(74);
			match(NUMBER);
			setState(75);
			match(NUMBER);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				mapSymbols();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0) );
			}
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROBOT:
				_localctx = new RobotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ROBOT);
				}
				break;
			case CHEST:
				_localctx = new ChestContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(CHEST);
				}
				break;
			case GRASS:
				_localctx = new GrassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(GRASS);
				}
				break;
			case PALMTREE:
				_localctx = new PalmtreeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(PALMTREE);
				}
				break;
			case BRIDGE:
				_localctx = new BridgeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(BRIDGE);
				}
				break;
			case BUSH:
				_localctx = new BushContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(BUSH);
				}
				break;
			case CASK:
				_localctx = new CaskContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				match(CASK);
				}
				break;
			case WELL:
				_localctx = new WellContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				match(WELL);
				}
				break;
			case EMPTY:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
				match(EMPTY);
				}
				break;
			case SQUELETON:
				_localctx = new SqueletonContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				match(SQUELETON);
				}
				break;
			case COMMENT_SINGLELINE:
				_localctx = new CommentSingleContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(94);
				match(COMMENT_SINGLELINE);
				}
				break;
			case COMMENT_MULTILINE:
				_localctx = new CommentMultiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
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
			setState(98);
			mapImport();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (CONST - 37)) | (1L << (ENUM - 37)) | (1L << (ID - 37)))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(99);
					globalVariable();
					}
					break;
				case 2:
					{
					setState(100);
					funct();
					}
					break;
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			mainFunction();
			setState(107);
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
			setState(109);
			match(IMPORT);
			setState(110);
			match(QUOTE);
			setState(111);
			match(MAPFILE);
			setState(112);
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
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
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
		int _la;
		try {
			int _alt;
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(MAIN);
			setState(115);
			match(AS);
			setState(116);
			match(FUNCTION);
			setState(117);
			match(LPAR);
			setState(118);
			match(RPAR);
			setState(119);
			match(COLON);
			setState(120);
			match(VOID);
			setState(121);
			match(DO);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					inst();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			{
			setState(128);
			digInstruction();
			setState(129);
			match(SEMICOLON);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0)) {
				{
				{
				setState(131);
				inst();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<FunctionInstContext> functionInst() {
			return getRuleContexts(FunctionInstContext.class);
		}
		public FunctionInstContext functionInst(int i) {
			return getRuleContext(FunctionInstContext.class,i);
		}
		public FunctionContext(FunctContext ctx) { copyFrom(ctx); }
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

	public final FunctContext funct() throws RecognitionException {
		FunctContext _localctx = new FunctContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funct);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(AS);
			setState(141);
			match(FUNCTION);
			setState(142);
			match(LPAR);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(143);
				argumentList();
				}
			}

			setState(146);
			match(RPAR);
			setState(147);
			match(COLON);
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==VOID || _la==SCALAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			match(DO);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				functionInst();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (CONST - 37)) | (1L << (ENUM - 37)) | (1L << (IF - 37)) | (1L << (WHILE - 37)) | (1L << (REPEAT - 37)) | (1L << (FOR - 37)) | (1L << (LEFT - 37)) | (1L << (RIGHT - 37)) | (1L << (UP - 37)) | (1L << (DOWN - 37)) | (1L << (JUMP - 37)) | (1L << (FIGHT - 37)) | (1L << (DIG - 37)) | (1L << (ID - 37)))) != 0) );
			setState(155);
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
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			argument();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				argument();
				}
				}
				setState(164);
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
		enterRule(_localctx, 18, RULE_argument);
		int _la;
		try {
			_localctx = new FunctionParameterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			match(ID);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				match(ID);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(AS);
			setState(174);
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
		enterRule(_localctx, 20, RULE_inst);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VariableInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new AssignationInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				assignation();
				}
				break;
			case 3:
				_localctx = new ActionInstructionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(178);
				actionType();
				setState(179);
				match(SEMICOLON);
				}
				}
				break;
			case 4:
				_localctx = new IfInstructionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				ifBlock();
				}
				break;
			case 5:
				_localctx = new WhileInstructionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				whileBlock();
				}
				break;
			case 6:
				_localctx = new RepeatInstructionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				repeatBlock();
				}
				break;
			case 7:
				_localctx = new ForInstructionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
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
		enterRule(_localctx, 22, RULE_functionInst);
		int _la;
		try {
			int _alt;
			_localctx = new FunctionInstructionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENUM) {
					{
					{
					setState(187);
					enumDeclaration();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONST) {
					{
					{
					setState(193);
					constDeclaration();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(199);
						structureType();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			}
			setState(208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(207);
					inst();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
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
	public static class GlobalVariableDeclarationContext extends GlobalVariableContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public GlobalVariableDeclarationContext(GlobalVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalVariableDeclaration(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalEnumDeclaration(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalConstantDeclaration(this);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterGlobalStructureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitGlobalStructureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitGlobalStructureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_globalVariable);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new GlobalVariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new GlobalConstantDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				constDeclaration();
				}
				break;
			case 3:
				_localctx = new GlobalEnumDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				enumDeclaration();
				}
				break;
			case 4:
				_localctx = new GlobalStructureDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
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
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			_localctx = new VariableDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			match(ID);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				match(ID);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(AS);
			setState(227);
			variableType();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(228);
				match(EQUAL);
				setState(229);
				initVariable();
				}
			}

			setState(232);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(SCALAR);
				}
				break;
			case 2:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				arrayType();
				}
				break;
			case 3:
				_localctx = new StructureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
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
		public ArrayDefinitionContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		int _la;
		try {
			_localctx = new ArrayDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(SCALAR);
			setState(240);
			match(LBRA);
			setState(241);
			match(NUMBER);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242);
				match(COMMA);
				setState(243);
				match(NUMBER);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
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
		public List<StructureTypeContext> structureType() {
			return getRuleContexts(StructureTypeContext.class);
		}
		public StructureTypeContext structureType(int i) {
			return getRuleContext(StructureTypeContext.class,i);
		}
		public StructureDefinitionContext(StructureTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureTypeContext structureType() throws RecognitionException {
		StructureTypeContext _localctx = new StructureTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_structureType);
		int _la;
		try {
			_localctx = new StructureDefinitionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
			setState(252);
			match(AS);
			setState(253);
			match(RECORD);
			setState(256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(254);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(255);
					structureType();
					}
					break;
				}
				}
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(260);
			match(END);
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
		enterRule(_localctx, 34, RULE_initVariable);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new ArrayInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				initArray();
				}
				break;
			case 2:
				_localctx = new RightInitialisationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
		enterRule(_localctx, 36, RULE_initArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LPAR);
			setState(268);
			initVariable();
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
					initVariable();
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
			setState(280);
			match(CONST);
			setState(281);
			match(ID);
			setState(282);
			match(AS);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(283);
				variableType();
				}
				break;
			case 2:
				{
				setState(284);
				structureType();
				}
				break;
			}
			setState(287);
			match(EQUAL);
			setState(288);
			initVariable();
			setState(289);
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
			setState(291);
			match(ENUM);
			setState(292);
			match(ID);
			setState(293);
			match(EQUAL);
			setState(294);
			match(LPAR);
			setState(295);
			match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				match(ID);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(RPAR);
			setState(304);
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
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public List<RightExprContext> rightExpr() {
			return getRuleContexts(RightExprContext.class);
		}
		public RightExprContext rightExpr(int i) {
			return getRuleContext(RightExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MULTI() { return getToken(PlayPlusParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(307);
				match(NOT);
				setState(308);
				rightExpr(23);
				}
				break;
			case 2:
				{
				_localctx = new IntegerExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(MINUS);
				setState(310);
				rightExpr(14);
				}
				break;
			case 3:
				{
				_localctx = new LeftExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				leftExpr(0);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new BooleanTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(TRUE);
				}
				break;
			case 6:
				{
				_localctx = new BooleanFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(FALSE);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(ID);
				setState(318);
				match(LPAR);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(319);
					rightExpr(0);
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(320);
						match(COMMA);
						setState(321);
						rightExpr(0);
						}
						}
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(329);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new ParenthesesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(LPAR);
				setState(331);
				rightExpr(0);
				setState(332);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(336);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(337);
						match(AND);
						setState(338);
						rightExpr(23);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(339);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(340);
						match(OR);
						setState(341);
						rightExpr(22);
						}
						break;
					case 3:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(342);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(343);
						match(EQUAL);
						setState(344);
						rightExpr(21);
						}
						break;
					case 4:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(345);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(346);
						match(LESS);
						setState(347);
						rightExpr(20);
						}
						break;
					case 5:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(348);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(349);
						match(LESS_EQUAL);
						setState(350);
						rightExpr(19);
						}
						break;
					case 6:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(351);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(352);
						match(GREAT);
						setState(353);
						rightExpr(18);
						}
						break;
					case 7:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(354);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(355);
						match(GREAT_EQUAL);
						setState(356);
						rightExpr(17);
						}
						break;
					case 8:
						{
						_localctx = new CompExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(357);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(358);
						match(NOT_EQUAL);
						setState(359);
						rightExpr(16);
						}
						break;
					case 9:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(360);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(361);
						match(PLUS);
						setState(362);
						rightExpr(14);
						}
						break;
					case 10:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(363);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(364);
						match(MINUS);
						setState(365);
						rightExpr(13);
						}
						break;
					case 11:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(366);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(367);
						match(MULTI);
						setState(368);
						rightExpr(12);
						}
						break;
					case 12:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(369);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(370);
						match(DIV);
						setState(371);
						rightExpr(11);
						}
						break;
					case 13:
						{
						_localctx = new IntegerExpressionContext(new RightExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rightExpr);
						setState(372);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(373);
						match(MOD);
						setState(374);
						rightExpr(10);
						}
						break;
					}
					} 
				}
				setState(379);
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
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				_localctx = new LeftIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(381);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new LeftArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(ID);
				setState(383);
				match(LBRA);
				setState(384);
				rightExpr(0);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(385);
					match(COMMA);
					setState(386);
					rightExpr(0);
					}
				}

				setState(389);
				match(RBRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LeftPropertyContext(new LeftExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_leftExpr);
					setState(393);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(394);
					match(T__0);
					setState(395);
					match(ID);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 46, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			leftExpr(0);
			setState(402);
			match(ASSIGN);
			setState(403);
			rightExpr(0);
			setState(404);
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
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterDigType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitDigType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitDigType(this);
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
	public static class FightTypeContext extends ActionTypeContext {
		public FightInstructionContext fightInstruction() {
			return getRuleContext(FightInstructionContext.class,0);
		}
		public FightTypeContext(ActionTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFightType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFightType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFightType(this);
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
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(LEFT);
				setState(407);
				match(LPAR);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(408);
					rightExpr(0);
					}
				}

				setState(411);
				match(RPAR);
				}
				break;
			case RIGHT:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(RIGHT);
				setState(413);
				match(LPAR);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(414);
					rightExpr(0);
					}
				}

				setState(417);
				match(RPAR);
				}
				break;
			case UP:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(UP);
				setState(419);
				match(LPAR);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (NUMBER - 14)) | (1L << (LPAR - 14)) | (1L << (MINUS - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (NOT - 14)) | (1L << (ID - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) {
					{
					setState(420);
					rightExpr(0);
					}
				}

				setState(423);
				match(RPAR);
				}
				break;
			case DOWN:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(DOWN);
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
			case JUMP:
				_localctx = new JumpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(430);
				match(JUMP);
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
			case FIGHT:
				_localctx = new FightTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				fightInstruction();
				}
				break;
			case DIG:
				_localctx = new DigTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
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
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public DigContext(DigInstructionContext ctx) { copyFrom(ctx); }
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

	public final DigInstructionContext digInstruction() throws RecognitionException {
		DigInstructionContext _localctx = new DigInstructionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_digInstruction);
		try {
			_localctx = new DigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(DIG);
			setState(441);
			match(LPAR);
			setState(442);
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
		public TerminalNode FIGHT() { return getToken(PlayPlusParser.FIGHT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public FightContext(FightInstructionContext ctx) { copyFrom(ctx); }
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

	public final FightInstructionContext fightInstruction() throws RecognitionException {
		FightInstructionContext _localctx = new FightInstructionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fightInstruction);
		try {
			_localctx = new FightContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FIGHT);
			setState(445);
			match(LPAR);
			setState(446);
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
		enterRule(_localctx, 54, RULE_ifBlock);
		int _la;
		try {
			_localctx = new IfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(IF);
			setState(449);
			match(LPAR);
			setState(450);
			rightExpr(0);
			setState(451);
			match(RPAR);
			setState(452);
			match(THEN);
			setState(454); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(453);
				inst();
				}
				}
				setState(456); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(458);
				match(ELSE);
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
				} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
				}
			}

			setState(466);
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
		enterRule(_localctx, 56, RULE_whileBlock);
		int _la;
		try {
			_localctx = new WhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(WHILE);
			setState(469);
			match(LPAR);
			setState(470);
			rightExpr(0);
			setState(471);
			match(RPAR);
			setState(472);
			match(DO);
			setState(474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(473);
				inst();
				}
				}
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(478);
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
		enterRule(_localctx, 58, RULE_repeatBlock);
		int _la;
		try {
			_localctx = new RepeatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(REPEAT);
			setState(482); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(481);
				inst();
				}
				}
				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (IF - 54)) | (1L << (WHILE - 54)) | (1L << (REPEAT - 54)) | (1L << (FOR - 54)) | (1L << (LEFT - 54)) | (1L << (RIGHT - 54)) | (1L << (UP - 54)) | (1L << (DOWN - 54)) | (1L << (JUMP - 54)) | (1L << (FIGHT - 54)) | (1L << (DIG - 54)) | (1L << (ID - 54)))) != 0) );
			setState(486);
			match(UNTIL);
			setState(487);
			match(LPAR);
			setState(488);
			rightExpr(0);
			setState(489);
			match(RPAR);
			setState(490);
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
		enterRule(_localctx, 60, RULE_forBlock);
		int _la;
		try {
			_localctx = new ForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(FOR);
			setState(493);
			match(ID);
			setState(494);
			match(ASSIGN);
			setState(495);
			rightExpr(0);
			setState(496);
			match(TO);
			setState(497);
			rightExpr(0);
			setState(498);
			match(DO);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u01fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\5\2C\n\2\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\6\4P\n\4"+
		"\r\4\16\4Q\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5c\n\5\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081"+
		"\13\b\3\b\3\b\3\b\3\b\7\b\u0087\n\b\f\b\16\b\u008a\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0093\n\t\3\t\3\t\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16"+
		"\t\u009b\3\t\3\t\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3"+
		"\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\r\7\r\u00bf\n\r\f\r\16\r"+
		"\u00c2\13\r\3\r\7\r\u00c5\n\r\f\r\16\r\u00c8\13\r\3\r\7\r\u00cb\n\r\f"+
		"\r\16\r\u00ce\13\r\5\r\u00d0\n\r\3\r\6\r\u00d3\n\r\r\r\16\r\u00d4\3\16"+
		"\3\16\3\16\3\16\5\16\u00db\n\16\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16"+
		"\17\u00e3\13\17\3\17\3\17\3\17\3\17\5\17\u00e9\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u00f0\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00f7\n\21\f\21\16"+
		"\21\u00fa\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u0103\n\22\r\22"+
		"\16\22\u0104\3\22\3\22\3\22\3\23\3\23\5\23\u010c\n\23\3\24\3\24\3\24\3"+
		"\24\7\24\u0112\n\24\f\24\16\24\u0115\13\24\5\24\u0117\n\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u0120\n\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u012d\n\26\f\26\16\26\u0130\13\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0145\n\27\f\27\16\27\u0148\13\27\5\27\u014a"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0151\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u017a\n\27\f\27\16\27\u017d\13\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0186\n\30\3\30\3\30\5\30\u018a"+
		"\n\30\3\30\3\30\3\30\7\30\u018f\n\30\f\30\16\30\u0192\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u019c\n\32\3\32\3\32\3\32\3\32\5\32"+
		"\u01a2\n\32\3\32\3\32\3\32\3\32\5\32\u01a8\n\32\3\32\3\32\3\32\3\32\5"+
		"\32\u01ae\n\32\3\32\3\32\3\32\3\32\5\32\u01b4\n\32\3\32\3\32\3\32\5\32"+
		"\u01b9\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\6\35\u01c9\n\35\r\35\16\35\u01ca\3\35\3\35\6\35\u01cf\n\35"+
		"\r\35\16\35\u01d0\5\35\u01d3\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\6\36\u01dd\n\36\r\36\16\36\u01de\3\36\3\36\3\37\3\37\6\37\u01e5\n"+
		"\37\r\37\16\37\u01e6\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \6 \u01f7\n \r \16 \u01f8\3 \3 \3 \2\4,.!\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\3\4\2$$GG\u023c\2B\3\2\2\2"+
		"\4G\3\2\2\2\6J\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fo\3\2\2\2\16t\3\2\2\2\20"+
		"\u008d\3\2\2\2\22\u009f\3\2\2\2\24\u00a7\3\2\2\2\26\u00bb\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00da\3\2\2\2\34\u00dc\3\2\2\2\36\u00ef\3\2\2\2 \u00f1\3\2"+
		"\2\2\"\u00fd\3\2\2\2$\u010b\3\2\2\2&\u010d\3\2\2\2(\u011a\3\2\2\2*\u0125"+
		"\3\2\2\2,\u0150\3\2\2\2.\u0189\3\2\2\2\60\u0193\3\2\2\2\62\u01b8\3\2\2"+
		"\2\64\u01ba\3\2\2\2\66\u01be\3\2\2\28\u01c2\3\2\2\2:\u01d6\3\2\2\2<\u01e2"+
		"\3\2\2\2>\u01ee\3\2\2\2@C\5\4\3\2AC\5\n\6\2B@\3\2\2\2BA\3\2\2\2C\3\3\2"+
		"\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3"+
		"\2\2\2JK\7\4\2\2KL\7\17\2\2LM\7\20\2\2MO\7\20\2\2NP\5\b\5\2ON\3\2\2\2"+
		"PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7\2\2\3TS\3\2\2\2TU\3\2\2\2"+
		"U\7\3\2\2\2Vc\7\5\2\2Wc\7\6\2\2Xc\7\7\2\2Yc\7\b\2\2Zc\7\t\2\2[c\7\n\2"+
		"\2\\c\7\13\2\2]c\7\f\2\2^c\7\r\2\2_c\7\16\2\2`c\7\22\2\2ac\7\21\2\2bV"+
		"\3\2\2\2bW\3\2\2\2bX\3\2\2\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2"+
		"b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\t\3\2\2\2di\5\f\7"+
		"\2eh\5\32\16\2fh\5\20\t\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\16\b\2mn\7\2\2\3n\13\3\2\2\2op\7\25\2\2"+
		"pq\7\37\2\2qr\7\26\2\2rs\7\37\2\2s\r\3\2\2\2tu\7\"\2\2uv\7\35\2\2vw\7"+
		"#\2\2wx\7\27\2\2xy\7\30\2\2yz\7\17\2\2z{\7$\2\2{\177\7%\2\2|~\5\26\f\2"+
		"}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5\64\33\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0087\u008a\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7&\2\2\u008c\17\3\2\2\2\u008d\u008e\7I\2\2"+
		"\u008e\u008f\7\35\2\2\u008f\u0090\7#\2\2\u0090\u0092\7\27\2\2\u0091\u0093"+
		"\5\22\n\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\7\30\2\2\u0095\u0096\7\17\2\2\u0096\u0097\t\2\2\2\u0097\u0099"+
		"\7%\2\2\u0098\u009a\5\30\r\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7&"+
		"\2\2\u009e\21\3\2\2\2\u009f\u00a4\5\24\13\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00ac\7I\2\2\u00a8\u00a9\7\31\2\2\u00a9\u00ab\7I\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\5"+
		"\36\20\2\u00b1\25\3\2\2\2\u00b2\u00bc\5\34\17\2\u00b3\u00bc\5\60\31\2"+
		"\u00b4\u00b5\5\62\32\2\u00b5\u00b6\7\32\2\2\u00b6\u00bc\3\2\2\2\u00b7"+
		"\u00bc\58\35\2\u00b8\u00bc\5:\36\2\u00b9\u00bc\5<\37\2\u00ba\u00bc\5>"+
		" \2\u00bb\u00b2\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\27\3\2\2\2\u00bd\u00bf\5*\26\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00d0\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c5\5(\25\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00d0\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00cc\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\5\26\f\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\31\3\2\2\2\u00d6\u00db\5\34\17\2\u00d7\u00db\5(\25\2\u00d8"+
		"\u00db\5*\26\2\u00d9\u00db\5\"\22\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\33\3\2\2\2\u00dc"+
		"\u00e1\7I\2\2\u00dd\u00de\7\31\2\2\u00de\u00e0\7I\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e8\5"+
		"\36\20\2\u00e6\u00e7\7\36\2\2\u00e7\u00e9\5$\23\2\u00e8\u00e6\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\32\2\2\u00eb\35"+
		"\3\2\2\2\u00ec\u00f0\7G\2\2\u00ed\u00f0\5 \21\2\u00ee\u00f0\5\"\22\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\37\3\2\2"+
		"\2\u00f1\u00f2\7G\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00f8\7\20\2\2\u00f4"+
		"\u00f5\7\31\2\2\u00f5\u00f7\7\20\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7I\2\2"+
		"\u00fe\u00ff\7\35\2\2\u00ff\u0102\7H\2\2\u0100\u0103\5\34\17\2\u0101\u0103"+
		"\5\"\22\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107"+
		"\7&\2\2\u0107\u0108\7\32\2\2\u0108#\3\2\2\2\u0109\u010c\5&\24\2\u010a"+
		"\u010c\5,\27\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c%\3\2\2\2"+
		"\u010d\u010e\7\27\2\2\u010e\u0116\5$\23\2\u010f\u0110\7\31\2\2\u0110\u0112"+
		"\5$\23\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\30\2\2\u0119"+
		"\'\3\2\2\2\u011a\u011b\7\'\2\2\u011b\u011c\7I\2\2\u011c\u011f\7\35\2\2"+
		"\u011d\u0120\5\36\20\2\u011e\u0120\5\"\22\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\36\2\2\u0122\u0123\5"+
		"$\23\2\u0123\u0124\7\32\2\2\u0124)\3\2\2\2\u0125\u0126\7(\2\2\u0126\u0127"+
		"\7I\2\2\u0127\u0128\7\36\2\2\u0128\u0129\7\27\2\2\u0129\u012e\7I\2\2\u012a"+
		"\u012b\7\31\2\2\u012b\u012d\7I\2\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\7\30\2\2\u0132\u0133\7\32\2\2\u0133+\3\2\2"+
		"\2\u0134\u0135\b\27\1\2\u0135\u0136\7\62\2\2\u0136\u0151\5,\27\31\u0137"+
		"\u0138\7*\2\2\u0138\u0151\5,\27\20\u0139\u0151\5.\30\2\u013a\u0151\7\20"+
		"\2\2\u013b\u0151\7.\2\2\u013c\u0151\7/\2\2\u013d\u0151\7J\2\2\u013e\u0151"+
		"\7K\2\2\u013f\u0140\7I\2\2\u0140\u0149\7\27\2\2\u0141\u0146\5,\27\2\u0142"+
		"\u0143\7\31\2\2\u0143\u0145\5,\27\2\u0144\u0142\3\2\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u0151\7\30\2\2\u014c\u014d\7\27\2\2\u014d\u014e\5,\27\2\u014e"+
		"\u014f\7\30\2\2\u014f\u0151\3\2\2\2\u0150\u0134\3\2\2\2\u0150\u0137\3"+
		"\2\2\2\u0150\u0139\3\2\2\2\u0150\u013a\3\2\2\2\u0150\u013b\3\2\2\2\u0150"+
		"\u013c\3\2\2\2\u0150\u013d\3\2\2\2\u0150\u013e\3\2\2\2\u0150\u013f\3\2"+
		"\2\2\u0150\u014c\3\2\2\2\u0151\u017b\3\2\2\2\u0152\u0153\f\30\2\2\u0153"+
		"\u0154\7\60\2\2\u0154\u017a\5,\27\31\u0155\u0156\f\27\2\2\u0156\u0157"+
		"\7\61\2\2\u0157\u017a\5,\27\30\u0158\u0159\f\26\2\2\u0159\u015a\7\36\2"+
		"\2\u015a\u017a\5,\27\27\u015b\u015c\f\25\2\2\u015c\u015d\7\63\2\2\u015d"+
		"\u017a\5,\27\26\u015e\u015f\f\24\2\2\u015f\u0160\7\64\2\2\u0160\u017a"+
		"\5,\27\25\u0161\u0162\f\23\2\2\u0162\u0163\7\65\2\2\u0163\u017a\5,\27"+
		"\24\u0164\u0165\f\22\2\2\u0165\u0166\7\66\2\2\u0166\u017a\5,\27\23\u0167"+
		"\u0168\f\21\2\2\u0168\u0169\7\67\2\2\u0169\u017a\5,\27\22\u016a\u016b"+
		"\f\17\2\2\u016b\u016c\7)\2\2\u016c\u017a\5,\27\20\u016d\u016e\f\16\2\2"+
		"\u016e\u016f\7*\2\2\u016f\u017a\5,\27\17\u0170\u0171\f\r\2\2\u0171\u0172"+
		"\7+\2\2\u0172\u017a\5,\27\16\u0173\u0174\f\f\2\2\u0174\u0175\7,\2\2\u0175"+
		"\u017a\5,\27\r\u0176\u0177\f\13\2\2\u0177\u0178\7-\2\2\u0178\u017a\5,"+
		"\27\f\u0179\u0152\3\2\2\2\u0179\u0155\3\2\2\2\u0179\u0158\3\2\2\2\u0179"+
		"\u015b\3\2\2\2\u0179\u015e\3\2\2\2\u0179\u0161\3\2\2\2\u0179\u0164\3\2"+
		"\2\2\u0179\u0167\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016d\3\2\2\2\u0179"+
		"\u0170\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c-\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u017f\b\30\1\2\u017f\u018a\7I\2\2\u0180\u0181\7I\2\2\u0181"+
		"\u0182\7\34\2\2\u0182\u0185\5,\27\2\u0183\u0184\7\31\2\2\u0184\u0186\5"+
		",\27\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\7\33\2\2\u0188\u018a\3\2\2\2\u0189\u017e\3\2\2\2\u0189\u0180\3"+
		"\2\2\2\u018a\u0190\3\2\2\2\u018b\u018c\f\3\2\2\u018c\u018d\7\3\2\2\u018d"+
		"\u018f\7I\2\2\u018e\u018b\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191/\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194"+
		"\5.\30\2\u0194\u0195\7!\2\2\u0195\u0196\5,\27\2\u0196\u0197\7\32\2\2\u0197"+
		"\61\3\2\2\2\u0198\u0199\7@\2\2\u0199\u019b\7\27\2\2\u019a\u019c\5,\27"+
		"\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01b9"+
		"\7\30\2\2\u019e\u019f\7A\2\2\u019f\u01a1\7\27\2\2\u01a0\u01a2\5,\27\2"+
		"\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01b9"+
		"\7\30\2\2\u01a4\u01a5\7B\2\2\u01a5\u01a7\7\27\2\2\u01a6\u01a8\5,\27\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01b9"+
		"\7\30\2\2\u01aa\u01ab\7C\2\2\u01ab\u01ad\7\27\2\2\u01ac\u01ae\5,\27\2"+
		"\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b9"+
		"\7\30\2\2\u01b0\u01b1\7D\2\2\u01b1\u01b3\7\27\2\2\u01b2\u01b4\5,\27\2"+
		"\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9"+
		"\7\30\2\2\u01b6\u01b9\5\66\34\2\u01b7\u01b9\5\64\33\2\u01b8\u0198\3\2"+
		"\2\2\u01b8\u019e\3\2\2\2\u01b8\u01a4\3\2\2\2\u01b8\u01aa\3\2\2\2\u01b8"+
		"\u01b0\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\63\3\2\2"+
		"\2\u01ba\u01bb\7F\2\2\u01bb\u01bc\7\27\2\2\u01bc\u01bd\7\30\2\2\u01bd"+
		"\65\3\2\2\2\u01be\u01bf\7E\2\2\u01bf\u01c0\7\27\2\2\u01c0\u01c1\7\30\2"+
		"\2\u01c1\67\3\2\2\2\u01c2\u01c3\78\2\2\u01c3\u01c4\7\27\2\2\u01c4\u01c5"+
		"\5,\27\2\u01c5\u01c6\7\30\2\2\u01c6\u01c8\7<\2\2\u01c7\u01c9\5\26\f\2"+
		"\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01d2\3\2\2\2\u01cc\u01ce\7=\2\2\u01cd\u01cf\5\26\f\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\7&\2\2\u01d59\3\2\2\2\u01d6\u01d7\79\2\2\u01d7"+
		"\u01d8\7\27\2\2\u01d8\u01d9\5,\27\2\u01d9\u01da\7\30\2\2\u01da\u01dc\7"+
		"%\2\2\u01db\u01dd\5\26\f\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7&"+
		"\2\2\u01e1;\3\2\2\2\u01e2\u01e4\7>\2\2\u01e3\u01e5\5\26\f\2\u01e4\u01e3"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\7;\2\2\u01e9\u01ea\7\27\2\2\u01ea\u01eb\5,"+
		"\27\2\u01eb\u01ec\7\30\2\2\u01ec\u01ed\7&\2\2\u01ed=\3\2\2\2\u01ee\u01ef"+
		"\7?\2\2\u01ef\u01f0\7I\2\2\u01f0\u01f1\7!\2\2\u01f1\u01f2\5,\27\2\u01f2"+
		"\u01f3\7:\2\2\u01f3\u01f4\5,\27\2\u01f4\u01f6\7%\2\2\u01f5\u01f7\5\26"+
		"\f\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\7&\2\2\u01fb?\3\2\2\2\65"+
		"BGQTbgi\177\u0088\u0092\u009b\u00a4\u00ac\u00bb\u00c0\u00c6\u00cc\u00cf"+
		"\u00d4\u00da\u00e1\u00e8\u00ef\u00f8\u0102\u0104\u010b\u0113\u0116\u011f"+
		"\u012e\u0146\u0149\u0150\u0179\u017b\u0185\u0189\u0190\u019b\u01a1\u01a7"+
		"\u01ad\u01b3\u01b8\u01ca\u01d0\u01d2\u01de\u01e6\u01f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}