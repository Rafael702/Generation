package Exercicio;

public class imprimiClasses {

	public static void main(String[] args) {
	
		testaClasses t1 = new testaClasses();
		testaClasses t2 = new testaClasses();
		testaClasses t3 = new testaClasses();
		
		t1.somDoAnimal(new Cachorro());
		t1.acaoAnimal(new Cachorro());
		
		t2.somDoAnimal(new Cavalo());
		t2.acaoAnimal(new  Cavalo());
		
		t3.somDoAnimal(new Preguica());
		t3.acaoAnimal(new Preguica());
	}

}
