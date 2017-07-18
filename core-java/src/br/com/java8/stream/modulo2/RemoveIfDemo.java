package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import br.com.java8.stream.dto.PersonList;

public class RemoveIfDemo {
	public static void main(String[] args) {
		
		List<PersonList> list = new ArrayList<PersonList>();
		list.add(new PersonList(1, "Mahesh"));
		list.add(new PersonList(2, "Ram"));
		list.add(new PersonList(3, "Krishna"));  

		Consumer<PersonList> style = (PersonList p) -> System.out.println("Id : "+p.getPid()+", Name : "+p.getName());
		System.out.println("--- Before delete ----");
		list.forEach(style);
		
		int pid = 2;
		Predicate<PersonList> personPredicate = p -> p.getPid() == pid;
		list.removeIf(personPredicate);
		System.out.println("--- After delete ----");
		list.forEach(style);
		
	}
}
