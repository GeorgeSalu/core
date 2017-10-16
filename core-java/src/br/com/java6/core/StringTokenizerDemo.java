package br.com.java6.core;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "A,B,C,D";
		String delim = ",";
		StringTokenizer st = new StringTokenizer(str, delim);

		System.out.println("Number o token is:" + st.countTokens());
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}