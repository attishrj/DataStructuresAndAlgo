package com.java.collection.list;

import java.util.ArrayList;

public class EmpList {
	

	public static void main(String[] args) {
		
		ArrayList<Employee> empList=new ArrayList<>();
		Employee em = new Employee(22, "attish");
		empList.add(em);
		empList.add(new Employee(27, "raj"));
		empList.add(new Employee(25, "xyz"));
		empList.add(new Employee(32, "alpa"));
		empList.add(new Employee(34, "hello"));
		empList.add(new Employee(30, "qwh"));
		empList.add(new Employee(28, "zweh"));
		for(Employee e:empList)
		{
		  	
		}
     System.out.println("EmpList.main()"+empList.contains(em));

	}

	private static void initList(ArrayList<Employee> empList) {
		
	}

}
