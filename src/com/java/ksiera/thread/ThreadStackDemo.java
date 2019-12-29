package com.java.ksiera.thread;

public class ThreadStackDemo {

	public static void main(String[] args) {
		int x=51;
		System.out.println("ThreadStackDemo.main()"+x);
		method2();
		
	}

	private static void method2() {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("My Runnable ");
				
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Annonymous Runnable ");
			}
		});
		t1.start();
		
	}
}
