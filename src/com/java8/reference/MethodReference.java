package com.java8.reference;

public class MethodReference {
	public MethodReference() {
		System.out.println("Here");
	}

	int m1() {
		System.out.println("My thread");
		return 5;
	}

	public static void main(String[] args) {
		MethodReference obj = new MethodReference();
		Runnable r = obj::m1;
		Runnable s = new MethodReference()::m1;
		for (int i = 0; i < 4; i++) {
			Thread t = new Thread(new MethodReference()::m1);
			t.start();
		}
	}
}
