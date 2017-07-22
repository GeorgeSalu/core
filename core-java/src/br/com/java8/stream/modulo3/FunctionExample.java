package br.com.java8.stream.modulo3;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		
		Function<Integer,String> ob = f1 -> "Age :"+f1;
		System.out.println(ob.apply(20));
		
	}
}
