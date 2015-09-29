package br.com.alura.xstream;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.TreeMarshaller.CircularReferenceException;

public class CategoriaTeste {

	@Test(expected=CircularReferenceException.class)
	public void deveSerializarUmCiclo() {

		Categoria esporte = new Categoria(null, "esporte");
		Categoria futebol = new Categoria(esporte, "futebol");
		Categoria geral = new Categoria(futebol, "geral");
		esporte.setPai(geral);
		
		XStream xstream = new XStream();
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.aliasType("categoria", Categoria.class);
	
	    String xmlEsperado = "<categoria id=\"1\">\n" +
	            "  <pai id=\"2\">\n" +
	            "    <pai id=\"3\">\n" +
	            "      <pai reference=\"1\"/>\n" +
	            "      <nome>futebol</nome>\n" +
	            "    </pai>\n" +
	            "    <nome>geral</nome>\n" +
	            "  </pai>\n" +
	            "  <nome>esporte</nome>\n" +
	            "</categoria>";
	
	    assertEquals(xmlEsperado, xstream.toXML(esporte));
	}
}