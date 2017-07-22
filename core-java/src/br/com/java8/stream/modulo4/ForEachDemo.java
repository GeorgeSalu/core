package br.com.java8.stream.modulo4;

import java.util.stream.Stream;

public class ForEachDemo {
	public static void main(String[] args) {
		
		System.out.println("ForEach Demo");
		Stream.of("AAA","BBB","CCC").forEach(s -> System.out.println("Output : "+s));
		
		System.out.println("ForEachOrdered Demo");
		Stream.of("AAA","BBB","CCC").forEachOrdered(s -> System.out.println("Output : "+s));
		
	}
}
