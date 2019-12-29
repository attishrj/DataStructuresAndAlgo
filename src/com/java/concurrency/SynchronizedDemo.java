package com.java.concurrency;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d=new Display();
		MyThread mt1=new MyThread(d, "Dhoni");
		MyThread mt2=new MyThread(d, "Tendulkar");
		Thread t1=new Thread(mt1);
		t1.start();
		Thread t2=new Thread(mt2);
		t2.start();
		

	}

}
