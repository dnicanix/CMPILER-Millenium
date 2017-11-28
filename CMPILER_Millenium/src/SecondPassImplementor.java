import java.util.ArrayList;
import java.util.Stack;

/*
 * 
 * 
 */

public class SecondPassImplementor extends MilleniumBaseVisitor<MilleniumValue>{
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
	
	
	public SecondPassImplementor(MilleniumInterpreter interpreter){
		this.interpreter = interpreter;
		this.scopes = interpreter.getScopes();
		this.semanticErrors = interpreter.getSemanticErrors();
		definedFuncs = interpreter.getDefinedFuncs();
		
		currScope = null;
	}
	
}
