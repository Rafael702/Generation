package doPortugolParaJava;

import java.util.Scanner;

public class equacoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Informe o valor de a: ");
		a = sc.nextDouble();
		System.out.println("Informe o valor de b: ");
		b = sc.nextDouble();
		System.out.println("Informe o valor de c: ");
		c = sc.nextDouble();
		System.out.println("Informe o valor de d: ");
		d = sc.nextDouble();
		System.out.println("Informe o valor de e: ");
		e = sc.nextDouble();
		System.out.println("Informe o valor de f: ");
		f = sc.nextDouble();
		
		
		
		x = ((c*e) - (b*f))/((a*e) - (b*d));
		y = ((a*f) - (c*d))/((a*e) - (b*d));
		
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);
	}

}
