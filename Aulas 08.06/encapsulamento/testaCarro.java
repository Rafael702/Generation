package encapsulamento;

public class testaCarro {

	public static void main(String[] args) {
		Carro car = new Carro ();
		
		car.setMarca("Fiat");
		car.setModelo("Palio");
		car.setCapacidadeCombustivel(45.45);
		car.setNumPassageiros(5);
		
		System.out.println("Marca: " + car.getMarca());
		System.out.println("Modelo " + car.getModelo());
		System.out.println();
	}

}
