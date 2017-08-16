package br.com.java8.core;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		
		BiPredicate<Integer, String> condition = (i,s) -> i > 20 && s.startsWith("R");
		
		System.out.println(condition.test(10, "Ram"));
		System.out.println(condition.test(30, "Shyram"));
		System.out.println(condition.test(30, "Ram"));
		
	}
}
