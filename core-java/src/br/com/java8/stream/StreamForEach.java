package br.com.java8.stream;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
		
		Integer[] data = {1,2,3,4,5,6,7};
		
		System.out.println("---- forEach ------");
		Arrays.stream(data).filter(num -> num % 2 == 1)
			.forEach(s -> System.out.print(s+" "));
		
		System.out.println("\n ----- forEachOrdered Demo");
		Arrays.stream(data).filter(num -> num % 2 == 1 )
			.forEachOrdered(s -> System.out.print(s+" "));
		
	}
}
