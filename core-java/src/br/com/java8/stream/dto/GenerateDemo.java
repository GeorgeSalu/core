package br.com.java8.stream.dto;

import java.util.stream.Stream;

public class GenerateDemo {
	public static void main(String[] args) {
		
		ItemStream item = new ItemStream("AA");
		Stream<String> stream = Stream.generate(item::getName);
		stream.forEach(s -> System.out.println(s));
		
	}
}
