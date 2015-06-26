package br.com.alura.fj11.programa;


public class TestaComparacaoConta {

	public void imprimeString(String string) {
			StringBuilder buff = new StringBuilder(string);
			System.out.print(buff.reverse());
	}

	public static void main(String[] args) {
		
		String stringToIntIn = "762";
		int stringToIntOut = 0;
		
		for (int i = 0; i < stringToIntIn.length(); i++){
			int alg = Character.getNumericValue(stringToIntIn.charAt(i));			
			stringToIntOut = (stringToIntOut * 10) + alg;
			
		}

		System.out.println(stringToIntOut);
		
	}
}
