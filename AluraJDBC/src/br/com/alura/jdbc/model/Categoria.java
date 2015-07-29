package br.com.alura.jdbc.model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int id;
	private String nome;
	private final List<Produto> produtos = new ArrayList<Produto>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Categoria(int id, String nome) {
		this.nome = nome;
		this.id = id;

	}

	public void adiciona(Produto p) {
		produtos.add(p);

	}
}
