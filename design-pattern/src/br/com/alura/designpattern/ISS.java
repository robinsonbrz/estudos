package br.com.alura.designpattern;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {

	}

	@Override
	public double calcula(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.06
				+ calculoDoOutroImposto(orcamento);
		return iss;
	}

}
