//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Stack;
//
//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
//import javax.script.ScriptException;
//
//import org.antlr.v4.codegen.model.chunk.ThisRulePropertyRef_ctx;
//import org.antlr.v4.runtime.RuleContext;
//import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.ParseTreeWalker;
//import org.antlr.v4.runtime.tree.TerminalNode;
//
//import utils.StringUtils;
//
//
//public class MilleniumBaseImplementor extends MilleniumBaseVisitor<MilleniumValue>{
//	
//	private Stack<Scope> scopes;
//	private String currScope;
//	private String currVarIdentifier;
//	private String currVarDataType;
//	private String currFuncIdentifier;
//	private String currFuncReturnType;
//	private boolean isCurrVarConstant;
//	private boolean hasError;
//	private ArrayList<MilleniumFunction> definedFuncs;
//	private MilleniumView milleniumView;
//	private String currExpression, currNumExpression;
//	private MilleniumRules currRule;
//	
//	private MilleniumSemanticErrors semanticErrors;
//	
//	public MilleniumBaseImplementor(MilleniumView milleniumView){
//		this.milleniumView = milleniumView;
//		scopes = new Stack<Scope>();
//		scopes.push(new Scope("Global", null)); //main function
//		semanticErrors = new MilleniumSemanticErrors(milleniumView);
//		hasError = false;
//		definedFuncs = new ArrayList<MilleniumFunction>();
//		currExpression = "";
//		currNumExpression = "";
//		currRule = MilleniumRules.None;
//	}
//	
//	//Add Variable to ST
//	public void addVarToSymbolTable(String value){
//		MilleniumValue val = null;
//		val = new MilleniumValue(value, currVarDataType, 
//				semanticErrors);
//		val.setIdentifier(currVarIdentifier);
//		
//		if(isCurrVarConstant){
//			val.setConstantFlag(true);
//			//System.out.println("val marked as constant!");
//		}
//
//		if(val.getDataType() != null){
//			scopes.peek().addToSymbolTable(val);
//			//System.out.println("Added Var to Symbol Table Successfully!");
//		}
//	}
//	
//	//Add Array to ST
//	public void addArrToSymbolTable(MilleniumArray arr){
//		scopes.peek().addToSymbolTable(arr);
//		//System.out.println("Added Arr to Symbol Table Successfully!");
//	}
//	
//	//Add Parameter Var to ST
//	public void addParamAsVarToSymbolTable(MilleniumValue val){		
//		if(isCurrVarConstant){
//			val.setConstantFlag(true);
//			//System.out.println("val marked as constant!");
//		}
//
//		if(val.getDataType() != null){
//			scopes.peek().addToSymbolTable(val);
//			//System.out.println("Added Var to Symbol Table Successfully!");
//		}
//	}
//	
//	//Add Function to ST
//	public void addFuncToSymbolTable(ArrayList<MilleniumValue> parameters){
//		MilleniumFunction func = null;
//		func = new MilleniumFunction(currFuncReturnType, parameters, semanticErrors);
//		func.setIdentifier(currFuncIdentifier);
//		scopes.peek().addToSymbolTable(func);
//		//System.out.println("Added Func to Symbol Table Successfully!");
//	}
//	
//	//Find Scope
//	public Scope findScope(String name){
//		for(int i =0; i < scopes.size(); i++){
//			if(scopes.get(i).getName().equals(name))
//				return scopes.get(i);
//		}
//		return null;
//
//	}
//	
//	//Find function 
//	public MilleniumFunction findFunc(String funcIdentifier){
//		for (int i = 0; i < definedFuncs.size(); i++){
//			//change to equals signature later
//			//System.out.println("DefinedFunc: " + definedFuncs.get(i).getIdentifier());
//			//System.out.println("funcIdentifier: " + funcIdentifier);
//			
//			if (definedFuncs.get(i).getIdentifier().equals(funcIdentifier))
//				return definedFuncs.get(i);
//		}
//		
//		return null;
//	}
//	
//
//	//Variable Declaration (Data Type)
//	@Override 
//	public MilleniumValue visitVariableDeclaration(MilleniumParser.VariableDeclarationContext ctx) 
//	{ 
//		isCurrVarConstant = false; 
//		//System.out.println("Data Type: " + ctx.data_type().getText());
//		currVarDataType = ctx.data_type().getText(); //get data type of variable
//
//		return visitChildren(ctx); 
//	}
//	
//	//Array Declaration
//	@Override 
//	public MilleniumValue visitArrayDeclaration(MilleniumParser.ArrayDeclarationContext ctx) 
//	{ 
//		if((scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText())) == null){
//			if(ctx.array_size().INTEGER_LITERAL() != null){
//				int size = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
//				MilleniumArray arr = new MilleniumArray (size, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
//				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
//				addArrToSymbolTable(arr);
//			}else{
//				//TODO
//				//temp yung 1 pls change
//				MilleniumArray arr = new MilleniumArray (1, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
//				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
//				addArrToSymbolTable(arr);
//			}
//		}else{
//			//Array is already defined
//			//System.out.println("Declared Array: " + ctx.VARIABLE_IDENTIFIER().getText());
//			semanticErrors.setSpecificIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
//			semanticErrors.addError(ctx.getStart().getLine() + "", 
//					ctx.getStart().getCharPositionInLine() + "", 
//					SemanticErrors.MULTIPLE_VAR_DECLARATION);
//		}
//
//		return visitChildren(ctx); 
//	}
//	
//	//Variable Declaration (Identifier)
//	@Override 
//	public MilleniumValue visitVarIdentifierInDeclaration1(MilleniumParser.VarIdentifierInDeclaration1Context ctx) 
//	{ 
//		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
//		//System.out.println("Value Identifier1: " + currVarIdentifier);
//		if(scopes.peek().getAVar(currVarIdentifier) != null){
//			semanticErrors.setSpecificIdentifier(currVarIdentifier);
//			semanticErrors.addError(ctx.getStart().getLine() + "", 
//					ctx.getStart().getCharPositionInLine() + "", 
//					SemanticErrors.MULTIPLE_VAR_DECLARATION);
//		}
//		return visitChildren(ctx); 
//	}
//	
//	//Variable Declaration w/ No Assignment
//	@Override 
//	public MilleniumValue visitVarIdentifierInDeclaration2(MilleniumParser.VarIdentifierInDeclaration2Context ctx) 
//	{ 
//		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
//		//System.out.println("Value Identifier2: " + currVarIdentifier);
//		if((scopes.peek().getAVar(currVarIdentifier)) != null){
//			semanticErrors.setSpecificIdentifier(currVarIdentifier);
//			semanticErrors.addError(ctx.getStart().getLine() + "", 
//					ctx.getStart().getCharPositionInLine() + "", 
//					SemanticErrors.MULTIPLE_VAR_DECLARATION);
//		}else if (ctx.var_assignment_statement() == null){ //no assignment
//			addVarToSymbolTable(null);
//		}
//
//		return visitChildren(ctx); 
//	}
//	
//	//Variable Assignment
//	@Override 
//	public MilleniumValue visitVarAssignment(MilleniumParser.VarAssignmentContext ctx) 
//	{ 
//		MilleniumValue val = null;
//		
//		
//		if(ctx.assignment_factor() != null){
//			//attach line numbers & char position in line
//			semanticErrors.setLine(ctx.getStart().getLine() + "");
//			semanticErrors.setCharPositionInLine(ctx.getStart().getCharPositionInLine() + "");
//			val = new MilleniumValue(null, currVarDataType, 
//					semanticErrors);
//			//System.out.println("VAR ASSIGNENT: " + currVarIdentifier);
//			addVarToSymbolTable(ctx.assignment_factor().getText());
//			//System.out.println("Value: " + ctx.assignment_factor().getText());
//		}
//		
//		currRule = MilleniumRules.VarAssignment;
//		return visitChildren(ctx); 
//	}
//	
//	//Constant Declaration
//	@Override public MilleniumValue visitConstantDeclaration(MilleniumParser.ConstantDeclarationContext ctx) 
//	{ 
//		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
//		currVarDataType = ctx.data_type().getText(); //get data type of constant variable
//		isCurrVarConstant = true;
//		//System.out.println("Value Identifier of Constant: " + currVarIdentifier);
//		
//
//		return visitChildren(ctx); 
//	}
//	
//	//New Assignment
//	@Override public MilleniumValue visitNewAssignment(MilleniumParser.NewAssignmentContext ctx) 
//	{ 
//		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
//		MilleniumValue variable = scopes.peek().getAVar(currVarIdentifier);
//		
//			
//		//Check for constant re-assignment
//		if((variable != null) && (variable.isConstantFlag() == true))
//		{
//			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "", SemanticErrors.CONSTANT_REASSIGNMENT);
//		}else{
//			//Assign new value
//			MilleniumValue newVal = null;
//			
//			if(ctx.assignment_factor().expression() != null){
//				newVal = this.visit(ctx.assignment_factor().expression());
//				//System.out.println("NEW VAL:" + newVal);
//				//System.out.println("VALUE:" + variable.getValue().toString());
//			}
//			//TODO dagdag pa
//			
//			//System.out.println(ctx.assignment_factor().expression().getText());
//			
//			//Check if array
//			if(ctx.array_size() != null){
//				int index;
//				if(ctx.array_size().VARIABLE_IDENTIFIER() != null){
//					//access index thru a var
//					index  =(Integer)scopes.peek().getAVar(ctx.array_size().VARIABLE_IDENTIFIER().getText()).getValue();
//				}else{
//					index = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
//				}
//				
//				DataType dataType = scopes.peek().getAnArr(currVarIdentifier).getDataType();
//			
//				if(newVal != null){
//					MilleniumValue newArrVal = new MilleniumValue(newVal.getValue(), dataType);
//					scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).setValueAt(new MilleniumValue(newArrVal.getValue(), dataType), index);
//				}
//				
//			}
//			//not an array
//			else{
//				if(newVal.getValue() != null)
//					variable.setValue(newVal.getValue());
//			}
//		}
//		
//		return null; 
//	}
//	
//	//Function Declaration
//	@Override
//	public MilleniumValue visitFunction_declaration(MilleniumParser.Function_declarationContext ctx){
//		if(findScope(ctx.FUNCTION_IDENTIFIER().getText()) != null){
//			semanticErrors.setSpecificIdentifier(ctx.FUNCTION_IDENTIFIER().getText());
//			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "",
//					SemanticErrors.MULTIPLE_FUNC_DECLARATION
//					);	
//		}else{
//			currFuncIdentifier = ctx.FUNCTION_IDENTIFIER().getText();
//			
//			//Check if there's a return statement
//			List<MilleniumParser.StatementContext> statements = ctx.function_block().code_block().statement();
//			boolean isReturn = false;
//			int line = 0;
//			String charPositionInLine = "";
//			
//			for(int i = 0; i < statements.size(); i++){
//				if(statements.get(i).return_statement() != null)
//					isReturn = true;
//				
//				line = statements.get(i).getStop().getLine();
//				charPositionInLine = statements.get(i).getStop().getCharPositionInLine() + "";
//			}
//
//			if(ctx.VOID() != null){
//				currFuncReturnType = ctx.VOID().getText();
//				//Check if there's a return statement
//				if(isReturn){
//					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
//					semanticErrors.addError(line + "", charPositionInLine, SemanticErrors.UNEXPECTING_RETURN);				
//				}					
//			}
//			else{
//				currFuncReturnType = ctx.data_type().getText();
//				//Check if there's a return statement
//				if(!isReturn){
//					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
//					semanticErrors.addError(line+1 + "", charPositionInLine, SemanticErrors.EXPECTING_RETURN);				
//				}
//
//			}
//
//			List<MilleniumParser.ParametersContext> parameters = ctx.function_block().parameters();
//			ArrayList<MilleniumValue> arrayParameters = new ArrayList<MilleniumValue>();
//			MilleniumValue val = null;
//			
//			if(parameters != null){
//				for(MilleniumParser.ParametersContext parameter : parameters){
//					
//					val = new MilleniumValue(null, parameter.data_type().getText(),
//							semanticErrors);
//					val.setIdentifier(parameter.VARIABLE_IDENTIFIER().getText());
//					arrayParameters.add(val);
//					
//				}	
//			}
//			
//			//System.out.println("Func: " + currFuncIdentifier);
//			//System.out.println("Return: " + currFuncReturnType);
//			//System.out.println("Parent Context: " + ctx.getParent());
//			MilleniumFunction func = new MilleniumFunction(currFuncReturnType, arrayParameters, semanticErrors);
//			func.setIdentifier(currFuncIdentifier);
//			
//			//Add function in arraylist and scopes
//			definedFuncs.add(func);
//			scopes.push(new Scope(ctx.FUNCTION_IDENTIFIER().getText(), ctx.getParent()));
//			
//			//Add params to ST
//			for(int i = 0; i < arrayParameters.size(); i++){
//				addParamAsVarToSymbolTable(arrayParameters.get(i));				
//			}
//			
//			currScope = currFuncIdentifier;
//		}
//		//scopes.push(new Scope(ctx.FUNCTION_IDENTIFIER()));
//		return visitChildren(ctx); 
//	}
//	
//
//	//Main Function
//	@Override 
//	public MilleniumValue visitMainFunction(MilleniumParser.MainFunctionContext ctx) 
//	{ 
//		//System.out.println("ENTER MAIN");
//		//Add function in arraylist and scopes
//		scopes.push(new Scope("Main", ctx.getParent()));
//		currScope = currFuncIdentifier;
//		
//		/*
//		for(int i = 0; i < ctx.getChildCount(); i ++){
//			ParseTree cont = ctx.getChild(i);
//			System.out.println("Child: " + ctx.getChild(i).getText() + ctx.getChild(i));
//			this.visit(cont);
//		}*/
//
//		visitChildren(ctx) ;
//		return new MilleniumValue();
//	}
//	
//	//Function Call
//	@Override 
//	public MilleniumValue visitFunctionCall(MilleniumParser.FunctionCallContext ctx) 
//	{ 
//		
//		MilleniumFunction calledFunc = findFunc(ctx.FUNCTION_IDENTIFIER().getText());
//		//System.out.println("FUNCTION CALL" + calledFunc.getIdentifier());
//		
//		if(calledFunc != null){//function has been defined, check params
//			List<MilleniumParser.Actual_paramsContext> params =  ctx.actual_params(); //parames on all
//			semanticErrors.setSpecificIdentifier(calledFunc.getFuncDataTypes());
//			
//			
//			//1. Check num of params
//			if( params.size() != calledFunc.getParameters().size()){
//				semanticErrors.addError(ctx.start.getLine() + "", 
//						ctx.start.getCharPositionInLine() + "", SemanticErrors.PARAMETER_MISMATCH);
//			}
//			
//			//2. Check data type of params (VARIABLES ONLY)
//			for(int i = 0; i < params.size(); i++){
//				
//				if(params.get(i).VARIABLE_IDENTIFIER() != null){
//					//check var on symboltable
//					//System.out.println("RAR: " + params.get(i).VARIABLE_IDENTIFIER().getText());
//					MilleniumValue val = scopes.peek()
//							.getAVar(params.get(i).VARIABLE_IDENTIFIER().getText());
//					if(val != null){
//
//						if(calledFunc.getAParameter(i)
//							.getDataType().equals(val.getDataType())){ //param data type same with actual param data type
//							
//						}else{
//							semanticErrors.addError(ctx.start.getLine() + "", 
//									ctx.start.getCharPositionInLine() + "", SemanticErrors.PARAMETER_MISMATCH);
//						}
//					}
//				}
//			}
//			
//			semanticErrors.setLine(ctx.getStart().getLine() + "");
//			semanticErrors.setCharPositionInLine(ctx.getStart().getCharPositionInLine() + "");
//			return new MilleniumValue(calledFunc.getReturnValue().toString(), calledFunc.getFuncDataTypes(), semanticErrors);
//
//			
//		}else{
//			semanticErrors.setSpecificIdentifier(ctx.FUNCTION_IDENTIFIER().getText());
//			semanticErrors.addError(ctx.getStart().getLine() + "", 
//					ctx.getStart().getCharPositionInLine() + "", 
//					SemanticErrors.UNDECLARED_FUNC);
//			hasError = true;
//			//return new MilleniumValue("");
//			return new MilleniumValue(null);
//		}
//		//return visitChildren(ctx);
//		//return null;
//	}
//	
//
//	
//	/*** Expressions ***/
//	@Override public MilleniumValue visitExprFactorNumOpeExpr(MilleniumParser.ExprFactorNumOpeExprContext ctx) {
//		//System.out.println("hala" + currRule.toString());
//		if((currRule.equals(MilleniumRules.Print))){
//			if(ctx.num_ope().getText().equals("+")){
//				//System.out.println("HAHAH");
//				MilleniumValue leftVal = this.visit(ctx.expression_factor());
//				if(leftVal != null){
//					//System.out.println("leftVal " + leftVal.getValue());
//					currExpression += leftVal.getValue();
//				}
//				
//				MilleniumValue rightVal = this.visit(ctx.expression());
//				
//				if(rightVal != null){
//					//System.out.println("rightVal " + rightVal.getValue());
//					currExpression += rightVal.getValue();
//				}
//				
//			}	
//		}
//		/*
//		else{
//			
//			System.out.println("RAR: " + ctx.getText());
//			MilleniumValue leftVal = this.visit(ctx.expression_factor());
//			if(leftVal != null){
//				//System.out.println("leftVal " + leftVal.getValue());
//				currNumExpression += leftVal.getValue();
//			}
//			currNumExpression += ctx.num_ope().getText();
//			
//			MilleniumValue rightVal = this.visit(ctx.expression());
//			
//			if(rightVal != null){
//				//System.out.println("rightVal " + rightVal.getValue());
//				currNumExpression += rightVal.getValue();
//			}
//			
//			System.out.println("currNumExpression: " + currNumExpression);
//			
//			ScriptEngineManager mgr = new ScriptEngineManager();
//			ScriptEngine engine = mgr.getEngineByName("JavaScript");
//			try {
//				System.out.println("EVAL" + engine.eval(currNumExpression));
//				return new MilleniumValue (engine.eval(currNumExpression)) ;
//			} catch (ScriptException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		*/
//		
//		else{
//			
//			MilleniumValue valLeft = this.visit(ctx.getChild(0));
//			MilleniumValue valRight = this.visit(ctx.getChild(2));
//			Object left = null;
//			Object right = null;
//			
//			if(valLeft != null && valRight != null){
//				left = valLeft.getValue();
//				right = valRight.getValue();
//			}
//			
//			double result;
//			
//			String numOpe = ctx.getChild(1).getText();
//			if(left != null && right != null){
//				if(numOpe.equals("-")){
//					result = Double.parseDouble(left.toString()) - Double.parseDouble(right.toString());
//					return new MilleniumValue(result);
//				}
//				if(numOpe.equals("/")){
//					result = Double.parseDouble(left.toString()) / Double.parseDouble(right.toString());
//					return new MilleniumValue(result);
//				}
//				if(numOpe.equals("*")){
//					result = Double.parseDouble(left.toString()) * Double.parseDouble(right.toString());
//					return new MilleniumValue(result);
//				}
//			}
//		
//
//		}
//		
//		return null;
//	}
//	
//	//Expr Num_Ope Expr
//	@Override public MilleniumValue visitExprNumOpeExpr(MilleniumParser.ExprNumOpeExprContext ctx) 
//	{ 
//		//System.out.println("RAR2: " + ctx.getText());
//		
//
//		return visitChildren(ctx); 
//	}
//	
//	
//	@Override 
//	public MilleniumValue visitExpression_factor(MilleniumParser.Expression_factorContext ctx) 
//	{ 	
//		//System.out.println("EXPRESSION FACTOOOOOOOOOOOOOOR");
//		//Called by print_factor + expressions
//		/*
//		if((currRule == MilleniumRules.Print)){
//			if(ctx.VARIABLE_IDENTIFIER() != null){
//				currExpression += scopes.peek().getAVar(ctx.VARIABLE_IDENTIFIER().getText()).getValue();
//			}else if(ctx.STRING_LITERAL() != null ){
//				currExpression += ctx.STRING_LITERAL().getText();
//			}else if(ctx.funccall_statement() != null){
//				this.visit(ctx.funccall_statement());
//			}
//		}
//		*/
//		//For expressions
//		/*else*/{
//			if(ctx.array_size() != null){
//				int index;
//				if(ctx.array_size().VARIABLE_IDENTIFIER() != null){
//					//access index thru a var
//					index  =(Integer)scopes.peek().getAVar(ctx.array_size().VARIABLE_IDENTIFIER().getText()).getValue();
//				}else{
//					index = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
//				}
//				return scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).getMillValue(index);
//			}
//			else if(ctx.STRING_LITERAL() != null){
//				//System.out.println("STRING LITERAL" + ctx.STRING_LITERAL().getText());
//				return new MilleniumValue(ctx.STRING_LITERAL().getText());
//			}
//			else if(ctx.VARIABLE_IDENTIFIER() != null){
//				
//				MilleniumValue val = scopes.peek().getAVar(ctx.VARIABLE_IDENTIFIER().getText());
//				//System.out.println("VARIABLE IDENTIFIER" + val.getValue());
//				if(val != null)
//					return scopes.peek().getAVar(ctx.VARIABLE_IDENTIFIER().getText());
//			}else if(ctx.num_factor() != null)
//			{	
//				if(ctx.num_factor().INTEGER_LITERAL() != null)
//					return new MilleniumValue(ctx.num_factor().INTEGER_LITERAL().getText());
//				else if(ctx.num_factor().FLOAT_LITERAL() != null)
//					return new MilleniumValue(ctx.num_factor().FLOAT_LITERAL().getText());
//			}else if(ctx.funccall_statement() != null){
//				//System.out.println("YOWYHASHAUH");
//				this.visit(ctx.funccall_statement());
//			}
//		}
//		return visitChildren(ctx);
//	}
//
//	/*** End of Expressions ***/
//	
//
//	/*** Different Prints ***/
//	
//	@Override
//	public MilleniumValue visitPrintString(MilleniumParser.PrintStringContext ctx) 
//	{ 
//		String value = ctx.STRING_LITERAL().getText();
//		return new MilleniumValue(value);
//	}
//	
//	
//	@Override 
//	public MilleniumValue visitPrintFactorPlusPrintFactor(MilleniumParser.PrintFactorPlusPrintFactorContext ctx) 
//	{ 
//		MilleniumValue leftVisit = this.visit(ctx.getChild(0));
//		MilleniumValue rightVisit = this.visit(ctx.getChild(2));
//		String leftVal = "", rightVal = "";
//		
//		if(leftVisit != null && rightVisit != null){
//			leftVal = this.visit(ctx.getChild(0)).getValue().toString();
//			rightVal = this.visit(ctx.getChild(2)).getValue().toString();			
//		}
//		return new MilleniumValue(leftVal + rightVal); 
//	}
//	 
//	
//	
//	@Override 
//	public MilleniumValue visitPrintFactorPlusExpr(MilleniumParser.PrintFactorPlusExprContext ctx) 
//	{
//		//System.out.println("HELLO");
//		String leftVal = "";
//		MilleniumValue val = this.visit(ctx.getChild(0));
//		
//		if(val != null){
//			leftVal = val.getValue().toString();	
//			//System.out.println("LEFT VAL BOIII " + leftVal);
//		}
//
//		//currRule = MilleniumRules.Print;
//		currExpression = "";
//		if(ctx.expression() != null){
//			
//			if ((ctx.expression().getChild(0).getClass() == MilleniumParser.Expression_factorContext.class)
//					&& (ctx.expression().children.size() == 1)){
//				currExpression += this.visit(ctx.expression()).getValue();
//			}
//			else{
//				this.visit(ctx.expression());
//			}
//		}
//		
//		
//		return new MilleniumValue(leftVal + currExpression); 
//		
//		
//	}
//	
//	/*
//	@Override
//	public MilleniumValue visitPrintExprFactorOnly(MilleniumParser.PrintExprFactorOnlyContext ctx) 
//	{ 
//		//currRule = MilleniumRules.PrintExprOnly;
//		System.out.println("PrintExprOnly");
//		MilleniumValue val = this.visit(ctx.expression_factor());
//		if(val != null){
//			return new MilleniumValue(val.getValue());
//		}
//		else{
//			return null;
//		}
//		
//	}
//	*/
//	/*** END OF DIFFERENT PRINTS ***/
//
//	
//	/*** Conditionals ***/
//	
//	@Override 
//	public MilleniumValue visitRelationalBool(MilleniumParser.RelationalBoolContext ctx) 
//	{ 	
//		MilleniumValue valLeft = this.visit(ctx.getChild(0));
//		MilleniumValue valRight = this.visit(ctx.getChild(2));
//		Object left = null;
//		Object right = null;
//		
//		if(valLeft != null && valRight != null){
//			left = valLeft.getValue();
//			right = valRight.getValue();
//		}
//
//		String relationalOpe = ctx.getChild(1).getText();
//		
//		boolean result = false;
//		
//		if((left != null) && (right != null)){
//			switch(relationalOpe){
//				case "<":
//					result = Double.parseDouble(left.toString()) < Double.parseDouble(right.toString());
//					break;
//				case "<=":
//					result = Double.parseDouble(left.toString()) <= Double.parseDouble(right.toString());
//					break;
//				case ">":
//					result = Double.parseDouble(left.toString()) > Double.parseDouble(right.toString());
//					break;
//				case ">=":
//					result = Double.parseDouble(left.toString()) >= Double.parseDouble(right.toString());
//					break;
//				case "==":
//					result = Double.parseDouble(left.toString()) == Double.parseDouble(right.toString());
//					break;
//				case "!=":
//					result = Double.parseDouble(left.toString()) != Double.parseDouble(right.toString());
//					break;
//			}
//			
//			return new MilleniumValue(result);
//		}else{
//			return new MilleniumValue(false);
//		}
//		
//		
//
//	}
//	
//	//Logical Boolean
//	@Override public MilleniumValue visitLogicalBool(MilleniumParser.LogicalBoolContext ctx) {
//		MilleniumValue valLeft = this.visit(ctx.getChild(0));
//		MilleniumValue valRight = this.visit(ctx.getChild(2));
//		String logicalOpe = ctx.getChild(1).getText();
//		
//		Object left = null;
//		Object right = null;
//		
//		if(valLeft != null && valRight != null){
//			left = valLeft.getValue();
//			right = valRight.getValue();
//		}
//		
//		boolean result = false;
//		if((left != null) && (right != null)){
//			switch(logicalOpe){
//			case "AND":
//				result = Boolean.parseBoolean(left.toString()) && Boolean.parseBoolean(right.toString());
//				break;
//			case "OR":
//				result =Boolean.parseBoolean(left.toString()) || Boolean.parseBoolean(right.toString());
//				break;
//			}
//		}
//		
//		
//		return new MilleniumValue(result); 
//	}
//	
//	//String vs String
//	/*@Override public MilleniumValue visitStringVsString(MilleniumParser.StringVsStringContext ctx) {
//		MilleniumValue valLeft = this.visit(ctx.getChild(0));
//		MilleniumValue valRight = this.visit(ctx.getChild(2));
//		String relationalOpe = ctx.getChild(1).getText();
//		
//		Object left = null;
//		Object right = null;
//		
//		if(valLeft != null && valRight != null){
//			left = valLeft.getValue();
//			right = valRight.getValue();
//		}
//		
//		boolean result = false;
//		if((left != null) && (right != null)){
//			switch(relationalOpe){
//			
//			}
//		}
//		
//		
//		return new MilleniumValue(result); 
//		
//	}*/
//	
//	//While Loop
//	@Override public MilleniumValue visitWhile_statement(MilleniumParser.While_statementContext ctx) 
//	{ 
//		//System.out.println("WHILEEEEE");
//		MilleniumValue value = this.visit(ctx.conditional_block().conditional_factor());
//		//System.out.println("BOOL: " + (Boolean)value.getValue());
//		 
//		while((Boolean)value.getValue()){
//	        // evaluate the code block
//			this.visit(ctx.conditional_block().code_block());
//            //System.out.println("babalik");
//            //evaluate condition
//            value = this.visit(ctx.conditional_block().conditional_factor());
//            //System.out.println("updated val " + value.getValue());
//		}
//
//		return null; 
//	
//	}
//	
//	
//	//For Loop
//	@Override 
//	public MilleniumValue visitFor_statement(MilleniumParser.For_statementContext ctx) 
//	{ 
//		this.visit(ctx.for_assignment_statement());
//		MilleniumValue value = this.visit(ctx.bool_expression());
//		//System.out.println("Bool Expression: " + value.getValue());
//		
//		while((Boolean)value.getValue()){
//	        // evaluate the code block
//            this.visit(ctx.code_block());
//            
//            //increment
//            this.visit(ctx.assignment_statement());
//            
//            // evaluate the expression
//            value = this.visit(ctx.bool_expression());
//		}
//		
//		return null; 
//	}
//	
//	//Assignment for for loop
//	@Override
//	public MilleniumValue visitFor_assignment_statement(MilleniumParser.For_assignment_statementContext ctx) 
//	{ 
//		String identifier = ctx.VARIABLE_IDENTIFIER().getText();
//		MilleniumValue val = scopes.peek().getAVar(identifier);
//		
//		if(val != null){
//			//variable is already in ST
//			
//			val.setValue(this.visit(ctx.assignment_factor()));
//		}else{
//			//variable is not initialized
//			
//			if(ctx.data_type().getText() != null){
//				currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
//				currVarDataType = ctx.data_type().getText();
//				addVarToSymbolTable(ctx.assignment_factor().getText());	
//			}else{
//				semanticErrors.setSpecificIdentifier(identifier);
//				semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getLine() + "",
//						SemanticErrors.UNDECLARED_VAR);
//			}
//		}
//
//		return visitChildren(ctx);
//	}
//	
//	/*** END OF CONDITIONALS ***/
//	
//	/*** Other Statements ***/
//	
//	//Increment or Decrement ++ --
//	@Override
//	public MilleniumValue visitDecrementOrIncrement(MilleniumParser.DecrementOrIncrementContext ctx)
//	{
//		String identifier = ctx.VARIABLE_IDENTIFIER().getText();
//		
//		MilleniumValue val = scopes.peek().getAVar(identifier);
//		//check first if val is constant
//		if(val.isConstantFlag()){
//			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "", 
//					SemanticErrors.CONSTANT_REASSIGNMENT);
//		}else{
//			if(ctx.DECREMENT_OPE() != null){
//				val.setValue((Integer)val.getValue() - 1);
//			}else if(ctx.INCREMENT_OPE() != null){
//				val.setValue((Integer)val.getValue() + 1);
//			}			
//		}
//		
//		return visitChildren(ctx); 
//	}
//	
//	//Assignment with Num Ope +=, *=
//	@Override 
//	public MilleniumValue visitAssignmentWithNumOpe(MilleniumParser.AssignmentWithNumOpeContext ctx) 
//	{ 
//		MilleniumValue val = scopes.peek().getAVar(ctx.VARIABLE_IDENTIFIER().getText());
//		
//		if(val != null){
//			/*MilleniumValue expression = this.visit(ctx.expression());
//			if(ctx.assignment_num_ope().ADDITION_ASSIGNMENT_OPE() != null){
//				//System.out.println("VALUE: " + val.getValue());
//				//System.out.println("EXPRESSION: " + expression.getValue());
//				val.setValue(Integer.parseInt(val.getValue().toString()) + Integer.parseInt((String) expression.getValue()));
//			}else if(ctx.assignment_num_ope().SUBTRACTION_ASSIGNMENT_OPE() != null){
//				val.setValue(Integer.parseInt(val.getValue().toString()) - Integer.parseInt((String) expression.getValue()));
//			}else if(ctx.assignment_num_ope().MULTIPLICATION_ASSIGNMENT_OPE() != null){
//				val.setValue(Integer.parseInt(val.getValue().toString()) * Integer.parseInt((String) expression.getValue()));
//			}*/
//			MilleniumValue expression = this.visit(ctx.expression());
//			if(ctx.assignment_num_ope().ADDITION_ASSIGNMENT_OPE() != null){
//				//System.out.println("VALUE: " + val.getValue());
//				//System.out.println("EXPRESSION: " + expression.getValue());
//				val.setValue(Double.parseDouble(val.getValue().toString()) +Double.parseDouble(expression.getValue().toString()));
//			}else if(ctx.assignment_num_ope().SUBTRACTION_ASSIGNMENT_OPE() != null){
//				val.setValue(Double.parseDouble(val.getValue().toString()) - Double.parseDouble(expression.getValue().toString()));
//			}else if(ctx.assignment_num_ope().MULTIPLICATION_ASSIGNMENT_OPE() != null){
//				val.setValue(Double.parseDouble(val.getValue().toString()) * Double.parseDouble(expression.getValue().toString()));
//			}
//			//TODO add
//		}else{
//			//TODO throw error
//		}
//		return visitChildren(ctx); 
//	}
//	
//	//Return 
//	@Override public MilleniumValue visitReturn_statement(MilleniumParser.Return_statementContext ctx) 
//	{ 
//		if(ctx.data_type() == null){
//			//return statement is correct
//		}else {
//			//return statement is wrong / there is non
//			
//		}
//		return visitChildren(ctx); 
//	}
//	
//	//If Statement
//	@Override public MilleniumValue visitIf_statement(MilleniumParser.If_statementContext ctx){
//		if(ctx.getToken(MilleniumLexer.IF_CONDITIONAL, 0) != null){
//			Class boolexpression_type = ctx.conditional_block().conditional_factor().bool_expression().getClass();
//			MilleniumValue value = null;
//			if(boolexpression_type == MilleniumParser.RelationalBoolContext.class){
//				MilleniumParser.RelationalBoolContext relbool_ctx = (MilleniumParser.RelationalBoolContext) ctx.conditional_block().conditional_factor().bool_expression();
//				value = this.visit(relbool_ctx);
//				//System.out.println("rel: " + value.getValue());
//				if((Boolean)value.getValue()){
//					this.visit(ctx.conditional_block().code_block());
//				}
//			}
//			else if(boolexpression_type == MilleniumParser.LogicalBoolContext.class){
//				MilleniumParser.LogicalBoolContext logicalbool_ctx = (MilleniumParser.LogicalBoolContext) ctx.conditional_block().conditional_factor().bool_expression();
//				value = this.visit(logicalbool_ctx);
//				
//				if((Boolean)value.getValue()){
//					this.visit(ctx.conditional_block().code_block());
//				}
//			}
//			/*
//			else if(boolexpression_type == MilleniumParser.StringVsStringContext.class){
//				MilleniumParser.StringVsStringContext stringvsstring_ctx = (MilleniumParser.StringVsStringContext) ctx.conditional_block().conditional_factor().bool_expression();
//				value = this.visit(stringvsstring_ctx);
//				
//				if((Boolean)value.getValue()){
//					this.visit(ctx.conditional_block().code_block());
//				}
//			}*/
//			
//		}
//		
//		return null;
//	}
//	
//	//Print Statement with no NL
//	
//	@Override 
//	public MilleniumValue visitPrint(MilleniumParser.PrintContext ctx) { 
//		currRule = MilleniumRules.Print;
//		//System.out.println("RARRRRR" + this.visit(ctx.print_factor()));
//		MilleniumValue val = null;
//		String toPrint = "";
//
//		if(ctx.print_factor() != null){
//			val = this.visit(ctx.print_factor());
//		}else if(ctx.expression() != null){
//			val = this.visit(ctx.expression());
//		}
//		
//		if(val != null){
//			toPrint = StringUtils.removeQuotes(val.getValue().toString());
//		}
//		
//		System.out.print(toPrint);
//
//		//reset rule to none
//		currRule = MilleniumRules.None;
//		//System.out.println("NONE DAPAT: " + currRule.toString());
//		return visitChildren(ctx);
//		
//	}
//	
//	//Print Statement with NL
//	@Override 
//	public MilleniumValue visitPrintNewLine(MilleniumParser.PrintNewLineContext ctx) 
//	{ 
//		
//			currRule = MilleniumRules.Print;
//			//System.out.println("RARRRRR" + this.visit(ctx.print_factor()));
//			MilleniumValue val = null;
//			String toPrint = "";
//
//			if(ctx.print_factor() != null){
//				val = this.visit(ctx.print_factor());
//			}else if(ctx.expression() != null){
//				val = this.visit(ctx.expression());
//			}
//			
//			if(val != null){
//				toPrint = StringUtils.removeQuotes(val.getValue().toString());
//			}
//			
//			if(hasError == false){
//				System.out.println(toPrint);
//			}
//			else{
//				hasError = false;
//			}
//
//			//reset rule to none
//			currRule = MilleniumRules.None;
//			//System.out.println("NONE DAPAT: " + currRule.toString());
//		
//			
//			/*
//			MilleniumValue val = null;
//			String toPrint = "";
//			currRule = MilleniumRules.Print;
//			
//			System.out.println(currRule.toString());
//			if(ctx.expression() != null){
//				val = this.visit(ctx.expression());
//			}
//			
//			if(val != null){
//				toPrint = StringUtils.removeQuotes(val.getValue().toString());
//				System.out.println(toPrint);
//			}
//			return visitChildren(ctx);
//			*/
//				
//		return visitChildren(ctx);
//	}
//	
//	//Scan
//	@Override 
//	public MilleniumValue visitScan(MilleniumParser.ScanContext ctx) {
//
//		String input = milleniumView.openScanDialog();
//		String var = ctx.VARIABLE_IDENTIFIER().getText();
//		MilleniumValue val = scopes.peek().getAVar(var);
//		val.setValue(input);
//		return visitChildren(ctx);
//
//	}
//	
//	//@Override 
//	public MilleniumValue visitScanThruArr(MilleniumParser.ScanThruArrContext ctx) {
//		String input = milleniumView.openScanDialog();
//		
//		
//		int index;
//		if(ctx.array_size().VARIABLE_IDENTIFIER() != null){
//			//access index thru a var
//			index  =(Integer)scopes.peek().getAVar(ctx.array_size().VARIABLE_IDENTIFIER().getText()).getValue();
//		}else{
//			index = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
//		}
//		
//		DataType dataType = scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).getDataType();
//		
//		MilleniumValue sample = new MilleniumValue(input, dataType);
//	
//		scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).setValueAt(new MilleniumValue(input, dataType), index);
//		
//		
//		
//		return visitChildren(ctx);
//	}
//
//
//} 
