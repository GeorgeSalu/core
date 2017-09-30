package br.com.java6.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyTwo {
	public static void main(String[] args) {
		List<Integer> source = Arrays.asList(1, 2, 3, 4);
		List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		Collections.copy(dest, source);
		for (Integer i : dest) {
			System.out.print(i + " ");
		}
	}
}