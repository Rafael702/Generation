package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[6];
		int i,par = 0, impar = 0;
		
		System.out.println("Digite seis números: ");
		
		for(i = 0; i <=5;i++) {
			
			num[i] = sc.nextInt();
		}
		for(i = 0;i <= 5; i++) {
			if(num[i] % 2 == 0) {
				System.out.println("Número par: " + num[i]);
				par += num[i];
			}else {
				System.out.println("Número impar: " + num[i]);
				impar += num[i];

			}
		}
		System.out.println("A soma total dos números que são pares: " + par);
		System.out.println("A soma total dos números que são impares: " + impar);

	}

}
