package doPortugolParaJava;

import java.util.Scanner;

public class tresN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,r,s,d;
		
		System.out.println("Entre com um número para A: ");
		a = sc.nextInt();
		
		System.out.println("Entre com um número para B: ");
		b = sc.nextInt();
		
		System.out.println("Entre com um número para C: ");
		c = sc.nextInt();
		
		r = (int) Math.pow(a+b, 2);
		s = (int) Math.pow(b+c, 2);
		
		d = (r+s)/2;
		
		System.out.println("O valor de D é = " + d);
		
	}

}
