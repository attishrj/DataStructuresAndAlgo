package com.java.depth.exception;

public class TryMultiplecatch {

	public static void main(String[] args) {
		TryMultiplecatch obj=new TryMultiplecatch();
		int number=5;
		System.out.println(" ");obj.method(number);

	}

	private void method(int number) {
		
		try {
			number=number/0;
		} catch (ArithmeticException e) {
			System.out.println("in method exception");
			e.printStackTrace();
		}
		finally {
			
			
			
			
		}
		
		catch (Exception e) {
			System.out.println("in main exception");
		e.printStackTrace();
		}
	}

}
