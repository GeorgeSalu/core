package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.java8.core.util.Book;

public class DistinctByProperty {
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
		
		list.stream().filter(distinctByKey(b -> b.getName()))
						.forEach(b -> System.out.println(b.getName()+","+b.getPrice()));
		
	}
	
	private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Map<Object, Boolean> seen = new ConcurrentHashMap<>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
	
}
