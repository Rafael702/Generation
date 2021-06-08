package ExerciciosLacosRepeticao;
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int n, totN = 0;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Para sair do programa, digite: 0. Para continuar, digite um número diferente de 0!");
		
			do {
			System.out.println("Digite um número: ");
			n = sc.nextInt();
			
			if(n !=0) {
				totN += n;
				}
			
			}while(n !=0); 
		
			System.out.println("O total de todos os números digitados é: " + totN);
	}

}
