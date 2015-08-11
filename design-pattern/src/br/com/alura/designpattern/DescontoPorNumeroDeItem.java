package br.com.alura.designpattern;

public class DescontoPorNumeroDeItem implements Desconto{

	private Desconto desconto;
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5)
			return orcamento.getValor() * 0.1;
		else
			return desconto.calculaDesconto(orcamento);
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

}
