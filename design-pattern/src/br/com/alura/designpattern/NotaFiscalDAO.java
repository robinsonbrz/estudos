package br.com.alura.designpattern;

public class NotaFiscalDAO implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota Fiscal salva!!!");
	}
	
}
