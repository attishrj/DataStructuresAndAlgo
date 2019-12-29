package com.abstractinfo.and.interfaceinfo;

public class ADT extends AbstractDemo {

	ADT() {
	//	super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void set(int a) {
	super.a=a;
	}

	@Override
	int get() {
		// TODO Auto-generated method stub
		return a;
	}
  public static void main(String[] args) {
	AbstractDemo d=new ADT();
	d.set(15);
	d.display();
}
	
}
