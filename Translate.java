package antlr.ArrayInit;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {
	
	public static void main(String[] args) throws Exception{
		String words = "{2,3,4}";
		
		ANTLRInputStream input = new ANTLRInputStream(words);
		
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ArrayInitParser parser = new ArrayInitParser(tokens);
		ParseTree tree = parser.init();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(new ShortToUnicodeString(),tree);
		System.out.println();
	}

}
