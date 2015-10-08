package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.caelum.agenda.Contato;

@Component
public class ContatoJDBCDAO implements ContatoDAO {

	private Connection connection;

	public ContatoJDBCDAO() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> listar() {
		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			List<Contato> contatos = new ArrayList<Contato>();
			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void salvar(Contato contato) {

		String sql = "insert into contatos (nome,telefone) values (?,?)";
		try {
			// prepared statement para insercao
			PreparedStatement stmt = connection.prepareStatement(sql);
			// seta os valores
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Contato buscarPorId(Integer id) {
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from contatos where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()){
				Contato contato = new Contato();
				contato.setId(rs.getInt("id"));
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				return contato;
			}
			stmt.close();
			throw new RuntimeException("ID nao encontrado");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void deleta(Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
			stmt.setInt(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public void altera(Contato contato) {
		String sql = "update contatos set nome=?, telefone=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.setInt(3, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
