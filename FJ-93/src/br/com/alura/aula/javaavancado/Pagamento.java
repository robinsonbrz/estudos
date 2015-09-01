package br.com.alura.aula.javaavancado;

import java.util.Calendar;

public class Pagamento{

	private String nome;
	private double valor;
	private Calendar data;
	private Documento documentoPagador;


	public Documento getCnpjPagador() {
		return documentoPagador;
	}

	public void setCnpjPagador(Documento cnpjPagador) {
		this.documentoPagador = cnpjPagador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getData() {
		return this.data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}


}