package com.java.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentraclLockBasicd {
	public static void main(String[] args) {
		ReentrantLock reentrantLock = new ReentrantLock();
		reentrantLock.lock();
		reentrantLock.lock();
		reentrantLock.unlock();
		System.out.println(reentrantLock.getHoldCount());
		reentrantLock.unlock();
		System.out.println(reentrantLock.isLocked());

	}

}
