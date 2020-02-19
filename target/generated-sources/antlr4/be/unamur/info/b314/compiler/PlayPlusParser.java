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
		IMPORT=1, QUOTE=2, MAPFILE=3, MAIN=4, AS=5, FUNCTION=6, LPAR=7, RPAR=8, 
		COLON=9, VOID=10, DO=11, END=12, ID=13, NUMBER=14, COMMENT=15, NEWLINE=16, 
		WS=17;
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_mapImport = 2, RULE_mainFunction = 3;
	public static final String[] ruleNames = {
		"root", "programme", "mapImport", "mainFunction"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", "'\"'", null, "'main'", "'as'", "'function'", "'('", 
		"')'", "':'", "'void'", "'do'", "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "QUOTE", "MAPFILE", "MAIN", "AS", "FUNCTION", "LPAR", 
		"RPAR", "COLON", "VOID", "DO", "END", "ID", "NUMBER", "COMMENT", "NEWLINE", 
		"WS"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			programme();
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
		public List<TerminalNode> COMMENT() { return getTokens(PlayPlusParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(PlayPlusParser.COMMENT, i);
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
		enterRule(_localctx, 2, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			mapImport();
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT) {
					{
					{
					setState(11);
					match(COMMENT);
					}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(19);
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
		enterRule(_localctx, 4, RULE_mapImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(IMPORT);
			setState(22);
			match(QUOTE);
			setState(23);
			match(MAPFILE);
			setState(24);
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
		enterRule(_localctx, 6, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(MAIN);
			setState(27);
			match(AS);
			setState(28);
			match(FUNCTION);
			setState(29);
			match(LPAR);
			setState(30);
			match(RPAR);
			setState(31);
			match(COLON);
			setState(32);
			match(VOID);
			setState(33);
			match(DO);
			setState(34);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\7\3\17\n\3\f\3\16\3\22\13\3\5\3\24"+
		"\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\2\2\6\2\4\6\b\2\2$\2\n\3\2\2\2\4\f\3\2\2\2\6\27\3\2\2\2\b\34\3"+
		"\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\23\5\6\4\2\r\17\7\21\2\2\16\r\3\2\2"+
		"\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2"+
		"\2\23\20\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\5\b\5\2\26\5\3\2\2"+
		"\2\27\30\7\3\2\2\30\31\7\4\2\2\31\32\7\5\2\2\32\33\7\4\2\2\33\7\3\2\2"+
		"\2\34\35\7\6\2\2\35\36\7\7\2\2\36\37\7\b\2\2\37 \7\t\2\2 !\7\n\2\2!\""+
		"\7\13\2\2\"#\7\f\2\2#$\7\r\2\2$%\7\16\2\2%\t\3\2\2\2\4\20\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}