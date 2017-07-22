package br.com.java8.stream.modulo3;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
	public static void main(String[] args) {

		ToDoubleFunction<Integer> ob = f1 -> f1 * 301;
		System.out.println(ob.applyAsDouble(102));

	}
}
