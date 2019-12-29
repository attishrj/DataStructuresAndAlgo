package com.java.ksiera.thread;

public class MyThread extends Thread {
	
	/*public MyThread() {
		//getState();
	}*/
	
	@Override
	public void run() {
		
		System.out.println("Imp job running in MyThread.run()");
	}@Override
	public State getState() {
		System.out.println("In run method super.getState()  " +super.getState());
		return super.getState();
	}
	

}
