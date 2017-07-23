package br.com.java8.stream.modulo4;

import java.util.stream.Stream;

public class StreamOfDemo {
	public static void main(String[] args) {
		
		Stream.of("Ram","Shyam","Mohan").forEach(s -> System.out.println(s));
		
	}
}
