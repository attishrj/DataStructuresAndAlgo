package com.java.ksiera.thread.deadLock;

public class A {

	synchronized void displayA(B b) {
		System.out.println("Thread1 starts executing displayA ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call B's last method ");
		b.lastB();
	}

	synchronized void lastA() {
		System.out.println("Inside A's last method");
	}
}
