package ExerciciosLacosRepeticao;
/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 * */
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ,mt3 = 0, med = 0, cont = 0;
		
		System.out.println("Para sair do programa, digite: 0. Para continuar, digite um n�mero diferente de 0!");
		
		do {
		System.out.println("Digite um n�mero: ");
		n = sc.nextInt();
		
		if(n % 3 == 0) {
			mt3 += n;
			cont++;
			}
		
		}while(n !=0); 
		
		med = mt3/cont;
		System.out.println("O total de todos os n�meros digitados �: " + med);

	}

}
