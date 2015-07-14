package br.com.alura.fj11.modelo;

public class ContaPoupanca extends Conta implements Comparable<Conta> {

	public ContaPoupanca(int numeroConta, String nomeCliente) {
		this.numero = numeroConta;
		this.nome = nomeCliente;
	}

	public void atualiza(double taxa) {
		this.saldo += (this.saldo * (taxa * 3));
	}

	public void deposita(double deposito) {
		this.saldo += (deposito - 0.1);
	}

	@Override
	public int compareTo(Conta other) {
		return this.nome.compareTo(other.nome);
	}
}