package br.com.alura.designpattern;


public class TestaCalculadorDesconto {
	public static void main(String[] args) {

		CalculadorDesconto calculador = new CalculadorDesconto();

		Orcamento orcamento = new Orcamento(50.0);

		orcamento.adicionaItem(new Item("CANETA", 200.0));
		orcamento.adicionaItem(new Item("LAPIS", 300.0));
		orcamento.adicionaItem(new Item("MOCHILA", 300.0));
		orcamento.adicionaItem(new Item("ESTOJO", 300.0));
		//orcamento.adicionaItem(new Item("LAPIS DE COR", 300.0));
		// orcamento.adicionaItem(new Item("BORRACHA", 300.0));

		double desconto = calculador.calcula(orcamento);
		System.out.println(desconto);

	}
}
