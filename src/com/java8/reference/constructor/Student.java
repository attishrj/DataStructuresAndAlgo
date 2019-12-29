package com.java8.reference.constructor;

public class Student {
	int roll;
	String name;
	int age;

	public Student(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
System.out.println("Student. args Constructor ");
	}
	public Student() {
		System.out.println("Student No args Constructor ");// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}

}
