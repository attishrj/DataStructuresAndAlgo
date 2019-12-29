package com.java.basics;

/**
 * Final variable doesn't support setter methods, can be initialized through constructor
 * */

public class AboutFinal {
	final int num;
	final String name;
	int age;
	// Even though reference varibale sb is final 
	// We can perform any changes 

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}


	public AboutFinal(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
		final StringBuffer sb = new StringBuffer("Hello"); 
		
		sb.append("GFG"); 
		sb.append("hellohii");
	}
	void display()
	{
		System.out.println("AboutFinal.display()"+this.age+" "+this.name+" "+this.num);
	}

	public static void main(String[] args) {
		AboutFinal obj=new AboutFinal(1, "RAJ", 27);
		
		obj.display();
		
		
	}
}
