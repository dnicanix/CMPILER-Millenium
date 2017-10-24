
import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.*;

public class MilleniumLanguage {
	
	MilleniumController milleniumController;
	MilleniumView milleniumView;
	ArrayList<String> valuesAndTokens;
	
	MilleniumLexer lexer;
	MilleniumParser parser;
	
	public MilleniumLanguage(){
		valuesAndTokens = new ArrayList<String>();
		milleniumController = new MilleniumController(this);
		milleniumView = new MilleniumView(milleniumController);
	}

	// 1.) TOKENIZE
	public String tokenize(String src){
		
		String valuesAndTokens = ""; 
		
		ANTLRInputStream input = new ANTLRInputStream( src);
		lexer = new MilleniumLexer(input);
		/* PRINTING TOKENS
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
	    */
		return "";
	}
	
	
	// 2.) PARSE()
	public void parse(){
		
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    
	    parser = new MilleniumParser(tokens);    
	    parser.removeErrorListeners();
	    parser.addErrorListener(new MilleniumParserErrorListener(milleniumView));
	    //parser.addErrorListener(new DiagnosticErrorListener());
	    //parser.getInterpreter() .setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION); // Report all ambiguities	    
	    parser.setBuildParseTree(true);
	    ParseTree tree = parser.program(); // begin parsing at rule 'start'
	    /***
	    MilleniumParserListener mill = new MilleniumParserListener();
	    ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk(mill, tree);
	     ***/
	    System.out.println(tree.toStringTree(parser)); // print LISP-style tree
	}
	
	
	// 3.) INTERPRET()
}
