package ExerciciosCondicionais;
/*	1- Fa�a um programa que receba tr�s inteiros  
 * 	e
 * 	diga qual deles � o maior.
 * 
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = sc.nextInt();
		
		System.out.println("Os n�meros s�o: "+ "\n n1: " + n1 + "\n n2: " + n2 + "\n n3: " + n3);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: " + n1);
		}else if(n1<n2 && n2>n3) {
			System.out.println("O maior n�mero �: " + n2);
		}else {
			System.out.println("O maior n�mero �: " + n3);
		}

	}

}
