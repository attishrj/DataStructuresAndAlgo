package com.java.depth.exception;

public class ThrowsPropafation {

	public static void main(String[] args) throws Exception {
		dostuff();

	}

	private static void dostuff() throws Exception  {
		doMorestuff();
		
	}

	private static void doMorestuff() throws Exception {
		System.out.println("Hello");
		//throw new Exception();
		Thread.sleep(10000);
		
	}

}
