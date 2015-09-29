package xStream;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.omg.CORBA.NO_RESOURCES;

import br.com.alura.xstream.Compra;
import br.com.alura.xstream.Produto;

import com.thoughtworks.xstream.XStream;

public class CompraTest {
	
	@Test
	public void deveSerializarCadaUmDosProdutosDeUmaCompra(){
		
		String resultadoEsperado = "<compra>\n"+
			    "  <id>15</id>\n"+
			    "  <produtos>\n"+
			    "    <produto codigo=\"1587\">\n"+
			    "      <nome>geladeira</nome>\n"+
			    "      <preco>1000.0</preco>\n"+
			    "      <descrição>geladeira duas portas</descrição>\n"+
			    "    </produto>\n"+
			    "    <produto codigo=\"1588\">\n"+
			    "      <nome>ferro de passar</nome>\n"+
			    "      <preco>100.0</preco>\n"+
			    "      <descrição>ferro com vaporizador</descrição>\n"+
			    "    </produto>\n"+
			    "  </produtos>\n"+
			    "</compra>";
		
		Compra compra = compraComGeladeiraEFerro();
		
		XStream xstream = xstreamParaCompraEProduto();
		String xmlGerado = xstream.toXML(compra);
		assertEquals(resultadoEsperado, xmlGerado);
	}
	
	public void deveGerarUmaCompraComOsProdutosAdequados(){
		
		String xmlOrigem = "<compra>\n"+
			    "  <id>15</id>\n"+
			    "  <produtos>\n"+
			    "    <produto codigo=\"1587\">\n"+
			    "      <nome>geladeira</nome>\n"+
			    "      <preco>1000.0</preco>\n"+
			    "      <descrição>geladeira duas portas</descrição>\n"+
			    "    </produto>\n"+
			    "    <produto codigo=\"1588\">\n"+
			    "      <nome>ferro de passar</nome>\n"+
			    "      <preco>100.0</preco>\n"+
			    "      <descrição>ferro com vaporizador</descrição>\n"+
			    "    </produto>\n"+
			    "  </produtos>\n"+
			    "</compra>";
		
		Compra compraEsperada = compraComGeladeiraEFerro();
		
		XStream xstream = xstreamParaCompraEProduto();
		
		Compra compraGerada = (Compra) xstream.fromXML(xmlOrigem);
		
		assertEquals(compraEsperada, compraGerada);
	}

	private XStream xstreamParaCompraEProduto() {
		XStream xstream = new XStream();
		xstream.alias("compra", Compra.class);
		xstream.alias("produto", Produto.class);
		xstream.aliasField("descrição", Produto.class, "descricao");
		//xstream.aliasAttribute(Produto.class, "codigo", "codigo");
		xstream.useAttributeFor(Produto.class, "codigo");
		return xstream;
	}

	private Compra compraComGeladeiraEFerro() {
		Produto geladeira = geladeira();
		Produto ferroDePassar = ferroDePassar();
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(geladeira);
		produtos.add(ferroDePassar);
		Compra compraEsperada = new Compra(15, produtos);
		return compraEsperada;
	}

	private Produto ferroDePassar() {
		Produto ferroDePassar = new Produto("ferro de passar", 100.0, "ferro com vaporizador", 1588);
		return ferroDePassar;
	}

	private Produto geladeira() {
		Produto geladeira = new Produto("geladeira", 1000.0, "geladeira duas portas",1587);
		return geladeira;
	}
	
	private Compra compraDuasGeladeirasIguais(){
		
		Produto geladeira = geladeira();
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(geladeira);
		produtos.add(geladeira);
		Compra compraEsperada = new Compra(15, produtos);
		return compraEsperada;
	}
	
	@Test
	public void deveSerializarDuasGeladeirasIguais(){
		
	    String resultadoEsperado = "<compra>\n" 
	            + "  <id>15</id>\n"
	            + "  <produtos>\n" 
	            + "    <produto codigo=\"1587\">\n"
	            + "      <nome>geladeira</nome>\n"
	            + "      <preco>1000.0</preco>\n"
	            + "      <descrição>geladeira duas portas</descrição>\n"
	            + "    </produto>\n"
	            + "    <produto codigo=\"1587\">\n"
	            + "      <nome>geladeira</nome>\n"
	            + "      <preco>1000.0</preco>\n"
	            + "      <descrição>geladeira duas portas</descrição>\n"
	            + "    </produto>\n"
	            + "  </produtos>\n" 
	            + "</compra>";
	    
	    Compra compra = compraDuasGeladeirasIguais();
	    XStream xstream = xstreamParaCompraEProduto();
	    xstream.setMode(XStream.NO_REFERENCES);
	    String xmlGerado = xstream.toXML(compra);
	    
	    assertEquals(resultadoEsperado,xmlGerado );
	    
	}
}
