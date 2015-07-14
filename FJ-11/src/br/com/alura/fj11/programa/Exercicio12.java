package br.com.alura.fj11.programa;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.fj11.modelo.Conta;
import br.com.alura.fj11.modelo.ContaCorrente;

public class Exercicio12 {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();

		Conta c2 = new ContaCorrente();

		/*
		 * Utilizando o comando Infer Generic Type Arguments para criar
		 * generics, garantindo uma melhor tipagem do código, evitando que sejam
		 * feitos Casts desnecessários para adicionar um elemento na Lista.
		 */
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
