package br.com.java8.stream;

import java.util.List;

import br.com.java8.stream.dto.UserFilter;

public class FilterReduce {
	public static void main(String[] args) {
		
		List<UserFilter> list = UserFilter.getUsers();
		
		list.stream().filter(u -> u.getName().endsWith("sh"))
						.mapToInt(u -> u.getAge()).reduce((a,b) -> a+b)
						.ifPresent(s -> System.out.println("Sum of age of users ending name with 'sh': "+ s));
		
	}
}
