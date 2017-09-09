package br.com.java7.core;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;
import java.util.concurrent.locks.ReentrantLock;

public class Locker implements ManagedBlocker {
	final ReentrantLock rtlock;
	boolean isLocked = false;

	Locker(ReentrantLock rtlock) {
		this.rtlock = rtlock;
	}

	public boolean block() {
		if (!isLocked) {
			rtlock.lock();
		}
		return true;
	}

	public boolean isReleasable() {
		return isLocked || (isLocked = rtlock.tryLock());
	}
}