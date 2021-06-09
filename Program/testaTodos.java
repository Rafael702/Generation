package Program;

import funcionario.Professor;

public class testaTodos {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		
		prof.setNome("Oziel");
		prof.setIdade(24);
		prof.setEndereco("Rua Matacavlos, 550");
		
		System.out.println("===============Dados do Professor==============");
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Idade: " + prof.getIdade());
		System.out.println("Endereço: " + prof.getEndereco());
	}

}
