package ExerciciosCondicionais;
/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade,proib = 10, inf = 14, juv = 17, adul = 25 ;
		
		System.out.println("Informe a sua idade: ");
		idade = sc.nextInt();
		
	if(idade < proib) {
		System.out.println("INAVÁLIDO!" + "\nEntrada permitida somente para até ou maiores de 10 anos!");
	}else if(idade >=proib && idade <= inf ) {
			System.out.println("Categoria: Infantil" + "\nIdade " + idade);
		}else if(idade >inf && idade <= juv) {
			System.out.println("Categoria: Juvenil" + "\nIdade " + idade);
		}else {
			System.out.println("Categoria: Adulto" + "\nIdade " + idade);
		}
	}

}
