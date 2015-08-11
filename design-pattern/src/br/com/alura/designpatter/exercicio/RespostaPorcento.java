package br.com.alura.designpatter.exercicio;

import br.com.alura.designpatter.exercicio.Requisicao.Formato;

public class RespostaPorcento implements Resposta {
	private Resposta proximaResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			proximaResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void proximaResposta(Resposta resposta) {
		this.proximaResposta = resposta;
	}

	public RespostaPorcento(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}
}
