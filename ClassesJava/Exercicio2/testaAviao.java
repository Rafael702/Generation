package Exercicio2;

import java.util.Scanner;

public class testaAviao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao av = new Aviao();
		
		av.marca = "LATAM";
		av.setGasolina(sc.nextInt());
		av.Combustivel(av.getGasolina());
		
		

	}

}
