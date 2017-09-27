package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RemainderDemo {
	public static void main(String[] args) {
		
		BigDecimal bdec = new BigDecimal("700.588");
		MathContext mc = new MathContext(2, RoundingMode.CEILING);
		BigDecimal bdecMath = bdec.remainder(new BigDecimal("21.46"), mc);
		System.out.println("a % b using MathContext : " + bdecMath);
		
	}
}
