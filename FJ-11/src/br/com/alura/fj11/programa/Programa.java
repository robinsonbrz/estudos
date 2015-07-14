package br.com.alura.fj11.programa;

public class Programa implements Runnable {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println("Programa" + id + " valor: " + i);
		}

	}

}
