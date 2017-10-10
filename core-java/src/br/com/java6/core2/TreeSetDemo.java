package br.com.java6.core2;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		SortedSet<Bean> set = new TreeSet<Bean>(new A());
		set.add(new Bean("A"));
		set.add(new Bean("C"));
		set.add(new Bean("B"));
		for (Bean ob : set) {
			System.out.println(ob.name);
		}
	}
}

class A implements Comparator<Bean> {
	@Override
	public int compare(Bean b1, Bean b2) {
		return b1.name.compareTo(b2.name);
	}
}

class Bean {
	public String name;

	public Bean(String name) {
		this.name = name;
	}
}