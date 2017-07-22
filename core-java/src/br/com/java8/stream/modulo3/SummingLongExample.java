package br.com.java8.stream.modulo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingLongExample {
	public static void main(String[] args) {

		List<Long> list = new ArrayList<>();
		list.add((long) 340);
		list.add((long) 240);
		list.add((long) 360);
		
		long result = list.stream().collect(Collectors.summingLong(l -> l));
		
		System.out.println(result);

	}
}
