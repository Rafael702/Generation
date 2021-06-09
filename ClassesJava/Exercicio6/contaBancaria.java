package Exercicio6;

public class contaBancaria {
		
	private String nomeCliente;
	private double valorConta;
	private double valorDepositado;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getValorConta() {
		return valorConta;
	}
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	 
	public double getValorDepositado() {
		return valorDepositado;
	}
	public void setValorDepositado(double valorDepositado) {
		this.valorDepositado = valorDepositado;
	}
	
	public double deposito(double valorDepositado) {
		return   valorConta + valorDepositado;
	}
	
}
