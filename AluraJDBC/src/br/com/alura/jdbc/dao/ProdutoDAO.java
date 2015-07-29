package br.com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.model.Categoria;
import br.com.alura.jdbc.model.Produto;

import com.mysql.jdbc.Statement;

public class ProdutoDAO {

	Connection dbConnection;

	public ProdutoDAO(Connection con) {
		this.dbConnection = con;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?,?)";

		try (PreparedStatement prStmt = dbConnection.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS)) {

			prStmt.setString(1, produto.getNome());
			prStmt.setString(2, produto.getDescricao());
			prStmt.execute();

			try (ResultSet rs = prStmt.getGeneratedKeys()) {
				if (rs.next()) {

					int id = rs.getInt(1);
					produto.setId(id);
					System.out.println(produto);

				}
			}

		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<Produto>();

		String sql = "SELECT * FROM PRODUTO";

		try (PreparedStatement prStmt = dbConnection.prepareStatement(sql)) {
			prStmt.execute();

			transformaResultadoEmProdutos(produtos, prStmt);
		}

		return produtos;
	}

	public List<Produto> busca(Categoria cat) throws SQLException {

		String sql = "SELECT * FROM PRODUTO WHERE CATEGORIA_ID = ?";
		List<Produto> produtos = new ArrayList<Produto>();

		try (PreparedStatement prdStmt = dbConnection.prepareStatement(sql)) {
			prdStmt.setInt(1, cat.getId());
			prdStmt.execute();

			transformaResultadoEmProdutos(produtos, prdStmt);
		}

		return produtos;
	}

	private void transformaResultadoEmProdutos(List<Produto> produtos,
			PreparedStatement prdStmt) throws SQLException {

		try (ResultSet rs = prdStmt.getResultSet()) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String nome = rs.getString("nome");
				String descricao = rs.getString("descricao");
				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				produtos.add(produto);
			}
		}
	}
}
