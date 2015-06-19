package br.com.alura.fj11.modelo;

import br.com.alura.fj11.excecao.ValorInvalidoException;

abstract public class Conta {

	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double deposito) {

		if (deposito < 0) {
			throw new ValorInvalidoException(
					"Não é permitido depositar valor negativo!");
		} else {
			this.saldo += deposito;
		}
	}

	public abstract void atualiza(double taxa);

}