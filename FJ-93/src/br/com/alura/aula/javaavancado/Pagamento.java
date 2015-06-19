package br.com.alura.aula.javaavancado;

import java.util.Calendar;

public class Pagamento {

	private String nome;
	private double valor;
	private String numCnpj;
	private Calendar data;

	private Cnpj cnpjPagador = new Cnpj(this.numCnpj);

	public String getNumCnpj() {
		return numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	public Cnpj getCnpjPagador() {
		return cnpjPagador;
	}

	public void setCnpjPagador(Cnpj cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
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