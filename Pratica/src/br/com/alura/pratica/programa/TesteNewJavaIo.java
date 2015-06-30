package br.com.alura.pratica.programa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteNewJavaIo {
	public static void main(String [] args) throws IOException{
		
		/*
		 * Colocando estudo em pr�tica da java.io
		 */
		
		/**
		 * Scanner faz parte do pacote java.util, e possui alguns contrutores que permitem que ele receba
		 * um InputStream ou suas classes filhas, no caso abaixo, meu teclado ser� a entrada.
		 * 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		/**
		 * A PrintStream herda de FileOutPutStream e permite que eu escreve direto uma String, ao inv�s de
		 * implementar manualmente a escrita de arquivo atrav�s do Decorator Pattern
		 */
		PrintStream ps = new PrintStream(new FileOutputStream("saida.txt"));
		
		/**
		 * Permite que eu digite uma mensagem no console, essa mensagem ser� grava no arquivo de sa�da configurado no meu
		 * objeto "ps".
		 */
		
		System.out.println("Imprima o que deseja gravar no arquivo: ");
		
		/**
		 * Enquanto eu tiver uma pr�xima linha no meu console, o la�o ser� executado, gravando a linha de entrada no arquivo
		 * configurado o objeto "ps", e verificando que existe uma pr�xima linha.
		 */
		while(sc.hasNextLine()){
			ps.println(sc.nextLine());
		}
		
		ps.close();
		sc.close();
		
	}
}
