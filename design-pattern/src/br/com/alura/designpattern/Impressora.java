package br.com.alura.designpattern;

public class Impressora implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota impressa!");
	}

}
