package br.com.java8.stream;

import java.util.List;

import br.com.java8.stream.dto.UserFilter;

public class FilterFindFirstAndForEach {
	public static void main(String[] args) {
		
		List<UserFilter> list = UserFilter.getUsers();
		System.out.println("------ Using findFirst ------");
		UserFilter user = list.stream().filter(u -> u.getName().endsWith("sh")).findFirst().orElse(null);
		
		System.out.println(user.getName());
		System.out.println("----- Using ForEach -----");
		list.stream().filter(u -> u.getName().endsWith("sh")).forEach(u -> System.out.println(u.getName()));
		
	}
}
