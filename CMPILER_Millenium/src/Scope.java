

import java.util.HashMap;

import org.antlr.v4.runtime.RuleContext;

public class Scope {
	
	private String name;
	private HashMap<String, MilleniumSymbol> symbolTable;
	private RuleContext caller;
	
	public Scope(String name, RuleContext caller){
		this.name = name;
		symbolTable = new HashMap<String, MilleniumSymbol>();
		this.caller = caller;
	}
	
	public void addToSymbolTable(MilleniumFunction func){
		symbolTable.put(func.getIdentifier(), func);
	}
	
	public void addToSymbolTable(MilleniumValue var){
		symbolTable.put(var.getIdentifier(), var);
	}
	
	public MilleniumValue getAVar(String identifier){
		return (MilleniumValue)symbolTable.get(identifier);
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
