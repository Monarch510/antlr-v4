package antlr.ArrayInit;

import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();

		ANTLRInputStream input = new ANTLRInputStream(words);
		
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ArrayInitParser parse = new ArrayInitParser(tokens);
		
		ParseTree tree = parse.init();
		System.out.println(tree.toStringTree(parse));
	}

}
