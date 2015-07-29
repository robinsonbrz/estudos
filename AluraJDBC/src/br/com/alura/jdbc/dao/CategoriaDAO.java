package br.com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.model.Categoria;
import br.com.alura.jdbc.model.Produto;

public class CategoriaDAO {

	Connection dbConnection;

	public CategoriaDAO(Connection con) {
		this.dbConnection = con;
	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> categorias = new ArrayList<Categoria>();

		String sql = "SELECT * FROM CATEGORIA";

		try (PreparedStatement prdStmt = dbConnection.prepareStatement(sql)) {
			prdStmt.execute();
			try (ResultSet rs = prdStmt.getResultSet()) {
				while (rs.next()) {

					String nome = rs.getString("nome");
					int id = rs.getInt(1);
					Categoria cat = new Categoria(id, nome);
					categorias.add(cat);
				}
			}
		}

		return categorias;
	}

	public List<Categoria> listaComProdutos() throws SQLException {

		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;

		String sql = "select c.id as c_id, c.nome as c_nome, p.id as p_id, p.nome as p_nome, p.descricao as p_descricao from Categoria as c join Produto as p on p.categoria_id = c.id";

		try (PreparedStatement prdStmt = dbConnection.prepareStatement(sql)) {
			prdStmt.execute();

			try (ResultSet rs = prdStmt.getResultSet()) {
				while (rs.next()) {
					String nome = rs.getString("c_nome");
					int id = rs.getInt(1);

					if (ultima == null || !ultima.getNome().equals(nome)) {

						Categoria cat = new Categoria(id, nome);
						categorias.add(cat);
						ultima = cat;
					}
					String nomeProduto = rs.getString("p_nome");
					String descricaoProduto = rs.getString("p_descricao");
					int idProduto = rs.getInt("p_id");

					Produto p = new Produto(nomeProduto, descricaoProduto);
					p.setId(idProduto);
					ultima.adiciona(p);
				
				}
			}
		}
		return categorias;
	}
}
