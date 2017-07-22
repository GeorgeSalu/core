package br.com.java8.stream.modulo3;

import java.util.function.LongFunction;

public class LongFunctionExample {
	public static void main(String[] args) {
		
		LongFunction<String> ob = f -> String.valueOf(f*f);
		System.out.println(ob.apply(43));
		
	}
}
