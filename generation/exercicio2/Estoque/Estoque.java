package br.com.generation.exercicio2.Estoque;

public class Estoque {

	
		
		private int dataDeValidade;
		private String nomeDoProduto;
		private int dataDeEntrada;
		
		public Estoque() {
			
		}
		
		public Estoque(int dataDeValidade, String nomeDoProduto, int dataDeEntrada) {
			this.dataDeEntrada = dataDeEntrada;
			this.nomeDoProduto = nomeDoProduto;
			this.dataDeEntrada = dataDeEntrada;
		}
		
		public int getDataDeValidade() {
			return dataDeValidade;
		}
		public void setDataDeValidade(int dataDeValidade) {
			this.dataDeValidade = dataDeValidade;
		}
		public String getNomeDoProduto() {
			return nomeDoProduto;
		}
		public void setNomeDoProduto(String nomeDoProduto) {
			this.nomeDoProduto = nomeDoProduto;
		}
		public int getDataDeEntrada() {
			return dataDeEntrada;
		}
		public void setDataDeEntrada(int dataDeEntrada) {
			this.dataDeEntrada = dataDeEntrada;
		}
		
}
