package br.com.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Guaran�");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("A�a�");
		list.add("Banana");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.addAll(list, "Cupua�u", "Laranja", "Laranja");
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja"));
		
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		boolean d = Collections.disjoint(list, list2);
		System.out.println(d);
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guaran�");
		System.out.println(indice);
		System.out.println(list);
		
		Collections.fill(list, "A�a�");
		System.out.println(list);
		
		//cole��o n�o modificavel
		
		@SuppressWarnings("unused")
		Collection<String> constante = Collections.unmodifiableCollection(list);
	}

}
