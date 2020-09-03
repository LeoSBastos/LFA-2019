package br.com.lfa.trab1.sintatico;
import java_cup.runtime.Symbol;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.com.lfa.trab1.lexico.Lexico;
public class Main {

	public static void main(String[] args) throws IOException{
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/br/com/lfa/trab1/";

		String file = rootPath + subPath + "palavra.txt";
		List<Symbol> list = new ArrayList<>();
		try {
		Lexico lexico = new Lexico(new FileReader(file));
		Symbol token;
		while((token = lexico.next_token()).sym != 0) {
			list.add(token);
		}}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Palavra reconhecida");
		
	}
}
