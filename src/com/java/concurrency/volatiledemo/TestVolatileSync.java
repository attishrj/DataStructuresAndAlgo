package com.java.concurrency.volatiledemo;

public class TestVolatileSync {

	public static void main(String[] args) {
		DescribeThread th=new DescribeThread();
		MyThread mt1=new MyThread("Thread1", th);
		MyThread mt2=new MyThread("Thread1", th);
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		mt2.isFlagTrue(false);
		mt1.isFlagTrue(true);
		t1.start();
		t2.start();
		
		

	}

}
