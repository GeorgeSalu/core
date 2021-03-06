package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;

import br.com.java8.stream.dto.Book;
import br.com.java8.stream.dto.BookComparator;
import br.com.java8.stream.dto.Writer;

public class FlatMapWithArrayOfObject {
	public static void main(String[] args) {
		
		List<Book> books = Arrays.asList(new Book(10, "AAA"), new Book(20, "BBB"));
    	Writer w1 = new Writer("Mohan", books);
    	books = Arrays.asList(new Book(30, "CCC"), new Book(15, "DDD"));
    	Writer w2 = new Writer("Sohan", books);    	
    	books = Arrays.asList(new Book(45, "EEE"), new Book(25, "FFF"));
    	Writer w3 = new Writer("Vikas", books);
    	books = Arrays.asList(new Book(5, "GGG"), new Book(15, "HHH"));
    	Writer w4 = new Writer("Ramesh", books);
        Writer[][] writerArray = {{w1,w2},{w3,w4}};
		
        Book book = Arrays.stream(writerArray).flatMap(row -> Arrays.stream(row))
        				.flatMap(writer -> writer.getBooks().stream()).max(new BookComparator()).get();
        
        System.out.println("Name : "+book.getName()+", Price : "+book.getPrice());
        
	}
}
