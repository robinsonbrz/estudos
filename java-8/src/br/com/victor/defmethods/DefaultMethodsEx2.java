package br.com.victor.defmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsEx2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Comparator<String> comparator = new ComparadorDeString();

		palavras.sort(comparator);

		palavras.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
}

class ComparadorDeString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length())
			return -1;
		if (o1.length() > o2.length())
			return 1;
		return 0;
	}

}
