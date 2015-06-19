package br.com.alura.fj11.interfaces;

/*
 * Interfaces são contratos, que diferente da Herança, as classes que
 * "assinam" esse contrato implementem apenas os métodos que você
 * jungar necessário.
 * 
 * Quanto mais genérica for a interface, mais facil fica o polimorfismo
 * 
 * */
public interface Tributavel {
	double calculoTributos();
}
