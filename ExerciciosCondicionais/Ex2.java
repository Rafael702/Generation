package ExerciciosCondicionais;
/*2- Faça um programa que entre com três números e coloque em ordem crescente.
*
/*
 * 
 */
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o 1° número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2° número: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3° número: ");
		n3 = sc.nextInt();
		
		
		if(n1 >= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Os números são: "+ "\n" + n3  + "\n" + n2 + "\n" + n1);
		}else if(n1 >= n2 && n1 >= n3 && n2 <= n3) {
			System.out.println("Os números são: "+ "\n" + n2 + "\n" + n3 + "\n" + n1);
		}else if(n1 <= n2 && n1 >= n3 && n2 >= n3) {
			System.out.println("Os números são: "+ "\n" + n3 + "\n" + n1 + "\n" + n2);
		}else if(n1 <= n2 && n1 <= n3 && n2 >= n3) {
			System.out.println("Os números são: "+ "\n" + n1 + "\n" + n3 + "\n" + n2);
		}else if(n1 >= n2 && n1 <= n3 && n2 <= n3) {
			System.out.println("Os números são: "+ "\n" + n2 + "\n" + n1  + "\n" + n3);
		}else {
			System.out.println("Os números são: "+ "\n" + n1 + "\n" + n2  + "\n" + n3);
		}
	}

}
