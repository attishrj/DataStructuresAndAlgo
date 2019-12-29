package com.java8.reference.constructor;

public class Sample {
	int x=5;
	public Sample() {
		System.out.println("No args Constructor");
	}

	Sample(String s) {
		System.out.println("Args Constructor");
	}
   void display()
   {
	   System.out.println("Sample.display() "+x);
   }
}
