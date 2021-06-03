package doPortugolParaJava;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n1,n2,n3,p1=2, p2=3, p3=5,mdP = 0;
		
		
		System.out.println("Entre com a nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Entre com a nota 2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Entre com a nota 3: ");
		n3 = sc.nextDouble();
		
		mdP = ((n1*p1) + (n2*p2) + (n3*p3))/ (p1+p2+p3);
		
		System.out.println("A média Ponderada é = " + mdP);
		

	}

}
