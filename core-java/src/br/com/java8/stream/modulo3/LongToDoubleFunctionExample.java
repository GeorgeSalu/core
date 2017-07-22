package br.com.java8.stream.modulo3;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {
	public static void main(String[] args) {
		
		LongToDoubleFunction ob = f -> f*f;
		System.out.println(ob.applyAsDouble(43));
		
	}
}
