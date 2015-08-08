package br.com.alura.strategy.exercicio;

import java.util.Random;

public class Moderado implements Investimento {
	/*
	 * PARA CONHECIMENTO O método nextInt da classe Random, retorna um
	 * pseudonumero randomico distribuido uniformemente entre 0 e o n. Onde é o
	 * um numero inteiro maior que zero que deve ser passado como parametro.
	 * 
	 * Exemplo
	 * 
	 * rand.nextInt(4) será gerado numeros entre 0 e 4.
	 * 
	 * Devido a regrade negocio, foi utilizado o metódo nextInt passando como
	 * parametro o numero 2 pois, será gerando numeros entre 0 e 1, cada um com
	 * 50% de retorno.
	 */

	double retornoInvestimento;

	@Override
	public double investir(Conta conta) {

		Random rand = new Random();

		if (rand.nextInt(2) == 0)
			retornoInvestimento = conta.getSaldo() * 0.025;
		else
			retornoInvestimento = conta.getSaldo() * 0.007;

		return retornoInvestimento;
	}

}
