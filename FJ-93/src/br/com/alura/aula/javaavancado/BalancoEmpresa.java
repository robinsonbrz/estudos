package br.com.alura.aula.javaavancado;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	
    private Map<Documento, Divida> dividas;
    private ArmazenadorDeDividas bd = new BancoDeDados("localhost", "user", "1234");

    public BalancoEmpresa(){
        this.dividas = new HashMap<>();
    }

    public void registraDivida( Divida divida) {
    	bd.salva(divida);
    }

    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = bd.carrega(documentoCredor);
        if (divida != null) {
            divida.registra(pagamento);
        }
    }

	public BalancoEmpresa(ArmazenadorDeDividas bd) {
		super();
		this.bd = bd;
	} 
    
}