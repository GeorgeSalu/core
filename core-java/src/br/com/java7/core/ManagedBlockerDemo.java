package br.com.java7.core;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;

public class ManagedBlockerDemo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);
		bq.put("A");
		bq.put("B");
		QueueManagedBlocker<String> blocker = new QueueManagedBlocker<String>(bq);
		ForkJoinPool.managedBlock(blocker);
		System.out.println(blocker.getValue());
	}
}