package br.com.alura.fj11.programa;

public class TestaJavaLang {

	/**
	 * Estudo do pacote Java.lang
	 */

	public static void main(String[] args) {
		String s = "fj11";
		String outra = s.replaceAll("1", "2");
		System.out.println(s);
		
		if(s.contains(outra)){
			System.out.println("Existe um string dentro de outra!");
		}
		else {
			System.out.println("Esse teste � falso");
		}
		
		if(s.isEmpty()){
			System.out.println("Esta string est� vazia!");
		}
		else{
			System.out.println("Esta string cont�m valor!!!");
		}
		
	}
}
