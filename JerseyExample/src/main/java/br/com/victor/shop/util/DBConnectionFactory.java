package br.com.victor.shop.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DBConnectionFactory {

	private static MysqlDataSource datasource;

	public DBConnectionFactory() {

		MysqlDataSource dbDataSource = new MysqlDataSource();

		dbDataSource.setServerName("localhost");
		dbDataSource.setPortNumber(3306);
		dbDataSource.setDatabaseName("lojarest");
		dbDataSource.setUser("root");
		dbDataSource.setPassword("root001");
		this.datasource = dbDataSource;
	}

	public static Connection getConnection() throws SQLException {
		Connection con = datasource.getConnection();
		return con;
	}
}
