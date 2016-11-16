package br.com.victor.streamings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class AlunoTest {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(Curso::getAlunos));

		cursos.forEach(a -> System.out.println(a.getNome()));

		/*
		 * Aplicando o uso de Stream: No exemplo abaixo, foi utilizado um método
		 * do Stream que ira filtar os elementos de uma lista, de acordo com o
		 * critério adotado.
		 */
		Stream<Curso> streamDeCurso = cursos.stream().filter(c -> c.getAlunos() > 50);

		// Imprimindo os elementos dessa lista.
		streamDeCurso.forEach(a -> System.out.println(a.getNome()));

		// Explorando ainda mais o uso de Lambdas
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.forEach(c -> System.out.println(c.getNome()));

		/*
		 * No caso abaixo, estamos utilizado um outro método da classe Stream,
		 * que é o map. Seu retorno é um Stream<Integer> e utilizamos para
		 * filtrar a quantidade de alunos em cada curso.
		 */
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		//Evitando o autoboxing
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.mapToInt(Curso::getAlunos)
			.forEach(System.out::println);
	}
}
