package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AbsDemo {
	public static void main(String[] args) {
		
		BigDecimal b1 = new BigDecimal("-234.54");
		System.out.println(b1.abs());
		BigDecimal b2 = new BigDecimal("100.124");
		System.out.println(b2.abs());
		//Using MathContext
		MathContext mc = new MathContext(2, RoundingMode.CEILING);
		BigDecimal b3 = new BigDecimal("654.75");
		System.out.println(b3.abs(mc));
		
	}
}
