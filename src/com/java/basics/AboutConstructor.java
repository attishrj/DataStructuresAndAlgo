package com.java.basics;

public class AboutConstructor {
	private int x,y;
	

	public AboutConstructor(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x=="+x);
		System.out.println("y=="+y);
	}


	public static void main(String[] args) {
		
    AboutConstructor obj=new AboutConstructor();
	}

}
