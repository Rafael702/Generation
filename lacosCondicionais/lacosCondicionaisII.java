package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionaisII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n1,n2, result = 0;
		
		char operacao; //Lembrete: char é o caracter no Portugol(um caracter). A cadeia de palavras é o String
		
		System.out.println("Digite o 1° número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a operação: ");
		operacao = sc.next().charAt(0); //Inicia o char com o número 0. Os números equivalem as letras;
		//O zero está valendo como o default. Para o char não ficar com o valor null.
		
		System.out.println("Digite o 2° número: ");
		n2 = sc.nextDouble();
		
		if(operacao == '+') {
			result = n1 + n2;
		}else if(operacao == '-') {
			result = n1 - n2;
		}else if(operacao == '*') {
			result = n1 * n2;
		}else if(operacao == '/') {
			result = n1 / n2;
		}
			System.out.println("Resultado: " + result);
		
	}

}
