package br.com.java8.stream.modulo3;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
	public static void main(String[] args) {
		
		DoubleFunction<String> df = d -> String.valueOf(d * 5.3);
		System.out.println(df.apply(43.7));
		
	}
}
