package lacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisI {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n1,n2,med;
		
		System.out.println("Digite a 1� nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		n2 = sc.nextDouble();
		
		med = (n1+n2)/2;
		
		if(med >= 6.0) {
			System.out.println("Aprovado " + "\nM�dia: " + med);
		}else if(med >=3 && med <= 6.0){
			System.out.println("Recupera��o " + "\nM�dia: " + med );
	}else {
			System.out.println("Reprovado " + "\nM�dia: " + med);
		}
		sc.close();
	}

}
