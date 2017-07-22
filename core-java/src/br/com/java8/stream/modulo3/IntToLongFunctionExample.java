package br.com.java8.stream.modulo3;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {
	public static void main(String[] args) {
		
		IntToLongFunction ob = f -> f*f;
		System.out.println(ob.applyAsLong(43));
		
	}
}
