package br.com.alura.fj11.interfaces;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
