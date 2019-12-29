package com.java.basics;

public class Ambiguity {
	public void display(Integer a)
	{
		System.out.println("Integer ");
	}
	public void display(Object a)
	{
		System.out.println("Object ");
	}

	public void display(String a)
	{
		System.out.println("String ");
	}


	public static void main(String[] args) {
		Ambiguity obj=new Ambiguity();
		//String b=null;
		obj.display(null);

	}

}
