package br.com.alura.designpatter.exercicio;

public interface Resposta {

	void responde(Requisicao requisicao, Conta conta);
	void proximaResposta(Resposta resposta);

}
