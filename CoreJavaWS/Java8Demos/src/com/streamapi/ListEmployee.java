package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListEmployee {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee("Shalini", "Mittal", "Mumbai"),
				new Employee("Suhail", "Sharma","Pune"),
				new Employee("Ragini", "Gupta","Mumbai"),
				new Employee("Richa", "Sivaraman", "Delhi"),
				new Employee("Joe", "Gray","Mumbai"),
				new Employee("Joe", "Gray","Mumbai")
				);
		// display full name
		emps.stream().map(emp -> emp.getFirstname()+" "+emp.getLastname())
		.forEach(fullname -> System.out.println(fullname));
		
		// display those employees in 'Mumbai'
		 List<Employee> empMum =  emps.stream().filter(emp -> emp.getCity().equals("Mumbai"))
		.collect(Collectors.toList());
		 
	}
}
