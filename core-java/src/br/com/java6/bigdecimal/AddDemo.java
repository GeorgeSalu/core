package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AddDemo {
	public static void main(String[] args) {
		
		BigDecimal b = new BigDecimal("234.3");
		BigDecimal bres = new BigDecimal("450.23");
		System.out.println("Add : "+bres);
		
		MathContext mc = new MathContext(2,RoundingMode.DOWN);
		BigDecimal bdecMath = b.add(new BigDecimal("450.23"),mc);
		System.out.println("Add using MathContext : "+bdecMath);
		
	}
}
