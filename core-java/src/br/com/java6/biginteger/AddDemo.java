package br.com.java6.biginteger;

import java.math.BigInteger;

public class AddDemo {
	public static void main(String[] args) {
		
		BigInteger bint = new BigInteger("234");
		BigInteger bintRes = bint.add(new BigInteger("450"));
		
		System.out.println("Result = "+bintRes);
	}
}
