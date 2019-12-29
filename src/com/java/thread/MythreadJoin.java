package com.java.thread;

public class MythreadJoin extends Thread {
	
	public static Thread mt;
	@Override
	public void run() {
		try {
			mt.join();
		for (int i = 0; i <3; i++) {
				// mt.start();
				Thread.sleep(2000);
				System.out.println("Seetha thread: "
						+ Thread.currentThread().getName()); 
		}
		} 
         
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	


}
}
