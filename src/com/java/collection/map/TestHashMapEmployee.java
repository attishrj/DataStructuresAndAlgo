package com.java.collection.map;

import java.util.HashMap;

public class TestHashMapEmployee {
	public static void main(String[] args) {
		 HashMap<EmployeeForHashMap,EmployeeForHashMap> hmap=new HashMap<>();
		 EmployeeForHashMap emp1=new EmployeeForHashMap("Attish", 47);
		 EmployeeForHashMap emp2=new EmployeeForHashMap("Raj", 35);
		 EmployeeForHashMap emp3=new EmployeeForHashMap("Laxmi", 8);
		 hmap.put(emp1, emp1);
		 hmap.put(emp2, emp2);
		 hmap.put(new EmployeeForHashMap("Attish", 47), new EmployeeForHashMap("Attish", 47));
		 
		 
		 System.out.println(hmap.size());
		 System.out.println(hmap.get(emp3));
		 System.out.println(hmap.get(emp2));
		 System.out.println(hmap.get(emp1));
	}

}
