package doPortugolParaJava;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int d = 0,dias,mes,anos;
		
		System.out.println("Informe a sua idade em dias: ");
	    dias = sc.nextInt();
	    
	    System.out.println("Informe a sua idade em mêses: ");
	    mes = sc.nextInt();
	    
	    System.out.println("Informe a sua idade em anos: ");
	    anos = sc.nextInt();
	    
	    d = (d+(anos*365)+(mes*30));
	    
	    System.out.println("Total de dias: " + d);

	}

}
