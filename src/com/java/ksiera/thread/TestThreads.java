package com.java.ksiera.thread;

public class TestThreads {

	public static void main(String[] args) {
	/*	MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();*/
		MyThread myThread=new MyThread();
		Thread t2=new Thread(myThread);
		System.out.println("t2.getState() "+t2.getState());
		t2.start();
		System.out.println("after start t2.getState() "+t2.getState());
		

	}

}
