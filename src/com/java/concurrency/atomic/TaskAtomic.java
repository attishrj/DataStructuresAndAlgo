package com.java.concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TaskAtomic implements Runnable {
	private final AtomicInteger number;
	

	public TaskAtomic() {
		this.number = new AtomicInteger();
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			number.set(i);
			
		}

	}

}
