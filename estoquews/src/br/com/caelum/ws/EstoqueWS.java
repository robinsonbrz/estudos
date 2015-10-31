package br.com.caelum.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.usuario.AutorizacaoException;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;

/*Classe que representa nosso Webservice SOAP e suas operações, no caso
 *temos apenas um operação para recuperar todos os itens de uma lista.
 */

/*
 * Personalizei meu WS com notações do JAX-WS para torna-lo mais legivel.
 * 
 * Notação RequestWrapper: utilizado para representar o nome do request no XML
 * Notação ResponseWrapper: utilizado para representar o retorno no XML.
 *
 */

@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();
	private TokenDao tokenDao = new TokenDao();

	@WebMethod(operationName = "todosOsItens")
	@WebResult(name = "itens")
	@ResponseWrapper(localName = "itens")
	@RequestWrapper(localName = "listaItens")
	public List<Item> getItens(@WebParam(name = "filtros") Filtros filtros) {
		System.out.println("Chamando getItens()");
		List<Filtro> lista = filtros.getLista();
		List<Item> itensResultado = dao.todosItens(lista);
		return itensResultado;
	}

	@WebMethod(operationName = "CadastrarItem")
	public Item cadastrarItem(@WebParam(name="tokenUsuario",header=true) TokenUsuario token, @WebParam(name = "item") Item item) throws AutorizacaoException {
		
		if(!this.tokenDao.ehValido(token)){
			throw new AutorizacaoException("Autorizacao Falhou.");
		}
		
		System.out.println("Cadastrando item " + item);
		new ItemValidador(item).validate();
		this.dao.cadastrar(item);
		return item;
	}
}
