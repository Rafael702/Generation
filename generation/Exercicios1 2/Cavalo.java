package br.com.generation.Exercicios;

public class Cavalo extends Animal{
	
	
	public String emitirSom() {
		return emitirSom(" o cavalo faz: Iiiihhhiihh");
	}
	
	public String acao() {
		return super.acao(" O cavalo corre 32 a 50km");
	}
	
}
