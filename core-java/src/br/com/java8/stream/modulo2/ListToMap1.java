package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Mohan");
		list.add("Sohan");
		list.add("Mahesh");
		
		Map<String, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s -> s));
		map.forEach((x,y) -> System.out.println("Key : "+x+", Value : "+y));
		
		
	}
}
