package br.com.alura.jdbc.model;

public class Produto {

	private int id;
	private String nome;
	private String descricao;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Produto(String nome, String descricao) {
		super();

		this.nome = nome;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("[Produto: %d, %s, %s]", id, nome, descricao);
	}

}
