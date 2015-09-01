package br.com.alura.aula.javaavancado;

public class CPF implements Documento {

	private String numeroCPF;

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	@Override
	public boolean ehValido() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getValor() {
		return this.numeroCPF;
	}

	public CPF(String numeroCPF) {
		super();
		this.numeroCPF = numeroCPF;
	}

}
