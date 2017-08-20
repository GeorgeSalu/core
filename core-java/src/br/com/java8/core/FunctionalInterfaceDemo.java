package br.com.java8.core;

import br.com.java8.core.function.Add;
import br.com.java8.core.function.Display;
import br.com.java8.core.function.Multiply;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		Display display = () -> "functional interface with no arguments";
		String s = display.show();
		System.out.println(s);
		
		Multiply multiply = (int num) -> num * 10;
		int res = multiply.multiply(5);
		System.out.println(res);
		
		Add add = (int a, int b) -> a + b;
		int rs = add.addData(15, 20);
		System.out.println(rs);
		
	}
}
