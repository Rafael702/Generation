package br.com.generation.poo;

public class testaMetodo {
	public static String contador(int inicio, int fim) {
		String numeroString = "";
		for(int c = inicio; c <= fim; c++) {
			numeroString +=  c + "";
			
		}
		
		return numeroString;
	}
}
