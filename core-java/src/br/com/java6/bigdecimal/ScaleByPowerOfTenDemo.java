package br.com.java6.bigdecimal;

import java.math.BigDecimal;

public class ScaleByPowerOfTenDemo {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("12.5");
		System.out.println("Result: " + b1.scaleByPowerOfTen(4));
	}
}
