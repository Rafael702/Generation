package Exercicio;

public class imprimiClasses {

	public static void main(String[] args) {
	
		testaClasses t1 = new testaClasses();
		testaClasses t2 = new testaClasses();
		testaClasses t3 = new testaClasses();
		
		t1.setName(new Cachorro(), "Bob");
		t1.setIdade(new Cachorro(), 15);
		
		System.out.println("O nome do cachorro é: " + t1.getName());
		System.out.println("A idade do Cachorro é: " + t1.getIdade());
		
		
		t1.somDoAnimal(new Cachorro());
		t1.acaoAnimal(new Cachorro());
		
		System.out.println("");
		t2.setName(new Cavalo(), "Pé de Pano");
		t2.setIdade(new Cavalo(), 4);
		
		System.out.println("O nome do Cavalo é: " + t2.getName());
		System.out.println("A idade do Cavalo é: " + t2.getIdade());
		
		t2.somDoAnimal(new Cavalo());
		t2.acaoAnimal(new  Cavalo());
		
		System.out.println("");
		t3.setName(new Preguica(), "Thompsom");
		t3.setIdade(new Preguica(), 3);
		
		System.out.println("O nome da Preguiça é: " + t3.getName());
		System.out.println("A idade da Preguiça é: " + t3.getIdade());
		
		t3.somDoAnimal(new Preguica());
		t3.acaoAnimal(new Preguica());
		
		
	}

}
