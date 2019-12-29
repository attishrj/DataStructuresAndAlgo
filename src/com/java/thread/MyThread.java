package com.java.thread;

public class MyThread extends Thread {

	public void run() {
		try {
			//super.run();
			for (int i = 0; i <10; i++) {
				
				System.out.println ("Child Thread " );
				Thread.yield();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 
	}

}
