package br.com.victor.shop.resource;

import java.net.URI;
import java.sql.Connection;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.victor.shop.dao.ProdutoDAO;
import br.com.victor.shop.model.Produto;
import br.com.victor.shop.util.DBConnectionFactory;

/*
 * Esta classe serve para construir um recurso (resource) que será exposto na internet.
 * Esta classe também descreve todas as operações que nosso resource suporta.
 */

@Path("produtos")
public class ProdutoResource {

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	//@Produces(MediaType.APPLICATION_JSON)
	public Produto busca(@PathParam("id") double id) throws Exception {
		new DBConnectionFactory();
		
		try (Connection dbConnection = DBConnectionFactory.getConnection()) {
			
			Produto produto = new ProdutoDAO(dbConnection).buscaProdutoPorID(id);
			return produto;
		}
	
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response adiciona(Produto conteudo) throws SQLException {
		new DBConnectionFactory();
		
		Produto produto = conteudo;

		try (Connection dbConnection = DBConnectionFactory.getConnection()) {
			ProdutoDAO prdDAO = new ProdutoDAO(dbConnection);
			prdDAO.insereProduto(produto);
		}

		URI uri = URI.create("/produtos/" + produto.getId());
		return Response.created(uri).build();
	}
}
