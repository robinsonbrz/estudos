package br.com.alura.designpattern;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.06;
		return iss;
	}
}
