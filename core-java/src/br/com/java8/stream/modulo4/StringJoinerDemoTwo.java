package br.com.java8.stream.modulo4;

import java.util.StringJoiner;

public class StringJoinerDemoTwo {
	public static void main(String[] args) {

		StringJoiner sjObj = new StringJoiner(",", "{", "}");

		sjObj.add("AA").add("BB").add("CC").add("DD").add("EE");
		String output = sjObj.toString();
		System.out.println(output);

		StringJoiner otherSj = new StringJoiner(":", "(", ")");
		otherSj.add("10").add("20").add("30");
		System.out.println(otherSj);

		StringJoiner finalSj = sjObj.merge(otherSj);
		System.out.println(finalSj);

		System.out.println("Length of Final String:" + finalSj.length());

	}
}
