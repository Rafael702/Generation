package lacosCondicionais;

import java.util.Scanner;

public class lacosCondicionaisII {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n1,n2, result = 0;
		
		char operacao; //Lembrete: char � o caracter no Portugol(um caracter). A cadeia de palavras � o String
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a opera��o: ");
		operacao = sc.next().charAt(0); //Inicia o char com o n�mero 0. Os n�meros equivalem as letras;
		//O zero est� valendo como o default. Para o char n�o ficar com o valor null.
		
		System.out.println("Digite o 2� n�mero: ");
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
