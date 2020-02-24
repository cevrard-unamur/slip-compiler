// Generated from Map.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17;
	public static final int
		RULE_map = 0, RULE_mapDescription = 1, RULE_mapSymbols = 2;
	public static final String[] ruleNames = {
		"map", "mapDescription", "mapSymbols"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
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
				mapDescription();
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

	public static class MapDescriptionContext extends ParserRuleContext {
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
		public MapDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDescription; }
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

	public final MapDescriptionContext mapDescription() throws RecognitionException {
		MapDescriptionContext _localctx = new MapDescriptionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapDescription);
		int _la;
		try {
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
		public TerminalNode ROBOT() { return getToken(MapParser.ROBOT, 0); }
		public TerminalNode CHEST() { return getToken(MapParser.CHEST, 0); }
		public TerminalNode GRASS() { return getToken(MapParser.GRASS, 0); }
		public TerminalNode PALMTREE() { return getToken(MapParser.PALMTREE, 0); }
		public TerminalNode BRIDGE() { return getToken(MapParser.BRIDGE, 0); }
		public TerminalNode BUSH() { return getToken(MapParser.BUSH, 0); }
		public TerminalNode CASK() { return getToken(MapParser.CASK, 0); }
		public TerminalNode WELL() { return getToken(MapParser.WELL, 0); }
		public TerminalNode EMPTY() { return getToken(MapParser.EMPTY, 0); }
		public TerminalNode SQUELETON() { return getToken(MapParser.SQUELETON, 0); }
		public TerminalNode COMMENT_SINGLELINE() { return getToken(MapParser.COMMENT_SINGLELINE, 0); }
		public TerminalNode COMMENT_MULTILINE() { return getToken(MapParser.COMMENT_MULTILINE, 0); }
		public MapSymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSymbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).enterMapSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MapListener ) ((MapListener)listener).exitMapSymbols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MapVisitor ) return ((MapVisitor<? extends T>)visitor).visitMapSymbols(this);
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
			setState(24);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\3\3\3\3\3\3\3\3\3\6\3\24"+
		"\n\3\r\3\16\3\25\3\3\5\3\31\n\3\3\4\3\4\3\4\2\2\5\2\4\6\2\3\4\2\4\r\20"+
		"\21\34\2\13\3\2\2\2\4\16\3\2\2\2\6\32\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2"+
		"\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\13\3\2\2\2\16\17"+
		"\7\3\2\2\17\20\7\16\2\2\20\21\7\17\2\2\21\23\7\17\2\2\22\24\5\6\4\2\23"+
		"\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27"+
		"\31\7\2\2\3\30\27\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\t\2\2\2\33"+
		"\7\3\2\2\2\5\13\25\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}