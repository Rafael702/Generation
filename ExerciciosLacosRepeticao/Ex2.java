package ExerciciosLacosRepeticao;
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
* */
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num,par=0, impar=0;
		
		for(int n = 1; n<=5; n++) {
			System.out.println("Digite o " + n + "� n�mero:");
			num = sc.nextInt();
			
			if(num % 2 == 0) {
					par += 1;
			}
			else if(num % 2 !=0) {
				impar += 1;
			}
		}
		
		System.out.println("Dos 10 n�meros digitados, " + par +" s�o par");
		System.out.println("Dos 10 n�meros digitados, " + impar +" s�o impar");
		

	}

}
