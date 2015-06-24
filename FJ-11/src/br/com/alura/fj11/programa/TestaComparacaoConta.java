package br.com.alura.fj11.programa;

import br.com.alura.fj11.modelo.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		
		c1.setNome("João");
		c1.setNumero(123321);
		c2.setNome("Carlos");
		c2.setNumero(123321);
		
		if (c1 == c2) {
			System.out.println("Diferentes");
		} else {
			System.out.println("Iguais");
		}
		
		if(!c1.equals(c2)){
			System.out.println("Diferentes");
		}
		else{
			System.out.println("Iguais");
		}
	}
}
