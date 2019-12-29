package com.java.depth.exception;

public class TestExceptionStack {

	public static void main(String[] args) {
		TestExceptionStack obj = new TestExceptionStack();
		obj.doStuff();

	}

	private void doStuff() {
		domoreStuff();
		System.out.println(10 / 0);

	}

	private void domoreStuff() {
		System.out.println("Hello");

	}

}
