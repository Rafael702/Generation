package Exercicio;

public class Cachorro extends superAnimal implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("O cachorro faz: Auauauau");
		
	}

	@Override
	public void acao() {
		System.out.println("O cachorro corre...");
		
	}

}
