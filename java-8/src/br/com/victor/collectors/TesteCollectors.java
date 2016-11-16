package br.com.victor.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.victor.streamings.Curso;

public class TesteCollectors {

	public static void main(String[] args) {

		/*
		 * Utilizando Collector e outros recursos do Stream
		 */

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		/*
		 * Trabalhando com o Optional - O Optional é uma classe nova do Java 8
		 * que permite trabalhar com possiveis valores null.
		 * 
		 */

		Optional<Curso> optional = cursos.stream().filter(c -> c.getAlunos() > 100).findAny();
		Curso curso = optional.get();

		/*
		 * No caso acima, caso não exista nenhum objeto dentro de nossa
		 * Optional, o que será retornado?
		 * 
		 * Ao inves de usar o get, podemos utilizar o orElse(statement), que
		 * caso não existe um objeto ele retorna o que foi passado como
		 * parametro
		 * 
		 * Curso curso = optional.orElse();
		 * 
		 * Ou podemos utilizar o ifPresent(), que, caso o valor existe, ele
		 * invoca um consumidor
		 * 
		 * curso.ifPresent(c -> System.out.println(c.getNome()));
		 */

		Curso curso1 = optional.orElse(null);

		cursos.stream().filter(c -> c.getAlunos() > 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));

		/*
		 * Gerando collections a partir de um Stream
		 * 
		 * Para converter um Stream em uma nova lista, podemos utilizar o Collectors, que implementa a interface Collect
		 * no caso abaixo, utilizamos um coletor chamado toList().
		 */
		List<Curso> resultados = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toList());

		/*
		 * Podemos não apenas converter o resultado do Stream em uma lista, mas podemos converter em um mapa
		 */
		Map mapa = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

		cursos.stream()
			.findAny()
			.ifPresent(c -> System.out.print(c.getNome()));
		
		//Calculando a média de alunos por curso.
		cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
	}
}
