package com.java.basics;

public class MoreStaticNonStatic {
	String name="RAJ";
//	MoreStaticNonStatic obj;
	void setName(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	static void staticNameset(String newNam)
	{
		new MoreStaticNonStatic().setName(newNam);
	}

	public static void main(String[] args) {
		MoreStaticNonStatic obj=new MoreStaticNonStatic();
		//obj.setName("HELLO");
		staticNameset("HELLO");
		
	}

}
