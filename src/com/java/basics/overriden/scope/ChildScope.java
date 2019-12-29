package com.java.basics.overriden.scope;

public class ChildScope extends ParentScope {
	@Override
	protected void setPint(int pint) {
		// TODO Auto-generated method stub
		super.setPint(pint);
	}
	
	@Override
	protected int getPint() {
		
		   int a=5;
		// TODO Auto-generated method stub
		return super.getPint();
	}
	@Override
	protected void print() {
		System.out.println("Child "+super.getPint());;
	}

}
