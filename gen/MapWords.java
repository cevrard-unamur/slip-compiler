// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/MapWords.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, NUMBER=12, COMMENT_MULTILINE=13, COMMENT_SINGLELINE=14, 
		NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", "CASK", 
			"WELL", "EMPTY", "SQUELETON", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", 
			"COMMENT_SINGLELINE", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
			"'_'", "'Q'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
			"CASK", "WELL", "EMPTY", "SQUELETON", "NUMBER", "COMMENT_MULTILINE", 
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


	public MapWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MapWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rA\n\r\r\r\16\rB\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20M\n\20\f\20\16\20P\13\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21[\n\21\f\21\16\21^\13\21\3\21"+
		"\3\21\3\21\3\21\3\22\5\22e\n\22\3\22\3\22\3\22\3\22\3\23\6\23l\n\23\r"+
		"\23\16\23m\3\23\3\23\4N\\\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\2\35\2\37\17!\20#\21%\22\3\2\4\4\2C\\c|\4\2\13\13"+
		"\"\"\2s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'"+
		"\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17"+
		"\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31@\3\2"+
		"\2\2\33D\3\2\2\2\35F\3\2\2\2\37H\3\2\2\2!V\3\2\2\2#d\3\2\2\2%k\3\2\2\2"+
		"\'(\7o\2\2()\7c\2\2)*\7r\2\2*\4\3\2\2\2+,\7B\2\2,\6\3\2\2\2-.\7Z\2\2."+
		"\b\3\2\2\2/\60\7I\2\2\60\n\3\2\2\2\61\62\7R\2\2\62\f\3\2\2\2\63\64\7C"+
		"\2\2\64\16\3\2\2\2\65\66\7D\2\2\66\20\3\2\2\2\678\7V\2\28\22\3\2\2\29"+
		":\7U\2\2:\24\3\2\2\2;<\7a\2\2<\26\3\2\2\2=>\7S\2\2>\30\3\2\2\2?A\5\35"+
		"\17\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\32\3\2\2\2DE\t\2\2\2E\34"+
		"\3\2\2\2FG\4\62;\2G\36\3\2\2\2HI\7\61\2\2IJ\7,\2\2JN\3\2\2\2KM\13\2\2"+
		"\2LK\3\2\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7,\2"+
		"\2RS\7\61\2\2ST\3\2\2\2TU\b\20\2\2U \3\2\2\2VW\7\61\2\2WX\7\61\2\2X\\"+
		"\3\2\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_`\5#\22\2`a\3\2\2\2ab\b\21\2\2b\"\3\2\2\2ce\7\17\2\2dc\3"+
		"\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\f\2\2gh\3\2\2\2hi\b\22\2\2i$\3\2\2\2jl"+
		"\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\23\2\2"+
		"p&\3\2\2\2\b\2BN\\dm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}