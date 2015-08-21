package br.com.alura.designpattern;

public class ItemDaNotaBuilder {

	private double valor;
	private String nomeItem;

	public ItemDaNotaBuilder selecionarValorItem(double valor) {
		this.valor = valor;
		return this;
	}

	public ItemDaNotaBuilder selecionarNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
		return this;
	}

	public ItemDaNota contuirItem() {
		return new ItemDaNota(valor, nomeItem);
	}
}
