package com.java.learn.overriden;

interface Arithmatic {
	int operation(int a, int b);

}

public class MOperation {

	public static void main(String[] args) {
		MOperation obj = new MOperation();
		Arithmatic addition = (int a, int b) -> {
			return a  +b;
		};
		int add=addition.operation(4, 5);
		
		
		Arithmatic addd=new Arithmatic() {
			
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		int c=   addd.operation(4, 6);
	}

}
