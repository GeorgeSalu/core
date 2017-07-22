package br.com.java8.stream.modulo3;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample {
	public static void main(String[] args) {
		
		DoubleToIntFunction ob = f -> new Double(f * 4.8).intValue();
		System.out.println(ob.applyAsInt(43.7));
		
	}
}
