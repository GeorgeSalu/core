package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class MinMaxDemo {
	public static void main(String[] args) {
		System.out.println("Min: " + new BigDecimal("300.34").min(new BigDecimal("150.87")));
		System.out.println("Max: " + new BigDecimal("300.34").max(new BigDecimal("150.87")));
	}
}
