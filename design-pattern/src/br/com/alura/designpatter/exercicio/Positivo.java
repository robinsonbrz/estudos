package br.com.alura.designpatter.exercicio;

public class Positivo implements EstadoDeUmaConta {

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor * 0.98);
	}

	@Override
	public void saca(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		if (conta.getSaldo() < 0) {
			conta.estado = new Negativo();
		}
	}

}
