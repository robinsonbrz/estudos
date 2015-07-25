package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Datasource {
	
	private static MysqlDataSource dataSource;

	public Datasource() {
		
		MysqlDataSource ds = new MysqlDataSource();
		
		ds.setServerName("localhost");
		ds.setPortNumber(3306);
		ds.setDatabaseName("lojavirtual");
		ds.setUser("root");
		ds.setPassword("SegredO123@");
		this.dataSource = ds;
	
	}

	public static Connection getConnection() throws SQLException {
		
		Connection conn = dataSource.getConnection();
		
		return conn;
	}
}
