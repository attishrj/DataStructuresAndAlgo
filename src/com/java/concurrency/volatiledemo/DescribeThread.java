package com.java.concurrency.volatiledemo;

import java.util.concurrent.atomic.AtomicBoolean;

public class DescribeThread {
	
	AtomicBoolean isFalg;
	
	public AtomicBoolean isFalg() {
		return isFalg;
	}

	public void setFalg(boolean value) {
		this.isFalg = value;
	}
	public void inLoops()
	{
		for (int i = 0; i < 5; i++) {
			wish();
		}
		
	}

	public void wish()
	{
		if(isFalg() != null)
		{
			System.out.println("Inside the processing");
			return;
		}
		System.out.println("outside the processing");
	}
	

}
