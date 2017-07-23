package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class FindFirstDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("XX","YY","ZZ");
		list.stream().findFirst().ifPresent(s -> System.out.println(s));
		
	}
}
