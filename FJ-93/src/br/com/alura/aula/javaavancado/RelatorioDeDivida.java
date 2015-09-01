package br.com.alura.aula.javaavancado;

public class RelatorioDeDivida {

	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio() {

		System.out.println("Nome credor " + divida.getNomeCredor());
		System.out.println("CNPJ credor: " + divida.getDocumentoCredor());
		System.out.println("Valor a pagar " + divida.getTotal());
		System.out.println("Valor pago: " + divida.getValorPago());
	}

	public static void main(String[] args) {

		Divida divida = new Divida();

		divida.setCredor("Teste");
		divida.setDocumentoCredor(new Cnpj("00.000.001/0000-0"));
		divida.setTotal(100);

		Pagamento pagamento = new Pagamento();
		pagamento.setNome("Outra empresa");
		pagamento.setCnpjPagador(new Cnpj("00.000.001/0000-1"));
		pagamento.setValor(20);

		divida.registra(pagamento);

		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		relatorio.geraRelatorio();

	}
}
