package Exercicio2;

public class Aviao {
	
	String marca;
	private int gasolina;
	
	
	public int getGasolina() {
		return gasolina;
	}


	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}


	public boolean Combustivel(int gasolina) {
		if(gasolina < 100) {
			System.out.println("Abaixo do nível esperado!");
		}else {
			System.out.println("Permissão para seguir na viagem: " + gasolina);
		}
		return false;		
	}
	
	
	
}
