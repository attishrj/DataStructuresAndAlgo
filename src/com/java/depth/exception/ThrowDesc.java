package com.java.depth.exception;

public class ThrowDesc extends Exception {

	// case 1
	static ArithmeticException ex1;// new ArithmeticException();

	public static void main(String[] args) throws ThrowDesc {
		ThrowDesc obj = new ThrowDesc();
		// ArithmeticException ex=new ArithmeticException();
		System.out.println(" ex.getLocalizedMessage() " + obj.getMessage());
		throw obj;

	}

}
