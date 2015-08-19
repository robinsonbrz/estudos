package br.com.alura.designpatter.exercicio;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQue500MilReais extends Filtro {

	public FiltroMaiorQue500MilReais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() > 500000) {
				filtrada.add(conta);
			}
			filtrada.addAll(contas);
		}

		return filtrada;
	}

}
