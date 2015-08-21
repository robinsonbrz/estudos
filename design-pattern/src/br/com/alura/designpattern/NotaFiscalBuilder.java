package br.com.alura.designpattern;

import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private double impostos;
	private double valorTotal;

	private List<ItemDaNota> itens;
	private Calendar dataAtual;
	private String observacoes;

	public NotaFiscalBuilder informarRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder informarCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder adicionar(ItemDaNota item) {
		itens.add(item);
		valorTotal += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder adicionarObs(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder data(Calendar dataQualquer) {
		this.dataAtual = dataQualquer;
		return this;
	}

	public NotaFiscal emitirNotaFiscal() {
		return new NotaFiscal(razaoSocial, cnpj, valorTotal, impostos,
				dataAtual, observacoes, itens);
	}
}
