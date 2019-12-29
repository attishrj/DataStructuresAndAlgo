package com.java.geeks.inheritance;

public class ParentClass {
	int num1;
	int num2;
	int num3=10;
	private ParentClass() {
		// TODO Auto-generated constructor stub
	}
	/*public ParentClass(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}*/
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	final public void display()
	{
		System.out.println(" num1  "+num1 +" "+num2);
	}
	 public void display(int num1)
	{
		System.out.println(" num1  "+num1 +" "+num2);
	}
	
	

}
