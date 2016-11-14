package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso cursos = new Curso("Victor Felipe", "Mule ESB");
		List<Aula> aulas = cursos.getAulas();

		cursos.getAulas().add(new Aula("Introdução a Webservices", 60));

		System.out.println(aulas);
	}
}
