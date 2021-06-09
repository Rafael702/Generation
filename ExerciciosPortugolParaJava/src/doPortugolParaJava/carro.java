package doPortugolParaJava;

import java.util.Scanner;

public class carro {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			double custoFab, custoCon,dist;
			
			System.out.println("Entre com o custo de fábrica: ");
			custoFab = sc.nextDouble();
			
			dist = custoFab + (custoFab*0.20);
			custoCon = dist + (dist*0.45);
			
			System.out.println("Custo do Consumidor: " + custoCon);
	}

}
