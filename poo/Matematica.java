package br.com.xti.poo;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
	}
	double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	double media(int x) {
		System.out.print("media(int x) ");
		return x;
	}
	
	double media(double ... numeros) {
		System.out.print("media(int ... numeros) ");
		return this.soma(numeros)/numeros.length;
	}
	
	double media(int x, int y) {
		System.out.print("media(int x, int y) ");
		return (x+y) / 2;
	}
	
	double media(String x, String y) {
		System.out.print("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix+iy) / 2;
	}
	
	//Maneira que eu resolvi o problema
	/** @return a raiz quadrada do numero segundo a equação de Pell */
	int raiz(int valor) {
		int sub = 1, menor = 0, r = 0;
		while(valor >= sub) {
			menor = valor - sub;
			valor = menor;
			sub += 2;
			r++;
		}
		return r;
	}
	
	/*
	//Maneira que o Ricardo da universidade XTI resolveu
	int raizdois(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		return raiz;
	}
	*/
}
