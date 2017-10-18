package br.com.java6.core;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		Set<Entry<Integer, String>> set = ht.entrySet();

		for (Entry<Integer, String> en : set) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}

		Enumeration<Integer> enm = ht.keys();
		while (enm.hasMoreElements()) {
			System.out.println(ht.get(enm.nextElement()));
		}
	}
}