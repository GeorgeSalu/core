package br.com.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,43,12,25);
		
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(i -> i+i));
		
		System.out.println("Sum : "+stats.getSum());
		
	}
}
