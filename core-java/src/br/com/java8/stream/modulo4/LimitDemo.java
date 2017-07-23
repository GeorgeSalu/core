package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "EE");
		list.stream().limit(3).forEach(s -> System.out.println(s));
	}
}
