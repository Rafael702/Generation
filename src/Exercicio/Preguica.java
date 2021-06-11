package Exercicio;

public class Preguica extends superAnimal implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("A preguiça faz: zzzZZZZzzzZ");
		
	}

	@Override
	public void acao() {
		System.out.println("A Preguiça sobe em árvores..");
		
	}

	
	
}
