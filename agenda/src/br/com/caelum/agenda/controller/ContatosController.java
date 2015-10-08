package br.com.caelum.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.agenda.Contato;
import br.com.caelum.agenda.dao.ContatoDAO;


@Controller
@RequestMapping("contatos")
public class ContatosController {

	private final ContatoDAO contatoDao;

	@Autowired
	public ContatosController(ContatoDAO contatoDao) {
		this.contatoDao = contatoDao;
	}
	
	@RequestMapping("/novo")
	public String novo() {
		return "contatos/novo";
	}
	
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Integer id, Model model) {
		Contato contato = contatoDao.buscarPorId(id);
		model.addAttribute(contato);
		return "contatos/editar";
	}
	
	@RequestMapping("/listar")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("contatos/listar");
		mv.addObject("contatos",contatoDao.listar());
		return mv;
	}
	
	@RequestMapping("/salvar")
	public String salvar(Contato contato) {
		contatoDao.salvar(contato);
		return redirecionaParaOListar();
	}
	
	@RequestMapping("/exibir/{id}")
	public ModelAndView exibir(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView("contatos/exibir");
		mv.addObject("contato", contatoDao.buscarPorId(id));
		return mv;
	}
	
	@RequestMapping("/alterar")
	public String alterar(Contato contato) {
		contatoDao.altera(contato);
		return redirecionaParaOListar();
	}
	
	@RequestMapping("/deletar/{id}")
	public String deletar(@PathVariable("id") Integer id) {
		Contato contato = contatoDao.buscarPorId(id);
		contatoDao.deleta(contato);
		return redirecionaParaOListar();
	}
	
	@RequestMapping("/contato/randomData")
	public String randomData() {
		
		for(int i = 1; i <= 100; i++) {
			Contato contato = new Contato();
			contato.setNome("contato " + i);
			contatoDao.salvar(contato);
		}
		
		return redirecionaParaOListar();
	}

	private String redirecionaParaOListar() {
		return "redirect:/contatos/listar";
	}
	
}
