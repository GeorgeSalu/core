package br.com.java6.biginteger;

import java.math.BigInteger;

public class NegateDemo {
	public static void main(String[] args) {
		BigInteger bint1 = new BigInteger("-134");
		System.out.println("negate() of -134 :" + bint1.negate());
		BigInteger bint2 = new BigInteger("155");
		System.out.println("negate() of 155 :" + bint2.negate());
	}
}