package br.com.alura.designpatter.exercicio;

import java.util.Calendar;

public class Conta {

	private String titular;
	private double saldo;
	private Calendar dataAbertura;

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

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
}
