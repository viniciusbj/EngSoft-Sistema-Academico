package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Helper {
	public static String LeArquivo (String path) {
		String texto="";
		try {
	      BufferedReader arquivo = new BufferedReader(new FileReader(path));
	 
	      texto = arquivo.readLine();
	      while (texto != null) {
	        texto += arquivo.readLine();
	      }
	 
	      arquivo.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }
		return texto;
		
	}
}
