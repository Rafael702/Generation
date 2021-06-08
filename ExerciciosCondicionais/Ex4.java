package ExerciciosCondicionais;
/*4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este
*número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
*ímpar exiba o número elevado ao quadrado.
*  
* */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.println("Entre com um número: ");
		n = sc.nextDouble();
		
		if(n % 2 == 0) {
			System.out.printf("O número: " + n + " é Par!" +
			"\n" + "Sua Raiz Quadrada é: " + "%.2f" ,  Math.sqrt(n));
		}else{
			System.out.printf("O número: " + n + " é Impar!" +
					"\n" + "Este número elevado ao quadrado é: " + "%.2f" , Math.pow(n,2));
			

		}
		

	}

}
