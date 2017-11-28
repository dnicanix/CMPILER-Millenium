


import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class MilleniumParserErrorListener implements ANTLRErrorListener{
	
	MilleniumView mv;
	
	public MilleniumParserErrorListener(MilleniumView mv){
		this.mv = mv;
	}
	
	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3,
			boolean arg4, BitSet arg5, ATNConfigSet arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2,
			int arg3, BitSet arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2,
			int arg3, int arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object offendingToken, int line,
			int charPositionInLine, String msg, RecognitionException arg5) {
		// TODO Auto-generated method stub
		offendingToken = offendingToken.toString().split("=")[1].split(",")[0];
		//System.err.println("[SYNTAX ERROR]: " + msg + " (line " + line + ":" + charPositionInLine + ")");
		
		String errorType = "[SYNTAX ERROR]";
		String errorLine = line + "";
		String errorMsg = msg;
		
		if(msg.contains("mismatched input")){
			
/*			System.err.println
					("[SYNTAX ERROR]: Input mismatched!" +
							" Try replacing " + offendingToken + " or input onwards" +
							". (line " + line + ":" + charPositionInLine + ")"
					);*/
			
			errorMsg = "Input mismatched! Try replacing " + offendingToken + " or input onwards.";

		}else if(msg.contains("no viable")){
			offendingToken = msg.split("input")[1];
			
			/*System.err.println
				("[SYNTAX ERROR]: No viable alternative! " +
						"Fix the input" + offendingToken + ". " + 
						 "(line " + line + ":" + charPositionInLine + ")");*/
			
			errorMsg = "No viable alternative! Fix the input" + offendingToken + ".";
			
		}else if(msg.contains("token recognition")){
			
			/*System.err.println
			("[SYNTAX ERROR]: Unrecognized token! " +
					"Delete " + offendingToken + ". " + 
					 "(line " + line + ":" + charPositionInLine + ")");*/
			
			errorMsg = "Unrecognized token! Delete " + offendingToken + ".";
		}
		else if(msg.contains("extraneous input")){
			
			/*System.err.println
			("[SYNTAX ERROR]: Unnecessary input!! " +
					"Replace " + offendingToken + ". " + 
					 "(line " + line + ":" + charPositionInLine + ")");*/
			
			errorMsg = "Unnecessary input! Replace " + offendingToken + ".";
		}else if(msg.contains("missing")){
			
			/*System.err.println
			("[SYNTAX ERROR]: Missing token!! " +
					"Try adding " + offendingToken + ". " + 
					 "(line " + line + ":" + charPositionInLine + ")");*/
			
			errorMsg = "Missing token! Try adding a token before " + offendingToken + ".";
		}else{
			/*System.err.println("[SYNTAX ERROR]: " + msg + " (line " + line + ":" + charPositionInLine + ")");*/
		}
		
		mv.addErrorMessages(errorType, errorLine, errorMsg);
		
	}

}
