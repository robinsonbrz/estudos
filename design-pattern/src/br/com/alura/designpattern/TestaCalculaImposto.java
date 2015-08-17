package br.com.alura.designpattern;

public class TestaCalculaImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(200.00);
		CalculadorImposto calc = new CalculadorImposto();
		
		orcamento.adicionaItem(new Item("LAPIS", 0.3));
		orcamento.adicionaItem(new Item("MOCHILA", 120.99));
		
		calc.calculaImposto(orcamento, new ICPP());
		calc.calculaImposto(orcamento, new IKCV());

	}
}
