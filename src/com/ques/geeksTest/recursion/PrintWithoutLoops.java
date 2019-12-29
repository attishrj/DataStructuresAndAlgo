package com.ques.geeksTest.recursion;

public class PrintWithoutLoops {
	public static void main(String[] args) {
		
		int n=1000000000;
		printRec(n);
	}

	private static void printRec(int n) {
		if(n<=0)
		{
			return;
		}
		printRec(n-1);
		System.out.print(n+" ");
		
	}

}
