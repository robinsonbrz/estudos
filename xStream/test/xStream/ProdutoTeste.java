package xStream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.xstream.Produto;

import com.thoughtworks.xstream.XStream;

public class ProdutoTeste {

	@Test
	public void deveGerarOXmlComONomePrecoEDescricaoAdequados() {
		String resultadoEsperado = "<produto codigo=\"1587\">\n"
				+ "  <nome>geladeira</nome>\n" + "  <preco>1000.0</preco>\n"
				+ "  <descrição>geladeira duas portas</descrição>\n"
				+ "</produto>";

		Produto geladeira = new Produto("geladeira", 1000.0,
				"geladeira duas portas", 1587);

		XStream xstream = new XStream();
		xstream.alias("produto", Produto.class);
		xstream.aliasField("descrição", Produto.class, "descricao");
		//xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.useAttributeFor(Produto.class, "codigo");
		String xmlGerado = xstream.toXML(geladeira);
		assertEquals(resultadoEsperado, xmlGerado);
	}
}
