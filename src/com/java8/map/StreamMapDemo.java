package com.java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.java8.predicate.Employee;
import com.java8.predicate.EmployeesPredicate;

public class StreamMapDemo {
	
	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

       // mapDes(alpha);
        
        List<Employee> elist = new ArrayList<>();
        initList(elist);
        distinctDemo(elist);
		System.out.println(EmployeesPredicate.filterEmpoyees(elist, EmployeesPredicate.isAdultMale()));

	}

	private static void distinctDemo(List<Employee> elist) {
		List<Integer> distinctSalaries = elist.stream()
                .map( e -> e.getSalary() )
                .distinct()
                .collect(Collectors.toList());

System.out.println("distinct salaries are "+distinctSalaries);
		
	}

	private static void initList(List<Employee> elist) {
		elist.add(new Employee(1, 23, "M", "Rick", "Beethovan",1000));
		elist.add(new Employee(2, 13, "F", "Martina", "Hengis",2000));
		elist.add(new Employee(3, 43, "M", "Ricky", "Martin",30000));
		elist.add(new Employee(4, 26, "M", "Jon", "Lowman",4000));
		elist.add(new Employee(5, 19, "F", "Cristine", "Maria",4000));
		elist.add(new Employee(6, 15, "M", "David", "Feezor",3000));
		elist.add(new Employee(7, 68, "F", "Melissa", "Roy",2000));
		elist.add(new Employee(8, 79, "M", "Alex", "Gussin",1000));
		elist.add(new Employee(9, 15, "F", "Neetu", "Singh",6000));
		elist.add(new Employee(10, 45, "M", "Naveen", "Jain",5000));

	}


	private static void mapDes(List<String> alpha) {
		//Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]

        // Java 8
        Function<? super String, ? extends String> mapper = String::toUpperCase;
		List<String> collect = alpha.stream().map(mapper).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]
	}

}
