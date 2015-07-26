package br.com.terry.model;

/**
 * @author Victor
 *
 */
public class Cliente {

	private int id;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	private String nome;
	private String documento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getDocumento() {
		return documento;
	}

	/**
	 * Contrustutor para instanciar um cliente
	 * 
	 * @param nome
	 * @param documento
	 */

	public Cliente(String nome, String documento) {
		super();
		this.nome = nome;
		this.documento = documento;
	}
}
