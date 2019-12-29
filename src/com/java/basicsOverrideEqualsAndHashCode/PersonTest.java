package com.java.basicsOverrideEqualsAndHashCode;

public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person(11, "ram");
		Person p11=new Person("ram");
		Person p2=new Person(21, "ram");
		Person p22=new Person("ram");
		System.out.println(p11.equals(p22));

	}

}
