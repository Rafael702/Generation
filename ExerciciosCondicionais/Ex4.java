package ExerciciosCondicionais;
/*4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
*n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
*�mpar exiba o n�mero elevado ao quadrado.
*  
* */

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n;
		
		System.out.println("Entre com um n�mero: ");
		n = sc.nextDouble();
		
		if(n % 2 == 0) {
			System.out.printf("O n�mero: " + n + " � Par!" +
			"\n" + "Sua Raiz Quadrada �: " + "%.2f" ,  Math.sqrt(n));
		}else{
			System.out.printf("O n�mero: " + n + " � Impar!" +
					"\n" + "Este n�mero elevado ao quadrado �: " + "%.2f" , Math.pow(n,2));
			

		}
		

	}

}
