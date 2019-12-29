package com.ques.geeksTest.bitWise;

public class JavaBit {

	public static void main(String[] args) {
	int x=3;
	int y=3;
	
	int i = x&y;
	System.out.println(i);

	int k=8;
	System.out.println(~k);
	Runtime runtime = Runtime.getRuntime();
	runtime.freeMemory();
	}

}
