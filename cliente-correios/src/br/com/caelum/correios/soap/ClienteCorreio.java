package br.com.caelum.correios.soap;

import java.math.BigDecimal;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClienteCorreio {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx?WSDL");
		QName qname = new QName("http://tempuri.org/", "CalcPrecoPrazoWS");

		Service service = Service.create(url, qname);
		CalcPrecoPrazoWSSoap  cliente = service.getPort(CalcPrecoPrazoWSSoap.class);

		// Parametros

		String codigoSedex = "40010";
		String cepOrigemCaelumSP = "04101300"; // Caelum SP
		String cepDestino = "20040030"; // Caelum RJ
		String peso3kg = "3";
		BigDecimal comprimento20cm = new BigDecimal(20);
		BigDecimal altura10cm = new BigDecimal(10);
		BigDecimal largura15cm = new BigDecimal(15);
		BigDecimal diametro10cm = new BigDecimal(10);
		int formatoEncomendaCaixa = 1; // 1 é caixa ou pacote
		BigDecimal semValorDeclarado = BigDecimal.ZERO;
		String semEntregueEmMaos = "N";
		String semAvisoRecebimento = "N";
		String semCodigoEmpresa = "";
		String semSenhaEmpresa = "";

		// Chamando o serviço

		CResultado resultado = cliente.calcPrecoPrazo(semCodigoEmpresa, semSenhaEmpresa, codigoSedex, cepOrigemCaelumSP,
				cepDestino, peso3kg, formatoEncomendaCaixa, comprimento20cm, altura10cm, largura15cm, diametro10cm,
				semEntregueEmMaos, semValorDeclarado, semAvisoRecebimento);

		// Resultado

		// recuperando o resultado
		List<CServico> servicosPesquisados = resultado.getServicos().getCServico();
		String valorFrete = servicosPesquisados.get(0).getValor();

		System.out.printf("Frete para %s eh de %s %n", cepDestino, valorFrete);

	}
}
