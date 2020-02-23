// Generated from tmp/Language.g4 by ANTLR 4.6
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
public class LanguageLexer extends Lexer {
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
		null, "'#import'", null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", 
		"'='", "'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", 
		"'end'", "'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", 
		"'false'", "'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", 
		"'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, 
		"'record'", null, null, null, "':'"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

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
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u011e\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\7.\u012a\n.\f.\16.\u012d\13.\3/\3/\3/\3/\3/\5/\u0134"+
		"\n/\3/\7/\u0137\n/\f/\16/\u013a\13/\3/\3/\3\60\3\60\3\60\5\60\u0141\n"+
		"\60\3\60\3\60\3\61\3\61\3\62\6\62\u0148\n\62\r\62\16\62\u0149\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0154\n\65\f\65\16\65\u0157\13\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0162\n\66\f\66\16"+
		"\66\u0165\13\66\3\66\3\66\3\66\3\66\3\66\7\66\u016c\n\66\f\66\16\66\u016f"+
		"\13\66\3\66\5\66\u0172\n\66\3\66\3\66\3\67\5\67\u0177\n\67\3\67\3\67\3"+
		"\67\3\67\38\68\u017e\n8\r8\168\u017f\38\38\5\u0155\u0163\u016d\29\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\64k\65m\66o\67\3"+
		"\2\4\4\2\13\13\"\"\4\2C\\c|\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5y\3\2\2\2\7\177\3\2\2\2\t\u0081\3"+
		"\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2"+
		"\2\2\23\u008b\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3\2\2"+
		"\2\33\u0094\3\2\2\2\35\u0097\3\2\2\2\37\u009c\3\2\2\2!\u00a5\3\2\2\2#"+
		"\u00aa\3\2\2\2%\u00ad\3\2\2\2\'\u00b1\3\2\2\2)\u00b7\3\2\2\2+\u00bc\3"+
		"\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\u00c4\3\2\2\2"+
		"\65\u00c6\3\2\2\2\67\u00cb\3\2\2\29\u00d1\3\2\2\2;\u00d5\3\2\2\2=\u00d8"+
		"\3\2\2\2?\u00dc\3\2\2\2A\u00de\3\2\2\2C\u00e1\3\2\2\2E\u00e3\3\2\2\2G"+
		"\u00e6\3\2\2\2I\u00e9\3\2\2\2K\u00ee\3\2\2\2M\u00f4\3\2\2\2O\u00f7\3\2"+
		"\2\2Q\u00fc\3\2\2\2S\u0101\3\2\2\2U\u0107\3\2\2\2W\u011d\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0126\3\2\2\2]\u012e\3\2\2\2_\u013d\3\2\2\2a\u0144\3\2\2\2c"+
		"\u0147\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2\2\2k\u0171\3\2"+
		"\2\2m\u0176\3\2\2\2o\u017d\3\2\2\2qr\7%\2\2rs\7k\2\2st\7o\2\2tu\7r\2\2"+
		"uv\7q\2\2vw\7t\2\2wx\7v\2\2x\4\3\2\2\2yz\5[.\2z{\7\60\2\2{|\7o\2\2|}\7"+
		"c\2\2}~\7r\2\2~\6\3\2\2\2\177\u0080\7*\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7+\2\2\u0082\n\3\2\2\2\u0083\u0084\7.\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7=\2\2\u0086\16\3\2\2\2\u0087\u0088\7_\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7]\2\2\u008a\22\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\24"+
		"\3\2\2\2\u008e\u008f\7?\2\2\u008f\26\3\2\2\2\u0090\u0091\7$\2\2\u0091"+
		"\30\3\2\2\2\u0092\u0093\7)\2\2\u0093\32\3\2\2\2\u0094\u0095\7<\2\2\u0095"+
		"\u0096\7?\2\2\u0096\34\3\2\2\2\u0097\u0098\7o\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\36\3\2\2\2\u009c\u009d\7h\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1\u00a2\7k\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4 \3\2\2"+
		"\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9"+
		"\7f\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7f\2\2\u00ab\u00ac\7q\2\2\u00ac$\3"+
		"\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0"+
		"&\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7p\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7v\2\2\u00b6(\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\u00ba\7w\2\2\u00ba\u00bb\7o\2\2\u00bb*\3\2\2\2\u00bc"+
		"\u00bd\7-\2\2\u00bd,\3\2\2\2\u00be\u00bf\7/\2\2\u00bf.\3\2\2\2\u00c0\u00c1"+
		"\7,\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\62\3\2\2\2\u00c4\u00c5"+
		"\7\'\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca\66\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2"+
		"\u00d08\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7f\2"+
		"\2\u00d4:\3\2\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7<\3\2\2\2"+
		"\u00d8\u00d9\7p\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7v\2\2\u00db>\3\2\2"+
		"\2\u00dc\u00dd\7>\2\2\u00dd@\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7"+
		"?\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7@"+
		"\2\2\u00e4\u00e5\7?\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8"+
		"\7@\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec"+
		"\7h\2\2\u00ec\u00ed\7v\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7i\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7v\2\2\u00f3"+
		"L\3\2\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7r\2\2\u00f6N\3\2\2\2\u00f7\u00f8"+
		"\7f\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"P\3\2\2\2\u00fc\u00fd\7l\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7o\2\2\u00ff"+
		"\u0100\7r\2\2\u0100R\3\2\2\2\u0101\u0102\7h\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u0104\7i\2\2\u0104\u0105\7j\2\2\u0105\u0106\7v\2\2\u0106T\3\2\2\2\u0107"+
		"\u0108\7f\2\2\u0108\u0109\7k\2\2\u0109\u010a\7i\2\2\u010aV\3\2\2\2\u010b"+
		"\u010c\7d\2\2\u010c\u010d\7q\2\2\u010d\u010e\7q\2\2\u010e\u010f\7n\2\2"+
		"\u010f\u0110\7g\2\2\u0110\u0111\7c\2\2\u0111\u011e\7p\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115\7v\2\2\u0115\u0116\7g\2\2\u0116"+
		"\u0117\7i\2\2\u0117\u0118\7g\2\2\u0118\u011e\7t\2\2\u0119\u011a\7e\2\2"+
		"\u011a\u011b\7j\2\2\u011b\u011c\7c\2\2\u011c\u011e\7t\2\2\u011d\u010b"+
		"\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0119\3\2\2\2\u011eX\3\2\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7e\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0124\7t\2\2\u0124\u0125\7f\2\2\u0125Z\3\2\2\2\u0126\u012b\5e\63"+
		"\2\u0127\u012a\5e\63\2\u0128\u012a\5g\64\2\u0129\u0127\3\2\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\\\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0138\7$\2\2\u012f\u0137\5e\63\2"+
		"\u0130\u0137\5g\64\2\u0131\u0137\t\2\2\2\u0132\u0134\7\17\2\2\u0133\u0132"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\7\f\2\2\u0136"+
		"\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0133\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013c^\3\2\2\2\u013d"+
		"\u0140\7)\2\2\u013e\u0141\5e\63\2\u013f\u0141\5g\64\2\u0140\u013e\3\2"+
		"\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7)\2\2\u0143"+
		"`\3\2\2\2\u0144\u0145\7<\2\2\u0145b\3\2\2\2\u0146\u0148\5g\64\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014ad\3\2\2\2\u014b\u014c\t\3\2\2\u014cf\3\2\2\2\u014d\u014e\4\62"+
		";\2\u014eh\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7,\2\2\u0151\u0155"+
		"\3\2\2\2\u0152\u0154\13\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7\61\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\65\2\2\u015cj\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61\2"+
		"\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u0172\5m\67\2\u0167\u0168\7\61\2\2\u0168"+
		"\u0169\7\61\2\2\u0169\u016d\3\2\2\2\u016a\u016c\13\2\2\2\u016b\u016a\3"+
		"\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\17\2\2\u0171\u015d\3"+
		"\2\2\2\u0171\u0167\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b\66\2\2\u0174"+
		"l\3\2\2\2\u0175\u0177\7\17\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\7\f\2\2\u0179\u017a\3\2\2\2\u017a\u017b"+
		"\b\67\2\2\u017bn\3\2\2\2\u017c\u017e\t\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\b8\2\2\u0182p\3\2\2\2\21\2\u011d\u0129\u012b\u0133\u0136"+
		"\u0138\u0140\u0149\u0155\u0163\u016d\u0171\u0176\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}