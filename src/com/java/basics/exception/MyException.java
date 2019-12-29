package com.java.basics.exception;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
	public static void main(String[] args) {
		try {
			int b=0;
			int a=7/b;
			System.out.println(a);
			throw new MyException("");
			
		}
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}