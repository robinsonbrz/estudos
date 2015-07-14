package br.com.alura.fj11.programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Exercicio10 {
	public static void main(String[] args) {
		System.out.println("Iniciando");

		Collection<Integer> teste = new TreeSet<>();
		long inicio = System.currentTimeMillis();
		
		long tempoInicioInsert = System.currentTimeMillis();

		for (int i = 0; i <= 60000; i++) {
			teste.add(i);
		}
		
		long tempoFimInsert = System.currentTimeMillis();
		
		System.out.println("Tempo de insert: "
				+ (tempoFimInsert - tempoInicioInsert));
		
		long tempoInicioBusca = System.currentTimeMillis();
		
		for (int i = 0; i < teste.size(); i++) {
			teste.contains(i);
		}
		
		long tempoFimBusca = System.currentTimeMillis();
		
		System.out.println("Tempo de busca: " + (tempoFimBusca - tempoInicioBusca));
		
		long fim = System.currentTimeMillis();
		long tempoTotal = fim - inicio;

		System.out.println("Tempo gasto: " + tempoTotal);
	}
}
