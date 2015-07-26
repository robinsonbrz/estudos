package br.com.terry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.terry.model.Cliente;

public class ClienteDAO {

	Connection dbConneciton;

	public ClienteDAO(Connection con) {
		this.dbConneciton = con;
	}

	/**
	 * Método criado para persistir um novo cliente no banco
	 * 
	 * @param cliente
	 * @throws SQLException
	 */
	public void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO CLIENTE (NOME, DOCUMENTO) VALUES (?, ?)";
		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS)) {

			prdStmt.setString(1, cliente.getNome());
			prdStmt.setString(2, cliente.getDocumento());
			prdStmt.execute();

			try (ResultSet rs = prdStmt.getGeneratedKeys()) {
				if (rs.next()) {
					int id = rs.getInt(1);
					cliente.setId(id);
					System.out.println("Cliente cadastrado com sucesso!");
					System.out.println("Cliente: " + cliente.getNome() + "\n"
							+ "Documento: " + cliente.getDocumento() + "\n"
							+ "ID: " + cliente.getId());
				}
			}
		}
	}

	/**
	 * Método criado para atualizar o nome de um cliente
	 * 
	 * @param cliente
	 * @param novoNome
	 * @throws SQLException
	 */
	public void atualizaNome(Cliente cliente, String novoNome)
			throws SQLException {

		String sql = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?";
		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {
			prdStmt.setString(1, novoNome);
			prdStmt.setInt(2, cliente.getId());

			try {
				prdStmt.execute();
				System.out.println("Atualizado com sucesso!!!");
			} catch (SQLException erroSql) {
				System.out.println("Erro ao atualiazar o nome do Cliente.");
				erroSql.printStackTrace();
			}
		}
	}

	/**
	 * Método criado para atualizar o documento de um cliente
	 * 
	 * @param cliente
	 * @param novoDocumento
	 * @throws SQLException
	 */

	public void atualizaDocumento(Cliente cliente, String novoDocumento)
			throws SQLException {

		String sql = "UPDATE CLIENTE SET DOCUMENTO = ? WHERE ID = ?";
		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {

			cliente.setDocumento(novoDocumento);
			prdStmt.setString(1, novoDocumento);
			prdStmt.setInt(2, cliente.getId());

			try {
				prdStmt.execute();
				System.out.println("Atualizado com sucesso!!!");

			} catch (SQLException erroSql) {
				System.out.println("Erro ao atualiazar o nome do Cliente.");
				erroSql.printStackTrace();
			}
		}
	}

	/**
	 * Método criado para deletar um cliente do banco
	 * 
	 * @param cliente
	 * @throws SQLException
	 */
	public void deleta(Cliente cliente) throws SQLException {

		String sql = "DELETE FROM CLIENTE WHERE ID = ?";
		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {
			prdStmt.setInt(1, cliente.getId());
			try {
				prdStmt.execute();
				System.out.println("Usuário deletado com sucesso!!!");
			} catch (SQLException erroSql) {
				System.out.println("Erro ao deletar o nome do Cliente.");
				erroSql.printStackTrace();
			}
		}

	}

	/**
	 * Realiza a consulta de todos os usuários cadastrados e imprime o resultado.
	 * @throws SQLException
	 */

	public void lista() throws SQLException {

		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "SELECT * FROM CLIENTE";

		try (PreparedStatement prdStmt = dbConneciton.prepareStatement(sql)) {
			prdStmt.execute();

			try (ResultSet rs = prdStmt.getResultSet()) {
				while (rs.next()) {
					
					int id = rs.getInt(1);
					String nome = rs.getString("NOME");
					String documento = rs.getString("DOCUMENTO");
					Cliente cliente = new Cliente(nome, documento);
					cliente.setId(id);
					clientes.add(cliente);
				}
			}
		}

		System.out.println("Clientes cadastrados:");
		
		for (Cliente cliente : clientes) {
			
			System.out.print("||" + cliente.getId());
			System.out.print("||" + cliente.getNome());
			System.out.println("||" + cliente.getDocumento() + "||");
		}

	}

}
