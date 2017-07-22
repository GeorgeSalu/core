package br.com.java8.stream.modulo3;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetExample {
	public static void main(String[] args) {
		
		Set<String> set = Stream.of("AA","BB","CC").collect(Collectors.toSet());
		set.forEach(s -> System.out.println(s));
	}
}
