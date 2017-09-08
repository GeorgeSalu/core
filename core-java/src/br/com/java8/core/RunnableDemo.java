package br.com.java8.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
	public static void main(String[] args) {
		
		final ExecutorService executorService = Executors.newSingleThreadExecutor();
		Runnable r = () -> System.out.println("Lambda Expression Test with Runnable");
		executorService.execute(r);
		
	}
}
