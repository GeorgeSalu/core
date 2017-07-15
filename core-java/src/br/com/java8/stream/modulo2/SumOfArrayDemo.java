package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

import br.com.java8.stream.util.StatisticsUtility;

public class SumOfArrayDemo {
	public static void main(String[] args) {
		
		int[] array = {23,43,56,97,32};
		System.out.println("--- Using IntStream.sum() ---");
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		
		System.out.println("--- Using Stream.reduce() with IntBinaryOperator---");
		IntBinaryOperator ibop = (x,y) -> x+y;
		sum = Arrays.stream(array).reduce(0, ibop);
		System.out.println(sum);
		
		System.out.println("--- Using Stream.reduce() with Integer.sum----");
		sum = Arrays.stream(array).reduce(0, Integer::sum);
		System.out.println(sum);
		System.out.println("--- Using custom method ---");
		sum = Arrays.stream(array).reduce(0, StatisticsUtility::addIntData);
		System.out.println(sum);
		
	}
}
