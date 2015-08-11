package br.com.alura.designpatter.exercicio;

public class Requisicao {

	enum Formato {
		XML, CSV, PORCENTO
	}

	private Formato formato;
	
	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Requisicao(Formato formato) {
		this.formato = formato;
	}
}
