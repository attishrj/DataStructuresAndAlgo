package com.java.concurrency.atomic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tasklock implements Runnable {
	private Lock lock;
	private int number;
	public Tasklock() {
		this.lock=new ReentrantLock();
	}

	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			lock.lock();
			number=i;
			lock.unlock();
			
		}

	}

}
