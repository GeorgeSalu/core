package br.com.java6.unmodifiableCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UnmodifiableMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> modifiable = new HashMap<>();
		modifiable.put(1, "AAAA");
		Map<Integer, String> unmodifiable = Collections.unmodifiableMap(modifiable);
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