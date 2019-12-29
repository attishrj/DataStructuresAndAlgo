package com.java.geeks.inheritance;

public class ChildClass extends ParentClass {
 
	int a;
	private ChildClass(int num1, int num2) {
		//super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	//If parent class have param cons, child class cannot have no-args cons
	
	/*public ChildClass() {
		// TODO Auto-generated constructor stub
	}*/
	
	public void setA(int a)
	{
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public void display1()
	{
		System.out.println(a);
	}

}
