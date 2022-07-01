package br.com.kenneth.lambdastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>(List.of(5, 3, 4, 1, 2));
		// NumeroComparator comparator = new NumeroComparator(); // Usando o m�todo comparator.
		
		/*Implementando a Classe comparator usando uma classe anonima.
		  A grande vantagem � que n�o precisa mais usara a classe
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
		
		// O objetivo da express�o lambda � otimizar o codigo.
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2); // Express�o lambda.
		numeros.sort(comparator);
	
		// numeros.sort((o1, o2) -> -o1.compareTo(o2)); //Ou simplemente posso s� passar o par�metro
		
		System.out.println(numeros);
	}

}
