package br.com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.PersonCollect;

public class CollectToMap {
	public static void main(String[] args) {
		
		List<PersonCollect> list = new ArrayList<>();
		list.add(new PersonCollect(100, "Mohan"));
		list.add(new PersonCollect(200, "Sohan"));
		list.add(new PersonCollect(300, "Mahesh"));
		
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(PersonCollect::getId, PersonCollect::getName));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	
	}
}
