public class MilleniumSemanticErrors{

	private MilleniumView milleniumView;
	private MilleniumInterpreter interpreter;
	
	private String line;
	private String charPositionInLine;
	private String specificIdentifier;
	
	public MilleniumSemanticErrors(MilleniumView milleniumView, MilleniumInterpreter interpreter){
		this.milleniumView = milleniumView;
		this.interpreter = interpreter;
	}
	
	public void addError(String errorLine, String charPositionInLine, SemanticErrors error){
		String errorMsg = "";
		
		switch(error){
			case DTYPE_MISMATCH:
				errorMsg = "Data type mismatch! Change the data type or value.";
				break;
			case CONSTANT_REASSIGNMENT:
				errorMsg = "Constant re-assignment! Cannot reassign a value to consistent variable.";
				break;
			case MULTIPLE_VAR_DECLARATION:
				errorMsg = "Duplicate local variable " + specificIdentifier +"! Change the variable name.";
				break;
			case MULTIPLE_FUNC_DECLARATION:
				errorMsg = "Function " + specificIdentifier +" is already defined! Change the function name.";
				break;
			case UNDECLARED_FUNC:
				errorMsg = "Unknown function! Function " + specificIdentifier +" is not defined.";
				break;
			case PARAMETER_MISMATCH:
				errorMsg = "Parameter mismatch! Function call should be in the form " + specificIdentifier;
				break;
			case EXPECTING_RETURN:
				errorMsg = "Expecting return statement for function " + specificIdentifier + "!";
				break;
			case UNEXPECTING_RETURN:
				errorMsg ="Unexpected return Statement for function " + specificIdentifier + "!";
				break;
				
		}
		
		milleniumView.addSemanticErrorMessages("[SEMANTIC ERROR]", errorLine, errorMsg);
		interpreter.setHasError(true);
		//System.err.println("[SEMANTIC ERROR]: " + errorMsg + " (line " + errorLine + ":" + charPositionInLine + ")");
	}
	
	public void addError(String errorLine, String charPositionInLine, String errorMsg){
		milleniumView.addSemanticErrorMessages("[SEMANTIC ERROR]", errorLine, errorMsg);
		System.err.println("[SEMANTIC ERROR]: " + errorMsg + " (line " + errorLine + ":" + charPositionInLine + ")");
	}
	
	//Getters & Setters
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getCharPositionInLine() {
		return charPositionInLine;
	}
	public void setCharPositionInLine(String charPositionInLine) {
		this.charPositionInLine = charPositionInLine;
	}

	public String getSpecificIdentifier() {
		return specificIdentifier;
	}

	public void setSpecificIdentifier(String specificIdentifier) {
		this.specificIdentifier = specificIdentifier;
	}
	
	
	
	
}
