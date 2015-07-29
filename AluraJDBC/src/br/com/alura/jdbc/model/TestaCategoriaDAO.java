package br.com.alura.jdbc.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.Datasource;
import br.com.alura.jdbc.dao.CategoriaDAO;

public class TestaCategoriaDAO {
	public static void main(String[] args) throws SQLException {

		new Datasource();

		try (Connection con = Datasource.getConnection()) {
			List<Categoria> categorias = new CategoriaDAO(con)
					.listaComProdutos();

			for (Categoria categoria : categorias) {
				for (Produto produto : categoria.getProdutos()) {
					System.out.println(categoria.getNome() + " - "
							+ produto.getNome() + " - "
							+ produto.getDescricao());
				}
			}
		}
	}
}
