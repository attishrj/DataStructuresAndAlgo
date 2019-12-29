package com.java.basics.inheritance;

import java.io.IOException;

public class ChildDerived extends BaseParent {
	public ChildDerived() {
		System.out.print("B");
       // super();
	}
	@Override
	public float m(float x, float y) throws IOException {
		// TODO Auto-generated method stub
		return super.m(x, y);
	}

}
