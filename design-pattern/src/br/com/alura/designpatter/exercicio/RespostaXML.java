package br.com.alura.designpatter.exercicio;

import br.com.alura.designpatter.exercicio.Requisicao.Formato;

public class RespostaXML implements Resposta {

	private Resposta proximaResposta;

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("<conta>");
			System.out.println("<titular>" + conta.getTitular() + "</titular>");
			System.out.println("<saldo>" + conta.getSaldo() + "</saldo>");
			System.out.println("</conta>");
		} else {
			proximaResposta.responde(requisicao, conta);
		}
	}

	@Override
	public void proximaResposta(Resposta resposta) {
		this.proximaResposta = resposta;
	}
	
	public RespostaXML(Resposta proximaResposta) {
		this.proximaResposta = proximaResposta;
	}

}
