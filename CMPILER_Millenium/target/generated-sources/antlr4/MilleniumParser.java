// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MilleniumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HT_NL_CR=1, INT_DTYPE=2, FLOAT_DTYPE=3, CHAR_DTYPE=4, STRING_DTYPE=5, 
		BOOLEAN_DTYPE=6, IF_CONDITIONAL=7, ELSE_IF_CONDITIONAL=8, ELSE_CONDITIONAL=9, 
		FOR_LOOP=10, WHILE_LOOP=11, DO_LOOP=12, PRINT=13, SCAN=14, OPEN_PAR=15, 
		CLOSE_PAR=16, OPEN_CURLY_BRACK=17, CLOSE_CURLY_BRACK=18, OPEN_SQUARE_BRACK=19, 
		CLOSE_SQUARE_BRACK=20, ENUMERATION=21, COMMENT_BLOCK=22, END=23, ADDITION_OPE=24, 
		SUBTRACTION_OPE=25, MULTIPLICTION_OPE=26, DIVISION_OPE=27, MODULO_OPE=28, 
		LESS_THAN_OPE=29, LESS_THAN_EQUAL_TO_OPE=30, GREATER_THAN_OPE=31, GREATER_THAN_EQUAL_TO_OPE=32, 
		EQUAL_OPE=33, NOT_EQUAL_OPE=34, INCREMENT_OPE=35, DECREMENT_OPE=36, ASSINGMENT_OPE=37, 
		AND_OPE=38, OR_OPE=39, NOT_OPE=40, ARRAY_SIZE_DELIMETER=41, CONSTANT_KEYWORD=42, 
		FUNCTION_CALL=43, MAIN_FUNC=44, RETURN=45, VOID=46, INTEGER_LITERAL=47, 
		FLOAT_LITERAL=48, CHAR_LITERAL=49, STRING_LITERAL=50, BOOLEAN_LITERAL=51, 
		VARIABLE_IDENTIFIER=52, FUNCTION_IDENTIFIER=53;
	public static final int
		RULE_r = 0;
	public static final String[] ruleNames = {
		"r"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'digitz'", "'lutang'", "'single'", "'Msg'", "'weh'", "'priority'", 
		"'optionlang'", "'nochoice'", "'willingtowait'", "'hanggatkeri'", "'gora'", 
		"'post'", "'gimmeinput'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
		null, "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", 
		"'#'", "'consistent'", "'shoutout'", "'LEZGO'", "'uwina'", "'walangibabalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "SCAN", "OPEN_PAR", "CLOSE_PAR", 
		"OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", "CLOSE_SQUARE_BRACK", 
		"ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", "SUBTRACTION_OPE", 
		"MULTIPLICTION_OPE", "DIVISION_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
		"GREATER_THAN_OPE", "GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", 
		"INCREMENT_OPE", "DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", 
		"NOT_OPE", "ARRAY_SIZE_DELIMETER", "CONSTANT_KEYWORD", "FUNCTION_CALL", 
		"MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER"
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
	public String getGrammarFileName() { return "Millenium.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MilleniumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MilleniumParser.INTEGER_LITERAL, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(INTEGER_LITERAL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\2\2\5\2\4\3\2\2\2\4\5\7\61\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}