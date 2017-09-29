package br.com.java6.biginteger;

import java.math.BigInteger;

public class EqualsDemo {
	public static void main(String[] args) {
		System.out.println(new BigInteger("300").equals(new BigInteger("150")));
		System.out.println(new BigInteger("140").equals(new BigInteger("140")));
	}
}