package br.com.victor.shop.ws;

import javax.xml.ws.Endpoint;

public class JerseyShopPublish {
	public static void main(String[] args) {

		JerseyShopWs shopWs = new JerseyShopWs();
		String url = "http://localhost:8080/jerseyshopws";

		System.out.println("Serviço publicado");

		Endpoint.publish(url, shopWs);
	}
}
