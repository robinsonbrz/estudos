package br.com.alura.fj11.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteJavaIO {
	public static void main(String [] args) throws IOException{
		
		/**
		 * Decorator Pattern:
		 * 	Lendo arquivo utilizando APIs de mais baixo nivel a lógica é
		 * 	Ler um byte, converter esse byte em char, e construir a String.
		 */
		
		InputStream in = System.in;
		InputStreamReader isreader = new InputStreamReader(in);
		BufferedReader bfreader = new BufferedReader(isreader);
		
		String s = bfreader.readLine();
		System.out.println(s);

		
	}
}
