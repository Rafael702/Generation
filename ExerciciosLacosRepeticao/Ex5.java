package ExerciciosLacosRepeticao;
/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int n, totN = 0;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Para sair do programa, digite: 0. Para continuar, digite um n�mero diferente de 0!");
		
			do {
			System.out.println("Digite um n�mero: ");
			n = sc.nextInt();
			
			if(n !=0) {
				totN += n;
				}
			
			}while(n !=0); 
		
			System.out.println("O total de todos os n�meros digitados �: " + totN);
	}

}
