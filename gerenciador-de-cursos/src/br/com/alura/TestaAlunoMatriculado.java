package br.com.alura;

public class TestaAlunoMatriculado {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));

		Aluno aluno1 = new Aluno("Aluno 1", 1234);
		Aluno aluno2 = new Aluno("Aluno 2", 5678);
		Aluno aluno3 = new Aluno("Aluno 3", 91011);
		Aluno aluno4 = new Aluno("Aluno 4", 121314);
		Aluno aluno5 = new Aluno("Aluno 5", 151617);

		javaColecoes.matricula(aluno1);
		javaColecoes.matricula(aluno2);
		javaColecoes.matricula(aluno3);
		javaColecoes.matricula(aluno4);
		javaColecoes.matricula(aluno5);

		System.out.println(javaColecoes.buscaMatriculado(1234));

	}

}
