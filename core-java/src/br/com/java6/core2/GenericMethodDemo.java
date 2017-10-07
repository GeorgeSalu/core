package br.com.java6.core2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethodDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("Display method is Printing Integer");
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		display(intList);
		System.out.println("Display method is Printing String");
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		display(strList);
	}

	static void display(List<?> col) {
		for (Object ob : col) {
			System.out.println(ob);
		}
	}
}