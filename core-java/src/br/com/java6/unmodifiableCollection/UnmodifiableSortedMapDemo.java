package br.com.java6.unmodifiableCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class UnmodifiableSortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> modifiable = new TreeMap<>();
		modifiable.put(1, "AAAA");
		SortedMap<Integer, String> unmodifiable = Collections.unmodifiableSortedMap(modifiable);
		try {
			unmodifiable.put(2, "BBBB");
			; // will throw error
		} catch (UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException-----");
		}
		Set<Integer> set = unmodifiable.keySet();
		Iterator<Integer> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(unmodifiable.get(ite.next()));
		}
	}
}