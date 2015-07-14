package br.com.alura.fj11.programa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercicio13 {
	public static void main(String[] args) {
		
		System.out.println("Iniciando ...");
		long inicio = System.currentTimeMillis();
	
		List<Integer> teste = new ArrayList<>();
		
		long inicioInsert = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++){
			teste.add(i);
		}
		long fimInsert = System.currentTimeMillis();
		
		System.out.println("Tempo de insert: " + (fimInsert - inicioInsert));
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("Tempo gasto " + tempo);
	}
}
	