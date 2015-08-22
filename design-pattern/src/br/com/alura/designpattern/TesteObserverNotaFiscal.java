package br.com.alura.designpattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteObserverNotaFiscal {
	public static void main(String[] args) {

		List<AcaoAposGerarNota> listaAcoes = new ArrayList<AcaoAposGerarNota>();

		listaAcoes.add(new Impressora());
		listaAcoes.add(new EnviadorDeEmail());
		listaAcoes.add(new NotaFiscalDAO());
		listaAcoes.add(new Multiplicador(5));

		Calendar dataQualquer = Calendar.getInstance();

		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaAcoes);

		NotaFiscal nf = builder.informarCnpj("111333")
				.informarRazaoSocial("Teste")
				.adicionar(new ItemDaNota(100.0, "Item 1"))
				.adicionar(new ItemDaNota(200, "Item 2"))
				.adicionarObs("Teste Observer!!!!").data(dataQualquer)
				.emitirNotaFiscal();

	}
}
