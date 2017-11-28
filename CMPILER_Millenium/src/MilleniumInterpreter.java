import java.util.ArrayList;
import java.util.Stack;


public class MilleniumInterpreter {
	
	private Stack<Scope> scopes;
	private ArrayList<MilleniumFunction> definedFuncs;
	private boolean hasError;
	private MilleniumSemanticErrors semanticErrors;
	
	public MilleniumInterpreter(MilleniumView milleniumView){
		scopes = new Stack<Scope>();
		scopes.push(new Scope("Global", null));
		hasError = false;
		semanticErrors = new MilleniumSemanticErrors(milleniumView, this);
		definedFuncs = new ArrayList<MilleniumFunction>();
	}
	
	
	//Find Scope
	public Scope findScope(String name){
		for(int i =0; i < scopes.size(); i++){
			if(scopes.get(i).getName().equals(name))
				return scopes.get(i);
		}
		return null;

	}
	
	//Find function 
	public MilleniumFunction findFunc(String funcIdentifier){
		for (int i = 0; i < definedFuncs.size(); i++){
			//change to equals signature later
			//System.out.println("DefinedFunc: " + definedFuncs.get(i).getIdentifier());
			//System.out.println("funcIdentifier: " + funcIdentifier);
			
			if (definedFuncs.get(i).getIdentifier().equals(funcIdentifier))
				return definedFuncs.get(i);
		}
		
		return null;
	}
	
	
	//Getters & Setters
	public Stack<Scope> getScopes() {
		return scopes;
	}

	public void setScopes(Stack<Scope> scopes) {
		this.scopes = scopes;
	}

	public boolean isHasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public MilleniumSemanticErrors getSemanticErrors() {
		return semanticErrors;
	}

	public void setSemanticErrors(MilleniumSemanticErrors semanticErrors) {
		this.semanticErrors = semanticErrors;
	}

	public ArrayList<MilleniumFunction> getDefinedFuncs() {
		return definedFuncs;
	}

	public void setDefinedFuncs(ArrayList<MilleniumFunction> definedFuncs) {
		this.definedFuncs = definedFuncs;
	}

	

}
