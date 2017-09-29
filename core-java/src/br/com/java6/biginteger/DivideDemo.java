package br.com.java6.biginteger;

import java.math.BigInteger;

public class DivideDemo {
	public static void main(String[] args) {
		
		BigInteger bint = new BigInteger("500");
		BigInteger bintRes = bint.divide(new BigInteger("25"));
		System.out.println("Result : "+bintRes);
		
	}
}
