package br.com.java7.core;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentLinkedDequeDemo {
	
	static ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<String>();
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ThreadOne elementAdd = new ConcurrentLinkedDequeDemo().new ThreadOne();
		ThreadTwo elementGet = new ConcurrentLinkedDequeDemo().new ThreadTwo();
		executorService.execute(elementAdd);
		executorService.execute(elementGet);
		executorService.shutdown();
		
	}
	
	class ThreadOne implements Runnable {

		@Override
		public void run() {
			for(int i = 0;i < 5;i++){
				cld.add("A"+i);
			}
		}
		
	}
	
	class ThreadTwo implements Runnable {

		@Override
		public void run() {
			for(int i = 0;i < 5;i++) {
				String s = cld.poll();
				System.out.println("Element received is : "+s);
			}
		}
		
	}
	
}
