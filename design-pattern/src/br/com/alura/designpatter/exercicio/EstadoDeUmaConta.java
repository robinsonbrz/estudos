package br.com.alura.designpatter.exercicio;

public interface EstadoDeUmaConta {
	
	void deposita(Conta conta, double valor);
	void saca(Conta conta, double valor);
}
