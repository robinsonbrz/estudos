package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.Conta;
import br.com.alura.fj11.modelo.ContaCorrente;

public class TesteInteger {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(1000);
		System.out.println(conta);
	}
}
