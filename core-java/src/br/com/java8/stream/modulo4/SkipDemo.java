package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AA","BB","CC","DD");
		list.stream().skip(2).forEach(s -> System.out.println(s));
		
	}
}
