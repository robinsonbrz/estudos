package br.com.alura.fj11.modelo;


public class ContaPoupanca extends Conta {


	public void atualiza(double taxa) {
		this.saldo += (this.saldo * (taxa * 3));
	}

	public void deposita(double deposito) {
		this.saldo += (deposito - 0.1);
	}
}