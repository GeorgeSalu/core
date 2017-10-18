package br.com.java6.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list.size());
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			if ("C".equals(s)) {
				itr.remove();
			}
		}
		System.out.println(list.size());
	}
}