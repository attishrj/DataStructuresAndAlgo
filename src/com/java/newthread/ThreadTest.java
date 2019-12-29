package com.java.newthread;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running...");
		
	}
	public static void main(String[] args) {
		ThreadTest t=new ThreadTest();
		Thread thread=new Thread(t);
		thread.start();
		System.out.println("ThreadTest.main()"+thread.getState());
		thread.stop();
		thread.start();
	}

}
