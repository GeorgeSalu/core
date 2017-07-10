package br.com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("G","B","F","E");
		String max = list.stream().max(Comparator.comparing(String::toString)).get();
		System.out.println("Max : "+max);
		
		String min = list.stream().min(Comparator.comparing(String::toString)).get();
		System.out.println("Min : "+min);
		
		
	}
}
