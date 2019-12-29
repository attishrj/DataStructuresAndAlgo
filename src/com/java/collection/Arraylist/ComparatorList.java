package com.java.collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.reference.constructor.Student;

public class ComparatorList {
	public static void main(String[] args) {
		Student s1 = new Student(10, "Zara",18);
        Student s2 = new Student(50, "Jayesh",21);
        Student s3 = new Student(20, "Ash",19);
        Student s4 = new Student(30, "Kate",25);
        Student s5 = new Student(26, "Michael",25);
 
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        comparator8();
       // Collections.sort(list,MyComparator);
        
       // list.stream().sorted((s1,s2)->s1.g).forEach(System.out:print);
      //  list.stream().sorted(list,s1.getName().compareTo(s2.getName())).
	}

	private static void comparator8() {
		Comparator<Student>  MyComparator=new Comparator<Student>() {
        	
        	@Override
        	public int compare(Student o1, Student o2) {
        		int p=o1.getAge()-o2.getAge();
        		p=p==0?o1.getAge():p;
        		return p;
        	}
        	
        };
        
	}  
	
}
