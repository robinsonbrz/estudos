package br.com.alura.aula.javaavancado;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
	
    private Map<String, Divida> dividas;

    public BalancoEmpresa(){
        this.dividas = new HashMap<>();
    }

    public void registraDivida(Divida divida) {
        dividas.put(divida.getCnpjCredor().getValor(), divida);
    }

    public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
            divida.getPagamentos().registra(pagamento);
        }
    }
}