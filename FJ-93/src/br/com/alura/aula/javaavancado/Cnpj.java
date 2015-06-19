package br.com.alura.aula.javaavancado;

public class Cnpj {

	private String valor;

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	public String getValor() {
		return this.valor;
	}

	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Cnpj outro = (Cnpj) obj;
		return this.valor.equals(outro);
	}

	public int hashCode() {
		return this.valor.hashCode();
	}
	
	/*
	 *Por default o java sempre criar um construtor para a classe!!!
	 *A classe pode possuir quantos construtores for necessário!!! 
	 * */
	public Cnpj(String cnpjEntrada) {
		
		this.valor = cnpjEntrada ;
		if (getValor() == null) {
			throw new IllegalArgumentException("Por favor, infome um CPNJ!");
		}

	}

}
