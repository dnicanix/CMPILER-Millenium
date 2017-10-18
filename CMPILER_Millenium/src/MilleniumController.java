import java.util.ArrayList;


public class MilleniumController {
	MilleniumLanguage milleniumLang;

	public MilleniumController(MilleniumLanguage milleniumLang){
		this.milleniumLang = milleniumLang;
	}
	public String getLexerTokens(String src){	
		return milleniumLang.tokenize(src);
	}
	
	public void parse(){
		milleniumLang.parse();
	}
	
}
