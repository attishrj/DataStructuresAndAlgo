package com.java8;

public class RunnableLamba {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RunnableLamba.main(...).new Runnable() {...}.run()");
				
			}
		});
		t.setName("Thread t1");
		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		
		t.run();
		
		Runnable i;
		i=()->{
			System.out.println("Runnable lambda");
		};
		
	Thread myLamdaThread=new Thread(i);
	
	myLamdaThread.setName("myLamdaThread");
	myLamdaThread.start();
	System.out.println(myLamdaThread.getName());
	
	
	Thread LamdaThread=new Thread(()->System.out.println("Using lambda for runnable"));
	LamdaThread.start();
		
	}
   public static void printMessages()
   {
	   System.out.println("Hello");
   }
}
