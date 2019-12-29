package com.java.newthread.deadlock;

public class ThreadJoin extends Thread {
	public static ThreadJoin mt;
	@Override
	public void run() {
		try {
			mt.join();
			
			for(int i=0;i<10;i++)
			{
				System.out.println(mt.getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
