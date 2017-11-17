


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MilleniumRunner 
{
	/***
    ANTLRInputStream input = new ANTLRInputStream( System.in);

    MilleniumLexer lexer = new MilleniumLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    
    MilleniumParser parser = new MilleniumParser(tokens);
    ParseTree tree = parser.r(); // begin parsing at rule 'r'
    System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    ***/
	
	
	//ANTLRInputStream input = new ANTLRInputStream( System.in);
	
	
	/*
	String src = "digitz lutang single Msg weh ; priority optionlang nochoice "
			+ "willingtowait hanggatkeri gora post "
			+ "gimmeinput ( ) { } [ ] ???hello there??? ??? ??? ?whut ? ; 9 99 -98 +98 +-98 "
			+ "0.32 .32 99.98 'x' '%' \"ohayou\" \"\" \"x\""
			+ "+ - * /  % < <= > >= == != AND OR NOT"
			+ "FUNCTION , shoutout";
	
	ANTLRInputStream input = new ANTLRInputStream( src);
	MilleniumLexer lexer = new MilleniumLexer(input);
    while(true) {	
      Token token = lexer.nextToken();
      if(token.getType() == MilleniumLexer.EOF) {
        break;
      }
      System.out.println(MilleniumLexer.VOCABULARY.getSymbolicName(token.getType()) + " :: " + token.getText());
    }
    */
    public static void main( String[] args) throws Exception 
    {
    	MilleniumLanguage milleniumLang = new MilleniumLanguage();
    }
    
     
}