package classe;

public class testarCarro {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		
		ferrari.nome = "Ferrari";
		ferrari.marca = "Ferrari Italia";
		ferrari.ano = 2010;
		
		ferrari.acelerar(200);
		System.out.println("Velocidade " + ferrari.velocidade);
		
		ferrari.freiar(60);
		System.out.println("Velocidade " + ferrari.velocidade);
		
		
		
	}

}
