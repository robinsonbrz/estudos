package br.com.victor.shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.victor.shop.dao.ProdutoDAO;
import br.com.victor.shop.model.Produto;
import br.com.victor.shop.util.DBConnectionFactory;

public class TesteXMLMarshall {

	@Test
	public void testaXMLSerialization() throws SQLException {
		new DBConnectionFactory();

		String xmlEntrada = "<produto>"
				+ "	<nome>AMPLI. MAROTOSOM</nome>"
				+ "	<preco>9999.00</preco>"
				+ "	<decricao>AMPLIFICADOR MAROTO NA PROMOCAO" 
				+ "	</decricao>"
				+ "</produto>";

		XStream xstream = new XStream();
		xstream.alias("produto", Produto.class);

		Produto produto = (Produto) xstream.fromXML(xmlEntrada);
		System.out.println(produto.getNome());
		try (Connection con = DBConnectionFactory.getConnection()) {

			ProdutoDAO prdDAO = new ProdutoDAO(con);
			prdDAO.insereProduto(produto);
		}

	}
}
