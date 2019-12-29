package com.abstractinfo.and.interfaceinfo;

public class InterfaceTest implements BasicInterface {

	@Override
	public int operation(int a, int b) {
		return a+b;
		
	}
	public int operation(int a, int b,int c) {
		return (a+b)-c;
		
	}

	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		//obj.operation(a, b)

	}

}
