package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class UnscaledValueDemo {
	public static void main(String[] args) {
		System.out.println("unscaledValue for 0.0 : " + new BigDecimal("0.0").unscaledValue());
		System.out.println("unscaledValue for 134.23: " + new BigDecimal("134.23").unscaledValue());
		System.out.println("unscaledValue for -13.231: " + new BigDecimal("-13.231").unscaledValue());
	}
}
