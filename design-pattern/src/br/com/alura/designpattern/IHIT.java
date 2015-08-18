package br.com.alura.designpattern;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	public IHIT() {
	}

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
		return (orcamento.getValor() * 0.13) + 100 + calculoDoOutroImposto(orcamento);
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size()) + calculoDoOutroImposto(orcamento);
	}

}
