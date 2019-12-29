package com.java8;

@FunctionalInterface
public interface FuncInterfaceInheritB extends FuncInterfaceInheritA {
 // int multiply(int a,int b,int c);
	@Override
	default int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return b*a;
	}
}
