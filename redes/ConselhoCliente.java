package br.com.xti.redes;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		Socket socket = new Socket("192.168.1.15", 5000);
		Scanner s = new Scanner(socket.getInputStream());
		System.out.println("Mensagem:" + s.nextLine());
		s.close();
	}

}
