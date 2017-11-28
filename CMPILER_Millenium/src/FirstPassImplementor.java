import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/***
 * 
 * Adds the functions (params, return value)
 * Adds variables to symbol table
 * @author Danica C. Sevilla
 *
 */

public class FirstPassImplementor extends MilleniumBaseVisitor<MilleniumValue>{
	//Function Declaration
	
	private MilleniumInterpreter interpreter;
	private Stack<Scope> scopes;
	private MilleniumSemanticErrors semanticErrors;
	private ArrayList<MilleniumFunction> definedFuncs;
	
	private String currFuncIdentifier;
	private String currFuncReturnType;
	private String currScope;
	private String currVarIdentifier;
	private String currVarDataType;
	private boolean isCurrVarConstant;
	
	
	public FirstPassImplementor(MilleniumInterpreter interpreter){
		this.interpreter = interpreter;
		this.scopes = interpreter.getScopes();
		this.semanticErrors = interpreter.getSemanticErrors();
		definedFuncs = interpreter.getDefinedFuncs();
		
		currScope = null;
	}
	
	//Add Variable to ST
	public void addVarToSymbolTable(String value){
		MilleniumValue val = null;
		val = new MilleniumValue(value, currVarDataType, 
				semanticErrors);
		val.setIdentifier(currVarIdentifier);
		
		if(isCurrVarConstant){
			val.setConstantFlag(true);
			System.out.println("Val marked as constant!");
		}

		if(val.getDataType() != null){
			scopes.peek().addToSymbolTable(val);
			System.out.println("Added Var " + val.getIdentifier() + " to Symbol Table Successfully!");
		}
	}
	
	//Add Parameter Var to ST
	public void addParamAsVarToSymbolTable(MilleniumValue val){		
		if(isCurrVarConstant){
			val.setConstantFlag(true);
			System.out.println("Val marked as constant!");
		}

		if(val.getDataType() != null){
			scopes.peek().addToSymbolTable(val);
			System.out.println("Added Var " + val.getIdentifier() + " to Symbol Table Successfully!");
		}
	}
	
	//Add Array to ST
	public void addArrToSymbolTable(MilleniumArray arr){
		scopes.peek().addToSymbolTable(arr);
		System.out.println("Added Arr to Symbol Table Successfully!");
	}
	
	//Function Declaration
	@Override
	public MilleniumValue visitFunction_declaration(MilleniumParser.Function_declarationContext ctx){
		if(interpreter.findScope(ctx.FUNCTION_IDENTIFIER().getText()) != null){
			semanticErrors.setSpecificIdentifier(ctx.FUNCTION_IDENTIFIER().getText());
			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "",
					SemanticErrors.MULTIPLE_FUNC_DECLARATION
					);	
			
			
		}
		//Push to scope even if it's already defined.
			currFuncIdentifier = ctx.FUNCTION_IDENTIFIER().getText();
			
			//Check if there's a return statement
			List<MilleniumParser.StatementContext> statements = ctx.function_block().code_block().statement();
			boolean isReturn = false;
			int line = 0;
			String charPositionInLine = "";
			
			for(int i = 0; i < statements.size(); i++){
				if(statements.get(i).return_statement() != null)
					isReturn = true;
				
				line = statements.get(i).getStop().getLine();
				charPositionInLine = statements.get(i).getStop().getCharPositionInLine() + "";
			}

			if(ctx.VOID() != null){
				currFuncReturnType = ctx.VOID().getText();
				//Check if there's a return statement
				if(isReturn){
					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
					semanticErrors.addError(line + "", charPositionInLine, SemanticErrors.UNEXPECTING_RETURN);				
				}					
			}
			else{
				currFuncReturnType = ctx.data_type().getText();
				//Check if there's a return statement
				if(!isReturn){
					semanticErrors.setSpecificIdentifier(currFuncIdentifier);
					semanticErrors.addError(line+1 + "", charPositionInLine, SemanticErrors.EXPECTING_RETURN);				
				}

			}

			List<MilleniumParser.ParametersContext> parameters = ctx.function_block().parameters();
			ArrayList<MilleniumValue> arrayParameters = new ArrayList<MilleniumValue>();
			MilleniumValue val = null;
			
			if(parameters != null){
				for(MilleniumParser.ParametersContext parameter : parameters){
					
					val = new MilleniumValue(null, parameter.data_type().getText(),
							semanticErrors);
					val.setIdentifier(parameter.VARIABLE_IDENTIFIER().getText());
					arrayParameters.add(val);
					
				}	
			}
			
			System.out.println("Function Name: " + currFuncIdentifier);
			System.out.println("Return Type: " + currFuncReturnType);
			System.out.println("Parent: " + currScope);
			MilleniumFunction func = new MilleniumFunction(currFuncReturnType, arrayParameters, semanticErrors);
			func.setIdentifier(currFuncIdentifier);
			
			//Add function in arraylist and scopes
			definedFuncs.add(func);
			scopes.push(new Scope(ctx.FUNCTION_IDENTIFIER().getText(), null));
			
			//Add params to ST
			for(int i = 0; i < arrayParameters.size(); i++){
				addParamAsVarToSymbolTable(arrayParameters.get(i));				
			}
			
			currScope = currFuncIdentifier;
		

