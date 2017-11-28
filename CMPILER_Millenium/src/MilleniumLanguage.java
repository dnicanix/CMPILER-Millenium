
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.*;

public class MilleniumLanguage {
	
	private MilleniumController milleniumController;
	private MilleniumView milleniumView;
	private ArrayList<String> valuesAndTokens;
	
	
	private MilleniumLexer lexer;
	private MilleniumParser parser;
	private MilleniumInterpreter interpreter;
	private FirstPassImplementor firstPass;
	

	//MilleniumBaseImplementor implementor;
	
	
	public MilleniumLanguage() throws ClassNotFoundException{
		valuesAndTokens = new ArrayList<String>();
		milleniumController = new MilleniumController(this);
		milleniumView = new MilleniumView(milleniumController);
		//interpreter = new MilleniumInterpreter(milleniumView);
		//implementor = new MilleniumBaseImplementor(milleniumView);
	}
	
	// 1.) TOKENIZE
	public String tokenize(String src){
		
		String valuesAndTokens = ""; 
		
		ANTLRInputStream input = new ANTLRInputStream( src);
		lexer = new MilleniumLexer(input);
		/*** PRINTING TOKENS
		lexer.removeErrorListeners();
		lexer.addErrorListener(new MilleniumLexerErrorListener());
		
	    while(true) {
	      Token token = lexer.nextToken();
	      if(token.getType() == MilleniumLexer.EOF) {
	        break;
	      }
	     
	      valuesAndTokens += 
	    		  MilleniumLexer.VOCABULARY.getSymbolicName(token.getType()) + ": " + token.getText() + "\n";
	      
	    }
	    
	    return valuesAndTokens;
	    ***/
		return "";
	}
	
	
	// 2.) PARSE()
	public void parse(){
		
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    
	    parser = new MilleniumParser(tokens);    
	    parser.removeErrorListeners();
	    parser.addErrorListener(new MilleniumParserErrorListener(milleniumView));
	    parser.setBuildParseTree(true);
	    ParseTree tree = parser.program(); // begin parsing at rule 'start'
	    
	    interpreter = new MilleniumInterpreter(milleniumView);
	    FirstPassImplementor firstPass = new FirstPassImplementor(interpreter);
	    firstPass.visit(tree);
	    System.out.println("ERROR UPDATE: " + interpreter.isHasError());
	    
	    /***
	    MilleniumParserListener mill = new MilleniumParserListener();
	    ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk(mill, tree);
	     ***/
	    
	    // implementor = new MilleniumBaseImplementor(milleniumView);
	    //implementor.visit(tree);
	    //System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
	
	
	// 3.) INTERPRET()
}
