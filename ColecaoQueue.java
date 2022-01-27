package br.com.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//FIFO first in, first out - primeiro a entrar, é o primeiro a sair
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.add("Beatriz");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());//remove o elemento do início da fila
		System.out.println(fila);
		
		/* outros métodos disponíveis em linkedlist*/
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio");//coloco no inicio da fila
		f.addLast("Juliana");//coloca no fim da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());
		System.out.println(f.peekLast());
		
		f.pollFirst();
		f.pollLast();
		System.out.println(f);
	}

}
