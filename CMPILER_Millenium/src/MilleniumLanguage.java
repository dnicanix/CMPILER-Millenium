import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import errorhandlers.MilleniumLexerErrorListener;

public class MilleniumLanguage {
	
	MilleniumController milleniumController;
	MilleniumView milleniumView;
	ArrayList<String> valuesAndTokens;
	
	public MilleniumLanguage(){
		valuesAndTokens = new ArrayList<String>();
		milleniumController = new MilleniumController(this);
		milleniumView = new MilleniumView(milleniumController);
	}

	// 1.) TOKENIZE
	public String tokenize(String src){
		
		String valuesAndTokens = ""; 
		
		ANTLRInputStream input = new ANTLRInputStream( src);
		MilleniumLexer lexer = new MilleniumLexer(input);
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
	}
	
	
	// 2.) PARSE()
	
	
	// 3.) INTERPRET()
}
