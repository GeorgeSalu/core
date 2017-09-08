package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;

import br.com.java8.core.util.Book;

public class DistinctWithUserObjects {
	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<>();
		{
			list.add(new Book("core java", 120));
			list.add(new Book("core java", 130));
			list.add(new Book("core java", 130));
			list.add(new Book("freemarker", 150));
			list.add(new Book("spring mvc", 200));
			list.add(new Book("spring mvc", 200));
		}

		long l = list.stream().distinct().count();
		System.out.println("No of distinct books : "+l);
		list.stream().distinct().forEach(b -> System.out.println(b.getName()+","+b.getPrice()));
		
	}
}
