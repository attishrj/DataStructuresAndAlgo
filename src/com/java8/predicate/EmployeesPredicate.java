package com.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeesPredicate {

	//All Employees who are male and age more than 21
	public static Predicate<Employee> isAdultMale()
	{
		Predicate<Employee> predicate = p->p.getAge()>21 && p.getGender().equalsIgnoreCase("M");
		return predicate;
		
	}
	
	
	// All Employees who are female and age more than 18
	public static Predicate<Employee> isAdultFemale()
	{
		return p->p.getAge()>18&&p.getGender().equalsIgnoreCase("F");
	}
	
	//All Employees whose age is more than a given age
	public static Predicate<Employee> isMoreThanAge(int age)
	{
		return p->p.getAge()>age;
	}
	
	public static List<Employee> filterEmpoyees(List<Employee> employee, Predicate<Employee> predicate)
	{
		return employee.stream().filter(predicate).collect(Collectors.toList());
		
	}
}
