package uteis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class TxtWriter {
	
	public static String Read(String path) {
		String content = "";
		try {
			FileReader arq = new FileReader(path);
			BufferedReader readArq = new BufferedReader(arq);
			String line = "";
			try {
				line = readArq.readLine();
				while(line != null) {
					content += line;
					line = readArq.readLine();
				}
				arq.close();
				return content;
			}catch(IOException ex) {
				System.out.println("Erro: Não foi possível ler o arquivo");
				return "";
			}
		}catch(FileNotFoundException ex) {
			System.out.println("Erro: Arquivo não encontrado!");
			return "";
		}
	}

	public static boolean Write(String path, String text) {
		try {
			FileWriter arq = new FileWriter(path);
			PrintWriter writeArq = new PrintWriter(arq);
			writeArq.println(text);
			writeArq.close();
			return true;
		}catch(IOException e){
			System.out.println(e.getMessage());
			return false;
		}
	}
}