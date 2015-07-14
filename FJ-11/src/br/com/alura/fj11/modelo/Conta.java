package br.com.alura.fj11.modelo;

import br.com.alura.fj11.excecao.ValorInvalidoException;

abstract public class Conta {

	protected int numero;
	protected String nome;
	protected double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * recupera o numero de uma conta
	 * 
	 * @return numero da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Altera o numero de uma conta
	 * 
	 * @param numero
	 *            da conta
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Esse método tem o objetivo de informar o total de dinheiro disponivel na
	 * conta.
	 * 
	 * @ Saldo total da conta.
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Esse método tem o objetivo de efetuar um saque em dinheiro na conta.
	 * 
	 * @param Valor
	 *            a ser sacado
	 * 
	 */
	void saca(double valor) {
		this.saldo -= valor;
	}

	/**
	 * Esse método tem o objetivo de depositar um valor em dinheiro na Conta.
	 * 
	 * @param Valor
	 *            do deposito
	 */

	public void deposita(double deposito) {

		if (deposito < 0) {
			throw new ValorInvalidoException(
					"Não é  permitido depositar valor negativo!");
		} else {
			this.saldo += deposito;
		}
	}

	/**
	 * Altera o retorno da mensagem toString ao recuperar um objeto Conta da
	 * memoria
	 */

	@Override
	public String toString() {
		return "Esse objeto é a conta de " + this.nome + " com saldo R$ "
				+ this.saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	/**
	 * Atualiza a taxa referencial.
	 * 
	 * @param taxa
	 */
	public abstract void atualiza(double taxa);
	

}