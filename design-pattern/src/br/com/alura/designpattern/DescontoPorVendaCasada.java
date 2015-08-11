package br.com.alura.designpattern;


public class DescontoPorVendaCasada implements Desconto {

	private Desconto desconto;

	@Override
	public double calculaDesconto(Orcamento orcamento) {

		if (consultaItem("LAPIS", orcamento) == true
				&& consultaItem("CANETA", orcamento) == true) {
			return orcamento.getValor() * 0.05;
		}

		return 0;
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	public boolean consultaItem(String nomeItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeItem))
				return true;
		}
		return false;
	}
}
