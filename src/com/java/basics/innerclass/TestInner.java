package com.java.basics.innerclass;

public class TestInner {
	public static void main(String[] args) {
		
		DemoOuterClass obj=new DemoOuterClass();
		obj.func();
		obj.new DemoInnerClass().get();
		//DemoInnerClass
		//1st way
		DemoOuterClass.DemoInnerClass innerobj=obj.new DemoInnerClass();
		//2nd way
		DemoOuterClass.DemoInnerClass ioj=new DemoOuterClass().new DemoInnerClass();
	}

}
