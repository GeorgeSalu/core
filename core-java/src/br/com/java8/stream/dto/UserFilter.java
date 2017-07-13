package br.com.java8.stream.dto;

import java.util.ArrayList;
import java.util.List;

public class UserFilter {

	private int id;
	private String name;
	private int age;

	public UserFilter(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static List<UserFilter> getUsers() {
		List<UserFilter> list = new ArrayList<UserFilter>();
		list.add(new UserFilter(1, "Dinesh", 20));
		list.add(new UserFilter(2, "Kamal", 15));
		list.add(new UserFilter(3, "Vijay", 25));
		list.add(new UserFilter(4, "Ramesh", 30));
		list.add(new UserFilter(5, "Mahesh", 18));
		return list;
	}
	
}
