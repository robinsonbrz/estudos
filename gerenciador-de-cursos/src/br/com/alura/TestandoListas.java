package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		ArrayList<String> aulas = new ArrayList<String>();
		
		String aula1 = "Curso de Node.JS";
		String aula2 = "Curso de Angular JS";
		String aula3 = "Integração de Sistemas";
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.remove(0);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
