package br.com.alura.fj11.modelo;

import br.com.alura.fj11.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza(double taxa) {
		this.saldo += (this.saldo * (taxa * 2));
	}

	@Override
	public double calculoTributos() {
		return this.getSaldo() * 0.01;
	}
}