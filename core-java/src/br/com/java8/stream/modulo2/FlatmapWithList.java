package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;

import br.com.java8.stream.dto.Book;
import br.com.java8.stream.dto.BookComparator;
import br.com.java8.stream.dto.Writer;

public class FlatmapWithList {
	public static void main(String[] args) {
		
		List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	Writer w1 = new Writer("Mohan", books);
    	books = Arrays.asList(new Book(30, "XXX"), new Book(15, "ZZZ"));
    	Writer w2 = new Writer("Sohan", books);    	
    	List<Writer> writers = Arrays.asList(w1, w2);
		
    	Book book = writers.stream().flatMap(writer -> writer.getBooks().stream())
    					.max(new BookComparator()).get();
    	
    	System.out.println("Name : "+book.getName()+", Price : "+book.getPrice());
    	
	}
}
