package br.com.alura.designpattern;

public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.1;
		return icms;
	}
}
