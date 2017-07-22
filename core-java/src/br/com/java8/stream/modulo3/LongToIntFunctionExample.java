package br.com.java8.stream.modulo3;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionExample {
	public static void main(String[] args) {
		
		LongToIntFunction ob = f -> (int)(f*f);
		System.out.println(ob.applyAsInt(43));
		
	}
}
