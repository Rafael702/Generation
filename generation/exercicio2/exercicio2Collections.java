package br.com.generation.exercicio2;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;




public class exercicio2Collections {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String produto, rm;
		
		
		System.out.println("Quantos produtos você deseja cadastrar?");
		n = sc.nextInt();
		
		List<String> estoque = new ArrayList<>();
		
		for(int i=1; i <= n; i++) {
			System.out.println("Informe o nome do produto: ");
			produto = sc.next();
			
			estoque.add(produto);
			
		}
		
		System.out.println("Lista: " + estoque);
		
		System.out.println("Você deseja remover algum item da lista? y - sim| n - não");
		rm = sc.next();
		
		if(rm.equals("y")){
			System.out.println("Digite o número do produto para ser removido: ");
			int rf = sc.nextInt();
			
			estoque.remove(rf);
		}
		
		System.out.println("Lista atualizada: " + estoque);
				
		
		sc.close();
	}

}
