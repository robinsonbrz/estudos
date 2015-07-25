package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSQLInjection {
	public static void main(String[] args) throws SQLException {

		Connection con = new Datasource().getConnection();

		String nome = "TESTE', 'TESTE'); DELETE FROM PRODUTOS WHERE ID > 3; /* #";
		String sql = "INSERT INTO PRODUTOS (NOME) VALUES ('" + nome + "')";

		Statement statement = con.createStatement();

		System.out.println(sql);

		statement.execute(sql, Statement.RETURN_GENERATED_KEYS);

		System.out.println("Valores inseridos com sucesso!!!");

		statement.close();
		con.close();
	}
}
