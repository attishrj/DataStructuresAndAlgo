package com.java.basics.inheritance;

public class N extends M {

	public N(int i) {
		super(++i);
		System.out.println(i);
	}

}
