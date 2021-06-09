package br.com.generation.poo;

public class aulaPoo {
	static int numero1 = 100;
	static int numero2 = 200;
	static int soma;
	
	public static void main(String[] args) {
			
		
		metodo();
		metodo2();
		metodo3();
	}
	public static void metodo() {
		System.out.println("Eu sou um método");
	}
	public static void metodo2() {
		soma = numero1+numero2;
	}
	public static void metodo3() {
		System.out.println("A soma do número é: " + soma);
	}
	
	
}
