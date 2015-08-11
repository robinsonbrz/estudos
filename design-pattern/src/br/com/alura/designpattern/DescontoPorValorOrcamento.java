package br.com.alura.designpattern;

public class DescontoPorValorOrcamento implements Desconto {

	private Desconto desconto;

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500)
			return orcamento.getValor() * 0.07;
		else
			return desconto.calculaDesconto(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
