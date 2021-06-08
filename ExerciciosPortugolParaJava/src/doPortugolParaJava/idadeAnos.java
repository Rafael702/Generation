package doPortugolParaJava;

import java.util.Scanner;

public class idadeAnos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int mes, dias, anos,totDias;
		
		
		System.out.println("Informe os seus dias de vida: ");
		dias = sc.nextInt();
		
		System.out.println("Informe os seus anos de vida: ");
		anos = sc.nextInt();
		
		System.out.println("Informe os seus meses de vida: ");
		mes = sc.nextInt();
		
		totDias = (anos * 365) + (mes * 30) + dias;
		
		System.out.println("Idade total em dias" + "v" + totDias);

	}

}
