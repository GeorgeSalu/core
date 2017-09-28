package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class CompareToDemo {
	public static void main(String[] args) {
		System.out.println(new BigDecimal("300.43").compareTo(new BigDecimal("150.12")));
		System.out.println(new BigDecimal("200.42").compareTo(new BigDecimal("350.56")));
		System.out.println(new BigDecimal("140.56").compareTo(new BigDecimal("140.21")));
	}
}
