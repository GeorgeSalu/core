package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import br.com.java8.stream.dto.BookRunnable;

public class Java8RunnableDemoExecutor {
	public static void main(String[] args) {
		
		final List<BookRunnable> list = Arrays.asList(new BookRunnable(1, "Ramayan"),new BookRunnable(2, "Mahabharat"));
		ExecutorService service = Executors.newFixedThreadPool(2);
		Runnable r1 = () -> list.forEach(BookRunnable::print);
		service.execute(r1);

		Runnable r2 = () -> {
			Consumer<BookRunnable> style = (BookRunnable b) -> System.out.println("Book id : "+b.getId()+", Book Name : "+b.getName());
			list.forEach(style);
		};
		service.execute(r2);
		
	}
}
