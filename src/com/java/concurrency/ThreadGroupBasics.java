package com.java.concurrency;

public class ThreadGroupBasics {

	public static void main(String[] args) {
	System.out.println("  - "+Thread.currentThread().getThreadGroup().getParent().getName());

	}

}
