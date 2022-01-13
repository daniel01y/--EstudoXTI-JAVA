package br.com.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Number {

	public static void main(String[] args) throws ParseException {
		
		//Locale brasil = new Locale("pt", "BR");
		
		double saldo = 123_456.789;
		NumberFormat f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));//genéricos
		
		f = NumberFormat.getIntegerInstance();
		System.out.println(f.format(saldo));//inteiros
		
		f = NumberFormat.getPercentInstance();
		System.out.println(f.format(0.25));//percentual
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.format(saldo));//moeda
		
		f = NumberFormat.getInstance();
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(3);
		System.out.println(f.format(saldo));
		
		/* Internacionalização */
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		/* CONVERSÃO DE VALORES */
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.parse("$1,100.25"));
	}

}
