package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class NegateDemo {
	public static void main(String[] args) {
		MathContext mc = new MathContext(2, RoundingMode.CEILING);
		BigDecimal bdec1 = new BigDecimal("-134.43", mc);
		System.out.println("negate() of -134.43 :" + bdec1.negate());
		BigDecimal bdec2 = new BigDecimal("155.33", mc);
		System.out.println("negate() of 155.33 :" + bdec2.negate());
	}
}
