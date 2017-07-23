package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CountDemo {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("AA","BB","CC");
		Predicate<String> predicate = s -> s.startsWith("A");
		long l = list.stream().filter(predicate).count();
		System.out.println("Number of Matching Element : "+l);
		
	}
}
