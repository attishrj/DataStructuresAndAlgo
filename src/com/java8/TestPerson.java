package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {
		TestPerson obj=new TestPerson();
		List<Person> list=new ArrayList<>();
		list.add(new Person("Sachin", "Tendulkar", 30));
		list.add(new Person("Sourav", "Ganguly", 32));
		list.add(new Person("Viru", "Sehwag", 28));
		list.add(new Person("Rahul", "Dravid", 32));
		list.add(new Person("M.S", "Dhoni", 25));
		list.add(new Person("Yuvraj", "Singh", 26));
		list.add(new Person("Harbhajan", "Singh", 24));
		
		Collections.sort(list, new PersonComparator());
		Collections.sort(list,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		 list.forEach(i->System.out.println(i));
		
		//Step 1 :sort by Last Name 
		//Step 2 : Create a method that prints element in the list
		//Step 3:First Name begin with S
		 Condition startWith;
		 Condition endsWith;
		 startWith=(p)->
		 {
			 return p.getFirstName().startsWith("S");
		 };
		 endsWith=( p)->
		 {
			 return p.getLastName().endsWith("S");
		 };
		 for(Person p:list){
			 System.out.println("firstName "+p.getFirstName()+" "+obj.printNameWithBeging(startWith, p));
			 System.out.println("LastName "+p.getLastName()+" "+obj.printNameWithBeging(endsWith, p));
		 }
    
	}
	public boolean printNameWithBeging(Condition condition, Person p)
	{
		return condition.test(p);
	}
	

	static class PersonComparator implements Comparator<Person>
	{

		@Override
		public int compare(Person p1, Person p2) {
			return p1.getLastName().compareTo(p2.getLastName());
		}
	}
}
interface Condition{
	boolean test(Person P);
}

