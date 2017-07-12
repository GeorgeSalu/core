package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.Person;
import br.com.java8.stream.dto.StudentMap;

public class ListToAnotherList {
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Mohan", "student");
		Person p2 = new Person(2, "Sohan", "teacher");
		Person p3 = new Person(3, "Dinesh", "student");
		List<Person> personList = Arrays.asList(p1, p2, p3);
		
		List<StudentMap> stdList = personList.stream().filter(p -> p.getPersonType().equals("student"))
									.map(p -> new StudentMap(p.getId(), p.getName()))
									.collect(Collectors.toList());
		
		stdList.forEach(e -> System.out.println("Id : "+e.getId()+", Name : "+e.getName()));
		
	}
}
