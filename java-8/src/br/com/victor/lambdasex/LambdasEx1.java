package br.com.victor.lambdasex;

import java.util.ArrayList;
import java.util.List;

public class LambdasEx1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		/*
		 * Lambdas podem ser aplicadas em métodos funcionais compativeis isto é,
		 * devem ser compativel com a assinatura: Mesma quantidade de elementos
		 * de entrada, e retorno semelhante.
		 */
		
		//Método funcional Comparator - compare
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Métodos funcional Consumer - accept
		palavras.forEach(s -> System.out.println(s));

	}
}
