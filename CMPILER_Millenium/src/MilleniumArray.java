public class MilleniumArray {
	
	private Object[] valueArray;
	private DataType dataType;
	private String name;

	public MilleniumArray(int size, DataType dataType, String name){
		this.valueArray = new Object[size];
		this.dataType = dataType;
		this.name = name;
	}
	
	public void setValueAt(Object value, int index) {
		if(index >= valueArray.length){
			System.err.println("[SEMANTIC ERROR]: Array " + name + " out of bounds.");
		}else{
			valueArray[index] = value;
		}
	}
	
	public Object getValueAt(int index){
		if(index >= valueArray.length) {
			System.err.println("[SEMANTIC ERROR]: Array " + name + " out of bounds");
			return null;
		}
		else {
			switch(dataType){
				case digitz:
					return (Integer) valueArray[index];
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
		}
	}
	
	//Getters and Setters
	public Object[] getValueArray() {
		return valueArray;
	}

	public void setValueArray(Object[] valueArray) {
		this.valueArray = valueArray;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSize(){
		return valueArray.length;
	}

	
	
	
	
	
}
