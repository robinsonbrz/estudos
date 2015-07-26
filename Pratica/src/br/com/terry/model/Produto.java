package br.com.terry.model;

public class Produto {

	private int id;
	private String nome;
	private String categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	/**
	 * Construtor para instanciar um novo produto
	 * 
	 * @param nome
	 * @param categoria
	 */
	Produto(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}

}
