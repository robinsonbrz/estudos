package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lojavirtual", "root",
				"SegredO123@");
		
		Statement statement = conn.createStatement();
		boolean result = statement.execute("select * from Produto");
		ResultSet resultSet = statement.getResultSet();
		
		while(resultSet.next()){
			
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			
			System.out.println(id + " " + nome + " " + descricao);
		}
		
		resultSet.close();
		statement.close();
		conn.close();
	}
}
