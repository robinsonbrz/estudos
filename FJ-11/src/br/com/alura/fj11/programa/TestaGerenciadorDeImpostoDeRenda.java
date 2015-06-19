package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.ContaCorrente;
import br.com.alura.fj11.modelo.GerenciadorDeImpostoDeRenda;
import br.com.alura.fj11.modelo.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gr = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		
		gr.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gr.adiciona(cc);
		
		System.out.println(gr.getTotal());
	}
}
