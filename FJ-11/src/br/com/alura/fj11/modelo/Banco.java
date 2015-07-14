package br.com.alura.fj11.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private String nomeBanco;

	private List<Conta> contas = new ArrayList<>();
	private Map<String, Conta> indexadorDeContas = new HashMap<String, Conta>();

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public void adicionaConta(Conta conta) {
		contas.add(conta);
		indexadorDeContas.put(conta.getNome(), conta);
	}

	public Conta recuperaConta(int x) {
		return contas.get(x);

	}

	public int verificaQuandidadeDeContas() {
		return contas.size();
	}

	public Conta buscaContaPorNome(String nome) {
		return indexadorDeContas.get(nome);
	}

}
