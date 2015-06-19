package br.com.alura.fj11.modelo;

import br.com.alura.fj11.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calculoTributos() {
		return 42;
	}

}
