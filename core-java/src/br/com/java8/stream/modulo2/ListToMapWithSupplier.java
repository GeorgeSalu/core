package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.PersonCollect;

public class ListToMapWithSupplier {
	public static void main(String[] args) {
		
		List<PersonCollect> list = new ArrayList<PersonCollect>();
		list.add(new PersonCollect(100, "George"));
		list.add(new PersonCollect(200, "Nazare"));
		list.add(new PersonCollect(300, "Jorge"));

		LinkedHashMap<Integer, String> map = list.stream().collect(Collectors.toMap(PersonCollect::getId, PersonCollect::getName,
					(x,y) -> x+", "+y,LinkedHashMap::new));
		
		map.forEach((x,y) -> System.out.println("Key : "+x+", Value: "+y));
		
	}
}
