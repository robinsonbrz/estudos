package br.com.alura.fj11.modelo;

import br.com.alura.fj11.interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double	total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando tributavel: " + t);
		
		this.total += t.calculoTributos();
	}

	public double getTotal() {
		return total;
	}
	
	
}
