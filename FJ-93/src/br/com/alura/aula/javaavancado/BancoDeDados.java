package br.com.alura.aula.javaavancado;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados implements ArmazenadorDeDividas{
	
	private String url;
	private String usuario;
	private String senha;
	
	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();
	
	@Override
	public void salva(Divida divida){
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}
	@Override
	public Divida carrega(Documento documentoCredor){
		return dividasNoBanco.get(documentoCredor);
	}
	
	public void desconecta(){
		System.out.println("Desconecta");
	}
	
	public BancoDeDados(String url, String usuario, String senha) {
		super();
		this.url = url;
		this.usuario = usuario;
		this.senha = senha;
		
		System.out.println("Conectado!!!");
	}
	
	
}
