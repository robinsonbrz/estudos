package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.Banco;
import br.com.alura.fj11.modelo.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {

		Banco b1 = new Banco();
		b1.setNomeBanco("Teste 1");

		ContaPoupanca cp1 = new ContaPoupanca(12321, "Teste");
		b1.adicionaConta(cp1);

		System.out.println(b1.buscaContaPorNome("Teste"));
		System.out.println(b1.recuperaConta(0));

	}
}
