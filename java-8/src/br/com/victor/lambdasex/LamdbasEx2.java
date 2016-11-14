package br.com.victor.lambdasex;

public class LamdbasEx2 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		//Lambda
		new Thread(() -> System.out.print("Executando um Runnable")).start();

	}
}
