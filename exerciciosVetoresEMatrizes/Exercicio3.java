package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double m[][] = new double[3][3];
		int l,c, maior = 0;
		
		
		System.out.println("Digite nove n�meros: ");
		
		for(l = 0; l <=2; l++){
			for(c=0;c <=2;c++) {
				m[l][c] = sc.nextDouble();
			}
		}
		for(l = 0; l <=2; l++){
			for(c=0;c <=2;c++) {

				if(m[l][c] > 10) {
					maior += 1;
				}
			}
			
		}
		
		System.out.println("Os n�meros da matriz, maior que 10 s�o: " + maior);
		
		
	sc.close();
	}

}
