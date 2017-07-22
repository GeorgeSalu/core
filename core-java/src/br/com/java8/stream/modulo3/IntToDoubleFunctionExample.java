package br.com.java8.stream.modulo3;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {
	public static void main(String[] args) {
		
		IntToDoubleFunction ob = f -> f*f;
		System.out.println(ob.applyAsDouble(43));
		
	}
}
