import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import utils.StringUtils;


public class MilleniumBaseImplementor extends MilleniumBaseVisitor<MilleniumValue>{
	
	private Stack<Scope> scopes;
	private String currVarIdentifier;
	private String currVarDataType;
	private boolean isCurrVarConstant;
	
	private MilleniumSemanticErrors semanticErrors;
	
	public MilleniumBaseImplementor(MilleniumView milleniumView){
		scopes = new Stack<Scope>();
		scopes.push(new Scope("Global", null));
		semanticErrors = new MilleniumSemanticErrors(milleniumView);
	}
	
	public void addVarToSymbolTable(String value){
		MilleniumValue val = null;
		val = new MilleniumValue(value, currVarDataType, 
				semanticErrors);
		val.setIdentifier(currVarIdentifier);
		
		if(isCurrVarConstant){
			val.setConstantFlag(true);
			System.out.println("val marked as constant!");
		}

		if(val.getDataType() != null){
			scopes.peek().addToSymbolTable(val);
			System.out.println("Added to Symbol Table Successfully!");
		}
	}

	//Variable Declaration (Data Type)
	@Override 
	public MilleniumValue visitVariableDeclaration(MilleniumParser.VariableDeclarationContext ctx) 
	{ 
		isCurrVarConstant = false; 
		System.out.println("Data Type" + ctx.data_type().getText());
		currVarDataType = ctx.data_type().getText(); //get data type of variable
		
		return visitChildren(ctx); 
	}
	
	//Variable Declaration (Identifier)
	@Override 
	public MilleniumValue visitVarIdentifierInDeclaration1(MilleniumParser.VarIdentifierInDeclaration1Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		System.out.println("Value Identifier1: " + currVarIdentifier);
		if(scopes.peek().getAVar(currVarIdentifier) != null){
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					"Duplicate local variable " + currVarIdentifier);
		}
		return visitChildren(ctx); 
	}
	
	//Variable Declaration w/ No Assignment
	@Override 
	public MilleniumValue visitVarIdentifierInDeclaration2(MilleniumParser.VarIdentifierInDeclaration2Context ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		System.out.println("Value Identifier2: " + currVarIdentifier);
		if(scopes.peek().getAVar(currVarIdentifier) != null){
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					"Duplicate local variable " + currVarIdentifier);
		}else{
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
			
			addVarToSymbolTable(ctx.assignment_factor().getText());
		}
		
		return val;
	}
	
	//Constant Declaration
	@Override public MilleniumValue visitConstantDeclaration(MilleniumParser.ConstantDeclarationContext ctx) 
	{ 
		currVarIdentifier = ctx.VARIABLE_IDENTIFIER().getText();
		currVarDataType = ctx.data_type().getText(); //get data type of constant variable
		isCurrVarConstant = true;
		System.out.println("Value Identifier of Constant: " + currVarIdentifier);
		

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
		}
		
		return visitChildren(ctx); 
	}
	
	//Print Statement with no NL
	@Override 
	public MilleniumValue visitPrint(MilleniumParser.PrintContext ctx) { 
		if(ctx.expression().string_expression().STRING_LITERAL() != null){
			System.out.print(StringUtils.removeQuotes(ctx.expression().getText()));
		}
		
		return visitChildren(ctx); 
	}
	
	//Print Statement with NL{
	@Override 
	public MilleniumValue visitPrintNewLine(MilleniumParser.PrintNewLineContext ctx) 
	{ 
		return visitChildren(ctx); 
	}
	
	
	//Scan Statement
	@Override 
	public MilleniumValue visitScan(MilleniumParser.ScanContext ctx) 
	{ 
		Scanner sc = new Scanner(System.in);
		String newValue;
		String var = ctx.VARIABLE_IDENTIFIER().getText();
	
		MilleniumValue value = scopes.peek().getAVar(var);
		if( value != null){
			newValue = sc.next();
			switch(scopes.peek().getAVar(var).getDataType()){
				case digitz:
					value.setValue(new MilleniumValue(newValue, "digitz", semanticErrors));
					break;
				case lutang:
					value.setValue(new MilleniumValue(newValue, "lutang", semanticErrors));
					break;
				case single:
					value.setValue(new MilleniumValue(newValue, "single", semanticErrors));
					break;
				case Msg:
					value.setValue(new MilleniumValue(newValue, "Msg", semanticErrors));
					break;
				case weh:
					value.setValue(new MilleniumValue(newValue, "digitz", semanticErrors));
					break;
			}
			
			System.out.println(scopes.peek().getAVar(var).getValue() + "");
		}else{ //variable not declared
			semanticErrors.addError(ctx.getStart().getLine() + "", 
					ctx.getStart().getCharPositionInLine() + "", 
					"Undeclared variable " + var);
		}

		
		
		return visitChildren(ctx); 
	}
	

} 
