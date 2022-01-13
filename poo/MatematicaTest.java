package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		System.out.println(m.media(5));
		System.out.println(m.media(5, 3));
		System.out.println(m.media(5, 3, 34, 56));
		System.out.println(m.media("50", "30"));
		
		int ra = m.raiz(27);
		System.out.println("A raiz quadrada do valor informado é = "+ra);
		
	}

}
