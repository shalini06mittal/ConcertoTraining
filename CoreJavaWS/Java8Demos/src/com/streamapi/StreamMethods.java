package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("a","bb","cc","ddd","a");
		System.out.println(data.stream().distinct().count());
		
		List<Employee> emps = Arrays.asList(
				new Employee("Shalini", "Mittal", "Mumbai"),
				new Employee("Suhail", "Sharma","Pune"),
				new Employee("Ragini", "Gupta","Mumbai"),
				new Employee("Richa", "Sivaraman", "Delhi"),
				new Employee("Joe", "Gray","Mumbai"),
				new Employee("Joe", "Gray","Mumbai")
				);
		System.out.println(emps.stream().distinct().count());
		
		System.out.println(
		data.stream().collect(Collectors.groupingBy(String::length))
		);
		
		System.out.println(
			emps.stream().collect(Collectors.groupingBy(Employee::getCity))
		);
		
		var var = "ajkdh";
		int x = 10;
		
	}

}
