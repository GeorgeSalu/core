package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PowDemo {
	public static void main(String[] args) {
		
		int exponent = 7;
		MathContext mc = new MathContext(2, RoundingMode.CEILING);
		BigDecimal bdec = new BigDecimal("12");
		BigDecimal bdecres = bdec.pow(exponent, mc);
		System.out.println("Pow: " + bdecres);
		
	}
}
