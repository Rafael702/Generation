package exerciciosVetoresEMatrizes;


public class Exercicio1 {

	public static void main(String[] args) {
		
		int a[] = new int[6],soma;
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -3;
		a[4] = -5;
		a[5] = 7;
		
		soma = a[0] + a[1] + a[5];
		System.out.println("A soma total dos valores inseridos no A[0] + A[1] + A[5] = " + soma);
		
		a[4] = 100;
		
		System.out.println("A[4] está valendo: " + a[4]);
		
		System.out.println("Valores do vetor A: " + "\n" +  a[0] + "\n" + a[1] + "\n" + a[2] + "\n" + a[3] + "\n" + a[4] + "\n" + a[5]);
	}

}
