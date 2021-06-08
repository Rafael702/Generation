package Exericios1;

public class testaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Orivaldo";
		cliente.tipoDeCompra = "Roupas";
		cliente.valor = 50;
		cliente.idade = 17;
		
		System.out.println("Nome do cliente: " + cliente.nome);
		System.out.println("Tipo de Compra: " + cliente.tipoDeCompra);
		System.out.println("Valor da Compra: R$" + cliente.valor);

	}

}
