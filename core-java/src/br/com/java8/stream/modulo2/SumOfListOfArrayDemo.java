package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListOfArrayDemo {
	public static void main(String[] args) {
		
		List<Integer[]> list = new ArrayList<>();
		Integer[] a1 = {6,3,8,12};
		list.add(a1);
		Integer[] a2 = {8,13,9,22};
		list.add(a2);
		
		System.out.println("-- Using Collectors.summingInt ---");
		int sum = list.stream().flatMap(a -> Arrays.stream(a))
						.collect(Collectors.summingInt(i -> i));
		System.out.println(sum);
		System.out.println("-- Using Collectors.summingInt() ----");
		
		IntSummaryStatistics stats = list.stream().flatMap(a -> Arrays.stream(a))
							.collect(Collectors.summarizingInt(i -> i));
		System.out.println(stats.getSum());
		System.out.println("--- Using IntStream.sum() ---");
		sum = list.stream().flatMap(a -> Arrays.stream(a))
					.mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}
}
