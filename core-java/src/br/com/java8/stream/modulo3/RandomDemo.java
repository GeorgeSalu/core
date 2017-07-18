package br.com.java8.stream.modulo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo {
	
	private static final List<Integer> VALID_PWD_CHARS = new ArrayList<>();

	static {
		IntStream.rangeClosed('0', '9').forEach(VALID_PWD_CHARS::add);    
	    IntStream.rangeClosed('a', 'z').forEach(VALID_PWD_CHARS::add);    
	}
	
	public static void main(String[] args) {
		
		int passwordLength = 8;
		System.out.println("-- Generated Password ----");
		for(int i = 0;i < 5;i++){
			
			new Random().ints(passwordLength,0,VALID_PWD_CHARS.size())
					.map(VALID_PWD_CHARS::get).forEach(s -> System.out.print((char) s));
			
			System.out.println();
		}
		
		
	}
}
