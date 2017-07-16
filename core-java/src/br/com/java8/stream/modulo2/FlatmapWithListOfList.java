package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;

import br.com.java8.stream.dto.Book;
import br.com.java8.stream.dto.BookComparator;

public class FlatmapWithListOfList {
	public static void main(String[] args) {
		
		List<Book> list1 = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	List<Book> list2 = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
    	List<List<Book>> finalList = Arrays.asList(list1, list2);
		
    	Book book = finalList.stream().flatMap(list -> list.stream()).min(new BookComparator()).get();
    	System.out.println("Name : "+book.getName()+", Price : "+book.getPrice());
    	
	}
}
