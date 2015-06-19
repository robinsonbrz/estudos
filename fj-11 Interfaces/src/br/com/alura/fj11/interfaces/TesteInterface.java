package br.com.alura.fj11.interfaces;

public class TesteInterface {
	public static void main(String[] args) {
		AreaCalculavel ret = new Retangulo(3, 2);
		AreaCalculavel cir = new Circulo(2.54);
		AreaCalculavel qd = new Quadrado(2);

		System.out.println(ret.calculaArea());
		System.out.println(cir.calculaArea());
		System.out.println(qd.calculaArea());

	}
}
