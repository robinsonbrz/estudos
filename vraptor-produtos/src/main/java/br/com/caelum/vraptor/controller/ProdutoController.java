package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ProdutoDao;
import br.com.caelum.vraptor.model.Produto;
import br.com.caelum.vraptor.util.JPAUtil;

@Controller
public class ProdutoController {

	EntityManager em = JPAUtil.criaEntityManager();
	private final Result result;
	private final ProdutoDao dao;

	/*
	 * Para trabalhar com injeção de dependencia no CDI atravéz de contrutores,
	 * é muito importante termos um construtor vazio em nosso código
	 */

	@Inject
	public ProdutoController(Result result, ProdutoDao dao) {
		this.dao = dao;
		this.result = result;
	}

	public ProdutoController() {
		this(null, null);
	}

	// Por padrão, o nome do método será o mesmo nome da JSP.
	@Get("/sobre")
	public void sobre() {

	}

	@Get
	public void listagem() {
		result.include("produtoList", dao.lista());
	}

	@Get
	public void formulario() {

	}

	@Post
	public void adiciona(Produto produto) {
		dao.adiciona(produto);
		result.include("mensagem", "Produto ADICIONADO com sucesso!!!");
		result.redirectTo(this).listagem();
	}
	
	/*
	 * Redirect vs. Foward
	 * 
	 * O Foward trabalha do lado servidor, a logica, sempre será encaminhada
	 * processada novamente, e no final renderizada. No caso de adicionar um produto
	 * a cada refrest, o produto será adicionado novamente.
	 * 
	 * O Redirect, trabalha do lado do cliente, que durante a requisição
	 * invoca um outro metódo, sem manter os dados da primeira requisição
	 * pois ela já foi processada.
	 * 
	 */

	@Delete("/produto/remover")
	public void remover(Produto produto) {
		dao.remove(produto);
		result.include("mensagem", "Produto REMOVIDO com sucesso!!!");
		result.redirectTo(this).listagem();
	}
}
