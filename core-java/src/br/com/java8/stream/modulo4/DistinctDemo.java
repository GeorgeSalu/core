package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "AA", "BB");
		long l = list.stream().distinct().count();
		System.out.println("Number of distinct element:" + l);
	}
}
