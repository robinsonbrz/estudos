package br.com.alura.designpattern;

public abstract class TemplateImpostoCondicional extends Imposto {

	// Decorator Pattern

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public TemplateImpostoCondicional() {

	}

	// Classes abstratas do template que define as condições

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	// Lógica de aplicação de imposto comum entre ICPP e IKVC
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}

	}
}
