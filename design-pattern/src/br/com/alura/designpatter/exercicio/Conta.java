package br.com.alura.designpatter.exercicio;

import java.util.Calendar;

public class Conta {

	private String titular;
	private double saldo;
	private Calendar dataAbertura;
	protected EstadoDeUmaConta estado;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

}
