package br.com.java6.unmodifiableCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSetDemo {
	public static void main(String[] args) {
		Set<String> modifiable = new HashSet<>();
		modifiable.add("1111");
		Set<String> unmodifiable = Collections.unmodifiableSet(modifiable);
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