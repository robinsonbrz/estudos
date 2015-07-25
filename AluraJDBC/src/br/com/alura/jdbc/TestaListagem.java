package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection conn = new Datasource().getConnection();

		Statement prepStmt = conn.createStatement();
		boolean result = prepStmt.execute("select * from Produtos");
		ResultSet resultSet = prepStmt.getResultSet();

		while (resultSet.next()) {

			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");

			System.out.println(id + " " + nome + " " + descricao);
		}

		resultSet.close();
		prepStmt.close();
		conn.close();
	}

}
