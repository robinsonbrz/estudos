package br.com.alura.designpattern;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal enviada por e-mail!!!");
	}

}
