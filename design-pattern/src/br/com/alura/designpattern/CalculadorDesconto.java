package br.com.alura.designpattern;

public class CalculadorDesconto {

	public double calcula(Orcamento orcamento) {

		Desconto d = new DescontoPorNumeroDeItem();
		Desconto d1 = new DescontoPorValorOrcamento();
		Desconto d2 = new DescontoPorVendaCasada();
		Desconto d3 = new DescontoPadrao();

		d.proximoDesconto(d1);
		d1.proximoDesconto(d2);
		d2.proximoDesconto(d3);

		return d.calculaDesconto(orcamento);
	}
}
