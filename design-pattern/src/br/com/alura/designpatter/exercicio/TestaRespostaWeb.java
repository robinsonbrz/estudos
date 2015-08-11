package br.com.alura.designpatter.exercicio;

import br.com.alura.designpatter.exercicio.Requisicao.Formato;

public class TestaRespostaWeb {
	public static void main(String[] args) {

		Conta c1 = new Conta("Teste", 100.0);
		
		Requisicao req = new Requisicao(Formato.XML);
		
		RespostaDefault def = new RespostaDefault();
		RespostaPorcento porcento = new RespostaPorcento(def);
		RespostaXML xml = new RespostaXML(porcento);
		RespostaCSV csv = new RespostaCSV(xml);
		
		xml.responde(req, c1);

	}
}
