package br.com.alura.designpattern;

public class IKCV extends TemplateImpostoCondicional {

	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	public IKCV() {
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}

		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
