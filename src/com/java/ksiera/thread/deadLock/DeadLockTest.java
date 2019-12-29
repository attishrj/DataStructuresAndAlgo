package com.java.ksiera.thread.deadLock;

public class DeadLockTest {
	A a=new A();
	B b=new B();
	public void m1(Thread t)
	{
		t.start();
		a.displayA(b);//executed by main thread
	}

	public static void main(String[] args) {
		DeadLockTest obj=new DeadLockTest();
       Runnable r=()->
       {
    	    obj.b.displayB(obj.a);//executed by child thread
       };
       
       
       Thread t=new Thread(r);
       obj.m1(t);
	}

}
