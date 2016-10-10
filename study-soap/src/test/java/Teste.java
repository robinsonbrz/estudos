public class Teste {
	
	String name;
	String sobrenome;
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		
		Teste[] testes = new Teste[10];
		
		Teste test = new Teste();
		Teste test1 = new Teste();
		
		test.name = "Teste 1";
		test.sobrenome = "Sobrenome 1";
		
		test1.name = "Teste 2";
		test1.sobrenome = "Sobrenome 21";
		
		testes[0] = test;
		testes[1] = test1;
		System.out.println(testes[1].getName());
	}
}
