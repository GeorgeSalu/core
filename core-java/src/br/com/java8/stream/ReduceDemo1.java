package br.com.java8.stream;

import java.util.Arrays;

import br.com.java8.stream.util.StatisticsUtility;

public class ReduceDemo1 {
	public static void main(String[] args) {
		
		int[] array = {23,43,56,97,32};
		Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
		Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
		Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));
	}
}
