package com.java8.reference.constructor;

interface ISample {
	Sample get(String g);
}

interface IStudent {
	Student get(int roll, String name, int age);
}

public class ConstructorReference {

	public static void main(String[] args) {
		ISample iobj = Sample::new;
		Sample sample1 = iobj.get("RAJ");
		sample1.display();
		
		//--------------------------------------------------------//
		IStudent istuobj=Student::new;
		istuobj.get(4, "RAJ", 25);

	}

}
