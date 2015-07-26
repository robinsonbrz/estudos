package br.com.terry.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Datasource {
	
	private static MysqlDataSource datasource;
	
	/**
	 * Configura uma conex�o com o banco via JDBC - Driver atual MySQL
	 * Caso seja alterado o banco de dados, esse c�digo deve ser revisto 
	 */
	
	public Datasource(){
		
		MysqlDataSource ds = new MysqlDataSource();
		
		ds.setServerName("localhost");
		ds.setPortNumber(3306);
		ds.setDatabaseName("lojaguitarra");
		ds.setUser("root");
		ds.setPassword("SegredO123@");
		this.datasource = ds;
	}
	
	/**
	 * Metodo utilizado para solicitar ao datasource uma conex�o do pool
	 * @return Uma conex�o pr�-estabelecida no pool
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		Connection con = datasource.getConnection();
		return con;
	}
}
