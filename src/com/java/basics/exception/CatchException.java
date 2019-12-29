package com.java.basics.exception;

public class CatchException {

	public static void main(String[] args) {
		int i=50;
		int j=0;
		int data;
		try
		{
		data=i/j; //may throw exception 
		System.out.println(" "+data);
		}
            // handling the exception
		catch(Exception e)
		{
			e.printStackTrace();
             // resolving the exception in catch block
			
			try {
				System.out.println("here " + i / (j + 0));
			}
			catch (ArithmeticException e2) {
				System.out.println("In nested catch" +e.getMessage());
			}
			finally {
				System.out.println("In child finally block ");
				
				// TODO: handle finally clause
			}
			
		}
		finally {
			System.out.println("In main finally block");
		}

	}

}
