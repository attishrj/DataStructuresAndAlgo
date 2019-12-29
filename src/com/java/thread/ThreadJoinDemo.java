package com.java.thread;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MythreadJoin t=new MythreadJoin();
		MythreadJoin.mt=Thread.currentThread();
		
  t.start();
  t.wait();
  
 // t.join(2500);
  for(int i= 0;i<10;i++)
  {
  System.out.println("Rama Thread : "
		  + Thread.currentThread().getName()); 
	}
	}
}
