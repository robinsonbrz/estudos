package br.com.alura.designpattern;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	public ImpostoMuitoAlto() {

	}

	@Override
	protected double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.2) + calculoDoOutroImposto(orcamento);
	}

}
