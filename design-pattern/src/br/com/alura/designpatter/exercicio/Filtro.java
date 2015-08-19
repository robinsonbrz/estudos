package br.com.alura.designpatter.exercicio;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro outroFiltro;

	/*
	 * Construtores para indicar que toda classe filha de filtro possa ou não
	 * receber um filtro como parametro
	 */

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public Filtro() {

	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximo(List<Conta> contas) {
		if (outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return new ArrayList<Conta>();
	}

}
