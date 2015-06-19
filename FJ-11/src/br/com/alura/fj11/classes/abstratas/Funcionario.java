package br.com.alura.fj11.classes.abstratas;

/*
 * Classes abstratas, funcionam como moldes, para que ourtras classes possam herdar
 * seus atributos, sem necessariamente que a classe abstrata exista no seu código.
 * 
 * Classes que herdam de classes abstratas, possuem não apenas os mesmos atributos,
 * mas também os métodos abstratos.
 * */

public class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;

	public double getBonificacao() {
		return this.salario * 1.2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}