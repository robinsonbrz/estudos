package br.com.alura.fj11.programa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteJavaIO {
	
	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		PrintStream pswriter = new PrintStream(new FileOutputStream("saida.txt"));

		System.out.println("Digite aqui sua mensagem: ");
		
		while (entrada.hasNextLine()) {
			pswriter.println(entrada.nextLine());
		}

		pswriter.close();
		entrada.close();

	}
}
