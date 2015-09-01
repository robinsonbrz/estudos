package br.com.alura.aula.javaavancado;

public interface ArmazenadorDeDividas {

	public void salva(Divida divida);
	public Divida carrega(Documento documentoCredor);
}
