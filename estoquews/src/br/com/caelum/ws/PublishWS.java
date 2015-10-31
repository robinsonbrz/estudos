package br.com.caelum.ws;

import javax.xml.ws.Endpoint;

//Publicador, serve para definir um endpoint e expor um serviço SOAP na internet.

public class PublishWS {
	public static void main(String[] args) {
		EstoqueWS ws = new EstoqueWS();
		String url = "http://localhost:8080/estoquews";
		
		System.out.println("Serviço publicado!");
		
		Endpoint.publish(url, ws);
	}
}
