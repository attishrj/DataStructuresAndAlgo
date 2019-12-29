
package com.java.basics;

public class AboutStatic {
	static int a = 21;
	int b=32;

	public static void print() {
		System.out.println("a is " + a);
	}

	void display() {
		a++;
		System.out.println("AboutStatic.display()" + a);

	}

	public static void main(String[] args) {
		AboutStatic obj = new AboutStatic();
		obj.display();
	}

}
