package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ToEngineeringStringDemo {
	public static void main(String[] args) {
		MathContext mc = new MathContext(2, RoundingMode.CEILING);
		BigDecimal bdec = new BigDecimal("234.87", mc);
		System.out.println("Result: "+ bdec);
		System.out.println("Result with toEngineeringString(): "+bdec.toEngineeringString());
	}
}
