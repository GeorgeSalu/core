package br.com.java6.rentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyDemo implements Task {
	final ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void performTask() {
		try {
			reentrantLock.lockInterruptibly();

			try {
				System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
				System.out.println("Work on progress...");
				Thread.sleep(2000);
			} finally {
				System.out.println(Thread.currentThread().getName() + ": Lock released.");
				reentrantLock.unlock();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}