package br.com.java6.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, User> map = new LinkedHashMap<Integer, User>();
		User u1 = new User("A");
		User u2 = new User("B");
		User u3 = new User("C");
		map.put(1, u1);
		map.put(2, u2);
		map.put(3, u3);
		System.out.println(map.size());
		System.out.println(map.get(1).name);
		// iterate LinkedHashMap
		for (Map.Entry<Integer, User> mapEntry : map.entrySet()) {
			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue().name);
		}
	}
}

class User {
	public String name;

	public User(String name) {
		this.name = name;
	}
}