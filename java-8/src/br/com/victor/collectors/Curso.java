package br.com.victor.collectors;

public class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
}
