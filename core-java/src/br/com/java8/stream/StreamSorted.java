package br.com.java8.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamSorted {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "BBB");
		map.put(2, "AAA");
		map.put(3, "CCC");
		
		System.out.println("--- Sort by Map Value ----");
		map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.forEach(e -> System.out.println("Key: "+ e.getKey() +", Value: "+ e.getValue()));
		
	}
}
