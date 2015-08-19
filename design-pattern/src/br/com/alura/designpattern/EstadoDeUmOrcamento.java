package br.com.alura.designpattern;

public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	abstract void aprova(Orcamento orcamento);

	abstract void reprova(Orcamento orcamento);

	abstract void finaliza(Orcamento orcamento);
}
