package com.java8;

public class MethodReference {
	
	public static  void printMessage()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		MethodReference obj=new MethodReference();
		Thread t=new Thread(()->obj.printMessage());
		System.out.println(t.getName());
		t.start();
		
		Thread t2=new Thread(MethodReference::printMessage);
		t2.start();
		
	}
 
}
