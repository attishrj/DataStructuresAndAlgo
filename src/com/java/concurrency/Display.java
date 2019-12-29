  package com.java.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	//with synchronizec
	synchronized public void wishSynchronized(String name) {
		for (int i = 0; i <10; i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print( name +"\t");
			
		}
	}
	
	
	//with lock
	ReentrantLock l=new ReentrantLock();
	
		 public void wishReentrantLock(String name) {
			 l.lock();
			for (int i = 0; i <10; i++) {
				System.out.println("Good Morning");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print( name +"\t");
				
			}
			 l.unlock();
		}

	}


