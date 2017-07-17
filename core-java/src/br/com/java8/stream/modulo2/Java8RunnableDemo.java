package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.java8.stream.dto.BookRunnable;

public class Java8RunnableDemo {
	public static void main(String[] args) {
		
		final List<BookRunnable> list = Arrays.asList(new BookRunnable(1, "Ramayan"),new BookRunnable(2, "Mahabharat"));
		Runnable r1 = () -> list.forEach(BookRunnable::print);
		Thread th1 = new Thread(r1);
		th1.start();
		
		Runnable r2 = () -> {
			Consumer<BookRunnable> style = (BookRunnable b) -> System.out.println("Book id : "+b.getId()+", Book Name : "+b.getName());
			list.forEach(style);
		};
		
		Thread th2 = new Thread(r2);
		th2.start();
		
	}
}
