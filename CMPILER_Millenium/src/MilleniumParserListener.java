
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MilleniumParserListener extends MilleniumBaseListener {
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(MilleniumParser.ProgramContext ctx) {
		System.out.println("enterProgram");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(MilleniumParser.ProgramContext ctx) { 
		System.out.println("exitProgram");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(MilleniumParser.StatementContext ctx) {
		System.out.println("enterStatement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(MilleniumParser.StatementContext ctx) {
		System.out.println("exitStatement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVardecl_list(MilleniumParser.Vardecl_listContext ctx) {
		System.out.println("enterVardecl_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVardecl_list(MilleniumParser.Vardecl_listContext ctx) { 
		System.out.println("exitVardecl_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_decl(MilleniumParser.Var_declContext ctx) {
		System.out.println("enterVar_decl");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_decl(MilleniumParser.Var_declContext ctx) {
		System.out.println("exitVar_decl");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_identifier_list(MilleniumParser.Var_identifier_listContext ctx) {
		System.out.println("enterVar_identifier_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_identifier_list(MilleniumParser.Var_identifier_listContext ctx) { 
		System.out.println("exitVar_identifier_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterArray_size(MilleniumParser.Array_sizeContext ctx) {
		System.out.println("enterArray_size");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitArray_size(MilleniumParser.Array_sizeContext ctx) {
		System.out.println("exitArray_size");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterData_type(MilleniumParser.Data_typeContext ctx) {
		System.out.println("enterData_type");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitData_type(MilleniumParser.Data_typeContext ctx) {
		System.out.println("exitData_type");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_declaration(MilleniumParser.Function_declarationContext ctx) {
		System.out.println("enterFunction_declaration");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_declaration(MilleniumParser.Function_declarationContext ctx) {
		System.out.println("exitFunction_declaration");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_return(MilleniumParser.Function_returnContext ctx) {
		System.out.println("enterFunction_return");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_return(MilleniumParser.Function_returnContext ctx) { 
		System.out.println("exitFunction_return");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_noreturn(MilleniumParser.Function_noreturnContext ctx) {
		System.out.println("enterFunction_noreturn");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_noreturn(MilleniumParser.Function_noreturnContext ctx) {
		System.out.println("exitFunction_noreturn");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParameters(MilleniumParser.ParametersContext ctx) { 
		System.out.println("enterParameters");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParameters(MilleniumParser.ParametersContext ctx) {
		System.out.println("exitParameters");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunction_block(MilleniumParser.Function_blockContext ctx) {
		System.out.println("enterFunction_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction_block(MilleniumParser.Function_blockContext ctx) {
		System.out.println("exitFunction_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMain_function(MilleniumParser.Main_functionContext ctx) { 
		System.out.println("enterMain_function");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMain_function(MilleniumParser.Main_functionContext ctx) {
		System.out.println("exitMain_function");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(MilleniumParser.ExpressionContext ctx) {
		System.out.println("enterExpression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(MilleniumParser.ExpressionContext ctx) {
		System.out.println("exitExpression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterString_expression(MilleniumParser.String_expressionContext ctx) { 
		System.out.println("enterString_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitString_expression(MilleniumParser.String_expressionContext ctx) {
		System.out.println("exitString_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNum_expression(MilleniumParser.Num_expressionContext ctx) {
		System.out.println("enterNum_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNum_expression(MilleniumParser.Num_expressionContext ctx) {
		System.out.println("exitNum_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNum_ope(MilleniumParser.Num_opeContext ctx) {
		System.out.println("enterNum_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNum_ope(MilleniumParser.Num_opeContext ctx) {
		System.out.println("exitNum_ope");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterUnary_ope(MilleniumParser.Unary_opeContext ctx) { 
		System.out.println("enterUnary_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitUnary_ope(MilleniumParser.Unary_opeContext ctx) {
		System.out.println("exitUnary_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNum_factor(MilleniumParser.Num_factorContext ctx) { System.out.println("enterNum_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNum_factor(MilleniumParser.Num_factorContext ctx) { System.out.println("exitNum_factor");}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_func_expression(MilleniumParser.Var_func_expressionContext ctx) {
		System.out.println("enterVar_func_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_func_expression(MilleniumParser.Var_func_expressionContext ctx) {
		System.out.println("exitVar_func_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_func_factor(MilleniumParser.Var_func_factorContext ctx) { 
		System.out.println("enterVar_func_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_func_factor(MilleniumParser.Var_func_factorContext ctx) {
		System.out.println("exitVar_func_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBool_expression(MilleniumParser.Bool_expressionContext ctx) {
		System.out.println("enterBool_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBool_expression(MilleniumParser.Bool_expressionContext ctx) { 
		System.out.println("exitBool_expression");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelational_ope(MilleniumParser.Relational_opeContext ctx) { 
		System.out.println("enterRelational_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelational_ope(MilleniumParser.Relational_opeContext ctx) {
		System.out.println("exitRelational_ope");
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLogical_ope(MilleniumParser.Logical_opeContext ctx) {
		System.out.println("enterLogical_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLogical_ope(MilleniumParser.Logical_opeContext ctx) { 
		System.out.println("exitLogical_ope");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConst_statement(MilleniumParser.Const_statementContext ctx) {
		System.out.println("enterConst_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConst_statement(MilleniumParser.Const_statementContext ctx) { 
		System.out.println("exitConst_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar_assignment_statement(MilleniumParser.Var_assignment_statementContext ctx) { 
		System.out.println("enterVar_assignment_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar_assignment_statement(MilleniumParser.Var_assignment_statementContext ctx) {
		System.out.println("exitVar_assignment_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment_statement(MilleniumParser.Assignment_statementContext ctx) {
		System.out.println("enterAssignment_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment_statement(MilleniumParser.Assignment_statementContext ctx) {
		System.out.println("exitAssignment_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment_factor(MilleniumParser.Assignment_factorContext ctx) {
		System.out.println("enterAssignment_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment_factor(MilleniumParser.Assignment_factorContext ctx) {
		System.out.println("exitAssignment_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunccall_statement(MilleniumParser.Funccall_statementContext ctx) {
		System.out.println("enterFunccall_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunccall_statement(MilleniumParser.Funccall_statementContext ctx) {
		System.out.println("exitFunccall_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActual_parameter_list(MilleniumParser.Actual_parameter_listContext ctx) {
		System.out.println("enterActual_parameter_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActual_parameter_list(MilleniumParser.Actual_parameter_listContext ctx) {
		System.out.println("exitActual_parameter_list");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterActual_params(MilleniumParser.Actual_paramsContext ctx) { 
		System.out.println("enterActual_params");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitActual_params(MilleniumParser.Actual_paramsContext ctx) {
		System.out.println("exitActual_params");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional_factor(MilleniumParser.Conditional_factorContext ctx) {
		System.out.println("enterConditional_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional_factor(MilleniumParser.Conditional_factorContext ctx) {
		System.out.println("exitConditional_factor");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIf_statement(MilleniumParser.If_statementContext ctx) {
		System.out.println("enterIf_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIf_statement(MilleniumParser.If_statementContext ctx) {
		System.out.println("exitIf_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConditional_block(MilleniumParser.Conditional_blockContext ctx) {
		System.out.println("enterConditional_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConditional_block(MilleniumParser.Conditional_blockContext ctx) {
		System.out.println("exitConditional_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCode_block(MilleniumParser.Code_blockContext ctx) { 
		System.out.println("enterCode_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCode_block(MilleniumParser.Code_blockContext ctx) { 
		System.out.println("exitCode_block");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhile_statement(MilleniumParser.While_statementContext ctx) {
		System.out.println("enterWhile_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_statement(MilleniumParser.While_statementContext ctx) {
		System.out.println("exitWhile_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDo_while_statement(MilleniumParser.Do_while_statementContext ctx) { 
		System.out.println("enterDo_while_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDo_while_statement(MilleniumParser.Do_while_statementContext ctx) {
		System.out.println("exitDo_while_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFor_statement(MilleniumParser.For_statementContext ctx) {
		System.out.println("enterFor_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFor_statement(MilleniumParser.For_statementContext ctx) {
		System.out.println("exitFor_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturn_statement(MilleniumParser.Return_statementContext ctx) {
		System.out.println("enterReturn_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturn_statement(MilleniumParser.Return_statementContext ctx) {
		System.out.println("exitReturn_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterScan_statement(MilleniumParser.Scan_statementContext ctx) {
		System.out.println("enterScan_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitScan_statement(MilleniumParser.Scan_statementContext ctx) { 
		System.out.println("exitScan_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPrint_statement(MilleniumParser.Print_statementContext ctx) { 
		System.out.println("enterPrint_statement");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrint_statement(MilleniumParser.Print_statementContext ctx) {
		System.out.println("exitPrint_statement");
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { 
		System.out.println("enterEveryRule");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) {
		System.out.println("exitEveryRule");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { 
		System.out.println("visitTerminal");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { 
		System.out.println("visitErrorNode");
	}

}
