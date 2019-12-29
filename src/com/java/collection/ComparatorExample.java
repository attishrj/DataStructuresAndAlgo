package com.java.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

        System.out.println("Employees : " + employees);

Comparator<Employee> employeeNameComparator =new Comparator<Employee>() {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
};


Collections.sort(employees, employeeNameComparator);
System.out.println("\nEmployees (Sorted by Name) : " + employees);

        
	}

}
