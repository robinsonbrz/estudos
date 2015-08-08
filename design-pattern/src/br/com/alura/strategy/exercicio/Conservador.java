package br.com.alura.strategy.exercicio;

public class Conservador implements Investimento {

	double retornoInvestimento;
	
	@Override
	public double investir(Conta conta) {
		
		retornoInvestimento = conta.getSaldo() * 0.008;
		return retornoInvestimento;
	}

}
