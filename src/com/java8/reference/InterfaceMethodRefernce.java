package com.java8.reference;

interface Inf{
	int add(int a,int b);
}
public class InterfaceMethodRefernce {

	public int sum(int x, int y)
	{
		int z = x+y;
		System.out.println("The sum is " +z);
		return z;
	}
	
	public static void main(String[] args) {
		InterfaceMethodRefernce obj=new InterfaceMethodRefernce();
		Inf inf=(int c,int d)->
		{
			
			int e = c+d;
			System.out.println("The sum is " +e);
			return e;
		};
		inf.add(2, 4);
		
		Inf iobj=obj::sum;
		iobj.add(40, 90);
	}
}
