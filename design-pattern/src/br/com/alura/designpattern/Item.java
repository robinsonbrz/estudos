package br.com.alura.designpattern;

public class Item {

	private String nome;
	private double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

}
