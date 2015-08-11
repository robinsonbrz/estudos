package br.com.alura.designpattern;

public class DescontoPadrao implements Desconto{
	
	@Override
	public double calculaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void proximoDesconto(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

}
