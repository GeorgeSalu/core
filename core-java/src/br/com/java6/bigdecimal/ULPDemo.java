package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class ULPDemo {
	public static void main(String[] args) {
		BigDecimal bdec = new BigDecimal("234.87");
		System.out.println("ULP of 234.87 : " + bdec.ulp());
	}
}
