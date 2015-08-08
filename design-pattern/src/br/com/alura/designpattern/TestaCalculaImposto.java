package br.com.alura.designpattern;

public class TestaCalculaImposto {

	public static void main(String[] args) {
		Orcamento orc = new Orcamento(200.00);
		CalculadorImposto calculo = new CalculadorImposto();

		calculo.calculaImposto(orc, new ISS());
		calculo.calculaImposto(orc, new ICMS());

	}
}
