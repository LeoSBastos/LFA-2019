package br.com.lfa.trab1.lexico;

import java.io.File;
import java.nio.file.Paths;

public class LexGenerator {
	public static void main(String[] args) {
		 String rootPath = Paths.get("").toAbsolutePath(). toString();
	        String subPath = "/src/br/com/lfa/trab1/lexico/";

	        String file = rootPath + subPath + "grammar.flex";

	        File sourceCode = new File(file);

	        jflex.Main.generate(sourceCode);


	}
}
