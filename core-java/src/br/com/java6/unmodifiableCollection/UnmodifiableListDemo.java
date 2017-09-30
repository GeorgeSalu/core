package br.com.java6.unmodifiableCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {
	public static void main(String[] args) {
		List<String> modifiable = new ArrayList<>();
		modifiable.add("1111");
		List<String> unmodifiable = Collections.unmodifiableList(modifiable);
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
