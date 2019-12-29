package com.java.basics.inheritance;

public class ChildBase extends Base {
	String s="child";
	int z;
	 
	public ChildBase(int p)
	{
		
		super(30);
	}
	
	public ChildBase() {
		//super(20);
		this(50);
	
		System.out.println("Constructor ChildBase.ChildBase()");
		System.out.println("super. s "+super.s);
	}
	
	{
		System.out.println("ChildBase.enclosing_method()");
	}
	
	
	static {
		System.out.println("Static ChildBase.enclosing_method()");
	}
	public int subN(int c)
	{
		//InheritanceMain obj=new InheritanceMain();
		int d=super.sub(c);
		return d;
	}
	

}
