package br.com.alura.designpattern;

public class ICPP extends TemplateImpostoCondicional {

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICPP() {

	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
	}

}
