package br.com.alura.designpattern;

public class TestaDescontoAdicional {
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500);
		orcamento.aplicaDescontoExtra();
		
		System.out.println(orcamento.valor);
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.valor);
	}
}
