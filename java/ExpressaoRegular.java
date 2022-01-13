package br.com.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		boolean b = "Java".matches("java");
		
		/*
		 * (?i), Ignora maiúscula e minúcula
		 * (?x), Comentários
		 * (?m), Multilinhas
		 * (?s), Dottal
		 */
		
		b = "Java".matches("(?im)java");
		
		/*
		 * METACARACTERES
		 * . qualquer caractere
		 *\d dígitos 			[0-9]
		 *\D não é dígito		[^0-9]
		 *\s espaços			[ \t\n\x0B\f\r]
		 *\S não é espaço		[^\s]
		 *\w letra				[a-zA-Z_0-9]
		 *\W não é letra		
		 */
		
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "A".matches("\\w");
		b = " ".matches("\\s");
		
		b = "Pi".matches("..");
		b = "Pie".matches("...");
		b = "21".matches("\\d\\d");
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "70294-070".matches(cep);
		
		/*
		 * QUANTIFICADORES
		 * x{n} 	X, exatamente n vezes
		 * X{n,}	X, pelo menos n vezes
		 * X{n, m} 	X, pelo menos n mas não mais do que m vezes
		 * X?		X, 0 ou 1 vez
		 * X* 		X, 0 ou + vezes
		 * X+		X, 1 ou + vezes
		 */
		
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "123456".matches("\\d{2,5}");
		
		b = "".matches(".?");//0 ou 1
		b = "ab".matches(".*");//0 ou +
		b = "123".matches(".+");//1 ou +
		
		b = "70294-070".matches("\\d{5}-\\d{3}");
		b = "12/02/1980".matches("\\d{2}/\\d{2}/\\d{4}"); 
		
		
		/*
		 * METACARACTER DE FRONTEIRA
		 * ^ 	inicia
		 * $	finaliza
		 * |	ou
		 */
		
		b = "Pier21".matches("^Pier.*"); 
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sim|não");
		
		
		/*
		 * AGRUPADORES
		 * [...]			Agrupamento
		 * [a-z]			Alcance
		 * [a-e][i-u]		União
		 * [a-z&&[aeiou]]	Interseção
		 * [^abc]			Exceção
		 * [a-z&&[^m-p]]	subtração
		 * \x				Fuga literal
		 */
		
		b = "A".matches("[a-z]");
		b = "3".matches("[0-9]");
		
		b = "True".matches("[tT]rue");//true True
		b = "yes".matches("[tT]rue|[yY]es");//true True yes Yes
		b = "Beatriz".matches("[A-Z][a-z]*");//Primeiro Nome
		b = "alho".matches("[^abc]lho");
		b = "crau".matches("cr[ae]u");//crau creu
		
		b = "rh@xtiuniversity.com".matches("\\w+@\\w+\\.\\w{2,3}");//validação de email
		//minha validação de email copiada de um coment
		b = "danielyujitsuru@gmail.com.br".matches("\\w+@\\w+(\\.\\w{2,3})+");
		System.out.println(b);
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		/*SUBSTITUIÇÕES*/
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		
		String url = "www.xti.com.br/cliente-2011.html";
					//http://www.xti.com.br/2011/cliente.jsp//Objetivo
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println(r);
		System.out.println(url);
	}

}
