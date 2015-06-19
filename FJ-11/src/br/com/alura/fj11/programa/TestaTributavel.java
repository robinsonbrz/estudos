package br.com.alura.fj11.programa;

import br.com.alura.fj11.interfaces.Tributavel;
import br.com.alura.fj11.modelo.ContaCorrente;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		
		cc.deposita(100);
		System.out.println(cc.calculoTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculoTributos());
		System.out.printf("O saldo é: %.2f", cc.getSaldo());
		// Não compila System.out.println(t.getSaldo());
	}
}
