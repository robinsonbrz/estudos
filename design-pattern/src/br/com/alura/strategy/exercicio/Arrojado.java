package br.com.alura.strategy.exercicio;

import java.util.Random;

public class Arrojado implements Investimento {

	/*
	 * Dado funcionamento do m�todo da nextInt() da classe random, e devido a
	 * regra de neg�cio do exercicio, ser�o gerados 10 numeros aleat�rios, onde
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
