package ExerciciosCondicionais;
/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
*
/*
 * 
 */
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = sc.nextInt();
		
		
		if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Os n�meros s�o: "+ "\n" + n3  + "\n" + n2 + "\n" + n1);
		}else if(n1 >= n2 && n1 >= n3 && n2 <= n3) {
			System.out.println("Os n�meros s�o: "+ "\n" + n2 + "\n" + n3 + "\n" + n1);
		}else if(n1 <= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Os n�meros s�o: "+ "\n" + n3 + "\n" + n1 + "\n" + n2);
		}else if(n1 <= n2 && n1 <= n3 && n2 >= n3) {
			System.out.println("Os n�meros s�o: "+ "\n" + n1 + "\n" + n3 + "\n" + n2);
		}else if(n1 >= n2 && n1 <= n3 && n2 <= n3) {
			System.out.println("Os n�meros s�o: "+ "\n" + n2 + "\n" + n1  + "\n" + n3);
		}else {
			System.out.println("Os n�meros s�o: "+ "\n" + n1 + "\n" + n2  + "\n" + n3);
		}
	}

}
