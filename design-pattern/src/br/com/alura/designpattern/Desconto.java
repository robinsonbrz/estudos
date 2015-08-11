package br.com.alura.designpattern;

public interface Desconto {

	double calculaDesconto(Orcamento orcamento);

	void proximoDesconto(Desconto desconto);
}
