package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("AAA","BBB");
		List<String> list2 = Arrays.asList("CCC","DDD");
		Stream.of(list1,list2).flatMap(list -> list.stream()).forEach(s -> System.out.println(s));
		
	}
}
