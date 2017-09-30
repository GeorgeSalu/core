package br.com.java6.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyOne {
	public static void main(String[] args) {
		List<Integer> source = Arrays.asList(1, 2, 3);
		List<Integer> dest = Arrays.asList(4, 5, 6);
		Collections.copy(dest, source);
		for (Integer i : dest) {
			System.out.print(i + " ");
		}
	}
}