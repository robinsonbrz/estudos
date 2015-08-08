package br.com.alura.strategy.exercicio;

public class TestaRealizadorDeInvestimento {
	public static void main(String[] args) {

		Conta c1 = new Conta();
		RealizadorDeInvestimentos investimento = new RealizadorDeInvestimentos();

		c1.deposita(1000.00);
		investimento.realizaInvestimento(c1, new Arrojado());
		System.out.println(c1.getSaldo());

	}
}
