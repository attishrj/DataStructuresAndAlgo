package com.java.basics;

public class GarbageCollector {
	String s;
	

	public GarbageCollector(String s) {
		super();
		this.s = s;
	}
	public static void main(String[] args) throws Throwable {
		GarbageCollector obj=new GarbageCollector("Raj");
	String s=new String("Attish");
	s=null;
	obj.finalize();
	obj=null;
	System.gc();
	System.out.println("End of main");
	
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
}
