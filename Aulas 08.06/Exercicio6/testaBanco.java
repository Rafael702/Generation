package Exercicio6;

import java.util.Scanner;

public class testaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contaBancaria cb = new contaBancaria();
		
		cb.setNomeCliente("Jorge");
		cb.setValorConta(sc.nextDouble());
		cb.setValorDepositado(sc.nextDouble());
		
		
		System.out.println("O Cliente: " + cb.getNomeCliente() + "\n" 
				+ "Tinha: R$" + cb.getValorConta() + " guardado em sua conta " 
				+ "\nFoi depositado: R$" + cb.getValorDepositado() + 
				"\nTotal: " + cb.deposito(cb.getValorDepositado()));

	}

}
