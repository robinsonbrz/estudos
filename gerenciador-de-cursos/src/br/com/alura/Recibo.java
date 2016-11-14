package br.com.alura;

import java.util.Random;

public class Recibo implements Comparable<Recibo> {

	private int numero;

	public Recibo() {
		Random index = new Random();
		this.numero = index.nextInt(1000);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int compareTo(Recibo o) {
		if (this.getNumero() < o.getNumero())
			return -1;
		if (this.getNumero() > o.getNumero())
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Número do recibo: " + this.numero;
	}

}
