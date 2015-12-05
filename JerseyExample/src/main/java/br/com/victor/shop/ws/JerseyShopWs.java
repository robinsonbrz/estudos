package br.com.victor.shop.ws;

import java.sql.Connection;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.victor.shop.dao.ProdutoDAO;
import br.com.victor.shop.model.Produto;
import br.com.victor.shop.util.DBConnectionFactory;

@WebService
public class JerseyShopWs {

	@WebMethod(operationName="buscarProduto")
	@WebResult(name="produto")
	public Produto buscaProduto(@WebParam(name = "idProduto") int idProduto) throws SQLException {
		new DBConnectionFactory();

		try (Connection dbConnection = DBConnectionFactory.getConnection()) {

			Produto produto = new ProdutoDAO(dbConnection)
					.buscaProdutoPorID(idProduto);
			return produto;
		}
	}
}
