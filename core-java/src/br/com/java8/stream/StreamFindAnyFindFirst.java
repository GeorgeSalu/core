package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFindAnyFindFirst {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("G","B","F","E");
		String any = list.stream().findAny().get();
		System.out.println("FindAny : "+any);
		
		String fisrt = list.stream().findFirst().get();
		System.out.println("FindFirst : "+fisrt);
		
	}
}
