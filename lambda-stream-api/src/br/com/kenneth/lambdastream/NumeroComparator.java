package br.com.kenneth.lambdastream;

import java.util.Comparator;

public class NumeroComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);		
	}

}
