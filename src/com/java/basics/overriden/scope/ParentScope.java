package com.java.basics.overriden.scope;

public class ParentScope {
	protected int pint;
	protected void setPint(int pint) {
		this.pint = pint;
	}
	protected int getPint() {
		return pint;
	}
	protected void print()
	{
		System.out.println("Parent.print()"+getPint());
	}

}
