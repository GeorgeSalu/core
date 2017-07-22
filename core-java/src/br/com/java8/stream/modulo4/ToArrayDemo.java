package br.com.java8.stream.modulo4;

import java.util.stream.Stream;

public class ToArrayDemo {
	public static void main(String[] args) {
		
		Object[] ob = Stream.of("A","B","C","D").toArray();
		
		for(Object o :ob){
			System.out.println(o.toString());
		}
		
	}
}
