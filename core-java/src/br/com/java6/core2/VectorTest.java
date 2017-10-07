package br.com.java6.core2;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		for (String s : v) {
			System.out.println(s);
		}
		System.out.println("Checks availability of element by contains method");
		System.out.println(v.contains("A"));
		System.out.println("Remove element by remove method.");
		// remove first element
		v.remove(0);
		for (String s : v) {
			System.out.println(s);
		}
	}
}