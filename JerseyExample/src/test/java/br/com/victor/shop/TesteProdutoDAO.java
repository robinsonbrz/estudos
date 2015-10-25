package br.com.victor.shop;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.com.victor.shop.dao.ProdutoDAO;
import br.com.victor.shop.model.Produto;
import br.com.victor.shop.util.DBConnectionFactory;

public class TesteProdutoDAO {

	@Test
	public void testaBuscaProdutoDAO() throws SQLException {

		ProdutoDAO prtDAO = new ProdutoDAO(conexaoDB());
		Produto prt1 = prtDAO.buscaProdutoPorID(2d);

		System.out.println("Nome: " + prt1.getNome());
	}

	@Test
	public void testeInsereProdutoDAO() throws SQLException {

		Produto produto = new Produto("CONTRA BAIXO", 1230.9,
				"CONTRA BAIXO AUTOGRAFADO");

		ProdutoDAO prtDAO = new ProdutoDAO(conexaoDB());
		prtDAO.insereProduto(produto);
	}

	public Connection conexaoDB() throws SQLException {

		new DBConnectionFactory();
		Connection con = DBConnectionFactory.getConnection();
		return con;
	}
}
