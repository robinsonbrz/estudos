package br.com.alura.designpattern;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {

	}

	@Override
	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1
				+ calculoDoOutroImposto(orcamento);
		return icms;
	}

}
