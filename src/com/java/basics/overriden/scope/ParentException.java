package com.java.basics.overriden.scope;

public class ParentException {
	public ParentException() {
		System.out.println("ParentException.ParentException()");
	}
	void msg() {
		System.out.println("parent");
	}
}
