package com.java8;

@FunctionalInterface
public interface FuncInterfaceInheritA {
	int add(int a,int b);

	
	default int multiply(int a, int b)
	{
		return a*b;
	}

}
