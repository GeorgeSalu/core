package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingDoubleExample {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		Double result = list.stream().collect(Collectors.averagingDouble(d -> d*2));
		System.out.println(result);
		
	}
}
