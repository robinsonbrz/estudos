package br.com.alura.designpatter.exercicio;

public class RespostaDefault implements Resposta{

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato() == null){
			throw new RuntimeException("Formato de Resposta não encontrado");
		}
		
	}

	@Override
	public void proximaResposta(Resposta resposta) {
		// TODO Auto-generated method stub
		
	}

}
