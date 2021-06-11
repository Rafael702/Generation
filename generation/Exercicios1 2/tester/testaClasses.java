package br.com.generation.Exercicios.tester;

import br.com.generation.Exercicios.Animal;
import br.com.generation.Exercicios.Cachorro;
import br.com.generation.Exercicios.Cavalo;
import br.com.generation.Exercicios.Preguica;

public class testaClasses extends Animal{

	public static void main(String[] args) {
		 Cachorro dog = new Cachorro();
		 Cavalo horse = new Cavalo();
		 Preguica sloth = new Preguica();
		 
		 dog.setNome("Francis");
		 dog.setIdade(3);
		 
		 horse.setNome("Labão");
		 horse.setIdade(7);
		 
		 sloth.setNome("Thompson");
		 sloth.setIdade(5);
		 
		 
		 System.out.println("O nome do cachorro é: " + dog.getNome() + ", ele tem " + dog.getIdade() + " anos de idade." +
			dog.acao() + ". E" + dog.emitirSom());
		 
		 System.out.println("O nome do cavalo é: " + horse.getNome() + ", ele tem " + horse.getIdade() + " anos de idade." +
					horse.acao() + ". E" + horse.emitirSom());
		 
		 System.out.println("O nome da Preguiça é: " + sloth.getNome() + ", ele tem " + sloth.getIdade() + " anos de idade." +
					sloth.acao() + ". E" + sloth.emitirSom());
	}

}
