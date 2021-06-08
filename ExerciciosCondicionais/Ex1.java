package ExerciciosCondicionais;
/*	1- Faça um programa que receba três inteiros  
 * 	e
 * 	diga qual deles é o maior.
 * 
 */

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o 1° número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2° número: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3° número: ");
		n3 = sc.nextInt();
		
		System.out.println("Os números são: "+ "\n n1: " + n1 + "\n n2: " + n2 + "\n n3: " + n3);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);
		}else if(n1<n2 && n2>n3) {
			System.out.println("O maior número é: " + n2);
		}else {
			System.out.println("O maior número é: " + n3);
		}

	}

}
