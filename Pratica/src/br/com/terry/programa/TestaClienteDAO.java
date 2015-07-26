package br.com.terry.programa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.terry.dao.ClienteDAO;
import br.com.terry.model.Cliente;
import br.com.terry.util.Datasource;

public class TestaClienteDAO {
	
	public static void main(String[] args) throws SQLException {
		
		Cliente cliente1 = new Cliente("Teste Cliente Joao", "111.333.444-55");
		
		new Datasource();
		
		try(Connection dbConnection = Datasource.getConnection()){
			ClienteDAO clienteDAO =new ClienteDAO(dbConnection);
			
			//clienteDAO.inserir(cliente1);
			//clienteDAO.atualizaDocumento(cliente1, "111.222.333-44");
			//clienteDAO.atualizaNome(cliente1, "Joao Teste Atualizacao");
			//clienteDAO.lista();
		}	
		
	}
}
