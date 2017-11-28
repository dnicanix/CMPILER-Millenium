

import java.util.HashMap;

import org.antlr.v4.runtime.RuleContext;

public class Scope {
	
	private String name;
	private HashMap<String, MilleniumSymbol> symbolTable;
	private String parent; //Parent Scope
	private RuleContext caller;
	
	public Scope(String name, String parent){
		this.name = name;
		symbolTable = new HashMap<String, MilleniumSymbol>();
		this.parent = parent;
	}
	
	/*
	public Scope(String name, RuleContext caller){
		this.name = name;
		symbolTable = new HashMap<String, MilleniumSymbol>();
		this.caller = caller;
	}
	*/
	
	public void addToSymbolTable(MilleniumFunction func){
		symbolTable.put(func.getIdentifier(), func);
	}
	
	public void addToSymbolTable(MilleniumArray arr){
		symbolTable.put(arr.getIdentifier(), arr);
	}
		
	public void addToSymbolTable(MilleniumValue var){
		symbolTable.put(var.getIdentifier(), var);
	}

	public MilleniumValue getAVar(String identifier){
		try{
			return (MilleniumValue)symbolTable.get(identifier);
		}catch (Exception e){
			return new MilleniumValue(null);
		}

	}
	
	public MilleniumArray getAnArr(String identifier){
		return (MilleniumArray)symbolTable.get(identifier);
	}
	
	public MilleniumFunction getAFunc(String identifier){
		return (MilleniumFunction)symbolTable.get(identifier);
	}
	
	
	
	//Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, MilleniumSymbol> getSymbolTable() {
		return symbolTable;
	}

	public void setSymbolTable(HashMap<String, MilleniumSymbol> symbolTable) {
		this.symbolTable = symbolTable;
	}

	public RuleContext getCaller() {
		return caller;
	}

	public void setCaller(RuleContext caller) {
		this.caller = caller;
	}
	
	

}
