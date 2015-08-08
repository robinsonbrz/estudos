package br.com.alura.strategy.exercicio;

import java.util.Random;

public class Arrojado implements Investimento {

	/*
	 * Dado funcionamento do método da nextInt() da classe random, e devido a
	 * regra de negócio do exercicio, serão gerados 10 numeros aleatórios, onde
	 * cada numero tem a probabilidade de 10% se ser selecionado.
	 */

	double retornoInvestimento;

	@Override
	public double investir(Conta conta) {
		int rand = new Random().nextInt(10);

		if (rand >= 0 && rand <= 1)
			retornoInvestimento = conta.getSaldo() * 0.05;
		else if (rand >= 2 && rand <= 4)
			retornoInvestimento = conta.getSaldo() * 0.03;
		else
			retornoInvestimento = conta.getSaldo() * 0.006;

		return retornoInvestimento;
	}

}
