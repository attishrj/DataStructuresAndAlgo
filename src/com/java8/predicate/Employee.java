package com.java8.predicate;

public class Employee {
	int empid;
	int age;
	String gender;
	String fname;
	String lastName;
	int salary;

	public Employee(int empid, int age, String gender, String fname, String lastName, int salary) {
		super();
		this.empid = empid;
		this.age = age;
		this.gender = gender;
		this.fname = fname;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Employee(int empid, int age, String gender, String fname, String lastName) {
		super();
		this.empid = empid;
		this.age = age;
		this.gender = gender;
		this.fname = fname;
		this.lastName = lastName;
	}

	public int getEmpid() {
		return empid;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getFname() {
		return fname;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", age=" + age + ", gender=" + gender + ", fname=" + fname + ", lastName="
				+ lastName + "]";
	}
	

}
