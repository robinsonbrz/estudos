package br.com.alura.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private double valor;
	private final List<Item> itens;

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public Orcamento(double valor) {

		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

}
