package br.com.alura.jdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.Datasource;
import br.com.alura.jdbc.dao.ProdutoDAO;

import com.mysql.jdbc.Statement;

public class TestaDAO {
	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("Mesa", "Mesa de Centro");

		new Datasource();

		try (Connection con = Datasource.getConnection()) {

			String sql = "INSERT INTO PRODUTOS(NOME, DESCRICAO) VALUES (?,?)";

			try (PreparedStatement prStmt = con.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS)) {
				ProdutoDAO dao = new ProdutoDAO(con);
				dao.salva(produto);
				
				List<Produto> produtos = dao.lista();
				
				System.out.println("Lista de produtos Cadastrados:\n");
				
				for (Produto prod : produtos) {
					System.out.println(prod);
				}
			}
			
		}
	}
}
