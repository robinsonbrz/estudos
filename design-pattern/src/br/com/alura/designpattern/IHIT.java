package br.com.alura.designpattern;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> orcamentoAuxilar = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (orcamentoAuxilar.contains(item.getNome())) {
				return true;
			} else {
				orcamentoAuxilar.add(item.getNome());
			}
		}
		return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

}