		return visitChildren(ctx); 
	}
	
	//Variable Declaration (Data Type)
	@Override 
	public MilleniumValue visitVariableDeclaration(MilleniumParser.VariableDeclarationContext ctx) 
	{ 
		isCurrVarConstant = false; 
		//System.out.println("Data Type: " + ctx.data_type().getText());
		currVarDataType = ctx.data_type().getText(); //get data type of variable

		return visitChildren(ctx); 
	}
	
	//Array Declaration
	@Override 
	public MilleniumValue visitArrayDeclaration(MilleniumParser.ArrayDeclarationContext ctx) 
	{ 
		if((scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText())) == null){
			if(ctx.array_size().INTEGER_LITERAL() != null){
				int size = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
				MilleniumArray arr = new MilleniumArray (size, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
				addArrToSymbolTable(arr);
			}else{
				//TODO
				//temp yung 1 pls change
				MilleniumArray arr = new MilleniumArray (1, ctx.data_type().getText(), ctx.VARIABLE_IDENTIFIER().getText());
				arr.setIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
				addArrToSymbolTable(arr);
			}
		}else{
			//Array is already defined
			//System.out.println("Declared Array: " + ctx.VARIABLE_IDENTIFIER().getText());
			semanticErrors.setSpecificIdentifier(ctx.VARIABLE_IDENTIFIER().getText());
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}

		return visitChildren(ctx); 
	}
	
	//Variable Declaration (Identifier)
	@Override 
	public MilleniumValue visitVarIdentifierInDeclaration1(MilleniumParser.VarIdentifierInDeclaration1Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		//System.out.println("Value Identifier1: " + currVarIdentifier);
		if(scopes.peek().getAVar(currVarIdentifier) != null){
			semanticErrors.setSpecificIdentifier(currVarIdentifier);
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}
		
		return visitChildren(ctx); 
	}
	
	//Variable Declaration w/ No Assignment
	@Override 
	public MilleniumValue visitVarIdentifierInDeclaration2(MilleniumParser.VarIdentifierInDeclaration2Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		//System.out.println("Value Identifier2: " + currVarIdentifier);
		if((scopes.peek().getAVar(currVarIdentifier)) != null){
			semanticErrors.setSpecificIdentifier(currVarIdentifier);
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					SemanticErrors.MULTIPLE_VAR_DECLARATION);
		}else if (ctx.var_assignment_statement() == null){ //no assignment
			addVarToSymbolTable(null);
		}

		return visitChildren(ctx); 
	}
	
	//Variable Assignment
	@Override 
	public MilleniumValue visitVarAssignment(MilleniumParser.VarAssignmentContext ctx) 
	{ 
		MilleniumValue val = null;

		if(ctx.assignment_factor() != null){
			//attach line numbers & char position in line
			semanticErrors.setLine(ctx.getStart().getLine() + "");
			semanticErrors.setCharPositionInLine(ctx.getStart().getCharPositionInLine() + "");
			val = new MilleniumValue(null, currVarDataType, 
					semanticErrors);
			//System.out.println("VAR ASSIGNENT: " + currVarIdentifier);
			addVarToSymbolTable(ctx.assignment_factor().getText());
			//System.out.println("Value: " + ctx.assignment_factor().getText());
		}

		return visitChildren(ctx); 
	}
	
	//Constant Declaration
	@Override public MilleniumValue visitConstantDeclaration(MilleniumParser.ConstantDeclarationContext ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		currVarDataType = ctx.data_type().getText(); //get data type of constant variable
		isCurrVarConstant = true;
		//System.out.println("Value Identifier of Constant: " + currVarIdentifier);
		

		return visitChildren(ctx); 
	}
	
	//New Assignment
	@Override public MilleniumValue visitNewAssignment(MilleniumParser.NewAssignmentContext ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		MilleniumValue variable = scopes.peek().getAVar(currVarIdentifier);
		
			
		//Check for constant re-assignment
		if((variable != null) && (variable.isConstantFlag() == true))
		{
			semanticErrors.addError(ctx.getStart().getLine() + "", ctx.getStart().getCharPositionInLine() + "", SemanticErrors.CONSTANT_REASSIGNMENT);
		}else{
			//Assign new value
			MilleniumValue newVal = null;
			
			if(ctx.assignment_factor().expression() != null){
				newVal = this.visit(ctx.assignment_factor().expression());
				//System.out.println("NEW VAL:" + newVal);
				//System.out.println("VALUE:" + variable.getValue().toString());
			}
			//TODO dagdag pa
			
			//System.out.println(ctx.assignment_factor().expression().getText());
			
			//Check if array
			if(ctx.array_size() != null){
				int index;
				if(ctx.array_size().VARIABLE_IDENTIFIER() != null){
					//access index thru a var
					index  =(Integer)scopes.peek().getAVar(ctx.array_size().VARIABLE_IDENTIFIER().getText()).getValue();
				}else{
					index = Integer.parseInt(ctx.array_size().INTEGER_LITERAL().getText());
				}
				
				DataType dataType = scopes.peek().getAnArr(currVarIdentifier).getDataType();
			
				if(newVal != null){
					MilleniumValue newArrVal = new MilleniumValue(newVal.getValue(), dataType);
					scopes.peek().getAnArr(ctx.VARIABLE_IDENTIFIER().getText()).setValueAt(new MilleniumValue(newArrVal.getValue(), dataType), index);
				}
				
			}
			//not an array
			else{
				if(newVal.getValue() != null)
					variable.setValue(newVal.getValue());
			}
		}
		
		return null; 
	}
}
