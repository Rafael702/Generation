package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionais3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite uma letra de a à d: ");
		String letra = sc.nextLine();
		
		switch(letra) {
			case "a" , "A" , "Aa":
			System.out.println("Ana");
			break;
			
			case "b", "B":
				System.out.println("Bruna");
				break;
				
			case "c", "C":
				System.out.println("Cassimiro");
			break;
			
			case "d", "D":
				System.out.println("Délis");
			break;
		}  
		
	}

}
