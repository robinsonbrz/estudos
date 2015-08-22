package br.com.alura.designpattern;


public class Multiplicador implements AcaoAposGerarNota {

	private int fator;

	@Override
	public void executa(NotaFiscal nf) {
		double valorMultiplicado = nf.getValorTotal() * fator;
		System.out.println("Valor Multiplicado: " + valorMultiplicado);
	}

	public Multiplicador(int fator) {
		this.fator = fator;
	}

}
