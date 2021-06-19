package Exercicio;

public class testaClasses extends superAnimal{
		
	public void acaoAnimal(Animal animal) {
		animal.acao();
	}
	
	public void somDoAnimal(Animal animal) {
		animal.emitirSom();
	}
	
	
	@Override
	public void setName(Animal animal, String name) {
		// TODO Auto-generated method stub
		super.setName(animal, name);
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public void setIdade(Animal animal, int idade) {
		// TODO Auto-generated method stub
		super.setIdade(animal, idade);
	}
	
	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}
}
