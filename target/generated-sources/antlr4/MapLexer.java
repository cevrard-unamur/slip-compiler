// Generated from Map.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", "CASK", 
		"WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS"
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


	public MapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Map.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16E\n"+
		"\16\r\16\16\16F\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21Q\n\21\f\21"+
		"\16\21T\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22_\n\22"+
		"\f\22\16\22b\13\22\3\22\3\22\5\22f\n\22\3\22\5\22i\n\22\3\22\3\22\3\23"+
		"\5\23n\n\23\3\23\3\23\3\23\3\23\3\24\6\24u\n\24\r\24\16\24v\3\24\3\24"+
		"\4R`\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\2\37\2!\20#\21%\22\'\23\3\2\4\4\2C\\c|\4\2\13\13\"\"~\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2"+
		"\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67"+
		"\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33"+
		"D\3\2\2\2\35H\3\2\2\2\37J\3\2\2\2!L\3\2\2\2#Z\3\2\2\2%m\3\2\2\2\'t\3\2"+
		"\2\2)*\7o\2\2*+\7c\2\2+,\7r\2\2,\4\3\2\2\2-.\7B\2\2.\6\3\2\2\2/\60\7Z"+
		"\2\2\60\b\3\2\2\2\61\62\7I\2\2\62\n\3\2\2\2\63\64\7R\2\2\64\f\3\2\2\2"+
		"\65\66\7C\2\2\66\16\3\2\2\2\678\7D\2\28\20\3\2\2\29:\7V\2\2:\22\3\2\2"+
		"\2;<\7U\2\2<\24\3\2\2\2=>\7a\2\2>\26\3\2\2\2?@\7S\2\2@\30\3\2\2\2AB\7"+
		"<\2\2B\32\3\2\2\2CE\5\37\20\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\34\3\2\2\2HI\t\2\2\2I\36\3\2\2\2JK\4\62;\2K \3\2\2\2LM\7\61\2\2MN\7"+
		",\2\2NR\3\2\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3"+
		"\2\2\2TR\3\2\2\2UV\7,\2\2VW\7\61\2\2WX\3\2\2\2XY\b\21\2\2Y\"\3\2\2\2Z"+
		"[\7\61\2\2[\\\7\61\2\2\\`\3\2\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2"+
		"\2\2`^\3\2\2\2ae\3\2\2\2b`\3\2\2\2cf\5%\23\2df\7\2\2\3ec\3\2\2\2ed\3\2"+
		"\2\2fh\3\2\2\2gi\7\2\2\3hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\22\2\2k$\3"+
		"\2\2\2ln\7\17\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\f\2\2pq\3\2\2\2qr"+
		"\b\23\2\2r&\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\b\24\2\2y(\3\2\2\2\n\2FR`ehmv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}