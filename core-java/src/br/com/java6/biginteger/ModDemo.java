package br.com.java6.biginteger;

import java.math.BigInteger;

public class ModDemo {
	public static void main(String[] args) {
		System.out.println("32 mod 7= " + new BigInteger("32").mod(new BigInteger("7")));
		System.out.println("32 % 7= " + new BigInteger("32").remainder(new BigInteger("7")));

		System.out.println("-32 mod 7= " + new BigInteger("-32").mod(new BigInteger("7")));
		System.out.println("-32 % 7= " + new BigInteger("-32").remainder(new BigInteger("7")));
	}
}