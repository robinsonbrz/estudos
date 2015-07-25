package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		
		Connection con = new Datasource().getConnection();
			
		Statement stmt = con.createStatement();
		boolean result = stmt.execute("delete from produtos where id > 3");
		
		int count = stmt.getUpdateCount();
		System.out.println(count + " linhas atualizadas.");
		
		stmt.close();
		con.close();
	}
}
