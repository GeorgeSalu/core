package br.com.java6.core;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");

		Enumeration<Integer> enm = ht.keys();
		while (enm.hasMoreElements()) {
			System.out.println(ht.get(enm.nextElement()));
		}
		Vector<String> vec = new Vector<String>();
		vec.add("A");
		vec.add("B");
		vec.add("C");

		Enumeration<String> en = vec.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}