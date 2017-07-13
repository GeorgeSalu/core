package br.com.java8.stream;

import java.util.List;

import br.com.java8.stream.dto.UserFilter;

public class FilterMapToIntAndSum {
	public static void main(String[] args) {
		
		List<UserFilter> list = UserFilter.getUsers();
		
		System.out.println("--- Sum of age between the user id 2 and 4");
		int sum = list.stream().filter(u -> u.getId() >= 2 && u.getId() <= 4).mapToInt(u -> u.getAge()).sum();
		
		System.out.println("Sum : "+sum);
		
	}
}
