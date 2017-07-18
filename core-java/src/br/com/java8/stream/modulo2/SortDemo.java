package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.java8.stream.dto.PersonComparatorByName;
import br.com.java8.stream.dto.PersonList;

public class SortDemo {
	public static void main(String[] args) {
		
		List<PersonList> list = new ArrayList<PersonList>();
		list.add(new PersonList(1, "Mahesh"));
		list.add(new PersonList(2, "Ram"));
		list.add(new PersonList(3, "Krishna"));  

		Consumer<PersonList> style = (PersonList p) -> System.out.println("Id : "+p.getPid()+", Name : "+p.getName());
		System.out.println("---- before Sorting ----");
		list.forEach(style);
		list.sort(new PersonComparatorByName());
		System.out.println("---- After Sorting ----");
		list.forEach(style);
	}
}
