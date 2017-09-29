package br.com.java6.biginteger;

import java.math.BigInteger;

public class PowDemo {
	public static void main(String[] args) {
		int exponent = 7;
		BigInteger bint = new BigInteger("12");
		BigInteger bintRes = bint.pow(exponent);
		System.out.println("Result: " + bintRes);
	}
}
