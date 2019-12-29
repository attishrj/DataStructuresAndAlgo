package com.java.basics.inheritance;

public class Base {

	int a;
	int b;
	String s="parent";
	
	public Base() {
		// TODO Auto-generated constructor stub
	}
	public Base(int a) {
		System.out.println("Constructor Base.Base()");
	}
	
	{
		System.out.println("Base.enclosing_method()");

	}

	static {
		System.out.println("static Base.enclosing_method()");
	}


	public int sum(int c) {
		c = a + b;
		return c;
	}

	public final int sub(int c) {
		c = a - b;
		return c;
	}
}
