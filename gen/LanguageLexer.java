// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/Language.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, MAPFILE=2, LPAR=3, RPAR=4, COMMA=5, SEMICOLON=6, RBRA=7, LBRA=8, 
		AS=9, EQUAL=10, QUOTE=11, SINGLE_QUOTE=12, ASSIGN=13, MAIN=14, FUNCTION=15, 
		VOID=16, DO=17, END=18, CONST=19, ENUM=20, PLUS=21, MINUS=22, MULTI=23, 
		DIV=24, MOD=25, TRUE=26, FALSE=27, AND=28, OR=29, NOT=30, LESS=31, LESS_EQUAL=32, 
		GREAT=33, GREAT_EQUAL=34, NOT_EQUAL=35, IF=36, WHILE=37, TO=38, UNTIL=39, 
		THEN=40, ELSE=41, REPEAT=42, LEFT=43, RIGHT=44, UP=45, DOWN=46, JUMP=47, 
		FIGHT=48, DIG=49, SCALAR=50, RECORD=51, ID=52, STRING=53, CHAR=54, COLON=55, 
		NUMBER=56, COMMENT_MULTILINE=57, COMMENT_SINGLELINE=58, NEWLINE=59, WS=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", 
			"AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
			"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
			"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
			"REPEAT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", 
			"RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "LETTER", "DIGIT", 
			"COMMENT_MULTILINE", "COMMENT_SINGLELINE", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", 
			"'\"'", "'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", 
			"'const'", "'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", 
			"'and'", "'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'if'", 
			"'while'", "'to'", "'until'", "'then'", "'elsse'", "'repeat'", "'left'", 
			"'right'", "'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'", 
			null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "MAPFILE", "LPAR", "RPAR", "COMMA", "SEMICOLON", "RBRA", 
			"LBRA", "AS", "EQUAL", "QUOTE", "SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", 
			"VOID", "DO", "END", "CONST", "ENUM", "PLUS", "MINUS", "MULTI", "DIV", 
			"MOD", "TRUE", "FALSE", "AND", "OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", 
			"GREAT_EQUAL", "NOT_EQUAL", "IF", "WHILE", "TO", "UNTIL", "THEN", "ELSE", 
			"REPEAT", "LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", 
			"RECORD", "ID", "STRING", "CHAR", "COLON", "NUMBER", "COMMENT_MULTILINE", 
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u01b5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0156\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\7\65\u0162\n\65\f\65\16\65\u0165\13\65\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u016c\n\66\3\66\7\66\u016f\n\66\f\66\16\66\u0172\13\66"+
		"\3\66\3\66\3\67\3\67\3\67\5\67\u0179\n\67\3\67\3\67\38\38\39\69\u0180"+
		"\n9\r9\169\u0181\3:\3:\3;\3;\3<\3<\3<\3<\7<\u018c\n<\f<\16<\u018f\13<"+
		"\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u019a\n=\f=\16=\u019d\13=\3=\3=\5=\u01a1"+
		"\n=\3=\5=\u01a4\n=\3=\3=\3>\5>\u01a9\n>\3>\3>\3>\3>\3?\6?\u01b0\n?\r?"+
		"\16?\u01b1\3?\3?\4\u018d\u019b\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2u\2w;y<{=}>\3\2\4\4\2\13\13\"\"\4"+
		"\2C\\c|\2\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\3\177\3\2\2\2\5\u008d\3\2\2\2\7\u0093\3\2\2\2\t\u0095\3"+
		"\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u009b\3\2\2\2\21\u009d\3\2"+
		"\2\2\23\u009f\3\2\2\2\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2"+
		"\2\33\u00a8\3\2\2\2\35\u00ab\3\2\2\2\37\u00b0\3\2\2\2!\u00b9\3\2\2\2#"+
		"\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c5\3\2\2\2)\u00cb\3\2\2\2+\u00d0\3"+
		"\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2"+
		"\65\u00da\3\2\2\2\67\u00df\3\2\2\29\u00e5\3\2\2\2;\u00e9\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u00f2\3\2\2\2C\u00f5\3\2\2\2E\u00f7\3\2\2\2G"+
		"\u00fa\3\2\2\2I\u00fd\3\2\2\2K\u0100\3\2\2\2M\u0106\3\2\2\2O\u0109\3\2"+
		"\2\2Q\u010f\3\2\2\2S\u0114\3\2\2\2U\u011a\3\2\2\2W\u0121\3\2\2\2Y\u0126"+
		"\3\2\2\2[\u012c\3\2\2\2]\u012f\3\2\2\2_\u0134\3\2\2\2a\u0139\3\2\2\2c"+
		"\u013f\3\2\2\2e\u0155\3\2\2\2g\u0157\3\2\2\2i\u015e\3\2\2\2k\u0166\3\2"+
		"\2\2m\u0175\3\2\2\2o\u017c\3\2\2\2q\u017f\3\2\2\2s\u0183\3\2\2\2u\u0185"+
		"\3\2\2\2w\u0187\3\2\2\2y\u0195\3\2\2\2{\u01a8\3\2\2\2}\u01af\3\2\2\2\177"+
		"\u0083\7%\2\2\u0080\u0082\5}?\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7o\2\2\u0088\u0089\7r\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7t\2\2\u008b\u008c\7v\2\2\u008c\4\3\2\2\2\u008d"+
		"\u008e\5i\65\2\u008e\u008f\7\60\2\2\u008f\u0090\7o\2\2\u0090\u0091\7c"+
		"\2\2\u0091\u0092\7r\2\2\u0092\6\3\2\2\2\u0093\u0094\7*\2\2\u0094\b\3\2"+
		"\2\2\u0095\u0096\7+\2\2\u0096\n\3\2\2\2\u0097\u0098\7.\2\2\u0098\f\3\2"+
		"\2\2\u0099\u009a\7=\2\2\u009a\16\3\2\2\2\u009b\u009c\7_\2\2\u009c\20\3"+
		"\2\2\2\u009d\u009e\7]\2\2\u009e\22\3\2\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\26\3\2\2\2\u00a4\u00a5"+
		"\7$\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7)\2\2\u00a7\32\3\2\2\2\u00a8\u00a9"+
		"\7<\2\2\u00a9\u00aa\7?\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad"+
		"\7c\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\36\3\2\2\2\u00b0\u00b1"+
		"\7h\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7e\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8 \3\2\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7k\2"+
		"\2\u00bc\u00bd\7f\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7"+
		"q\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7f\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8"+
		"\7p\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca(\3\2\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7o\2\2\u00cf"+
		"*\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3."+
		"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5\60\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7"+
		"\62\3\2\2\2\u00d8\u00d9\7\'\2\2\u00d9\64\3\2\2\2\u00da\u00db\7v\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7g\2\2\u00de\66\3\2\2\2\u00df"+
		"\u00e0\7h\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e48\3\2\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2"+
		"\2\u00e7\u00e8\7f\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7"+
		"t\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7"+
		">\2\2\u00f3\u00f4\7?\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6D\3\2"+
		"\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f9F\3\2\2\2\u00fa\u00fb"+
		"\7>\2\2\u00fb\u00fc\7@\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7h\2\2\u00ffJ\3\2\2\2\u0100\u0101\7y\2\2\u0101\u0102\7j\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7n\2\2\u0104\u0105\7g\2\2\u0105L\3\2\2\2\u0106\u0107"+
		"\7v\2\2\u0107\u0108\7q\2\2\u0108N\3\2\2\2\u0109\u010a\7w\2\2\u010a\u010b"+
		"\7p\2\2\u010b\u010c\7v\2\2\u010c\u010d\7k\2\2\u010d\u010e\7n\2\2\u010e"+
		"P\3\2\2\2\u010f\u0110\7v\2\2\u0110\u0111\7j\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7p\2\2\u0113R\3\2\2\2\u0114\u0115\7g\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7u\2\2\u0117\u0118\7u\2\2\u0118\u0119\7g\2\2\u0119T\3\2\2\2\u011a"+
		"\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c\u011d\7r\2\2\u011d\u011e\7g\2\2"+
		"\u011e\u011f\7c\2\2\u011f\u0120\7v\2\2\u0120V\3\2\2\2\u0121\u0122\7n\2"+
		"\2\u0122\u0123\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125\7v\2\2\u0125X\3\2"+
		"\2\2\u0126\u0127\7t\2\2\u0127\u0128\7k\2\2\u0128\u0129\7i\2\2\u0129\u012a"+
		"\7j\2\2\u012a\u012b\7v\2\2\u012bZ\3\2\2\2\u012c\u012d\7w\2\2\u012d\u012e"+
		"\7r\2\2\u012e\\\3\2\2\2\u012f\u0130\7f\2\2\u0130\u0131\7q\2\2\u0131\u0132"+
		"\7y\2\2\u0132\u0133\7p\2\2\u0133^\3\2\2\2\u0134\u0135\7l\2\2\u0135\u0136"+
		"\7w\2\2\u0136\u0137\7o\2\2\u0137\u0138\7r\2\2\u0138`\3\2\2\2\u0139\u013a"+
		"\7h\2\2\u013a\u013b\7k\2\2\u013b\u013c\7i\2\2\u013c\u013d\7j\2\2\u013d"+
		"\u013e\7v\2\2\u013eb\3\2\2\2\u013f\u0140\7f\2\2\u0140\u0141\7k\2\2\u0141"+
		"\u0142\7i\2\2\u0142d\3\2\2\2\u0143\u0144\7d\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7n\2\2\u0147\u0148\7g\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u0156\7p\2\2\u014a\u014b\7k\2\2\u014b\u014c\7p\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7g\2\2\u014e\u014f\7i\2\2\u014f\u0150\7g\2\2\u0150"+
		"\u0156\7t\2\2\u0151\u0152\7e\2\2\u0152\u0153\7j\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0156\7t\2\2\u0155\u0143\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u0151"+
		"\3\2\2\2\u0156f\3\2\2\2\u0157\u0158\7t\2\2\u0158\u0159\7g\2\2\u0159\u015a"+
		"\7e\2\2\u015a\u015b\7q\2\2\u015b\u015c\7t\2\2\u015c\u015d\7f\2\2\u015d"+
		"h\3\2\2\2\u015e\u0163\5s:\2\u015f\u0162\5s:\2\u0160\u0162\5u;\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164j\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0170"+
		"\7$\2\2\u0167\u016f\5s:\2\u0168\u016f\5u;\2\u0169\u016f\t\2\2\2\u016a"+
		"\u016c\7\17\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u016f\7\f\2\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e"+
		"\u0169\3\2\2\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7$\2\2\u0174l\3\2\2\2\u0175\u0178\7)\2\2\u0176\u0179\5s:\2\u0177"+
		"\u0179\5u;\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017b\7)\2\2\u017bn\3\2\2\2\u017c\u017d\7<\2\2\u017dp\3\2\2\2"+
		"\u017e\u0180\5u;\2\u017f\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182r\3\2\2\2\u0183\u0184\t\3\2\2\u0184"+
		"t\3\2\2\2\u0185\u0186\4\62;\2\u0186v\3\2\2\2\u0187\u0188\7\61\2\2\u0188"+
		"\u0189\7,\2\2\u0189\u018d\3\2\2\2\u018a\u018c\13\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7\61"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0194\b<\2\2\u0194x\3\2\2\2\u0195\u0196"+
		"\7\61\2\2\u0196\u0197\7\61\2\2\u0197\u019b\3\2\2\2\u0198\u019a\13\2\2"+
		"\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019c\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u01a0\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\5{>\2\u019f"+
		"\u01a1\7\2\2\3\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a4\7\2\2\3\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a6\b=\2\2\u01a6z\3\2\2\2\u01a7\u01a9\7\17\2\2"+
		"\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\7\f\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\b>\2\2\u01ad|\3\2\2\2\u01ae\u01b0"+
		"\t\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b?\2\2\u01b4~\3\2\2\2\22"+
		"\2\u0083\u0155\u0161\u0163\u016b\u016e\u0170\u0178\u0181\u018d\u019b\u01a0"+
		"\u01a3\u01a8\u01b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}