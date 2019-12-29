package com.java.basics;
import java.io.IOException;

public class Child extends Parent{
	
	@Override
	protected void method() throws IOException{
		// TODO Auto-generated method stub
		//super.super.method();
		 System.out.println("Child::show() called");
	
	
	}
	@Override
	int display() {
		// TODO Auto-generated method stub
		int p=super.parent;
		return super.display();
	}
	
	public static void main(String[] args) throws IOException {
		Child obj=new Child();
		
		obj.method();
		System.out.println(obj.parent);
		System.out.println();
		Object A=new Object();
	   System.out.println(A.getClass());
		//method();
		
	}

}
