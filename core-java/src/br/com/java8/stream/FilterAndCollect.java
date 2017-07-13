package br.com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.UserFilter;

public class FilterAndCollect {
	public static void main(String[] args) {

		List<UserFilter> list = UserFilter.getUsers();
		
		long count = list.stream().filter(u -> u.getName().endsWith("sh")).collect(Collectors.counting());
		
		System.out.println("Number of users ending name with 'sh' : "+count);
	
	}
}
