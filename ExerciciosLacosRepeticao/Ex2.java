package ExerciciosLacosRepeticao;
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
* */
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num,par=0, impar=0;
		
		for(int n = 1; n<=5; n++) {
			System.out.println("Digite o " + n + "° número:");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
					par += 1;
			}
			else if(num % 2 !=0) {
				impar += 1;
			}
		}
		
		System.out.println("Dos 10 números digitados, " + par +" são par");
		System.out.println("Dos 10 números digitados, " + impar +" são impar");
		

	}

}
