package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DivideAndRemainderDemo {
	public static void main(String[] args) {
		
		MathContext mc = new MathContext(2, RoundingMode.FLOOR);
		BigDecimal bdec = new BigDecimal("123.56");
		BigDecimal[] bdecRes = bdec.divideAndRemainder(new BigDecimal("23.43"), mc);
		System.out.println("a/b: " + bdecRes[0]);
		System.out.println("a % b: " + bdecRes[1]);
		
	}
}
