package br.com.alura.designpatter.exercicio;

public class Negativo implements EstadoDeUmaConta {

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.95);
		if (conta.getSaldo() > 0) {
			conta.estado = new Positivo();
		}
	}

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Você ta quebrado manu! Vai sacar nada não!");
	}

}
