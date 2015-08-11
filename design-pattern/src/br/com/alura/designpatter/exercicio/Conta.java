package br.com.alura.designpatter.exercicio;

public class Conta {

	private String titular;
	private double saldo;


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
	

}
