package br.com.kenneth.lambdastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>(List.of(5, 3, 4, 1, 2));
		// NumeroComparator comparator = new NumeroComparator(); // Usando o método comparator.
		
		/*Implementando a Classe comparator usando uma classe anonima.
		  A grande vantagem é que não precisa mais usara a classe
		  Comparator.
		*/
//		
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -o1.compareTo(o2);
//			}
//
//		};
		
		// O objetivo da expressão lambda é otimizar o codigo.
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2); // Expressão lambda.
		numeros.sort(comparator);
	
		// numeros.sort((o1, o2) -> -o1.compareTo(o2)); //Ou simplemente posso só passar o parâmetro
		
		System.out.println(numeros);
	}

}
