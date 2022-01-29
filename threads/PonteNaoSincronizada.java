package br.com.xti.threads;

public class PonteNaoSincronizada implements Ponte {

	private int valor = -1;
	
	public void set(int valor) throws InterruptedException {
		System.out.println("Produziu " + valor);
		this.valor = valor;
	}

	public int get() throws InterruptedException {
		System.err.println("Consumiu " + valor);
		return valor;
	}

}
