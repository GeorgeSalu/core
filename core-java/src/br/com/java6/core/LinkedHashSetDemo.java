package br.com.java6.core;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Bean> set = new LinkedHashSet<Bean>();
		Bean b1 = new Bean("A");
		Bean b2 = new Bean("B");
		Bean b3 = new Bean("C");
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for (Bean b : set) {
			System.out.print(b.name + " ");
		}
		System.out.println("\nsize before duplicate element:" + set.size());

		Bean b4 = new Bean("C");
		set.add(b4);

		System.out.println("size after duplicate element:" + set.size());
	}
}

class Bean {
	public String name;

	public Bean(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		return name.equals(((Bean) o).name);
	}

	@Override
	public int hashCode() {
		int hash = 13;
		hash = (31 * hash) + (null == name ? 0 : name.hashCode());
		return hash;
	}
}