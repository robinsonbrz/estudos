package br.com.caelum.agenda.dao;

import java.util.List;

import br.com.caelum.agenda.Contato;

public interface ContatoDAO { 

	public abstract List<Contato> listar();

	public abstract void salvar(Contato contato);

	public abstract Contato buscarPorId(Integer id);

	public abstract void deleta(Contato contato);

	public abstract void altera(Contato contato);

}