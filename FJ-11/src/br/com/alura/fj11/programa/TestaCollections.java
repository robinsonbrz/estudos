package br.com.alura.fj11.programa;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.alura.fj11.modelo.ContaPoupanca;

public class TestaCollections {
	public static void main(String[] args) {

		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();

		for (int i = 0; i < 10; i++) {

			Random ran = new Random();
			String nomeConta = "Usuário" + ran.nextInt(1000);

			ContaPoupanca novaConta = new ContaPoupanca(ran.nextInt(2000),
					nomeConta);
			novaConta.deposita((ran.nextDouble()) * 1000);
			contas.add(novaConta);
		}

		for (ContaPoupanca c : contas) {
			System.out.println(c);
		}

		Collections.sort(contas);
		System.out.println(contas);

	}
}
