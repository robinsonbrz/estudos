package br.com.alura.designpatter.exercicio;

import br.com.alura.designpatter.exercicio.Requisicao.Formato;

public class RespostaCSV implements Resposta {

	private Resposta proximaResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		} else {
			proximaResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void proximaResposta(Resposta resposta) {
		this.proximaResposta = resposta;
	}

	public RespostaCSV(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}

}
