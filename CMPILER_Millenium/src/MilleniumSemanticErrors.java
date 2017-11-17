public class MilleniumSemanticErrors{

	private MilleniumView milleniumView;
	
	private String line;
	private String charPositionInLine;
	
	public MilleniumSemanticErrors(MilleniumView milleniumView){
		this.milleniumView = milleniumView;
	}
	
	public void addError(String errorLine, String charPositionInLine, SemanticErrors error){
		String errorMsg = "";
		
		switch(error){
			case DTYPE_MISMATCH:
				errorMsg = "Data type mismatch! Change the data type or value.";
				break;
			case CONSTANT_REASSIGNMENT:
				errorMsg = "Constant Re-assignment! Cannot reassign a value to consistent variable.";
				break;
			case MULTIPLE_VAR_DECLARATION:
				errorMsg = "Duplicate local variable! Change the variable name.";
				break;
				
		}
		
		milleniumView.addSemanticErrorMessages("[SEMANTIC ERROR]", errorLine, errorMsg);
		System.err.println("[SEMANTIC ERROR]: " + errorMsg + " (line " + errorLine + ":" + charPositionInLine + ")");
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
	
	
}
