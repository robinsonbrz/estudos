package br.com.victor.lambdasex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdasEx1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");

		/*
		 * Lambdas podem ser aplicadas em mÃ©todos funcionais compativeis isto
		 * e, devem ser compativel com a assinatura: Mesma quantidade de
		 * elementos de entrada, e retorno semelhante.
		 */

		// Metodo funcional Comparator - compare
		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		/*
		 * Utilizando Comparator.comparing - como funciona
		 * 
		 * Function<String, Integer> funcao = s -> s.length();
		 * Comparator<String> comparator = Comparator.comparing(funcao);
		 * palavras.sort(comparator);
		 * 
		 */
		palavras.sort(Comparator.comparing(s -> s.length()));

		/*
		 * Method Reference
		 * 
		 * Esta este Lamba é mais enxuto do utilizar "->", porém o resultado
		 * será o mesmo palarvras.sort(Comparator.String(String::length);
		 */
		palavras.sort(Comparator.comparing(String::length));

		/*
		 * Method Reference e Lambda
		 * 
		 * Podemos escrever o forEach conform abaixo, ou utilizar
		 * palavras.forEach(System.out::println); O resultado será o mesmo
		 */
		palavras.forEach(s -> System.out.println(s));

		/*
		 * Utilizando um custom Comparator, que ordem as palavras considerando o
		 * seu tamanho, da maior, para a menor.
		 */
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return 1;
			if (s1.length() > s2.length())
				return -1;
			return 0;
		});

		palavras.forEach(s -> System.out.println(s));

	}
}
