package com.java.thread;

public class MultithreadingDemo  extends Thread{
	
	@Override
	public void run() {
		try {
		//	super.run();
			 System.out.println ("Thread " + 
			         Thread.currentThread().getId() + 
			         " is running");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
 
	}
	

}
