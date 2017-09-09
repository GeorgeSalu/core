package br.com.java8.core;

import java.util.stream.Stream;

public class ConcatStreamsDemo {
	public static void main(String[] args) {
		
		Stream<String> s1 = Stream.of("AA","BB","CC");
		Stream<String> s2 = Stream.of("AA","BB","DD");
		Stream<String> s = Stream.concat(s1, s2);
		
		s.forEach(e -> System.out.println(e+" "));
		
		//remove duplicates
		s1 = Stream.of("AA","BB","CC");
		s2 = Stream.of("AA","BB","DD");
		System.out.println("\nremove duplicates");
		s = Stream.concat(s1, s2).distinct();
		s.forEach(e -> System.out.println(e+" "));
	}
}
