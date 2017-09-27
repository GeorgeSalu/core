package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class DivideToIntegralValueDemo {
	public static void main(String[] args) {
		
		BigDecimal bdec = new BigDecimal("706");
		BigDecimal bdecRes = bdec.divideToIntegralValue(new BigDecimal("20"));
		System.out.println(" divideToIntegralValue : "+bdecRes);
		
	}
}
