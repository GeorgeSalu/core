package br.com.java6.biginteger;

import java.math.BigInteger;

public class MultiplyDemo {
	public static void main(String[] args) {
		
		BigInteger bint = new BigInteger("50");
		BigInteger intRes = bint.multiply(new BigInteger("30"));
		System.out.println("Result = "+intRes);
	}
}
