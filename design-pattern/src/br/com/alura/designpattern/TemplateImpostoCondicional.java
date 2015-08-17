package br.com.alura.designpattern;

public abstract class TemplateImpostoCondicional implements Imposto {

	// Classes abstratas do template que define as condi��es

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	// L�gica de aplica��o de imposto comum entre ICPP e IKVC
	 public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}

	}
}
