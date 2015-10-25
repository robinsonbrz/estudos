package br.com.victor.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.victor.shop.model.Produto;

public class ProdutoDAO {

	Connection dbConneciton;

	public ProdutoDAO(Connection con) {
		this.dbConneciton = con;
	}

	public Produto buscaProdutoPorID(double d) {

		String sql = "SELECT * FROM PRODUTOS WHERE ID_PRODUTO = ?";
		List<Produto> produtosEncontrado = new ArrayList<Produto>();

		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {

			prdStmt.setDouble(1, d);
			prdStmt.execute();

			try (ResultSet rs = prdStmt.getResultSet()) {
				while (rs.next()) {

					int id_produto = rs.getInt("id_produto");
					String nome_produto = rs.getString("nome_produto");
					double preco_produto = rs.getDouble("preco_produto");
					String desc_produto = rs.getString("desc_produto");

					Produto p1 = new Produto(nome_produto, preco_produto,
							desc_produto);
					p1.setId(id_produto);
					produtosEncontrado.add(p1);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		Produto produtoDesejado = produtosEncontrado.get(0);
		return produtoDesejado;
	}

	public void insereProduto(Produto produto) throws SQLException {

		String sql = "INSERT INTO PRODUTOS (NOME_PRODUTO, PRECO_PRODUTO, DESC_PRODUTO) VALUES (?,?,?)";

		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {

			prdStmt.setString(1, produto.getNome());
			prdStmt.setDouble(2, produto.getPreco());
			prdStmt.setString(3, produto.getDecricao());

			prdStmt.execute();
		}

	}
}
