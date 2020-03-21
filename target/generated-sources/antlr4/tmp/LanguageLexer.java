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
		GREAT=33, GREAT_EQUAL=34, NOT_EQUAL=35, IF=36, WHILE=37, TO=38, UNTIL=39, 
		THEN=40, ELSE=41, REPEAT=42, FOR=43, LEFT=44, RIGHT=45, UP=46, DOWN=47, 
		JUMP=48, FIGHT=49, DIG=50, SCALAR=51, RECORD=52, ID=53, STRING=54, CHAR=55, 
		COLON=56, NUMBER=57, COMMENT_MULTILINE=58, COMMENT_SINGLELINE=59, NEWLINE=60, 
		WS=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", 
		"AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
		"REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "LETTER", 
		"DIGIT", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", 
		"'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", 
		"'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", 
		"'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'if'", 
		"'while'", "'to'", "'until'", "'then'", "'else'", "'repeat'", "'for'", 
		"'left'", "'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, 
		"'record'", null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
		"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
		"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
		"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
		"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
		"REPEAT", "FOR", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", 
		"SCALAR", "RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "COMMENT_MULTILINE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u01ba\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\7\2\u0084\n\2\f\2\16\2\u0087\13\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u015b\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\7\66\u0167\n\66\f\66\16\66\u016a\13"+
		"\66\3\67\3\67\3\67\3\67\3\67\5\67\u0171\n\67\3\67\7\67\u0174\n\67\f\67"+
		"\16\67\u0177\13\67\3\67\3\67\38\38\38\58\u017e\n8\38\38\39\39\3:\6:\u0185"+
		"\n:\r:\16:\u0186\3;\3;\3<\3<\3=\3=\3=\3=\7=\u0191\n=\f=\16=\u0194\13="+
		"\3=\3=\3=\3=\3=\3>\3>\3>\3>\7>\u019f\n>\f>\16>\u01a2\13>\3>\3>\5>\u01a6"+
		"\n>\3>\5>\u01a9\n>\3>\3>\3?\5?\u01ae\n?\3?\3?\3?\3?\3@\6@\u01b5\n@\r@"+
		"\16@\u01b6\3@\3@\4\u0192\u01a0\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y<{=}>\177?\3\2\4\4\2\13\13"+
		"\"\"\4\2C\\c|\u01c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u008f\3\2\2\2\7\u0095"+
		"\3\2\2\2\t\u0097\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2\2\2\17\u009d\3\2"+
		"\2\2\21\u009f\3\2\2\2\23\u00a1\3\2\2\2\25\u00a4\3\2\2\2\27\u00a6\3\2\2"+
		"\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ad\3\2\2\2\37\u00b2\3\2\2\2"+
		"!\u00bb\3\2\2\2#\u00c0\3\2\2\2%\u00c3\3\2\2\2\'\u00c7\3\2\2\2)\u00cd\3"+
		"\2\2\2+\u00d2\3\2\2\2-\u00d4\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2\63"+
		"\u00da\3\2\2\2\65\u00dc\3\2\2\2\67\u00e1\3\2\2\29\u00e7\3\2\2\2;\u00eb"+
		"\3\2\2\2=\u00ee\3\2\2\2?\u00f2\3\2\2\2A\u00f4\3\2\2\2C\u00f7\3\2\2\2E"+
		"\u00f9\3\2\2\2G\u00fc\3\2\2\2I\u00ff\3\2\2\2K\u0102\3\2\2\2M\u0108\3\2"+
		"\2\2O\u010b\3\2\2\2Q\u0111\3\2\2\2S\u0116\3\2\2\2U\u011b\3\2\2\2W\u0122"+
		"\3\2\2\2Y\u0126\3\2\2\2[\u012b\3\2\2\2]\u0131\3\2\2\2_\u0134\3\2\2\2a"+
		"\u0139\3\2\2\2c\u013e\3\2\2\2e\u0144\3\2\2\2g\u015a\3\2\2\2i\u015c\3\2"+
		"\2\2k\u0163\3\2\2\2m\u016b\3\2\2\2o\u017a\3\2\2\2q\u0181\3\2\2\2s\u0184"+
		"\3\2\2\2u\u0188\3\2\2\2w\u018a\3\2\2\2y\u018c\3\2\2\2{\u019a\3\2\2\2}"+
		"\u01ad\3\2\2\2\177\u01b4\3\2\2\2\u0081\u0085\7%\2\2\u0082\u0084\5\177"+
		"@\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7k"+
		"\2\2\u0089\u008a\7o\2\2\u008a\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7v\2\2\u008e\4\3\2\2\2\u008f\u0090\5k\66\2\u0090\u0091"+
		"\7\60\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7r\2\2\u0094"+
		"\6\3\2\2\2\u0095\u0096\7*\2\2\u0096\b\3\2\2\2\u0097\u0098\7+\2\2\u0098"+
		"\n\3\2\2\2\u0099\u009a\7.\2\2\u009a\f\3\2\2\2\u009b\u009c\7=\2\2\u009c"+
		"\16\3\2\2\2\u009d\u009e\7_\2\2\u009e\20\3\2\2\2\u009f\u00a0\7]\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7u\2\2\u00a3\24\3\2\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\30\3\2\2\2\u00a8"+
		"\u00a9\7)\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7<\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\34\3\2\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7w\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7k\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba \3\2\2\2\u00bb\u00bc\7x\2"+
		"\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7f\2\2\u00bf\"\3"+
		"\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7q\2\2\u00c2$\3\2\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7f\2\2\u00c6&\3\2\2\2\u00c7\u00c8"+
		"\7e\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7w\2\2\u00d0\u00d1\7o\2\2\u00d1*\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3"+
		",\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\60"+
		"\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\62\3\2\2\2\u00da\u00db\7\'\2\2\u00db"+
		"\64\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e68\3\2\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7f\2\2\u00ea:\3\2\2\2\u00eb"+
		"\u00ec\7q\2\2\u00ec\u00ed\7t\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\u00f1\7v\2\2\u00f1>\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3"+
		"@\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6\7?\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7@\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbF\3"+
		"\2\2\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7@\2\2\u00feH\3\2\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7h\2\2\u0101J\3\2\2\2\u0102\u0103\7y\2\2\u0103\u0104"+
		"\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106\7n\2\2\u0106\u0107\7g\2\2\u0107"+
		"L\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a\7q\2\2\u010aN\3\2\2\2\u010b\u010c"+
		"\7w\2\2\u010c\u010d\7p\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7n\2\2\u0110P\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\7p\2\2\u0115R\3\2\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7n\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011aT\3\2\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7r\2\2\u011e\u011f\7g\2\2"+
		"\u011f\u0120\7c\2\2\u0120\u0121\7v\2\2\u0121V\3\2\2\2\u0122\u0123\7h\2"+
		"\2\u0123\u0124\7q\2\2\u0124\u0125\7t\2\2\u0125X\3\2\2\2\u0126\u0127\7"+
		"n\2\2\u0127\u0128\7g\2\2\u0128\u0129\7h\2\2\u0129\u012a\7v\2\2\u012aZ"+
		"\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7k\2\2\u012d\u012e\7i\2\2\u012e"+
		"\u012f\7j\2\2\u012f\u0130\7v\2\2\u0130\\\3\2\2\2\u0131\u0132\7w\2\2\u0132"+
		"\u0133\7r\2\2\u0133^\3\2\2\2\u0134\u0135\7f\2\2\u0135\u0136\7q\2\2\u0136"+
		"\u0137\7y\2\2\u0137\u0138\7p\2\2\u0138`\3\2\2\2\u0139\u013a\7l\2\2\u013a"+
		"\u013b\7w\2\2\u013b\u013c\7o\2\2\u013c\u013d\7r\2\2\u013db\3\2\2\2\u013e"+
		"\u013f\7h\2\2\u013f\u0140\7k\2\2\u0140\u0141\7i\2\2\u0141\u0142\7j\2\2"+
		"\u0142\u0143\7v\2\2\u0143d\3\2\2\2\u0144\u0145\7f\2\2\u0145\u0146\7k\2"+
		"\2\u0146\u0147\7i\2\2\u0147f\3\2\2\2\u0148\u0149\7d\2\2\u0149\u014a\7"+
		"q\2\2\u014a\u014b\7q\2\2\u014b\u014c\7n\2\2\u014c\u014d\7g\2\2\u014d\u014e"+
		"\7c\2\2\u014e\u015b\7p\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7g\2\2\u0153\u0154\7i\2\2\u0154\u0155\7g\2\2"+
		"\u0155\u015b\7t\2\2\u0156\u0157\7e\2\2\u0157\u0158\7j\2\2\u0158\u0159"+
		"\7c\2\2\u0159\u015b\7t\2\2\u015a\u0148\3\2\2\2\u015a\u014f\3\2\2\2\u015a"+
		"\u0156\3\2\2\2\u015bh\3\2\2\2\u015c\u015d\7t\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7e\2\2\u015f\u0160\7q\2\2\u0160\u0161\7t\2\2\u0161\u0162\7f\2\2"+
		"\u0162j\3\2\2\2\u0163\u0168\5u;\2\u0164\u0167\5u;\2\u0165\u0167\5w<\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169l\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u0175\7$\2\2\u016c\u0174\5u;\2\u016d\u0174\5w<\2\u016e\u0174\t\2\2\2"+
		"\u016f\u0171\7\17\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0174\7\f\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2\2\2\u0173"+
		"\u016e\3\2\2\2\u0173\u0170\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\7$\2\2\u0179n\3\2\2\2\u017a\u017d\7)\2\2\u017b\u017e\5u;\2\u017c"+
		"\u017e\5w<\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\7)\2\2\u0180p\3\2\2\2\u0181\u0182\7<\2\2\u0182r\3\2\2\2"+
		"\u0183\u0185\5w<\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187t\3\2\2\2\u0188\u0189\t\3\2\2\u0189"+
		"v\3\2\2\2\u018a\u018b\4\62;\2\u018bx\3\2\2\2\u018c\u018d\7\61\2\2\u018d"+
		"\u018e\7,\2\2\u018e\u0192\3\2\2\2\u018f\u0191\13\2\2\2\u0190\u018f\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193"+
		"\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7,\2\2\u0196\u0197\7\61"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b=\2\2\u0199z\3\2\2\2\u019a\u019b"+
		"\7\61\2\2\u019b\u019c\7\61\2\2\u019c\u01a0\3\2\2\2\u019d\u019f\13\2\2"+
		"\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a5\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\5}?\2\u01a4"+
		"\u01a6\7\2\2\3\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a9\7\2\2\3\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\b>\2\2\u01ab|\3\2\2\2\u01ac\u01ae\7\17\2\2"+
		"\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\7\f\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b?\2\2\u01b2~\3\2\2\2\u01b3\u01b5"+
		"\t\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\b@\2\2\u01b9\u0080\3\2"+
		"\2\2\22\2\u0085\u015a\u0166\u0168\u0170\u0173\u0175\u017d\u0186\u0192"+
		"\u01a0\u01a5\u01a8\u01ad\u01b6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}