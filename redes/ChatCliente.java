package br.com.xti.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatCliente extends JFrame{

	JTextField textoParaEnviar;
	PrintWriter escritor;
	Socket socket;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;
	
	private class EscutaServidor implements Runnable {
		
		public void run() {
			try {
			String texto;
			while((texto = leitor.nextLine()) != null) {
				textoRecebido.append(texto + "\n");
			}
			}catch(Exception x) {}
		}
	}
	
	public ChatCliente(String nome) throws Exception {
		super("Chat : " + nome);
		this.nome = nome;
		
		Font fonte = new Font("serif", Font.PLAIN, 26);
		textoParaEnviar = new JTextField();
		textoParaEnviar.setFont(fonte);
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		botao.addActionListener(new EnviarListener());
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		envio.add(BorderLayout.CENTER, textoParaEnviar);
		envio.add(BorderLayout.EAST, botao);
		
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, envio);
		
		configurarRede();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	private class EnviarListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			escritor.println(nome + ":" + textoParaEnviar.getText());
			escritor.flush();
			textoParaEnviar.setText("");
			textoParaEnviar.requestFocus();
		}
		
	}
	
	private void configurarRede() throws Exception {
		try {
		socket = new Socket("192.168.1.15", 5000);
		escritor = new PrintWriter(socket.getOutputStream());
		leitor = new Scanner(socket.getInputStream());
		new Thread(new EscutaServidor()).start();
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ChatCliente("Ricardo");
		new ChatCliente("Sandra");
	}
}
