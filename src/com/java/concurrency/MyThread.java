package com.java.concurrency;

public class MyThread implements Runnable {
	Display display;
	String name;
	

	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}


	@Override
	public void run() {
		//display.wishSynchronized(name);
		display.wishReentrantLock(name);

	}

}
