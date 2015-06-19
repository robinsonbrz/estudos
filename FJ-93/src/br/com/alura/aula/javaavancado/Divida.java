package br.com.alura.aula.javaavancado;

public class Divida {

	private double total;
	private String credor;
	private String numCnpj;
	private Cnpj cnpjCredor = new Cnpj(this.numCnpj);

	public String getNumCnpj() {
		return numCnpj;
	}

	public void setNumCnpj(String numCnpj) {
		this.numCnpj = numCnpj;
	}

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	private Pagamentos pagamentos = new Pagamentos();

	public Pagamentos getPagamentos() {
		return pagamentos;
	}

	public String getCredor() {
		return this.credor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}