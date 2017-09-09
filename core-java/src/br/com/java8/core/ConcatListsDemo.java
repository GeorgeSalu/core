package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.java8.core.util.Book;

public class ConcatListsDemo {
	public static void main(String[] args) {
		
		List<Book> list1 = new ArrayList<>();
		List<Book> list2 = new ArrayList<>();
		{
			list1.add(new Book("core java", 200));
			list1.add(new Book("spring mvc", 300));
			list1.add(new Book("freemarker", 150));
			
			list2.add(new Book("core java", 200));
			list2.add(new Book("spring mvc", 230));
			list2.add(new Book("hibernate", 300));
			
		}
		
		List<Book> list = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		list.forEach(b -> System.out.println(b.getName()+", "+b.getPrice()));
		
		//remove duplicates using distinct
		System.out.println("--- remove duplicates using distinct");
		list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		list.forEach(b -> System.out.println(b.getName()+", "+b.getPrice()));
		
	}
}
