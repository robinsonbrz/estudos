package br.com.victor.shop.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Produto {

	private int id;
	private String nome;
	private double preco;
	private String decricao;

	//Construtor padrão para serialização JAX-B
	
	Produto() {
	}

	public Produto(String nome, double preco, String decricao) {
		this.nome = nome;
		this.preco = preco;
		this.decricao = decricao;
	}

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public String toXML() {

		XStream xstream = new XStream();
		xstream.alias("produto", Produto.class);

		return xstream.toXML(this);
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((decricao == null) ? 0 : decricao.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (decricao == null) {
			if (other.decricao != null)
				return false;
		} else if (!decricao.equals(other.decricao))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(preco) != Double
				.doubleToLongBits(other.preco))
			return false;
		return true;
	}

	/*
	 * Método sobreescrito apenas para testes.
	 */

	@Override
	public String toString() {
		return this.getNome();
	}

}
