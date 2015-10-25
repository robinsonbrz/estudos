package br.com.victor.shop;

import static org.junit.Assert.*;

import java.net.URI;
import java.sql.Connection;
import java.sql.SQLException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import junit.framework.Assert;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.victor.shop.dao.ProdutoDAO;
import br.com.victor.shop.model.Produto;
import br.com.victor.shop.util.DBConnectionFactory;

import com.thoughtworks.xstream.XStream;

public class ClientRESTS {

	private HttpServer server;
	private Client client;
	
	@Before
	public void iniciaServidor() {

		iniciarServidor();
		ClientConfig config = new ClientConfig();
		config.register(new LoggingFilter());
		this.client = ClientBuilder.newClient(config);
	}

	@After
	public void paraServidor() {
		server.stop();
	}

	@Test
	public void testaConexao() throws SQLException {

		new DBConnectionFactory();
		Connection con = DBConnectionFactory.getConnection();

		ProdutoDAO prdDAO = new ProdutoDAO(con);
		Produto prdEsperado = prdDAO.buscaProdutoPorID(3d);
	
		WebTarget target = client.target("http://localhost:8080/");
		Produto conteudo = target.path("/produtos/3").request().get(Produto.class);
		
		Produto prdConvertido = conteudo;

		Assert.assertEquals(prdEsperado, prdConvertido);

	}

	public void iniciarServidor() {
		URI uri = URI.create("http://localhost:8080/");
		ResourceConfig config = new ResourceConfig()
				.packages("br.com.victor.shop");
		server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
	}

	@Test
	public void testPostMethod() {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");

		Produto produto = new Produto("CHIMBINHA DVD", 120.0,
				"VIDEO AULA DO MESTRE");

		Entity<Produto> entity = Entity.entity(produto,
				MediaType.APPLICATION_XML);
		Response response = target.path("produtos").request().post(entity);
		assertEquals(201, response.getStatus());

	}

}
