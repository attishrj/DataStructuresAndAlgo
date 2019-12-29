package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {
	public static void main(String[] args) {
		TestPerson person=new TestPerson();
		List<Person> list=new ArrayList<>();
		list.add(new Person("Sachin", "Tendulkar", 30));
		list.add(new Person("Sourav", "Ganguly", 32));
		list.add(new Person("Viru", "Sehwag", 28));
		list.add(new Person("Rahul", "Dravid", 32));
		list.add(new Person("M.S", "Dhoni", 25));
		list.add(new Person("Yuvraj", "Singh", 26));
		list.add(new Person("Harbhajan", "Singh", 24));
		
		list.stream().filter(p->p.getLastName().startsWith("S")).
		forEach(p->System.out.println(p.getLastName()));
		
		
		list.
		forEach(p->System.out.println(p));
		
	}

}
