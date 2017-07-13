package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
	public static void main(String[] args) {
		
		String[] strArray = {"AA", "BB", "CC"};
		
		List<String> list = Arrays.stream(strArray).collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));
		
	}
}
