package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.stream().map(i -> i*i)
			.forEach(s -> System.out.print(s+" "));
		
	}
}
