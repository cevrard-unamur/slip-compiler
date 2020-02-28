// Generated from tmp/LanguageWords.g4 by ANTLR 4.6
package tmp;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, MAPFILE=2, LPAR=3, RPAR=4, COMMA=5, SEMICOLON=6, RBRA=7, LBRA=8, 
		AS=9, EQUAL=10, QUOTE=11, SINGLE_QUOTE=12, ASSIGN=13, MAIN=14, FUNCTION=15, 
		VOID=16, DO=17, END=18, CONST=19, ENUM=20, PLUS=21, MINUS=22, MULTI=23, 
		DIV=24, MOD=25, TRUE=26, FALSE=27, AND=28, OR=29, NOT=30, LESS=31, LESS_EQUAL=32, 
		GREAT=33, GREAT_EQUAL=34, NOT_EQUAL=35, LEFT=36, RIGHT=37, UP=38, DOWN=39, 
		JUMP=40, FIGHT=41, DIG=42, SCALAR=43, RECORD=44, ID=45, STRING=46, CHAR=47, 
		COLON=48, NUMBER=49, COMMENT_MULTILINE=50, COMMENT_SINGLELINE=51, NEWLINE=52, 
		WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", 
		"AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", 
		"LETTER", "DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", 
		"'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", 
		"'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", 
		"'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'", 
		null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", 
		"DIG", "SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", 
		"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
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


	public LanguageWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LanguageWords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u0183\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\5,\u0124\n,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\7.\u0130\n.\f.\16.\u0133"+
		"\13.\3/\3/\3/\3/\3/\5/\u013a\n/\3/\7/\u013d\n/\f/\16/\u0140\13/\3/\3/"+
		"\3\60\3\60\3\60\5\60\u0147\n\60\3\60\3\60\3\61\3\61\3\62\6\62\u014e\n"+
		"\62\r\62\16\62\u014f\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u015a"+
		"\n\65\f\65\16\65\u015d\13\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\7\66\u0168\n\66\f\66\16\66\u016b\13\66\3\66\3\66\5\66\u016f\n\66\3"+
		"\66\5\66\u0172\n\66\3\66\3\66\3\67\5\67\u0177\n\67\3\67\3\67\3\67\3\67"+
		"\38\68\u017e\n8\r8\168\u017f\38\38\4\u015b\u0169\29\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\64k\65m\66o\67\3\2\4\4\2\13\13"+
		"\"\"\4\2C\\c|\u0192\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\3q\3\2\2\2\5\177\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13"+
		"\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3"+
		"\2\2\2\35\u009d\3\2\2\2\37\u00a2\3\2\2\2!\u00ab\3\2\2\2#\u00b0\3\2\2\2"+
		"%\u00b3\3\2\2\2\'\u00b7\3\2\2\2)\u00bd\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3"+
		"\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00cc\3\2\2"+
		"\2\67\u00d1\3\2\2\29\u00d7\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2?\u00e2"+
		"\3\2\2\2A\u00e4\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G\u00ec\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f4\3\2\2\2M\u00fa\3\2\2\2O\u00fd\3\2\2\2Q\u0102\3\2"+
		"\2\2S\u0107\3\2\2\2U\u010d\3\2\2\2W\u0123\3\2\2\2Y\u0125\3\2\2\2[\u012c"+
		"\3\2\2\2]\u0134\3\2\2\2_\u0143\3\2\2\2a\u014a\3\2\2\2c\u014d\3\2\2\2e"+
		"\u0151\3\2\2\2g\u0153\3\2\2\2i\u0155\3\2\2\2k\u0163\3\2\2\2m\u0176\3\2"+
		"\2\2o\u017d\3\2\2\2qu\7%\2\2rt\5o8\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7k\2\2yz\7o\2\2z{\7r\2\2{|\7q\2\2|}\7t\2"+
		"\2}~\7v\2\2~\4\3\2\2\2\177\u0080\5[.\2\u0080\u0081\7\60\2\2\u0081\u0082"+
		"\7o\2\2\u0082\u0083\7c\2\2\u0083\u0084\7r\2\2\u0084\6\3\2\2\2\u0085\u0086"+
		"\7*\2\2\u0086\b\3\2\2\2\u0087\u0088\7+\2\2\u0088\n\3\2\2\2\u0089\u008a"+
		"\7.\2\2\u008a\f\3\2\2\2\u008b\u008c\7=\2\2\u008c\16\3\2\2\2\u008d\u008e"+
		"\7_\2\2\u008e\20\3\2\2\2\u008f\u0090\7]\2\2\u0090\22\3\2\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7u\2\2\u0093\24\3\2\2\2\u0094\u0095\7?\2\2\u0095\26"+
		"\3\2\2\2\u0096\u0097\7$\2\2\u0097\30\3\2\2\2\u0098\u0099\7)\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\7<\2\2\u009b\u009c\7?\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\7o\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\36\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7"+
		"p\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7p\2\2\u00aa \3\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7f\2\2\u00af\"\3\2\2\2\u00b0\u00b1"+
		"\7f\2\2\u00b1\u00b2\7q\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7f\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7w\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3,\3\2\2\2\u00c4\u00c5"+
		"\7/\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7\60\3\2\2\2\u00c8\u00c9"+
		"\7\61\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7\'\2\2\u00cb\64\3\2\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d0\66\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7"+
		"n\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d68\3\2\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da:\3\2\2\2\u00db\u00dc"+
		"\7q\2\2\u00dc\u00dd\7t\2\2\u00dd<\3\2\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7v\2\2\u00e1>\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3@\3"+
		"\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6B\3\2\2\2\u00e7\u00e8"+
		"\7@\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea\u00eb\7?\2\2\u00ebF\3"+
		"\2\2\2\u00ec\u00ed\7>\2\2\u00ed\u00ee\7@\2\2\u00eeH\3\2\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7v\2\2\u00f3"+
		"J\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7i\2\2\u00f7"+
		"\u00f8\7j\2\2\u00f8\u00f9\7v\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7w\2\2\u00fb"+
		"\u00fc\7r\2\2\u00fcN\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7y\2\2\u0100\u0101\7p\2\2\u0101P\3\2\2\2\u0102\u0103\7l\2\2\u0103"+
		"\u0104\7w\2\2\u0104\u0105\7o\2\2\u0105\u0106\7r\2\2\u0106R\3\2\2\2\u0107"+
		"\u0108\7h\2\2\u0108\u0109\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b\7j\2\2"+
		"\u010b\u010c\7v\2\2\u010cT\3\2\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2"+
		"\2\u010f\u0110\7i\2\2\u0110V\3\2\2\2\u0111\u0112\7d\2\2\u0112\u0113\7"+
		"q\2\2\u0113\u0114\7q\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2\u0116\u0117"+
		"\7c\2\2\u0117\u0124\7p\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c\u011d\7i\2\2\u011d\u011e\7g\2\2"+
		"\u011e\u0124\7t\2\2\u011f\u0120\7e\2\2\u0120\u0121\7j\2\2\u0121\u0122"+
		"\7c\2\2\u0122\u0124\7t\2\2\u0123\u0111\3\2\2\2\u0123\u0118\3\2\2\2\u0123"+
		"\u011f\3\2\2\2\u0124X\3\2\2\2\u0125\u0126\7t\2\2\u0126\u0127\7g\2\2\u0127"+
		"\u0128\7e\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b\7f\2\2"+
		"\u012bZ\3\2\2\2\u012c\u0131\5e\63\2\u012d\u0130\5e\63\2\u012e\u0130\5"+
		"g\64\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\\\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0134\u013e\7$\2\2\u0135\u013d\5e\63\2\u0136\u013d\5g\64\2\u0137\u013d"+
		"\t\2\2\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2"+
		"\u013a\u013b\3\2\2\2\u013b\u013d\7\f\2\2\u013c\u0135\3\2\2\2\u013c\u0136"+
		"\3\2\2\2\u013c\u0137\3\2\2\2\u013c\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0142\7$\2\2\u0142^\3\2\2\2\u0143\u0146\7)\2\2\u0144\u0147"+
		"\5e\63\2\u0145\u0147\5g\64\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\7)\2\2\u0149`\3\2\2\2\u014a\u014b\7<\2\2\u014b"+
		"b\3\2\2\2\u014c\u014e\5g\64\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150d\3\2\2\2\u0151\u0152\t"+
		"\3\2\2\u0152f\3\2\2\2\u0153\u0154\4\62;\2\u0154h\3\2\2\2\u0155\u0156\7"+
		"\61\2\2\u0156\u0157\7,\2\2\u0157\u015b\3\2\2\2\u0158\u015a\13\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f"+
		"\u0160\7\61\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b\65\2\2\u0162j\3\2\2"+
		"\2\u0163\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165\u0169\3\2\2\2\u0166"+
		"\u0168\13\2\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016f\5m\67\2\u016d\u016f\7\2\2\3\u016e\u016c\3\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0171\3\2\2\2\u0170\u0172\7\2\2\3\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b\66\2\2\u0174l\3\2\2\2"+
		"\u0175\u0177\7\17\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u0179\7\f\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b\67\2\2"+
		"\u017bn\3\2\2\2\u017c\u017e\t\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\b8\2\2\u0182p\3\2\2\2\22\2u\u0123\u012f\u0131\u0139\u013c\u013e"+
		"\u0146\u014f\u015b\u0169\u016e\u0171\u0176\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}