import java.util.HashSet;
import java.util.Set;

import br.com.alura.fj11.modelo.Conta;
import br.com.alura.fj11.modelo.ContaPoupanca;


public class TestaEqualsInConta {
	public static void main(String[] args) {
		
		Set<Conta> contas = new HashSet<>();
		
		ContaPoupanca cp1 = new ContaPoupanca(12345, "Teste 1");
		ContaPoupanca cp2 = new ContaPoupanca(12345, "Teste 2 ");
		
		contas.add(cp1);
		contas.add(cp2);
		
		for(Conta c : contas){
			System.out.println(c);;
		}
		
	}
}
