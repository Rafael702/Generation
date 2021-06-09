package exerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2]; //matriz resultante para as operações das opções (1) e (2)
		int usuario = 0; //essa variável guarda a opção que o usuário escolheu
		double constante; //essa variável é a constante pedida na opção (3)
		
		Scanner in = new Scanner(System.in);
		
		//Lendo a primeira matriz
		System.out.println("Digite a primeira matriz 2 x 2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m1[l][c] = in.nextDouble();
			}
		}
		
		//Lendo a segunda matriz
		System.out.println("\nDigite a segunda matriz 2x2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m2[l][c] = in.nextDouble();
			}
		}
		
		//Print do menuzinho de opções
		System.out.println("==================================================================");
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("DIGITE 1 para somar as matrizes\nDIGITE 2 para subtrair primeira matriz da segunda"
				+ "\nDIGITE 3 para adicionar uma constante as duas matrizes\nDIGITE 4 para imprimir as matrizes");
		usuario = in.nextInt();
		
		System.out.println("==================================================================");
		
		
		//Dentro dos ifs, o programa executa a opção e já imprime pro usuário!
		
		//opção 1: somar as matrizes
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			
			System.out.println("\nMatriz resultante da soma (m1 + m2): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		
		//opção 2: subtraindo as matrizes
		else if (usuario == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}

			System.out.println("\nMatriz resultante da subtração (m2 - m1): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		}
		//opção 3: adicionando uma constante
		else if (usuario == 3) {
			System.out.println("Digite a constante: ");
			constante = in.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}		
		}
	}
}