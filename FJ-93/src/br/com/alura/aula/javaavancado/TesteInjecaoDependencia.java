package br.com.alura.aula.javaavancado;

public class TesteInjecaoDependencia {
	public static void main(String[] args) {
		
		Divida divida = new Divida();
		Pagamento pagamento = new Pagamento();
		Pagamentos pagamentos = new Pagamentos();
		BancoDeDados bd = new BancoDeDados("localhost", "user", "pass");
		BalancoEmpresa balancoEmpresa = new BalancoEmpresa(bd);
		
		divida.setCredor("Teste");
		divida.setDocumentoCredor(new CPF("000.000.000-00"));
		divida.setTotal(100);

		balancoEmpresa.registraDivida(divida);
		
		pagamento.setCnpjPagador(new CPF("000.000.000-00"));
		pagamento.setValor(50);

		balancoEmpresa.pagaDivida(pagamento.getCnpjPagador(), pagamento);
		
		bd.desconecta();
	}
}
