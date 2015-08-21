package br.com.alura.designpattern;

public class ItemDaNota {

	private double valor;
	private String nome;

	public double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

	public ItemDaNota(double valor, String nome) {
		super();
		this.valor = valor;
		this.nome = nome;
	}

}
