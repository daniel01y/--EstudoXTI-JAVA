package br.com.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	JTextField texto;
	JButton sete, oito, nove, barra, quatro, cinco, seis, asteristico, um, dois, tres, traco, zero, ponto, igual, mais;
	
	
	public Calculadora() {
		super("Calculadora");
		//definindo os valor dos botões
		sete = new JButton("7");
		oito = new JButton("8");
		nove = new JButton("9");
		barra = new JButton("/");
		quatro = new JButton("4");
		cinco = new JButton("5");
		seis = new JButton("6");
		asteristico = new JButton("*");
		um = new JButton("1");
		dois = new JButton("2");
		tres = new JButton("3");
		traco = new JButton("-");
		zero = new JButton("0");
		ponto = new JButton(".");
		igual = new JButton("=");
		mais = new JButton("+");
		
		//PRIMEIRO CONTAINER COM CAIXA DE TEXTO
		Container c = getContentPane();
		
		texto = new JTextField();
		c.setLayout(new BorderLayout());
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		//SEGUNDO CONTAINER COM NUMEROS E INDICADORES
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 4, 5, 5));
		//adicionando as teclas
		c2.add(sete);
		c2.add(oito);
		c2.add(nove);
		c2.add(barra);
		c2.add(quatro);
		c2.add(cinco);
		c2.add(seis);
		c2.add(asteristico);
		c2.add(um);
		c2.add(dois);
		c2.add(tres);
		c2.add(traco);
		c2.add(zero);
		c2.add(ponto);
		c2.add(igual);
		c2.add(mais);
		
		c.add(BorderLayout.NORTH, texto);
		c.add(BorderLayout.CENTER, c2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Calculadora();
	}

}
