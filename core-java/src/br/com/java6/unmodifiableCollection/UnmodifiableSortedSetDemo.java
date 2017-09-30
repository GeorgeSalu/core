package br.com.java6.unmodifiableCollection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class UnmodifiableSortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> modifiable = new TreeSet<>();
		modifiable.add("1111");
		SortedSet<String> unmodifiable = Collections.unmodifiableSortedSet(modifiable);
		try {
			unmodifiable.add("2222"); // will throw error
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException-----");
		}
		for (String s : unmodifiable) {
			System.out.println(s);
		}
	}
}