package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A","B","C","D");
		String result = list.stream().collect(Collectors.joining(",", "(", ")"));
		System.out.println(result);
		
	}
}
