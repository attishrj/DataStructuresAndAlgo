package com.ques.hackerrank;

public class Test1 {

	public static void main(String[] args) {
		int sum=10;
		try {
			for(int i=-1;i<10;++i)
			{
				System.out.println("Value of i "+(i));
				sum/=i;
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			
			System.out.println(sum);
		}

	}

}
