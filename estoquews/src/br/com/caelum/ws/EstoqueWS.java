package br.com.caelum.ws;

import java.util.List;

import javax.jws.WebService;

import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;

/*Classe que representa nosso Webservice SOAP e suas operações, no caso
 *temos apenas um operação para recuperar todos os itens de uma lista.
 */
@WebService
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	public List<Item> getItens() {
		System.out.println("Chamando getItens()");
		return dao.todosItens();
	}
}
