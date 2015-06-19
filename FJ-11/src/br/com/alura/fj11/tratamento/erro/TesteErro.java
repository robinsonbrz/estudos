package br.com.alura.fj11.tratamento.erro;

class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("fim do main");
	}

	/*
	 * Nota:
	 * 
	 * Toda invocação de método no Java é empilhada em uma estrutura de dados
	 * que isola a área de memória de cada um. Quando o método termina, ele
	 * volta para o método que invocou.
	 */
	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}
}
