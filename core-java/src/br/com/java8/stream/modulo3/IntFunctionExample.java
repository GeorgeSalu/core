package br.com.java8.stream.modulo3;

import java.util.function.IntFunction;

public class IntFunctionExample {
	public static void main(String[] args) {
		
		IntFunction ob = f -> f*f;
		System.out.println(ob.apply(43));
		
	}
}
