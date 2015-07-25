package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	public static void main(String[] args) throws SQLException {

		/*
		 * Este tipo de implementação do try/catch, onde a conexão é fechada
		 * "automatícamente" é valida somente para o Java 7. Servidor de
		 * aplicação como por exemplo o weblogic 10 não suportam java 7, logo o
		 * close de uma conexão ou um preparedstatement/statement devem ficara
		 * explicitos no código.
		 */

		try (Connection conn = new Datasource().getConnection()) {

			String sql = "INSERT INTO PRODUTOS (NOME, DESCRICAO) VALUES (?, ?)";
			conn.setAutoCommit(false);
			try (PreparedStatement stmt = conn.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS)) {
				
				adiciona("TV LCD", " 50 polegadas", stmt);
				adiciona("Blueray", "FULL HDMI", stmt);
				conn.commit();
			}

			catch (Exception e) {
				// TODO Auto-generated catch block
				conn.rollback();
				System.out.println("Rollback efetuado");
				e.printStackTrace();
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static ResultSet adiciona(String nome, String descricao,
			PreparedStatement stmt) throws SQLException {

		if (nome.equals("Blueray")) {
			throw new IllegalArgumentException("Erro no progarama!!!");
		}

		stmt.setString(1, nome);
		stmt.setString(2, descricao);

		stmt.execute();

		try (ResultSet resultSet = stmt.getGeneratedKeys()) {

			int id = 1;

			while (resultSet.next()) {

				id = resultSet.getInt(1);
				System.out.println("O ID do novo produto gerado é " + id);
			}

			return resultSet;
		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
