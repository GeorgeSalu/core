package br.com.java6.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DivideDemo {
	public static void main(String[] args) {
		
		BigDecimal bdec = new BigDecimal("706");
		BigDecimal bdecRes = bdec.divide(new BigDecimal("20"));
		System.out.println("Divide: " + bdecRes);

		MathContext mc = new MathContext(2, RoundingMode.FLOOR);	
		BigDecimal bdecMath = bdec.divide(new BigDecimal("20"), mc);
		System.out.println("Divide using MathContext: " + bdecMath);
		
	}
}
