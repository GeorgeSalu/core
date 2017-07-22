package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingDoubleExample {
	public static void main(String[] args) {

		List<Double> list = Arrays.asList(340.5, 234.56, 672.76);
		Double result = list.stream().collect(Collectors.summingDouble(d -> d));
		System.out.println(result);
		
	}
}
