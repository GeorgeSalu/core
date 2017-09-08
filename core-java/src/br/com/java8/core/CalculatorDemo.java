package br.com.java8.core;

import br.com.java8.core.util.Calculator;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator cal = (int a,int b) -> a+b;
		int res = cal.add(5, 6);
		System.out.println(res);
		
	}
}
