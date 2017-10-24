// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MilleniumParser}.
 */
public interface MilleniumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MilleniumParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MilleniumParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MilleniumParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MilleniumParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void enterVardecl_list(MilleniumParser.Vardecl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#vardecl_list}.
	 * @param ctx the parse tree
	 */
	void exitVardecl_list(MilleniumParser.Vardecl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MilleniumParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MilleniumParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_identifier_list(MilleniumParser.Var_identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#var_identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_identifier_list(MilleniumParser.Var_identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#array_size}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(MilleniumParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#array_size}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(MilleniumParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(MilleniumParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(MilleniumParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MilleniumParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MilleniumParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#function_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_return(MilleniumParser.Function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#function_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_return(MilleniumParser.Function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noreturn(MilleniumParser.Function_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#function_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noreturn(MilleniumParser.Function_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MilleniumParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MilleniumParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(MilleniumParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(MilleniumParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(MilleniumParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(MilleniumParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MilleniumParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MilleniumParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(MilleniumParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(MilleniumParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(MilleniumParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(MilleniumParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#num_ope}.
	 * @param ctx the parse tree
	 */
	void enterNum_ope(MilleniumParser.Num_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#num_ope}.
	 * @param ctx the parse tree
	 */
	void exitNum_ope(MilleniumParser.Num_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#unary_ope}.
	 * @param ctx the parse tree
	 */
	void enterUnary_ope(MilleniumParser.Unary_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#unary_ope}.
	 * @param ctx the parse tree
	 */
	void exitUnary_ope(MilleniumParser.Unary_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void enterNum_factor(MilleniumParser.Num_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#num_factor}.
	 * @param ctx the parse tree
	 */
	void exitNum_factor(MilleniumParser.Num_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#var_func_expression}.
	 * @param ctx the parse tree
	 */
	void enterVar_func_expression(MilleniumParser.Var_func_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#var_func_expression}.
	 * @param ctx the parse tree
	 */
	void exitVar_func_expression(MilleniumParser.Var_func_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#var_func_factor}.
	 * @param ctx the parse tree
	 */
	void enterVar_func_factor(MilleniumParser.Var_func_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#var_func_factor}.
	 * @param ctx the parse tree
	 */
	void exitVar_func_factor(MilleniumParser.Var_func_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(MilleniumParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(MilleniumParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#relational_ope}.
	 * @param ctx the parse tree
	 */
	void enterRelational_ope(MilleniumParser.Relational_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#relational_ope}.
	 * @param ctx the parse tree
	 */
	void exitRelational_ope(MilleniumParser.Relational_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#logical_ope}.
	 * @param ctx the parse tree
	 */
	void enterLogical_ope(MilleniumParser.Logical_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#logical_ope}.
	 * @param ctx the parse tree
	 */
	void exitLogical_ope(MilleniumParser.Logical_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(MilleniumParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(MilleniumParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterVar_assignment_statement(MilleniumParser.Var_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitVar_assignment_statement(MilleniumParser.Var_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MilleniumParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MilleniumParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_num_ope(MilleniumParser.Assignment_num_opeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_num_ope(MilleniumParser.Assignment_num_opeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#assignment_factor}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_factor(MilleniumParser.Assignment_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#assignment_factor}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_factor(MilleniumParser.Assignment_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunccall_statement(MilleniumParser.Funccall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#funccall_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunccall_statement(MilleniumParser.Funccall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterActual_parameter_list(MilleniumParser.Actual_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#actual_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitActual_parameter_list(MilleniumParser.Actual_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void enterActual_params(MilleniumParser.Actual_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#actual_params}.
	 * @param ctx the parse tree
	 */
	void exitActual_params(MilleniumParser.Actual_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void enterConditional_factor(MilleniumParser.Conditional_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void exitConditional_factor(MilleniumParser.Conditional_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MilleniumParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MilleniumParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#conditional_block}.
	 * @param ctx the parse tree
	 */
	void enterConditional_block(MilleniumParser.Conditional_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#conditional_block}.
	 * @param ctx the parse tree
	 */
	void exitConditional_block(MilleniumParser.Conditional_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(MilleniumParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(MilleniumParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MilleniumParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MilleniumParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(MilleniumParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(MilleniumParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MilleniumParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MilleniumParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_assignment_statement(MilleniumParser.For_assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_assignment_statement(MilleniumParser.For_assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MilleniumParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MilleniumParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScan_statement(MilleniumParser.Scan_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScan_statement(MilleniumParser.Scan_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MilleniumParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(MilleniumParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MilleniumParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(MilleniumParser.Print_statementContext ctx);
}