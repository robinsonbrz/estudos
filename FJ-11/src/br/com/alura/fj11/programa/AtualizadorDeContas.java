package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.Conta;

public class AtualizadorDeContas {

	private double saltoTotal = 0;
	private double selic;

	public double getSaltoTotal() {
		return saltoTotal;
	}

	public void setSaltoTotal(double saltoTotal) {
		this.saltoTotal = saltoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c){
		
		System.out.println(c.getSaldo());
		c.atualiza(this.selic);
		System.out.println(c.getSaldo());
		this.saltoTotal += c.getSaldo();
	}

}