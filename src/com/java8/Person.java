package com.java8;

public class Person {//implements Comparator<Person> {
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	/*@Override
	public int compare(Person p1, Person p2) {
		String p1LastName=p1.getLastName();
		String p2LastName=p2.getLastName();
		return p1LastName.compareTo(p2LastName);
	}
*/
}
