package com.java8.predicate;

import java.util.ArrayList;
import java.util.List;

public class EmployeePredicateTest {
	public static void main(String[] args) {
		List<Employee> elist = new ArrayList<>();
		initList(elist);
		System.out.println(EmployeesPredicate.filterEmpoyees(elist, EmployeesPredicate.isAdultMale()));

	}

	private static void initList(List<Employee> elist) {
		elist.add(new Employee(1, 23, "M", "Rick", "Beethovan"));
		elist.add(new Employee(2, 13, "F", "Martina", "Hengis"));
		elist.add(new Employee(3, 43, "M", "Ricky", "Martin"));
		elist.add(new Employee(4, 26, "M", "Jon", "Lowman"));
		elist.add(new Employee(5, 19, "F", "Cristine", "Maria"));
		elist.add(new Employee(6, 15, "M", "David", "Feezor"));
		elist.add(new Employee(7, 68, "F", "Melissa", "Roy"));
		elist.add(new Employee(8, 79, "M", "Alex", "Gussin"));
		elist.add(new Employee(9, 15, "F", "Neetu", "Singh"));
		elist.add(new Employee(10, 45, "M", "Naveen", "Jain"));

	}

}
