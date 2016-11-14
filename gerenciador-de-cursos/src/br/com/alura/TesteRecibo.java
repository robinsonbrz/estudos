package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {

		Recibo r1 = new Recibo();
		Recibo r2 = new Recibo();
		Recibo r3 = new Recibo();

		Set<Recibo> recibos = new TreeSet<Recibo>();
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);

		Iterator<Recibo> iterator = recibos.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
