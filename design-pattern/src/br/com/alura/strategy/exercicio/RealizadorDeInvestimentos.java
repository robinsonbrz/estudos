package br.com.alura.strategy.exercicio;

public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento investimento) {

		double retornoInvestimento = (investimento.investir(conta)) * 0.75;
		conta.deposita(retornoInvestimento);
	}

}
