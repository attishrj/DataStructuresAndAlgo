package com.java8;

public class MyInterface implements JAVA8Interface1, JAVA8Interface2 {

	@Override
	public void defaultMethod() {
		JAVA8Interface1.super.defaultMethod();
		
	}

	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		MyInterface obj=new MyInterface();
		JAVA8Interface1.staticMethod();
		obj.defaultMethod();
	}

}
