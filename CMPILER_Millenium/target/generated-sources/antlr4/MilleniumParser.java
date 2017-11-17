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
		FOR_LOOP=10, WHILE_LOOP=11, DO_LOOP=12, PRINT=13, PRINT_NL=14, SCAN=15, 
		OPEN_PAR=16, CLOSE_PAR=17, OPEN_CURLY_BRACK=18, CLOSE_CURLY_BRACK=19, 
		OPEN_SQUARE_BRACK=20, CLOSE_SQUARE_BRACK=21, ENUMERATION=22, COMMENT_BLOCK=23, 
		END=24, ADDITION_OPE=25, SUBTRACTION_OPE=26, MULTIPLICATION_OPE=27, DIVISION_OPE=28, 
		ADDITION_ASSIGNMENT_OPE=29, SUBTRACTION_ASSIGNMENT_OPE=30, MULTIPLICATION_ASSIGNMENT_OPE=31, 
		DIVISION_ASSIGNMENT_OPE=32, MODULO_ASSIGNMENT_OPE=33, MODULO_OPE=34, LESS_THAN_OPE=35, 
		LESS_THAN_EQUAL_TO_OPE=36, GREATER_THAN_OPE=37, GREATER_THAN_EQUAL_TO_OPE=38, 
		EQUAL_OPE=39, NOT_EQUAL_OPE=40, INCREMENT_OPE=41, DECREMENT_OPE=42, ASSINGMENT_OPE=43, 
		AND_OPE=44, OR_OPE=45, NOT_OPE=46, ARRAY_SIZE_DELIMETER=47, CONSTANT_KEYWORD=48, 
		FUNCTION_CALL=49, MAIN_FUNC=50, RETURN=51, VOID=52, INTEGER_LITERAL=53, 
		FLOAT_LITERAL=54, CHAR_LITERAL=55, STRING_LITERAL=56, BOOLEAN_LITERAL=57, 
		VARIABLE_IDENTIFIER=58, FUNCTION_IDENTIFIER=59;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_vardecl_list = 2, RULE_var_decl = 3, 
		RULE_var_identifier_list = 4, RULE_array_size = 5, RULE_data_type = 6, 
		RULE_function_declaration = 7, RULE_function_return = 8, RULE_function_noreturn = 9, 
		RULE_parameters = 10, RULE_function_block = 11, RULE_main_function = 12, 
		RULE_expression = 13, RULE_string_expression = 14, RULE_num_expression = 15, 
		RULE_num_ope = 16, RULE_unary_ope = 17, RULE_num_factor = 18, RULE_var_func_expression = 19, 
		RULE_var_func_factor = 20, RULE_bool_expression = 21, RULE_relational_ope = 22, 
		RULE_logical_ope = 23, RULE_const_statement = 24, RULE_var_assignment_statement = 25, 
		RULE_assignment_statement = 26, RULE_assignment_num_ope = 27, RULE_assignment_factor = 28, 
		RULE_funccall_statement = 29, RULE_actual_parameter_list = 30, RULE_actual_params = 31, 
		RULE_conditional_factor = 32, RULE_if_statement = 33, RULE_conditional_block = 34, 
		RULE_code_block = 35, RULE_while_statement = 36, RULE_do_while_statement = 37, 
		RULE_for_statement = 38, RULE_for_assignment_statement = 39, RULE_return_statement = 40, 
		RULE_scan_statement = 41, RULE_print_statement = 42;
	public static final String[] ruleNames = {
		"program", "statement", "vardecl_list", "var_decl", "var_identifier_list", 
		"array_size", "data_type", "function_declaration", "function_return", 
		"function_noreturn", "parameters", "function_block", "main_function", 
		"expression", "string_expression", "num_expression", "num_ope", "unary_ope", 
		"num_factor", "var_func_expression", "var_func_factor", "bool_expression", 
		"relational_ope", "logical_ope", "const_statement", "var_assignment_statement", 
		"assignment_statement", "assignment_num_ope", "assignment_factor", "funccall_statement", 
		"actual_parameter_list", "actual_params", "conditional_factor", "if_statement", 
		"conditional_block", "code_block", "while_statement", "do_while_statement", 
		"for_statement", "for_assignment_statement", "return_statement", "scan_statement", 
		"print_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'digitz'", "'lutang'", "'single'", "'Msg'", "'weh'", "'priority'", 
		"'optionlang'", "'nochoice'", "'willingtowait'", "'hanggatkeri'", "'gora'", 
		"'post'", "'postln'", "'gimmeinput'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", null, "';'", "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", "'#'", "'consistent'", 
		"'shoutout'", "'LEZGO'", "'uwina'", "'walangibabalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", 
		"CLOSE_PAR", "OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", 
		"CLOSE_SQUARE_BRACK", "ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", 
		"SUBTRACTION_OPE", "MULTIPLICATION_OPE", "DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", 
		"SUBTRACTION_ASSIGNMENT_OPE", "MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", 
		"MODULO_ASSIGNMENT_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
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
	public static class ProgramContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MilleniumParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					function_declaration();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(92);
			main_function();
			setState(93);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode COMMENT_BLOCK() { return getToken(MilleniumParser.COMMENT_BLOCK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				const_statement();
				setState(97);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				const_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				assignment_statement();
				setState(103);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				funccall_statement();
				setState(106);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				do_while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				return_statement();
				setState(113);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				scan_statement();
				setState(116);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(118);
				scan_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(121);
				print_statement();
				setState(122);
				match(END);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(124);
				print_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(127);
				match(COMMENT_BLOCK);
				}
				break;
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

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVardecl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVardecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			var_decl();
			setState(131);
			match(END);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(132);
				vardecl_list();
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationContext extends Var_declContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public VariableDeclarationContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			data_type();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_SIZE_DELIMETER) {
				{
				setState(136);
				array_size();
				}
			}

			{
			setState(139);
			var_identifier_list();
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

	public static class Var_identifier_listContext extends ParserRuleContext {
		public Var_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_identifier_list; }
	 
		public Var_identifier_listContext() { }
		public void copyFrom(Var_identifier_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIdentifierInDeclaration2Context extends Var_identifier_listContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public VarIdentifierInDeclaration2Context(Var_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVarIdentifierInDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVarIdentifierInDeclaration2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVarIdentifierInDeclaration2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdentifierInDeclaration1Context extends Var_identifier_listContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public VarIdentifierInDeclaration1Context(Var_identifier_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVarIdentifierInDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVarIdentifierInDeclaration1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVarIdentifierInDeclaration1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_identifier_listContext var_identifier_list() throws RecognitionException {
		Var_identifier_listContext _localctx = new Var_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_identifier_list);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VarIdentifierInDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(VARIABLE_IDENTIFIER);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSINGMENT_OPE) {
					{
					setState(142);
					var_assignment_statement();
					}
				}

				setState(145);
				match(ENUMERATION);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(146);
					var_identifier_list();
					}
				}

				}
				break;
			case 2:
				_localctx = new VarIdentifierInDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(VARIABLE_IDENTIFIER);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSINGMENT_OPE) {
					{
					setState(150);
					var_assignment_statement();
					}
				}

				}
				break;
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

	public static class Array_sizeContext extends ParserRuleContext {
		public TerminalNode ARRAY_SIZE_DELIMETER() { return getToken(MilleniumParser.ARRAY_SIZE_DELIMETER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(MilleniumParser.INTEGER_LITERAL, 0); }
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitArray_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitArray_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ARRAY_SIZE_DELIMETER);
			setState(156);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_DTYPE() { return getToken(MilleniumParser.INT_DTYPE, 0); }
		public TerminalNode FLOAT_DTYPE() { return getToken(MilleniumParser.FLOAT_DTYPE, 0); }
		public TerminalNode CHAR_DTYPE() { return getToken(MilleniumParser.CHAR_DTYPE, 0); }
		public TerminalNode STRING_DTYPE() { return getToken(MilleniumParser.STRING_DTYPE, 0); }
		public TerminalNode BOOLEAN_DTYPE() { return getToken(MilleniumParser.BOOLEAN_DTYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) ) {
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_declaration);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DTYPE:
			case FLOAT_DTYPE:
			case CHAR_DTYPE:
			case STRING_DTYPE:
			case BOOLEAN_DTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				function_return();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				function_noreturn();
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

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFunction_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			data_type();
			setState(165);
			match(FUNCTION_IDENTIFIER);
			setState(166);
			function_block();
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

	public static class Function_noreturnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MilleniumParser.VOID, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_noreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFunction_noreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_noreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(VOID);
			setState(169);
			match(FUNCTION_IDENTIFIER);
			setState(170);
			function_block();
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

	public static class ParametersContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			data_type();
			setState(173);
			match(VARIABLE_IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENUMERATION) {
				{
				setState(174);
				match(ENUMERATION);
				setState(175);
				parameters();
				}
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

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(OPEN_PAR);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) {
				{
				setState(179);
				parameters();
				}
			}

			setState(182);
			match(CLOSE_PAR);
			setState(183);
			code_block();
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MilleniumParser.VOID, 0); }
		public TerminalNode MAIN_FUNC() { return getToken(MilleniumParser.MAIN_FUNC, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitMain_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(VOID);
			setState(186);
			match(MAIN_FUNC);
			setState(187);
			match(OPEN_PAR);
			setState(188);
			match(CLOSE_PAR);
			setState(189);
			code_block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_func_expressionContext var_func_expression() {
			return getRuleContext(Var_func_expressionContext.class,0);
		}
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public List<Num_opeContext> num_ope() {
			return getRuleContexts(Num_opeContext.class);
		}
		public Num_opeContext num_ope(int i) {
			return getRuleContext(Num_opeContext.class,i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				string_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				string_expression(0);
				setState(193);
				match(ADDITION_OPE);
				setState(194);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				var_func_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				num_expression(0);
				setState(198);
				num_ope();
				setState(199);
				num_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				bool_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				num_expression(0);
				setState(203);
				num_ope();
				setState(205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(204);
						num_ope();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(209);
				num_expression(0);
				notifyErrorListeners ("Invalid number operator! Replace it wih '+', '-', '*', '/', or '%'.");
				}
				break;
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

	public static class String_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(MilleniumParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MilleniumParser.OPEN_PAR, i);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MilleniumParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MilleniumParser.CLOSE_PAR, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitString_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(215);
				match(OPEN_PAR);
				setState(216);
				string_expression(0);
				setState(217);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(219);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(220);
				funccall_statement();
				}
				break;
			case 4:
				{
				setState(221);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(222);
				match(OPEN_PAR);
				setState(224); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(223);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(226); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(228);
				string_expression(0);
				setState(229);
				match(CLOSE_PAR);
				notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");
				}
				break;
			case 6:
				{
				setState(232);
				match(OPEN_PAR);
				setState(233);
				string_expression(0);
				setState(234);
				match(CLOSE_PAR);
				setState(236); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(235);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
					setState(244);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(245);
					match(ADDITION_OPE);
					setState(246);
					string_expression(7);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Num_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(MilleniumParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MilleniumParser.OPEN_PAR, i);
		}
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MilleniumParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MilleniumParser.CLOSE_PAR, i);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public List<Num_opeContext> num_ope() {
			return getRuleContexts(Num_opeContext.class);
		}
		public Num_opeContext num_ope(int i) {
			return getRuleContext(Num_opeContext.class,i);
		}
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitNum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		return num_expression(0);
	}

	private Num_expressionContext num_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, _parentState);
		Num_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_num_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(253);
				match(OPEN_PAR);
				setState(254);
				num_expression(0);
				setState(255);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(257);
				num_factor();
				}
				break;
			case 3:
				{
				setState(258);
				match(OPEN_PAR);
				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(259);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(264);
				num_expression(0);
				setState(265);
				match(CLOSE_PAR);
				notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");
				}
				break;
			case 4:
				{
				setState(268);
				match(OPEN_PAR);
				setState(269);
				num_expression(0);
				setState(270);
				match(CLOSE_PAR);
				setState(272); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(271);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(274); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new Num_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281);
						num_ope();
						setState(282);
						num_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Num_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_num_expression);
						setState(284);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(285);
						num_ope();
						setState(287); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(286);
								num_ope();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(289); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(291);
						num_expression(2);
						notifyErrorListeners ("Invalid number operator! Replace it wih '+', '-', '*', '/', or '%'.");
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Num_opeContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public TerminalNode SUBTRACTION_OPE() { return getToken(MilleniumParser.SUBTRACTION_OPE, 0); }
		public TerminalNode MULTIPLICATION_OPE() { return getToken(MilleniumParser.MULTIPLICATION_OPE, 0); }
		public TerminalNode DIVISION_OPE() { return getToken(MilleniumParser.DIVISION_OPE, 0); }
		public TerminalNode MODULO_OPE() { return getToken(MilleniumParser.MODULO_OPE, 0); }
		public Num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_ope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitNum_ope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_opeContext num_ope() throws RecognitionException {
		Num_opeContext _localctx = new Num_opeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << MULTIPLICATION_OPE) | (1L << DIVISION_OPE) | (1L << MODULO_OPE))) != 0)) ) {
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

	public static class Unary_opeContext extends ParserRuleContext {
		public Unary_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterUnary_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitUnary_ope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitUnary_ope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opeContext unary_ope() throws RecognitionException {
		Unary_opeContext _localctx = new Unary_opeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPE || _la==SUBTRACTION_OPE) ) {
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

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(MilleniumParser.CHAR_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(MilleniumParser.INTEGER_LITERAL, 0); }
		public Unary_opeContext unary_ope() {
			return getRuleContext(Unary_opeContext.class,0);
		}
		public TerminalNode FLOAT_LITERAL() { return getToken(MilleniumParser.FLOAT_LITERAL, 0); }
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitNum_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_num_factor);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(304);
					unary_ope();
					}
				}

				setState(307);
				match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(308);
					unary_ope();
					}
				}

				setState(311);
				match(FLOAT_LITERAL);
				}
				break;
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

	public static class Var_func_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(MilleniumParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MilleniumParser.OPEN_PAR, i);
		}
		public List<Var_func_expressionContext> var_func_expression() {
			return getRuleContexts(Var_func_expressionContext.class);
		}
		public Var_func_expressionContext var_func_expression(int i) {
			return getRuleContext(Var_func_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MilleniumParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MilleniumParser.CLOSE_PAR, i);
		}
		public Var_func_factorContext var_func_factor() {
			return getRuleContext(Var_func_factorContext.class,0);
		}
		public Relational_opeContext relational_ope() {
			return getRuleContext(Relational_opeContext.class,0);
		}
		public List<Num_opeContext> num_ope() {
			return getRuleContexts(Num_opeContext.class);
		}
		public Num_opeContext num_ope(int i) {
			return getRuleContext(Num_opeContext.class,i);
		}
		public Var_func_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_func_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_func_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_func_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVar_func_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_func_expressionContext var_func_expression() throws RecognitionException {
		return var_func_expression(0);
	}

	private Var_func_expressionContext var_func_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_func_expressionContext _localctx = new Var_func_expressionContext(_ctx, _parentState);
		Var_func_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_var_func_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(315);
				match(OPEN_PAR);
				setState(316);
				var_func_expression(0);
				setState(317);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(319);
				var_func_factor();
				}
				break;
			case 3:
				{
				setState(320);
				match(OPEN_PAR);
				setState(322); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(321);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(324); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(326);
				var_func_expression(0);
				setState(327);
				match(CLOSE_PAR);
				notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");
				}
				break;
			case 4:
				{
				setState(330);
				match(OPEN_PAR);
				setState(331);
				var_func_expression(0);
				setState(332);
				match(CLOSE_PAR);
				setState(334); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(333);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(336); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new Var_func_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_var_func_expression);
						setState(342);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESS_THAN_OPE:
						case LESS_THAN_EQUAL_TO_OPE:
						case GREATER_THAN_OPE:
						case GREATER_THAN_EQUAL_TO_OPE:
						case EQUAL_OPE:
						case NOT_EQUAL_OPE:
							{
							setState(343);
							relational_ope();
							}
							break;
						case ADDITION_OPE:
						case SUBTRACTION_OPE:
						case MULTIPLICATION_OPE:
						case DIVISION_OPE:
						case MODULO_OPE:
							{
							setState(344);
							num_ope();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(347);
						var_func_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Var_func_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_var_func_expression);
						setState(349);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(350);
						num_ope();
						setState(352); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(351);
								num_ope();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(354); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(356);
						var_func_expression(2);
						notifyErrorListeners ("Invalid number operator! Replace it wih '+', '-', '*', '/', or '%'.");
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Var_func_factorContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Var_func_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_func_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_func_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_func_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVar_func_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_func_factorContext var_func_factor() throws RecognitionException {
		Var_func_factorContext _localctx = new Var_func_factorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_func_factor);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case FUNCTION_CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				funccall_statement();
				}
				break;
			case ADDITION_OPE:
			case SUBTRACTION_OPE:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				num_factor();
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(MilleniumParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MilleniumParser.OPEN_PAR, i);
		}
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MilleniumParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MilleniumParser.CLOSE_PAR, i);
		}
		public TerminalNode NOT_OPE() { return getToken(MilleniumParser.NOT_OPE, 0); }
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Relational_opeContext relational_ope() {
			return getRuleContext(Relational_opeContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUAL_OPE() { return getToken(MilleniumParser.EQUAL_OPE, 0); }
		public TerminalNode NOT_EQUAL_OPE() { return getToken(MilleniumParser.NOT_EQUAL_OPE, 0); }
		public List<Var_func_expressionContext> var_func_expression() {
			return getRuleContexts(Var_func_expressionContext.class);
		}
		public Var_func_expressionContext var_func_expression(int i) {
			return getRuleContext(Var_func_expressionContext.class,i);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Logical_opeContext logical_ope() {
			return getRuleContext(Logical_opeContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_bool_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_OPE) {
					{
					setState(370);
					match(NOT_OPE);
					}
				}

				setState(373);
				match(OPEN_PAR);
				setState(374);
				bool_expression(0);
				setState(375);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(377);
				num_expression(0);
				setState(378);
				relational_ope();
				setState(379);
				num_expression(0);
				}
				break;
			case 3:
				{
				setState(381);
				string_expression(0);
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==EQUAL_OPE || _la==NOT_EQUAL_OPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				string_expression(0);
				}
				break;
			case 4:
				{
				setState(385);
				var_func_expression(0);
				setState(386);
				relational_ope();
				setState(387);
				var_func_expression(0);
				}
				break;
			case 5:
				{
				setState(389);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 6:
				{
				setState(390);
				match(NOT_OPE);
				setState(391);
				match(OPEN_PAR);
				setState(392);
				match(BOOLEAN_LITERAL);
				setState(393);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_OPE) {
					{
					setState(394);
					match(NOT_OPE);
					}
				}

				setState(397);
				match(OPEN_PAR);
				setState(399); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(398);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(401); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(403);
				bool_expression(0);
				setState(404);
				match(CLOSE_PAR);
				notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");
				}
				break;
			case 8:
				{
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_OPE) {
					{
					setState(407);
					match(NOT_OPE);
					}
				}

				setState(410);
				match(OPEN_PAR);
				setState(411);
				bool_expression(0);
				setState(412);
				match(CLOSE_PAR);
				setState(414); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(413);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(416); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
					setState(422);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(423);
					logical_ope();
					setState(424);
					bool_expression(9);
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Relational_opeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN_OPE() { return getToken(MilleniumParser.LESS_THAN_OPE, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPE() { return getToken(MilleniumParser.LESS_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode GREATER_THAN_OPE() { return getToken(MilleniumParser.GREATER_THAN_OPE, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPE() { return getToken(MilleniumParser.GREATER_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode EQUAL_OPE() { return getToken(MilleniumParser.EQUAL_OPE, 0); }
		public TerminalNode NOT_EQUAL_OPE() { return getToken(MilleniumParser.NOT_EQUAL_OPE, 0); }
		public Relational_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterRelational_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitRelational_ope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitRelational_ope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_opeContext relational_ope() throws RecognitionException {
		Relational_opeContext _localctx = new Relational_opeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relational_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPE) | (1L << LESS_THAN_EQUAL_TO_OPE) | (1L << GREATER_THAN_OPE) | (1L << GREATER_THAN_EQUAL_TO_OPE) | (1L << EQUAL_OPE) | (1L << NOT_EQUAL_OPE))) != 0)) ) {
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

	public static class Logical_opeContext extends ParserRuleContext {
		public TerminalNode AND_OPE() { return getToken(MilleniumParser.AND_OPE, 0); }
		public TerminalNode OR_OPE() { return getToken(MilleniumParser.OR_OPE, 0); }
		public Logical_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterLogical_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitLogical_ope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitLogical_ope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opeContext logical_ope() throws RecognitionException {
		Logical_opeContext _localctx = new Logical_opeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logical_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==AND_OPE || _la==OR_OPE) ) {
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

	public static class Const_statementContext extends ParserRuleContext {
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
	 
		public Const_statementContext() { }
		public void copyFrom(Const_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantDeclarationContext extends Const_statementContext {
		public TerminalNode CONSTANT_KEYWORD() { return getToken(MilleniumParser.CONSTANT_KEYWORD, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public ConstantDeclarationContext(Const_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_const_statement);
		int _la;
		try {
			_localctx = new ConstantDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(CONSTANT_KEYWORD);
			setState(436);
			data_type();
			setState(437);
			match(VARIABLE_IDENTIFIER);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSINGMENT_OPE) {
				{
				setState(438);
				var_assignment_statement();
				}
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

	public static class Var_assignment_statementContext extends ParserRuleContext {
		public Var_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment_statement; }
	 
		public Var_assignment_statementContext() { }
		public void copyFrom(Var_assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAssignmentContext extends Var_assignment_statementContext {
		public TerminalNode ASSINGMENT_OPE() { return getToken(MilleniumParser.ASSINGMENT_OPE, 0); }
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public VarAssignmentContext(Var_assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_assignment_statementContext var_assignment_statement() throws RecognitionException {
		Var_assignment_statementContext _localctx = new Var_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_var_assignment_statement);
		try {
			_localctx = new VarAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ASSINGMENT_OPE);
			setState(442);
			assignment_factor();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewAssignmentContext extends Assignment_statementContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSINGMENT_OPE() { return getToken(MilleniumParser.ASSINGMENT_OPE, 0); }
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public NewAssignmentContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNewAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNewAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitNewAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementOrIncrementContext extends Assignment_statementContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode INCREMENT_OPE() { return getToken(MilleniumParser.INCREMENT_OPE, 0); }
		public TerminalNode DECREMENT_OPE() { return getToken(MilleniumParser.DECREMENT_OPE, 0); }
		public DecrementOrIncrementContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterDecrementOrIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitDecrementOrIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitDecrementOrIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentWithOpeContext extends Assignment_statementContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Assignment_num_opeContext assignment_num_ope() {
			return getRuleContext(Assignment_num_opeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public AssignmentWithOpeContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignmentWithOpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignmentWithOpe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitAssignmentWithOpe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_statement);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new NewAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(VARIABLE_IDENTIFIER);
				setState(445);
				match(ASSINGMENT_OPE);
				setState(446);
				assignment_factor();
				}
				break;
			case 2:
				_localctx = new DecrementOrIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(VARIABLE_IDENTIFIER);
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT_OPE || _la==DECREMENT_OPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new AssignmentWithOpeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(VARIABLE_IDENTIFIER);
				setState(450);
				assignment_num_ope();
				setState(454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(451);
					expression();
					}
					break;
				case 2:
					{
					setState(452);
					num_factor();
					}
					break;
				case 3:
					{
					setState(453);
					match(STRING_LITERAL);
					}
					break;
				}
				}
				break;
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

	public static class Assignment_num_opeContext extends ParserRuleContext {
		public TerminalNode ADDITION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.ADDITION_ASSIGNMENT_OPE, 0); }
		public TerminalNode SUBTRACTION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.SUBTRACTION_ASSIGNMENT_OPE, 0); }
		public TerminalNode MULTIPLICATION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.MULTIPLICATION_ASSIGNMENT_OPE, 0); }
		public TerminalNode DIVISION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.DIVISION_ASSIGNMENT_OPE, 0); }
		public Assignment_num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignment_num_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignment_num_ope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitAssignment_num_ope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_num_opeContext assignment_num_ope() throws RecognitionException {
		Assignment_num_opeContext _localctx = new Assignment_num_opeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_ASSIGNMENT_OPE) | (1L << SUBTRACTION_ASSIGNMENT_OPE) | (1L << MULTIPLICATION_ASSIGNMENT_OPE) | (1L << DIVISION_ASSIGNMENT_OPE))) != 0)) ) {
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

	public static class Assignment_factorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Assignment_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignment_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignment_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitAssignment_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_factorContext assignment_factor() throws RecognitionException {
		Assignment_factorContext _localctx = new Assignment_factorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment_factor);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				num_factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(BOOLEAN_LITERAL);
				}
				break;
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

	public static class Funccall_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION_CALL() { return getToken(MilleniumParser.FUNCTION_CALL, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunccall_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFunccall_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funccall_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(FUNCTION_CALL);
			setState(467);
			match(FUNCTION_IDENTIFIER);
			setState(468);
			match(OPEN_PAR);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << NOT_OPE) | (1L << FUNCTION_CALL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				setState(469);
				actual_parameter_list();
				}
			}

			setState(472);
			match(CLOSE_PAR);
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

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitActual_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitActual_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			actual_params();
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

	public static class Actual_paramsContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitActual_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitActual_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actual_params);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(VARIABLE_IDENTIFIER);
				setState(477);
				match(ENUMERATION);
				setState(478);
				actual_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				expression();
				setState(481);
				match(ENUMERATION);
				setState(482);
				actual_params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				expression();
				}
				break;
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

	public static class Conditional_factorContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Conditional_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConditional_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConditional_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitConditional_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_factorContext conditional_factor() throws RecognitionException {
		Conditional_factorContext _localctx = new Conditional_factorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_factor);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				bool_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(BOOLEAN_LITERAL);
				}
				break;
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_CONDITIONAL() { return getToken(MilleniumParser.IF_CONDITIONAL, 0); }
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF_CONDITIONAL() { return getTokens(MilleniumParser.ELSE_IF_CONDITIONAL); }
		public TerminalNode ELSE_IF_CONDITIONAL(int i) {
			return getToken(MilleniumParser.ELSE_IF_CONDITIONAL, i);
		}
		public List<TerminalNode> ELSE_CONDITIONAL() { return getTokens(MilleniumParser.ELSE_CONDITIONAL); }
		public TerminalNode ELSE_CONDITIONAL(int i) {
			return getToken(MilleniumParser.ELSE_CONDITIONAL, i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(IF_CONDITIONAL);
			setState(492);
			conditional_block();
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_CONDITIONAL) {
				{
				{
				setState(493);
				match(ELSE_IF_CONDITIONAL);
				setState(494);
				conditional_block();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_CONDITIONAL) {
				{
				{
				setState(500);
				match(ELSE_CONDITIONAL);
				setState(501);
				code_block();
				}
				}
				setState(506);
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

	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CURLY_BRACK() { return getToken(MilleniumParser.OPEN_CURLY_BRACK, 0); }
		public TerminalNode CLOSE_CURLY_BRACK() { return getToken(MilleniumParser.CLOSE_CURLY_BRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConditional_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConditional_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitConditional_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(OPEN_PAR);
			setState(508);
			conditional_factor();
			setState(509);
			match(CLOSE_PAR);
			setState(510);
			match(OPEN_CURLY_BRACK);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_LOOP) | (1L << PRINT) | (1L << PRINT_NL) | (1L << SCAN) | (1L << COMMENT_BLOCK) | (1L << CONSTANT_KEYWORD) | (1L << FUNCTION_CALL) | (1L << RETURN) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(511);
				statement();
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(CLOSE_CURLY_BRACK);
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACK() { return getToken(MilleniumParser.OPEN_CURLY_BRACK, 0); }
		public TerminalNode CLOSE_CURLY_BRACK() { return getToken(MilleniumParser.CLOSE_CURLY_BRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(OPEN_CURLY_BRACK);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_LOOP) | (1L << PRINT) | (1L << PRINT_NL) | (1L << SCAN) | (1L << COMMENT_BLOCK) | (1L << CONSTANT_KEYWORD) | (1L << FUNCTION_CALL) | (1L << RETURN) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(520);
				statement();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(CLOSE_CURLY_BRACK);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(MilleniumParser.WHILE_LOOP, 0); }
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(WHILE_LOOP);
			setState(529);
			conditional_block();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO_LOOP() { return getToken(MilleniumParser.DO_LOOP, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(MilleniumParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_do_while_statement);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(DO_LOOP);
				setState(532);
				code_block();
				setState(533);
				match(WHILE_LOOP);
				setState(534);
				match(OPEN_PAR);
				setState(535);
				conditional_factor();
				setState(536);
				match(CLOSE_PAR);
				setState(537);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(DO_LOOP);
				setState(540);
				code_block();
				setState(541);
				match(WHILE_LOOP);
				setState(542);
				match(OPEN_PAR);
				setState(543);
				conditional_factor();
				setState(544);
				match(CLOSE_PAR);
				notifyErrorListeners("Insert ';' to complete statement'");
				}
				break;
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(MilleniumParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public List<TerminalNode> END() { return getTokens(MilleniumParser.END); }
		public TerminalNode END(int i) {
			return getToken(MilleniumParser.END, i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_assignment_statementContext for_assignment_statement() {
			return getRuleContext(For_assignment_statementContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(FOR_LOOP);
			setState(550);
			match(OPEN_PAR);
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				{
				setState(551);
				for_assignment_statement();
				}
				break;
			case INT_DTYPE:
			case FLOAT_DTYPE:
			case CHAR_DTYPE:
			case STRING_DTYPE:
			case BOOLEAN_DTYPE:
				{
				setState(552);
				data_type();
				setState(553);
				for_assignment_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(557);
			match(END);
			setState(558);
			bool_expression(0);
			setState(559);
			match(END);
			setState(560);
			assignment_statement();
			setState(561);
			match(CLOSE_PAR);
			setState(562);
			code_block();
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

	public static class For_assignment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSINGMENT_OPE() { return getToken(MilleniumParser.ASSINGMENT_OPE, 0); }
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public TerminalNode INCREMENT_OPE() { return getToken(MilleniumParser.INCREMENT_OPE, 0); }
		public TerminalNode DECREMENT_OPE() { return getToken(MilleniumParser.DECREMENT_OPE, 0); }
		public Assignment_num_opeContext assignment_num_ope() {
			return getRuleContext(Assignment_num_opeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public For_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFor_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFor_assignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitFor_assignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_assignment_statementContext for_assignment_statement() throws RecognitionException {
		For_assignment_statementContext _localctx = new For_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_for_assignment_statement);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(VARIABLE_IDENTIFIER);
				setState(565);
				match(ASSINGMENT_OPE);
				setState(566);
				assignment_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(VARIABLE_IDENTIFIER);
				setState(568);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT_OPE || _la==DECREMENT_OPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(VARIABLE_IDENTIFIER);
				setState(570);
				assignment_num_ope();
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(571);
					expression();
					}
					break;
				case 2:
					{
					setState(572);
					num_factor();
					}
					break;
				case 3:
					{
					setState(573);
					match(STRING_LITERAL);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				match(VARIABLE_IDENTIFIER);
				notifyErrorListeners("Variable must be initialized!");
				}
				break;
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MilleniumParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_return_statement);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(RETURN);
				setState(585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(581);
					expression();
					}
					break;
				case 2:
					{
					setState(582);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(583);
					match(BOOLEAN_LITERAL);
					}
					break;
				case 4:
					{
					setState(584);
					num_factor();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				match(RETURN);
				setState(588);
				data_type();
				notifyErrorListeners("Invalid return type! Replace with a data type value or expression.");
				}
				break;
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

	public static class Scan_statementContext extends ParserRuleContext {
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	 
		public Scan_statementContext() { }
		public void copyFrom(Scan_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScanContext extends Scan_statementContext {
		public TerminalNode SCAN() { return getToken(MilleniumParser.SCAN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public ScanContext(Scan_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_scan_statement);
		try {
			_localctx = new ScanContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(SCAN);
			setState(594);
			match(OPEN_PAR);
			setState(595);
			match(VARIABLE_IDENTIFIER);
			setState(596);
			match(CLOSE_PAR);
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

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(MilleniumParser.PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public PrintContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintNewLineContext extends Print_statementContext {
		public TerminalNode PRINT_NL() { return getToken(MilleniumParser.PRINT_NL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public PrintNewLineContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterPrintNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitPrintNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MilleniumVisitor ) return ((MilleniumVisitor<? extends T>)visitor).visitPrintNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_print_statement);
		try {
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(PRINT);
				setState(599);
				match(OPEN_PAR);
				setState(600);
				expression();
				setState(601);
				match(CLOSE_PAR);
				}
				break;
			case PRINT_NL:
				_localctx = new PrintNewLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(PRINT_NL);
				setState(604);
				match(OPEN_PAR);
				setState(605);
				expression();
				setState(606);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		case 15:
			return num_expression_sempred((Num_expressionContext)_localctx, predIndex);
		case 19:
			return var_func_expression_sempred((Var_func_expressionContext)_localctx, predIndex);
		case 21:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean num_expression_sempred(Num_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean var_func_expression_sempred(Var_func_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0265\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0083\n\3\3\4\3\4\3\4\5\4\u0088"+
		"\n\4\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\6\3\6\5\6\u0092\n\6\3\6\3\6\5\6\u0096"+
		"\n\6\3\6\3\6\5\6\u009a\n\6\5\6\u009c\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5"+
		"\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b3"+
		"\n\f\3\r\3\r\5\r\u00b7\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6"+
		"\17\u00d0\n\17\r\17\16\17\u00d1\3\17\3\17\3\17\5\17\u00d7\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00e3\n\20\r\20\16\20"+
		"\u00e4\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00ef\n\20\r\20\16"+
		"\20\u00f0\3\20\3\20\5\20\u00f5\n\20\3\20\3\20\3\20\7\20\u00fa\n\20\f\20"+
		"\16\20\u00fd\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0107"+
		"\n\21\r\21\16\21\u0108\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0113"+
		"\n\21\r\21\16\21\u0114\3\21\3\21\5\21\u0119\n\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\6\21\u0122\n\21\r\21\16\21\u0123\3\21\3\21\3\21\7\21\u0129"+
		"\n\21\f\21\16\21\u012c\13\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0134"+
		"\n\24\3\24\3\24\5\24\u0138\n\24\3\24\5\24\u013b\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\6\25\u0145\n\25\r\25\16\25\u0146\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\6\25\u0151\n\25\r\25\16\25\u0152\3\25\3\25\5"+
		"\25\u0157\n\25\3\25\3\25\3\25\5\25\u015c\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\6\25\u0163\n\25\r\25\16\25\u0164\3\25\3\25\3\25\7\25\u016a\n\25\f\25"+
		"\16\25\u016d\13\25\3\26\3\26\3\26\5\26\u0172\n\26\3\27\3\27\5\27\u0176"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u018e\n\27\3\27\3\27"+
		"\6\27\u0192\n\27\r\27\16\27\u0193\3\27\3\27\3\27\3\27\3\27\5\27\u019b"+
		"\n\27\3\27\3\27\3\27\3\27\6\27\u01a1\n\27\r\27\16\27\u01a2\3\27\3\27\5"+
		"\27\u01a7\n\27\3\27\3\27\3\27\3\27\7\27\u01ad\n\27\f\27\16\27\u01b0\13"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01ba\n\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c9\n\34"+
		"\5\34\u01cb\n\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u01d3\n\36\3\37\3"+
		"\37\3\37\3\37\5\37\u01d9\n\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\5!\u01e8\n!\3\"\3\"\5\"\u01ec\n\"\3#\3#\3#\3#\7#\u01f2\n#\f#\16#\u01f5"+
		"\13#\3#\3#\7#\u01f9\n#\f#\16#\u01fc\13#\3$\3$\3$\3$\3$\7$\u0203\n$\f$"+
		"\16$\u0206\13$\3$\3$\3%\3%\7%\u020c\n%\f%\16%\u020f\13%\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u0226\n\'\3(\3(\3(\3(\3(\3(\5(\u022e\n(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0241\n)\3)\3)\5)\u0245\n)\3*\3*\3*\3*\3*\5"+
		"*\u024c\n*\3*\3*\3*\3*\5*\u0252\n*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\5,\u0263\n,\3,\2\6\36 (,-\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\n\3\2\4\b\4\2\33\36$$\3"+
		"\2\33\34\3\2)*\3\2%*\3\2./\3\2+,\3\2\37\"\2\u02a0\2[\3\2\2\2\4\u0082\3"+
		"\2\2\2\6\u0084\3\2\2\2\b\u0089\3\2\2\2\n\u009b\3\2\2\2\f\u009d\3\2\2\2"+
		"\16\u00a0\3\2\2\2\20\u00a4\3\2\2\2\22\u00a6\3\2\2\2\24\u00aa\3\2\2\2\26"+
		"\u00ae\3\2\2\2\30\u00b4\3\2\2\2\32\u00bb\3\2\2\2\34\u00d6\3\2\2\2\36\u00f4"+
		"\3\2\2\2 \u0118\3\2\2\2\"\u012d\3\2\2\2$\u012f\3\2\2\2&\u013a\3\2\2\2"+
		"(\u0156\3\2\2\2*\u0171\3\2\2\2,\u01a6\3\2\2\2.\u01b1\3\2\2\2\60\u01b3"+
		"\3\2\2\2\62\u01b5\3\2\2\2\64\u01bb\3\2\2\2\66\u01ca\3\2\2\28\u01cc\3\2"+
		"\2\2:\u01d2\3\2\2\2<\u01d4\3\2\2\2>\u01dc\3\2\2\2@\u01e7\3\2\2\2B\u01eb"+
		"\3\2\2\2D\u01ed\3\2\2\2F\u01fd\3\2\2\2H\u0209\3\2\2\2J\u0212\3\2\2\2L"+
		"\u0225\3\2\2\2N\u0227\3\2\2\2P\u0244\3\2\2\2R\u0251\3\2\2\2T\u0253\3\2"+
		"\2\2V\u0262\3\2\2\2XZ\5\20\t\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2][\3\2\2\2^_\5\32\16\2_`\7\2\2\3`\3\3\2\2\2a\u0083\5\6\4"+
		"\2bc\5\62\32\2cd\7\32\2\2d\u0083\3\2\2\2ef\5\62\32\2fg\b\3\1\2g\u0083"+
		"\3\2\2\2hi\5\66\34\2ij\7\32\2\2j\u0083\3\2\2\2kl\5<\37\2lm\7\32\2\2m\u0083"+
		"\3\2\2\2n\u0083\5D#\2o\u0083\5J&\2p\u0083\5L\'\2q\u0083\5N(\2rs\5R*\2"+
		"st\7\32\2\2t\u0083\3\2\2\2uv\5T+\2vw\7\32\2\2w\u0083\3\2\2\2xy\5T+\2y"+
		"z\b\3\1\2z\u0083\3\2\2\2{|\5V,\2|}\7\32\2\2}\u0083\3\2\2\2~\177\5V,\2"+
		"\177\u0080\b\3\1\2\u0080\u0083\3\2\2\2\u0081\u0083\7\31\2\2\u0082a\3\2"+
		"\2\2\u0082b\3\2\2\2\u0082e\3\2\2\2\u0082h\3\2\2\2\u0082k\3\2\2\2\u0082"+
		"n\3\2\2\2\u0082o\3\2\2\2\u0082p\3\2\2\2\u0082q\3\2\2\2\u0082r\3\2\2\2"+
		"\u0082u\3\2\2\2\u0082x\3\2\2\2\u0082{\3\2\2\2\u0082~\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\5\3\2\2\2\u0084\u0085\5\b\5\2\u0085\u0087\7\32\2\2\u0086"+
		"\u0088\5\6\4\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2"+
		"\u0089\u008b\5\16\b\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\n\6\2\u008e\t\3\2\2\2\u008f"+
		"\u0091\7<\2\2\u0090\u0092\5\64\33\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\30\2\2\u0094\u0096\5\n\6\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009c\3\2\2\2\u0097\u0099\7<"+
		"\2\2\u0098\u009a\5\64\33\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0097\3\2\2\2\u009c\13\3\2\2"+
		"\2\u009d\u009e\7\61\2\2\u009e\u009f\7\67\2\2\u009f\r\3\2\2\2\u00a0\u00a1"+
		"\t\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a5\5\22\n\2\u00a3\u00a5\5\24\13\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00a7\5\16\b"+
		"\2\u00a7\u00a8\7=\2\2\u00a8\u00a9\5\30\r\2\u00a9\23\3\2\2\2\u00aa\u00ab"+
		"\7\66\2\2\u00ab\u00ac\7=\2\2\u00ac\u00ad\5\30\r\2\u00ad\25\3\2\2\2\u00ae"+
		"\u00af\5\16\b\2\u00af\u00b2\7<\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b3\5"+
		"\26\f\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2\2\u00b4"+
		"\u00b6\7\22\2\2\u00b5\u00b7\5\26\f\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\5H%\2\u00ba"+
		"\31\3\2\2\2\u00bb\u00bc\7\66\2\2\u00bc\u00bd\7\64\2\2\u00bd\u00be\7\22"+
		"\2\2\u00be\u00bf\7\23\2\2\u00bf\u00c0\5H%\2\u00c0\33\3\2\2\2\u00c1\u00d7"+
		"\5\36\20\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5\34"+
		"\17\2\u00c5\u00d7\3\2\2\2\u00c6\u00d7\5(\25\2\u00c7\u00c8\5 \21\2\u00c8"+
		"\u00c9\5\"\22\2\u00c9\u00ca\5 \21\2\u00ca\u00d7\3\2\2\2\u00cb\u00d7\5"+
		",\27\2\u00cc\u00cd\5 \21\2\u00cd\u00cf\5\"\22\2\u00ce\u00d0\5\"\22\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\17\1\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6\u00c2\3\2\2\2\u00d6\u00c6\3\2"+
		"\2\2\u00d6\u00c7\3\2\2\2\u00d6\u00cb\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d7"+
		"\35\3\2\2\2\u00d8\u00d9\b\20\1\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\36"+
		"\20\2\u00db\u00dc\7\23\2\2\u00dc\u00f5\3\2\2\2\u00dd\u00f5\7:\2\2\u00de"+
		"\u00f5\5<\37\2\u00df\u00f5\7<\2\2\u00e0\u00e2\7\22\2\2\u00e1\u00e3\7\22"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\7"+
		"\23\2\2\u00e8\u00e9\b\20\1\2\u00e9\u00f5\3\2\2\2\u00ea\u00eb\7\22\2\2"+
		"\u00eb\u00ec\5\36\20\2\u00ec\u00ee\7\23\2\2\u00ed\u00ef\7\23\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\20\1\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d8\3\2\2\2\u00f4\u00dd\3\2\2\2\u00f4\u00de\3\2\2\2\u00f4\u00df\3\2"+
		"\2\2\u00f4\u00e0\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5\u00fb\3\2\2\2\u00f6"+
		"\u00f7\f\b\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00fa\5\36\20\t\u00f9\u00f6"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\37\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\b\21\1\2\u00ff\u0100\7\22"+
		"\2\2\u0100\u0101\5 \21\2\u0101\u0102\7\23\2\2\u0102\u0119\3\2\2\2\u0103"+
		"\u0119\5&\24\2\u0104\u0106\7\22\2\2\u0105\u0107\7\22\2\2\u0106\u0105\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\5 \21\2\u010b\u010c\7\23\2\2\u010c\u010d\b"+
		"\21\1\2\u010d\u0119\3\2\2\2\u010e\u010f\7\22\2\2\u010f\u0110\5 \21\2\u0110"+
		"\u0112\7\23\2\2\u0111\u0113\7\23\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\b\21\1\2\u0117\u0119\3\2\2\2\u0118\u00fe\3\2\2\2\u0118\u0103\3"+
		"\2\2\2\u0118\u0104\3\2\2\2\u0118\u010e\3\2\2\2\u0119\u012a\3\2\2\2\u011a"+
		"\u011b\f\7\2\2\u011b\u011c\5\"\22\2\u011c\u011d\5 \21\b\u011d\u0129\3"+
		"\2\2\2\u011e\u011f\f\3\2\2\u011f\u0121\5\"\22\2\u0120\u0122\5\"\22\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5 \21\4\u0126\u0127\b\21\1\2\u0127"+
		"\u0129\3\2\2\2\u0128\u011a\3\2\2\2\u0128\u011e\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b!\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\t\3\2\2\u012e#\3\2\2\2\u012f\u0130\t\4\2\2\u0130"+
		"%\3\2\2\2\u0131\u013b\79\2\2\u0132\u0134\5$\23\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013b\7\67\2\2\u0136\u0138\5"+
		"$\23\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\78\2\2\u013a\u0131\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0137\3\2"+
		"\2\2\u013b\'\3\2\2\2\u013c\u013d\b\25\1\2\u013d\u013e\7\22\2\2\u013e\u013f"+
		"\5(\25\2\u013f\u0140\7\23\2\2\u0140\u0157\3\2\2\2\u0141\u0157\5*\26\2"+
		"\u0142\u0144\7\22\2\2\u0143\u0145\7\22\2\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\5(\25\2\u0149\u014a\7\23\2\2\u014a\u014b\b\25\1\2\u014b\u0157\3"+
		"\2\2\2\u014c\u014d\7\22\2\2\u014d\u014e\5(\25\2\u014e\u0150\7\23\2\2\u014f"+
		"\u0151\7\23\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\25\1\2\u0155"+
		"\u0157\3\2\2\2\u0156\u013c\3\2\2\2\u0156\u0141\3\2\2\2\u0156\u0142\3\2"+
		"\2\2\u0156\u014c\3\2\2\2\u0157\u016b\3\2\2\2\u0158\u015b\f\7\2\2\u0159"+
		"\u015c\5.\30\2\u015a\u015c\5\"\22\2\u015b\u0159\3\2\2\2\u015b\u015a\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5(\25\b\u015e\u016a\3\2\2\2\u015f"+
		"\u0160\f\3\2\2\u0160\u0162\5\"\22\2\u0161\u0163\5\"\22\2\u0162\u0161\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\5(\25\4\u0167\u0168\b\25\1\2\u0168\u016a\3"+
		"\2\2\2\u0169\u0158\3\2\2\2\u0169\u015f\3\2\2\2\u016a\u016d\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c)\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016e\u0172\7<\2\2\u016f\u0172\5<\37\2\u0170\u0172\5&\24\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172+\3\2\2\2\u0173"+
		"\u0175\b\27\1\2\u0174\u0176\7\60\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\22\2\2\u0178\u0179\5,\27\2\u0179"+
		"\u017a\7\23\2\2\u017a\u01a7\3\2\2\2\u017b\u017c\5 \21\2\u017c\u017d\5"+
		".\30\2\u017d\u017e\5 \21\2\u017e\u01a7\3\2\2\2\u017f\u0180\5\36\20\2\u0180"+
		"\u0181\t\5\2\2\u0181\u0182\5\36\20\2\u0182\u01a7\3\2\2\2\u0183\u0184\5"+
		"(\25\2\u0184\u0185\5.\30\2\u0185\u0186\5(\25\2\u0186\u01a7\3\2\2\2\u0187"+
		"\u01a7\7;\2\2\u0188\u0189\7\60\2\2\u0189\u018a\7\22\2\2\u018a\u018b\7"+
		";\2\2\u018b\u01a7\7\23\2\2\u018c\u018e\7\60\2\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\7\22\2\2\u0190\u0192\7"+
		"\22\2\2\u0191\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5,\27\2\u0196\u0197\7\23"+
		"\2\2\u0197\u0198\b\27\1\2\u0198\u01a7\3\2\2\2\u0199\u019b\7\60\2\2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7\22"+
		"\2\2\u019d\u019e\5,\27\2\u019e\u01a0\7\23\2\2\u019f\u01a1\7\23\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b\27\1\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u0173\3\2\2\2\u01a6\u017b\3\2\2\2\u01a6\u017f\3\2\2\2\u01a6\u0183\3\2"+
		"\2\2\u01a6\u0187\3\2\2\2\u01a6\u0188\3\2\2\2\u01a6\u018d\3\2\2\2\u01a6"+
		"\u019a\3\2\2\2\u01a7\u01ae\3\2\2\2\u01a8\u01a9\f\n\2\2\u01a9\u01aa\5\60"+
		"\31\2\u01aa\u01ab\5,\27\13\u01ab\u01ad\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad"+
		"\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af-\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b2\t\6\2\2\u01b2/\3\2\2\2\u01b3\u01b4\t"+
		"\7\2\2\u01b4\61\3\2\2\2\u01b5\u01b6\7\62\2\2\u01b6\u01b7\5\16\b\2\u01b7"+
		"\u01b9\7<\2\2\u01b8\u01ba\5\64\33\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3"+
		"\2\2\2\u01ba\63\3\2\2\2\u01bb\u01bc\7-\2\2\u01bc\u01bd\5:\36\2\u01bd\65"+
		"\3\2\2\2\u01be\u01bf\7<\2\2\u01bf\u01c0\7-\2\2\u01c0\u01cb\5:\36\2\u01c1"+
		"\u01c2\7<\2\2\u01c2\u01cb\t\b\2\2\u01c3\u01c4\7<\2\2\u01c4\u01c8\58\35"+
		"\2\u01c5\u01c9\5\34\17\2\u01c6\u01c9\5&\24\2\u01c7\u01c9\7:\2\2\u01c8"+
		"\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01be\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c3\3\2\2\2\u01cb"+
		"\67\3\2\2\2\u01cc\u01cd\t\t\2\2\u01cd9\3\2\2\2\u01ce\u01d3\5\34\17\2\u01cf"+
		"\u01d3\5&\24\2\u01d0\u01d3\7:\2\2\u01d1\u01d3\7;\2\2\u01d2\u01ce\3\2\2"+
		"\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3;"+
		"\3\2\2\2\u01d4\u01d5\7\63\2\2\u01d5\u01d6\7=\2\2\u01d6\u01d8\7\22\2\2"+
		"\u01d7\u01d9\5> \2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01db\7\23\2\2\u01db=\3\2\2\2\u01dc\u01dd\5@!\2\u01dd?"+
		"\3\2\2\2\u01de\u01df\7<\2\2\u01df\u01e0\7\30\2\2\u01e0\u01e8\5@!\2\u01e1"+
		"\u01e8\7<\2\2\u01e2\u01e3\5\34\17\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\5"+
		"@!\2\u01e5\u01e8\3\2\2\2\u01e6\u01e8\5\34\17\2\u01e7\u01de\3\2\2\2\u01e7"+
		"\u01e1\3\2\2\2\u01e7\u01e2\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8A\3\2\2\2"+
		"\u01e9\u01ec\5,\27\2\u01ea\u01ec\7;\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01ecC\3\2\2\2\u01ed\u01ee\7\t\2\2\u01ee\u01f3\5F$\2\u01ef\u01f0"+
		"\7\n\2\2\u01f0\u01f2\5F$\2\u01f1\u01ef\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fa\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6\u01f7\7\13\2\2\u01f7\u01f9\5H%\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbE\3\2\2\2"+
		"\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\22\2\2\u01fe\u01ff\5B\"\2\u01ff\u0200"+
		"\7\23\2\2\u0200\u0204\7\24\2\2\u0201\u0203\5\4\3\2\u0202\u0201\3\2\2\2"+
		"\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\25\2\2\u0208G\3\2\2\2\u0209"+
		"\u020d\7\24\2\2\u020a\u020c\5\4\3\2\u020b\u020a\3\2\2\2\u020c\u020f\3"+
		"\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0211\7\25\2\2\u0211I\3\2\2\2\u0212\u0213\7\r\2\2"+
		"\u0213\u0214\5F$\2\u0214K\3\2\2\2\u0215\u0216\7\16\2\2\u0216\u0217\5H"+
		"%\2\u0217\u0218\7\r\2\2\u0218\u0219\7\22\2\2\u0219\u021a\5B\"\2\u021a"+
		"\u021b\7\23\2\2\u021b\u021c\7\32\2\2\u021c\u0226\3\2\2\2\u021d\u021e\7"+
		"\16\2\2\u021e\u021f\5H%\2\u021f\u0220\7\r\2\2\u0220\u0221\7\22\2\2\u0221"+
		"\u0222\5B\"\2\u0222\u0223\7\23\2\2\u0223\u0224\b\'\1\2\u0224\u0226\3\2"+
		"\2\2\u0225\u0215\3\2\2\2\u0225\u021d\3\2\2\2\u0226M\3\2\2\2\u0227\u0228"+
		"\7\f\2\2\u0228\u022d\7\22\2\2\u0229\u022e\5P)\2\u022a\u022b\5\16\b\2\u022b"+
		"\u022c\5P)\2\u022c\u022e\3\2\2\2\u022d\u0229\3\2\2\2\u022d\u022a\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0230\7\32\2\2\u0230\u0231\5,\27\2\u0231"+
		"\u0232\7\32\2\2\u0232\u0233\5\66\34\2\u0233\u0234\7\23\2\2\u0234\u0235"+
		"\5H%\2\u0235O\3\2\2\2\u0236\u0237\7<\2\2\u0237\u0238\7-\2\2\u0238\u0245"+
		"\5:\36\2\u0239\u023a\7<\2\2\u023a\u0245\t\b\2\2\u023b\u023c\7<\2\2\u023c"+
		"\u0240\58\35\2\u023d\u0241\5\34\17\2\u023e\u0241\5&\24\2\u023f\u0241\7"+
		":\2\2\u0240\u023d\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0245\3\2\2\2\u0242\u0243\7<\2\2\u0243\u0245\b)\1\2\u0244\u0236\3\2\2"+
		"\2\u0244\u0239\3\2\2\2\u0244\u023b\3\2\2\2\u0244\u0242\3\2\2\2\u0245Q"+
		"\3\2\2\2\u0246\u024b\7\65\2\2\u0247\u024c\5\34\17\2\u0248\u024c\7:\2\2"+
		"\u0249\u024c\7;\2\2\u024a\u024c\5&\24\2\u024b\u0247\3\2\2\2\u024b\u0248"+
		"\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c\u0252\3\2\2\2\u024d"+
		"\u024e\7\65\2\2\u024e\u024f\5\16\b\2\u024f\u0250\b*\1\2\u0250\u0252\3"+
		"\2\2\2\u0251\u0246\3\2\2\2\u0251\u024d\3\2\2\2\u0252S\3\2\2\2\u0253\u0254"+
		"\7\21\2\2\u0254\u0255\7\22\2\2\u0255\u0256\7<\2\2\u0256\u0257\7\23\2\2"+
		"\u0257U\3\2\2\2\u0258\u0259\7\17\2\2\u0259\u025a\7\22\2\2\u025a\u025b"+
		"\5\34\17\2\u025b\u025c\7\23\2\2\u025c\u0263\3\2\2\2\u025d\u025e\7\20\2"+
		"\2\u025e\u025f\7\22\2\2\u025f\u0260\5\34\17\2\u0260\u0261\7\23\2\2\u0261"+
		"\u0263\3\2\2\2\u0262\u0258\3\2\2\2\u0262\u025d\3\2\2\2\u0263W\3\2\2\2"+
		"=[\u0082\u0087\u008b\u0091\u0095\u0099\u009b\u00a4\u00b2\u00b6\u00d1\u00d6"+
		"\u00e4\u00f0\u00f4\u00fb\u0108\u0114\u0118\u0123\u0128\u012a\u0133\u0137"+
		"\u013a\u0146\u0152\u0156\u015b\u0164\u0169\u016b\u0171\u0175\u018d\u0193"+
		"\u019a\u01a2\u01a6\u01ae\u01b9\u01c8\u01ca\u01d2\u01d8\u01e7\u01eb\u01f3"+
		"\u01fa\u0204\u020d\u0225\u022d\u0240\u0244\u024b\u0251\u0262";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}