package com.java.ksiera.thread.deadLock;

public class B {
	synchronized	void displayB(A a)
	{

		System.out.println("Thread1 starts executing display B ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call A's last method ");
		a.lastA();
	
		
		
	}
	synchronized void lastB()
	{

		System.out.println("Inside B's last method");
	
		
	}

}
