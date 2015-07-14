package br.com.alura.fj11.programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteTreeSet {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();

		for (int i = 0; i <= 1000; i++) {
			numeros.add(i);
		}

		Collections.reverse(numeros);

		for (Integer i : numeros) {
			System.out.println(i);
		}
	}
}
