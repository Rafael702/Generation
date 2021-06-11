package Exercicio;

public class Cavalo extends superAnimal implements Animal{

	@Override
	public void emitirSom() {
		System.out.println("O cavalo faz: IhhhhhiiiihHHH");
		
	}

	@Override
	public void acao() {
		System.out.println("O Cavalo corre...");
		
	}

	
}
