package com.java.basics.overriden.scope;

public class ChildException extends ParentException {
	int i;
	public ChildException(int i) {
		this.i=i;
	}
	/*@Override
	void msg() throws InterruptedException {
		Thread.sleep(1000);
	}*/
	
	@Override
	void msg() throws ArithmeticException {
		i=i/0;
		super.msg();
	}

	public static void main(String[] args) {
		ParentException obj=new ChildException(15);
		obj.msg();
	}
}
