package br.com.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Entre um Número de 0 a 10");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "Número invalido " + numero;
		System.out.println("Você entrou " + numero);
	}

}
