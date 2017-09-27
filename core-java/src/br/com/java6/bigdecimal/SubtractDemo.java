package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SubtractDemo {
	public static void main(String[] args) {
		
		BigDecimal b = new BigDecimal("50.35");
		BigDecimal bdec = b.subtract(new BigDecimal("34.765"));
		System.out.println("Subtract : "+bdec);
		
		MathContext mc = new MathContext(2, RoundingMode.FLOOR);
		BigDecimal bdecMath = b.subtract(new BigDecimal("34.765"),mc);
		System.out.println("Subtract using MathContext : "+bdecMath);
		
	}
}
