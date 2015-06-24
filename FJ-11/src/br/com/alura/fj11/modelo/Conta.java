package br.com.alura.fj11.modelo;

import br.com.alura.fj11.excecao.ValorInvalidoException;

abstract public class Conta {
	private int numero;
	private String nome;
	protected double saldo;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * recupera o numero de uma conta
	 * @return numero da conta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Altera o numero de uma conta
	 * @param numero da conta
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
	 * @param Valor a ser sacado
	 *            
	 */
	void saca(double valor) {
		this.saldo -= valor;
	}

	/**
	 * Esse método tem o objetivo de depositar um valor em dinheiro na Conta.
	 * 
	 * @param Valor do deposito
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
	 * Altera o retorno da mensagem toString ao recuperar um objeto Conta da memoria
	 */
	
	public String toString() {
		return "Esse objeto é uma conta com saldo R$ " + this.saldo;
	}
	
	
	public boolean equals(Object obj){
		
		Conta outraConta = (Conta) obj;
		
		if(this.numero == outraConta.numero && this.nome == outraConta.nome){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Atualiza a taxa referencial.
	 * @param taxa
	 */
	public abstract void atualiza(double taxa);

}