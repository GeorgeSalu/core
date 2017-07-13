package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectCounting {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
		long result = list.stream().collect(Collectors.counting());
		System.out.println("Count : "+result);
		
	}
}
