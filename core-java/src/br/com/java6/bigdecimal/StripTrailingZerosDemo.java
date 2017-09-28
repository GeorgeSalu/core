package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class StripTrailingZerosDemo {
	public static void main(String[] args) {
		BigDecimal b = new BigDecimal("120000.00");
		System.out.println("Result: " + b.stripTrailingZeros());
	}
}
