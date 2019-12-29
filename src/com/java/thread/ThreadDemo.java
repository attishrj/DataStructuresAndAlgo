package com.java.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		/**
		with extending thread**/
		
		/*MyThread t=new MyThread();
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread");
		}*/
		
		/**with runnable interface**/
		MyRunnable runnable=new MyRunnable();
		Thread th=new Thread(runnable);
		th.start();

	}

}
