package br.com.xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Aninhamento extends JFrame {

	JButton botao;
	public Aninhamento() {
		super("Aninhamento");
		
		botao = new JButton("Ok");
		botao.addActionListener(new ListenerAninhado());
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clase Anônima Processa " + botao.getText());
			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public class ListenerAninhado implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Clase Aninhada Processa " + botao.getText());
		}
		
	}
	
	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
		@SuppressWarnings("unused")
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
	}

}
