package br.com.java8.stream;

import java.util.Arrays;

public class StreamFlatMap {
	public static void main(String[] args) {
		
		Integer[][] data = {{1,2},{3,4},{5,6}};
		Arrays.stream(data).flatMap(row -> Arrays.stream(row)).filter(num -> num % 2 == 1)
			.forEach(s -> System.out.print(s+" "));
		
		
	}
}
