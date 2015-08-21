package br.com.alura.designpattern;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private double valorTotal;
	private double impostos;
	private Calendar dataAtual;
	private String observacoes;

	private List<ItemDaNota> itens;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public double getImpostos() {
		return impostos;
	}

	public Calendar getDataAtual() {
		return dataAtual;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public NotaFiscal(String razaoSocial, String cnpj, double valorTotal,
			double impostos, Calendar dataAtual, String observacoes,
			List<ItemDaNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorTotal = valorTotal;
		this.impostos = impostos;
		this.dataAtual = dataAtual;
		this.observacoes = observacoes;
		this.itens = itens;
	}

}
