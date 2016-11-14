package br.com.victor.defmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsEx1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Consumer<String> cons = new ConsumidorDeString();
		
		palavras.forEach(cons);
		
		/*
		 * Ou poderia utilizar o seguite código:
		 * 
		 * palavras.forEach(new Consumer<String>(){
		 * 	public void accept(String t){
		 * 		System.out.println(t);
		 * 	}
		 * });
		 */
		
	}

}

class ConsumidorDeString implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
