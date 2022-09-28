package com.boot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.boot.demo.entity.Address;
import com.boot.demo.entity.Employee;
import com.boot.demo.service.EmployeeService;

@SpringBootApplication
public class SpringBootEmsRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmsRestDemoApplication.class, args);
	}
	
	@Autowired
	private EmployeeService employeeService;
	
	//@Bean
	public void initialize()
	{
		for(int i=11;i<=20;i++)
		{
			Employee e1 = new Employee();
			e1.setEname("Emp "+i);
			e1.setEmail("emp"+i+"@test.com");
			e1.setPassword("emp"+i);
			e1.setPhone(i+"234567890");
			Address a1 = new Address();
			a1.setCity("city "+i);
			a1.setCountry("city "+i);
			a1.setZipcode(i+"234");
			e1.setAddress(a1);
			employeeService.insertEmployee(e1);
		}
		for(int i=11;i<=20;i++)
		{
			Employee e1 = new Employee();
			e1.setEname("Emp "+i);
			e1.setEmail("emp"+i+"@test.com");
			e1.setPassword("emp"+i);
			e1.setPhone(i+"234567890");
			Address a1 = new Address();
			a1.setCity("some "+i);
			a1.setCountry("some "+i);
			a1.setZipcode(i+"234");
			e1.setAddress(a1);
			employeeService.insertEmployee(e1);
		}
		
		
	}

}
