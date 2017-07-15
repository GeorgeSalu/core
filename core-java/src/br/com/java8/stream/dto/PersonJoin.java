package br.com.java8.stream.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonJoin {

	private String name;
	private int age;

	public PersonJoin(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	

	public int getAge() {
		return age;
	}

	public static List<PersonJoin> getList() {
		List<PersonJoin> list = new ArrayList<>();
		list.add(new PersonJoin("Ram", 23));
		list.add(new PersonJoin("Shyam", 20));
		list.add(new PersonJoin("Shiv", 25));
		list.add(new PersonJoin("Mahesh", 30));
		return list;
	}

}
