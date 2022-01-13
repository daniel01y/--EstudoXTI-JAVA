package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		/* 01 de Jan 1970 */
		System.out.println(System.currentTimeMillis());

		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		/* Métodos */
		data.getTime();
		data.setTime(1_000_000_000_000L);
		System.out.println(data.compareTo(agora));//-1,0,1
		
		/* GregorianCalendar */
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//mes 0-11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mês
		
		c.set(Calendar.YEAR, 1972);//altera o ano
		c.set(Calendar.MONTH, 2);//altera o mês
		c.set(Calendar.DAY_OF_MONTH, 5);
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);
		c.clear(Calendar.SECOND);
		System.out.println(c.getTime());
				
		c.roll(Calendar.DAY_OF_MONTH, 30);//altera apenas o que foi pedido e não unidades maiores
		System.out.println(c.getTime());
		
		/* Saudação com Bom Dia, Boa Tarde, Boa Noite */
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if(hora < 12) {
			System.out.println("Bom Dia!");
		}else if(hora > 12 && hora < 18) {
		System.out.println("Boa Tarde!");
		}else {
			System.out.println("Boa Noite!");
		}
	}

}
