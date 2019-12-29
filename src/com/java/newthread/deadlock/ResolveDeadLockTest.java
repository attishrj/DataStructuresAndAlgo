package com.java.newthread.deadlock;

public class ResolveDeadLockTest {

	public static void main(String[] args) {
		ResolveDeadLockTest test = new ResolveDeadLockTest();
		 
        final A a = test.new A();
        final B b = test.new B();
        
        Runnable block1 =new Runnable() {
			
			@Override
			public void run() {
				 synchronized (a) {
	                    try {
	                        // Adding delay so that both threads can start trying to
	                        // lock resources
	                        Thread.sleep(100);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                    // Thread-1 have A but need B also
	                    synchronized (b) {
	                        System.out.println("In block 1");
	                    }
				 }
			}
		};

	}

}
