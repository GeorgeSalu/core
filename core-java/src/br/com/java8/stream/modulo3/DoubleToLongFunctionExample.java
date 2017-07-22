package br.com.java8.stream.modulo3;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {
	public static void main(String[] args) {
		
		DoubleToLongFunction ob = f -> new Double(f*4.8).longValue();
		System.out.println(ob.applyAsLong(43.7));
		
	}
}
