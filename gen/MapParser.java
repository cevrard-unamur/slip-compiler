// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Map.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17;
	public static final int
		RULE_map = 0, RULE_mapStructure = 1, RULE_mapSymbols = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"map", "mapStructure", "mapSymbols"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
			"'_'", "'Q'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
			"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
			"COMMENT_SINGLELINE", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Map.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof MapListener ) ((MapListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAP) {
				{
				{
				setState(6);
				mapStructure();
				}
				}
				setState(11);
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
		public TerminalNode MAP() { return getToken(MapParser.MAP, 0); }
		public TerminalNode COLON() { return getToken(MapParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(MapParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MapParser.NUMBER, i);
		}
		public TerminalNode EOF() { return getToken(MapParser.EOF, 0); }
		public List<MapSymbolsContext> mapSymbols() {
			return getRuleContexts(MapSymbolsContext.class);
		}
		public MapSymbolsContext mapSymbols(int i) {
			return getRuleContext(MapSymbolsContext.class,i);
		}
		public MapDescriptionContext(MapStructureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterMapDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitMapDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitMapDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapStructureContext mapStructure() throws RecognitionException {
		MapStructureContext _localctx = new MapStructureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapStructure);
		int _la;
		try {
			_localctx = new MapDescriptionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(12);
			match(MAP);
			setState(13);
			match(COLON);
			setState(14);
			match(NUMBER);
			setState(15);
			match(NUMBER);
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				mapSymbols();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT) | (1L << CHEST) | (1L << GRASS) | (1L << PALMTREE) | (1L << BRIDGE) | (1L << BUSH) | (1L << CASK) | (1L << WELL) | (1L << EMPTY) | (1L << SQUELETON) | (1L << COMMENT_MULTILINE) | (1L << COMMENT_SINGLELINE))) != 0) );
			}
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(21);
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
		public TerminalNode ROBOT() { return getToken(MapParser.ROBOT, 0); }
		public RobotContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterRobot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitRobot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitRobot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PalmtreeContext extends MapSymbolsContext {
		public TerminalNode PALMTREE() { return getToken(MapParser.PALMTREE, 0); }
		public PalmtreeContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterPalmtree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitPalmtree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitPalmtree(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChestContext extends MapSymbolsContext {
		public TerminalNode CHEST() { return getToken(MapParser.CHEST, 0); }
		public ChestContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterChest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitChest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitChest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentMultiContext extends MapSymbolsContext {
		public TerminalNode COMMENT_MULTILINE() { return getToken(MapParser.COMMENT_MULTILINE, 0); }
		public CommentMultiContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterCommentMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitCommentMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitCommentMulti(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrassContext extends MapSymbolsContext {
		public TerminalNode GRASS() { return getToken(MapParser.GRASS, 0); }
		public GrassContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterGrass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitGrass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitGrass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BushContext extends MapSymbolsContext {
		public TerminalNode BUSH() { return getToken(MapParser.BUSH, 0); }
		public BushContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterBush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitBush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitBush(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaskContext extends MapSymbolsContext {
		public TerminalNode CASK() { return getToken(MapParser.CASK, 0); }
		public CaskContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterCask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitCask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitCask(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WellContext extends MapSymbolsContext {
		public TerminalNode WELL() { return getToken(MapParser.WELL, 0); }
		public WellContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterWell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitWell(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitWell(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqueletonContext extends MapSymbolsContext {
		public TerminalNode SQUELETON() { return getToken(MapParser.SQUELETON, 0); }
		public SqueletonContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterSqueleton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitSqueleton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitSqueleton(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BridgeContext extends MapSymbolsContext {
		public TerminalNode BRIDGE() { return getToken(MapParser.BRIDGE, 0); }
		public BridgeContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterBridge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitBridge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitBridge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends MapSymbolsContext {
		public TerminalNode EMPTY() { return getToken(MapParser.EMPTY, 0); }
		public EmptyContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentSingleContext extends MapSymbolsContext {
		public TerminalNode COMMENT_SINGLELINE() { return getToken(MapParser.COMMENT_SINGLELINE, 0); }
		public CommentSingleContext(MapSymbolsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterCommentSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitCommentSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitCommentSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapSymbolsContext mapSymbols() throws RecognitionException {
		MapSymbolsContext _localctx = new MapSymbolsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapSymbols);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROBOT:
				_localctx = new RobotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(ROBOT);
				}
				break;
			case CHEST:
				_localctx = new ChestContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(CHEST);
				}
				break;
			case GRASS:
				_localctx = new GrassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(GRASS);
				}
				break;
			case PALMTREE:
				_localctx = new PalmtreeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(PALMTREE);
				}
				break;
			case BRIDGE:
				_localctx = new BridgeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(BRIDGE);
				}
				break;
			case BUSH:
				_localctx = new BushContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				match(BUSH);
				}
				break;
			case CASK:
				_localctx = new CaskContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(30);
				match(CASK);
				}
				break;
			case WELL:
				_localctx = new WellContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(31);
				match(WELL);
				}
				break;
			case EMPTY:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(32);
				match(EMPTY);
				}
				break;
			case SQUELETON:
				_localctx = new SqueletonContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(33);
				match(SQUELETON);
				}
				break;
			case COMMENT_SINGLELINE:
				_localctx = new CommentSingleContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(34);
				match(COMMENT_SINGLELINE);
				}
				break;
			case COMMENT_MULTILINE:
				_localctx = new CommentMultiContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(35);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\3\3\6\3\24\n"+
		"\3\r\3\16\3\25\3\3\5\3\31\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\'\n\4\3\4\2\2\5\2\4\6\2\2\2\63\2\13\3\2\2\2\4\16\3\2\2\2"+
		"\6&\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2"+
		"\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17\7\3\2\2\17\20\7\16\2\2\20\21\7\17"+
		"\2\2\21\23\7\17\2\2\22\24\5\6\4\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3"+
		"\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\7\2\2\3\30\27\3\2\2\2\30\31\3"+
		"\2\2\2\31\5\3\2\2\2\32\'\7\4\2\2\33\'\7\5\2\2\34\'\7\6\2\2\35\'\7\7\2"+
		"\2\36\'\7\b\2\2\37\'\7\t\2\2 \'\7\n\2\2!\'\7\13\2\2\"\'\7\f\2\2#\'\7\r"+
		"\2\2$\'\7\21\2\2%\'\7\20\2\2&\32\3\2\2\2&\33\3\2\2\2&\34\3\2\2\2&\35\3"+
		"\2\2\2&\36\3\2\2\2&\37\3\2\2\2& \3\2\2\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2"+
		"\2&$\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2\6\13\25\30&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}