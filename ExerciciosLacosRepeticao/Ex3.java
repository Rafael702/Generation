package ExerciciosLacosRepeticao;
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, menosDe = 0,maisDe = 0;
		
		while(i != -99) {
			System.out.println("Informe a sua idade: ");
			i = sc.nextInt();
		if(i > 0) {
			if(i < 21) {
				menosDe += 1;
			}else if(i > 50) {
				maisDe += 1;
			}
	}
		}
			System.out.println("Mais de: " + menosDe + "  abaixo de 21 anos, fizeram a pesquisa: ");
			System.out.println("Mais de: " + maisDe + "  acima de 50 anos, fizeram a pesquisa: ");
	}

}
