package br.com.alura.designpattern;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {

		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� esta aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� foi aprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
