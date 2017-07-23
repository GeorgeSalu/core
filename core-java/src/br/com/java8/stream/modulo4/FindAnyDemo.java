package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class FindAnyDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AA","BB","CC");
		list.stream().findAny().ifPresent(s -> System.out.println(s));
		
	}
}
