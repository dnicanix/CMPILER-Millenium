import java.util.ArrayList;
import java.util.HashMap;

public class MilleniumFunction extends MilleniumSymbol{
	 
	private ArrayList<MilleniumValue> parameters;
	private MilleniumValue returnValue; 
	private FunctionType returnType;
	private MilleniumParser.Function_declarationContext ctx;
	private MilleniumSemanticErrors semanticErrors;
	
	public MilleniumFunction(String returnType, ArrayList<MilleniumValue> parameters, MilleniumSemanticErrors semanticErrors){
		this.parameters = parameters;
		this.returnType = setReturnType(returnType);
		this.semanticErrors = semanticErrors;
		setReturnValue(this.returnType);
	}
	

	public MilleniumValue getAParameter(String identifier){
		for(MilleniumValue parameter : parameters){
			if(parameter.getIdentifier().equals(identifier)){
				return parameter;
			}
				
		}
		
		return null;
	}
	
	public MilleniumValue getAParameter(int index){
		return parameters.get(index);
		
	}

	public void setReturnValue(FunctionType functionType) {

		//create an empty millenium value as a return value
		switch(this.returnType) {
			case weh_type: 
				returnValue = new MilleniumValue("", "weh", semanticErrors);
				break;
			case single_type: 
				returnValue = new MilleniumValue(String.valueOf(' '), "single", semanticErrors);
				break;
			case digitz_type: 
				returnValue = new MilleniumValue(String.valueOf(0), "digitz", semanticErrors); 
				break;
			case lutang_type:
				this.returnValue = new MilleniumValue(String.valueOf(0), "lutang", semanticErrors); 
				break;
			case Msg_type: 
				returnValue = new MilleniumValue("", "Msg", semanticErrors); 
				break;
			default:
				break;	
		}
	}
	
	public String getFuncDataTypes(){
		String dataTypes = getIdentifier() + "( ";
		
		for(int i = 0; i < parameters.size(); i++){
			dataTypes += parameters.get(i).getDataType();
			
			if((i+1) != parameters.size()){
				dataTypes += ", ";
			}	
		}
		
		dataTypes += " )";
		return dataTypes;
	}
	

	//Getters & Setters
	public ArrayList<MilleniumValue> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<MilleniumValue> parameters) {
		this.parameters = parameters;
	}

	public MilleniumValue getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(MilleniumValue returnValue) {
		this.returnValue = returnValue;
	}
	
	public FunctionType setReturnType(String returnType){
		switch(returnType){
			case "digitz":
				return FunctionType.digitz_type;
			case "lutang":
				return FunctionType.lutang_type;
			case "single":
				return FunctionType.single_type;
			case "Msg":
				return FunctionType.Msg_type;
			case "weh":
				return FunctionType.weh_type;
			case "walangibabalik":
				return FunctionType.VOID_type;
			default:
				return null;		
		}

	}

	public FunctionType getReturnType() {
		return returnType;
	}

	public MilleniumParser.Function_declarationContext getCtx() {
		return ctx;
	}

	public void setCtx(MilleniumParser.Function_declarationContext ctx) {
		this.ctx = ctx;
	}
	
	
	
}
