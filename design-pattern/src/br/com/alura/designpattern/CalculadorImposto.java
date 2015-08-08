package br.com.alura.designpattern;

public class CalculadorImposto {

	public void calculaImposto(Orcamento orcamento, Imposto imposto){
		double imp = imposto.calcula(orcamento);
		System.out.println(imp);
	}
}
