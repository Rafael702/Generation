package classe;

public class Carro {
	//Atributos e Variáveis
	
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
	
}
