// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MilleniumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MilleniumVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MilleniumParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#function_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declarations(MilleniumParser.Function_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MilleniumParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#vardecl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl_list(MilleniumParser.Vardecl_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MilleniumParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MilleniumParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link MilleniumParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(MilleniumParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarIdentifierInDeclaration1}
	 * labeled alternative in {@link MilleniumParser#var_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifierInDeclaration1(MilleniumParser.VarIdentifierInDeclaration1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VarIdentifierInDeclaration2}
	 * labeled alternative in {@link MilleniumParser#var_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdentifierInDeclaration2(MilleniumParser.VarIdentifierInDeclaration2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#array_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_size(MilleniumParser.Array_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(MilleniumParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(MilleniumParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MilleniumParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(MilleniumParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainFunction}
	 * labeled alternative in {@link MilleniumParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(MilleniumParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFactor}
	 * labeled alternative in {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactor(MilleniumParser.ExprFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionOnly}
	 * labeled alternative in {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOnly(MilleniumParser.ExpressionOnlyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFactorNumOpeExpr}
	 * labeled alternative in {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactorNumOpeExpr(MilleniumParser.ExprFactorNumOpeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNumOpeExpr}
	 * labeled alternative in {@link MilleniumParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNumOpeExpr(MilleniumParser.ExprNumOpeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#expression_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_factor(MilleniumParser.Expression_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalBool}
	 * labeled alternative in {@link MilleniumParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBool(MilleniumParser.LogicalBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MilleniumParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MilleniumParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalBool}
	 * labeled alternative in {@link MilleniumParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalBool(MilleniumParser.RelationalBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#num_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_ope(MilleniumParser.Num_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#unary_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_ope(MilleniumParser.Unary_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#num_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_factor(MilleniumParser.Num_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#relational_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_ope(MilleniumParser.Relational_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#logical_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_ope(MilleniumParser.Logical_opeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantDeclaration}
	 * labeled alternative in {@link MilleniumParser#const_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(MilleniumParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link MilleniumParser#var_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(MilleniumParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewAssignment}
	 * labeled alternative in {@link MilleniumParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewAssignment(MilleniumParser.NewAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementOrIncrement}
	 * labeled alternative in {@link MilleniumParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementOrIncrement(MilleniumParser.DecrementOrIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentWithNumOpe}
	 * labeled alternative in {@link MilleniumParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentWithNumOpe(MilleniumParser.AssignmentWithNumOpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#assignment_num_ope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_num_ope(MilleniumParser.Assignment_num_opeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#assignment_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_factor(MilleniumParser.Assignment_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MilleniumParser#funccall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MilleniumParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActual_params(MilleniumParser.Actual_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#conditional_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_factor(MilleniumParser.Conditional_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MilleniumParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#conditional_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_block(MilleniumParser.Conditional_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(MilleniumParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MilleniumParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(MilleniumParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MilleniumParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#for_assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_assignment_statement(MilleniumParser.For_assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(MilleniumParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Scan}
	 * labeled alternative in {@link MilleniumParser#scan_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(MilleniumParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScanThruArr}
	 * labeled alternative in {@link MilleniumParser#scan_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanThruArr(MilleniumParser.ScanThruArrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MilleniumParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MilleniumParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintNewLine}
	 * labeled alternative in {@link MilleniumParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNewLine(MilleniumParser.PrintNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintString}
	 * labeled alternative in {@link MilleniumParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(MilleniumParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFactorPlusPrintFactor}
	 * labeled alternative in {@link MilleniumParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFactorPlusPrintFactor(MilleniumParser.PrintFactorPlusPrintFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFactorPlusExpr}
	 * labeled alternative in {@link MilleniumParser#print_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFactorPlusExpr(MilleniumParser.PrintFactorPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MilleniumParser#print_factor_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_factor_boolean(MilleniumParser.Print_factor_booleanContext ctx);
}