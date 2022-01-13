package br.com.xti.java;

public class StringOperacoes {

	public static void main(String[] args) {
		
		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		System.out.println(s2);
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		System.out.println(s4);
	
		//OPERAÇÕES
		int tamanho = s1.length();
		System.out.println(tamanho);
		char letra = s1.charAt(0);//0 a length()-1
		System.out.println(letra);
		String texto = s1.toString();
		System.out.println(texto);
	
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");
		System.out.println(posicao);
		int ultima = s3.lastIndexOf('a');
		System.out.println(ultima);
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARAÇÃO
		String xti = "XTI";
		//boolean x = xti.equals("xti");
		//boolean x = xti.equalsIgnoreCase("xti");
		//boolean x = xti.startsWith("TI");
		boolean x = xti.endsWith("TI");
		System.out.println(x);
		
		//int c = "amor".compareTo("bola");//-1
		//int c = "123".compareTo("234");//
		//System.out.println(c);
		
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);
		System.out.println(o);
		
		String l = "O Brasil é Lindo";
		String sl = l.substring(11);
		System.out.println(sl);
		sl = l.substring(2, 8);
		System.out.println(sl);
		sl = l.concat(" que Maravilha");
		System.out.println(sl);
		sl = l.replace('s', 'z');
		//sl = l.replaceFirst(" ", "X");
		//sl = l.replaceAll(" ", "X");
		sl = l.toUpperCase();
		sl = l.toLowerCase();
		
		System.out.println("  	esp aços  ".trim());
	}

}
