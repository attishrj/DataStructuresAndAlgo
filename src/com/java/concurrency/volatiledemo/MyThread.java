package com.java.concurrency.volatiledemo;

public class MyThread implements Runnable {
	String name;
	DescribeThread th;

	public MyThread(String name, DescribeThread thread) {
		this.name = name;
		this.th = thread;
	}

	void isFlagTrue(boolean value) {
		th.setFalg(value);
	}

	@Override
	public void run() {
		th.inLoops();

	}

}
