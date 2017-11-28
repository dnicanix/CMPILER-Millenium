public class MilleniumArray extends MilleniumSymbol{
	
	private MilleniumValue[] valueArray;
	private DataType dataType;

	public MilleniumArray(int size, String dataType, String name){
		this.valueArray = new MilleniumValue[size];
		this.dataType = setDataType(dataType);
	}
	
	public void setValueAt(MilleniumValue value, int index) {
		if(index >= valueArray.length){
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds.");
		}else{
			valueArray[index] = value;
			//System.out.println("valueArray[index]: " + valueArray[index].getValue() + " | value: " + value.getValue());
		}
	}
	
	public MilleniumValue getMillValue(int index){
		if(index >= valueArray.length) {
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds");
			return null;
		}
		else {
			return valueArray[index];
		}		
	}
	
	public Object getValueAt(int index){
		if(index >= valueArray.length) {
			System.err.println("[SEMANTIC ERROR]: Array " + getIdentifier() + " out of bounds");
			return null;
		}
		else {
			/*
			switch(dataType){
				case digitz:
					return new MilleniumValue(valueArray[index], dataType);
				case lutang:
					return (Float) valueArray[index];
				case single:
					return (Character) valueArray[index];
				case Msg:
					return (String) valueArray[index];
				case weh:
					return (Boolean) valueArray[index];
				default:
					return null;
			}
			*/
			return valueArray[index].getValue();
		}
	}
	
	public DataType setDataType(String dataTypeStr){
		switch(dataTypeStr){
			case "digitz":
				return DataType.digitz;
			case "lutang":
				return DataType.lutang;
			case "single":
				return DataType.single;
			case "Msg":
				return DataType.Msg;
			case "weh":
				return DataType.weh;
			default:
				return null;
		}
	}
	
	//Getters and Setters
	public MilleniumValue[] getValueArray() {
		return valueArray;
	}

	public void setValueArray(MilleniumValue[] valueArray) {
		this.valueArray = valueArray;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}
	
	public int getSize(){
		return valueArray.length;
	}

	
	
	
	
	
}
