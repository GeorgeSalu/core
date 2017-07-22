package br.com.java8.stream.modulo4;

import java.util.StringJoiner;

public class StringJoinerDemoOne {
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-");
        sj.add("Ram");
        System.out.println(sj);
        sj.add("Shyam").add("Mohan");
        System.out.println(sj);
		
	}
}
