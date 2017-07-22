package br.com.java8.stream.modulo3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListExample {
	public static void main(String[] args) {
		
		List<String> list = Stream.of("AA","BB","CC").collect(Collectors.toList());
		list.forEach(s -> System.out.println(s));
		
	}
}
