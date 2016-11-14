package br.com.alura;

public class Aluno {

	String nome;
	int numeroMatricula;

	public String getNome() {
		return nome;
	}

	public Aluno(String nome, int numeroMatricula) {
		
		 if (nome == null)
		        throw new NullPointerException("Nome não pode ser nulo");
		 
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Nome aluno: " + this.nome + " Matricula: " + this.numeroMatricula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	

}
