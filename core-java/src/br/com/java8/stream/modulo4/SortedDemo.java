package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("DC","CD","AD");
         list.stream().sorted().forEach(s->System.out.println(s));
		
	}
}
