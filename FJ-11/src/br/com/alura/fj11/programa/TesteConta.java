package br.com.alura.fj11.programa;

import br.com.alura.fj11.excecao.ValorInvalidoException;
import br.com.alura.fj11.modelo.ContaCorrente;
import br.com.alura.fj11.modelo.ContaPoupanca;

public class TesteConta {
	public static void main(String[] args) {

		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		try {
			cc.deposita(-1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Acabou!!!!");
		}
		cp.deposita(1000);

		cc.atualiza(0.01);
		cp.atualiza(0.01);

		adc.roda(cc);
		adc.roda(cp);

		/*
		 * System.out.println(c.getSaldo()); System.out.println(cc.getSaldo());
		 * System.out.println(cp.getSaldo());
		 */
	}
}
