package br.com.alura.aula.javaavancado;

public class Divida {

	private double total;
	private String nomeCredor;
	private Documento documentoCredor;


	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

	private Pagamentos pagamentos = new Pagamentos();

	public void registra(Pagamento pagamento) {
		pagamentos.registra(pagamento);
	}

	public String getNomeCredor() {
		return this.nomeCredor;
	}

	public double getTotal() {
		return this.total;
	}

	public void setCredor(String credor) {
		this.nomeCredor = credor;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return pagamentos.getValorPago();
	}

}