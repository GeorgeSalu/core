package br.com.java8.stream.modulo2;

import java.util.Arrays;

public class FlatMapWithArray {
	public static void main(String[] args) {
		
		Integer[][] data = {{1,2},{3,4},{5,6}};
		Arrays.stream(data).flatMap(row -> Arrays.stream(row)).filter(num -> num % 2 == 0)
		.forEach(System.out::println);
		
	}
}
