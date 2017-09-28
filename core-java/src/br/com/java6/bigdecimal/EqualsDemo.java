package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class EqualsDemo {
	public static void main(String[] args) {
		System.out.println(new BigDecimal("300.34").equals(new BigDecimal("150.67")));
		System.out.println(new BigDecimal("140.78").equals(new BigDecimal("140.78")));
	}
}
