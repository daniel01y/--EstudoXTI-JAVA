package br.com.xti.colecao;

import java.util.ArrayList;

public class Generico <E> {

	E elemento;
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return elemento;
	}
	
	public double soma(ArrayList<? extends Number> lista) {
		double total = 0;
		for(Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		Generico<String> g = new Generico();
		g.setElemento("Lago Paranoá");
		//g.setElemento(123456);
		g.getElemento().toUpperCase();
	}

}
