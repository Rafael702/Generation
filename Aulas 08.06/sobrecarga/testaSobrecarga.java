package sobrecarga;

public class testaSobrecarga {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println("Somando dois inteiros: " + calc.soma(20,40));
		
		System.out.println("Somando dois fracion�rios: " + calc.soma(50.7, 67.3));
		
		
		
		

	}

}
