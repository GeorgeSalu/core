package br.com.java8.stream.modulo3;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {
	public static void main(String[] args) {

		ToDoubleBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;
		System.out.println(ob.applyAsDouble(102, 305));

	}
}
