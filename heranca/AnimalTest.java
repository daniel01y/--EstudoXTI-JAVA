package br.com.xti.heranca;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void main(String[] args) {
		
	
		//Animal generico = new Animal(0, null);
		Animal toto = new Cachorro();
		Animal carijo = new Galinha();
		
		barulho(toto);
		barulho(carijo);

	}

}
/*
 * 	public static void barulho(String animal) {
 		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au !");
		}
		else if (animal.equals("Galinha")) {
			System.out.println("Có, Có !");
		}
  	}
 */
