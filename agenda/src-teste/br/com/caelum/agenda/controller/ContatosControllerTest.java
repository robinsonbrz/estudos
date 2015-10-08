package br.com.caelum.agenda.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.agenda.Contato;
import br.com.caelum.agenda.dao.ContatoDAO;

public class ContatosControllerTest {

	private ContatosController controller;
	private MockContatoDAO dao;

	
	
	@Before
	public void setUp() throws Exception {
		dao = new MockContatoDAO();
		this.controller = new ContatosController(dao);
	}
	
	@Test
	public void salvandoContato() {
		final Contato contato = new Contato();
		contato.setNome("Madruga");
		this.controller.salvar(contato);
		Assert.assertEquals(1, dao.getContatos().size());
	}
	
	
	static class MockContatoDAO implements ContatoDAO {

		List<Contato> contatos = new ArrayList<Contato>();
		
		public void salvar(Contato contato) {
			contatos.add(contato);
		}
		
		public List<Contato> getContatos() {
			return contatos;
		}
		
		public List<Contato> listar() {
			return null;
		}


		public Contato buscarPorId(Integer id) {
			return null;
		}

		public void deleta(Contato contato) {
		}

		public void altera(Contato contato) {
		}
		
		
	}
}