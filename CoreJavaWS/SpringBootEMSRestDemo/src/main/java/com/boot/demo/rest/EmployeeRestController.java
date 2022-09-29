package com.boot.demo.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.Employee;
import com.boot.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees()
	{
		return this.employeeService.getEmployees();
	}
	
	@GetMapping(path ="/{eid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeById(@PathVariable int eid) {
		System.out.println("Emp id "+eid);
		Employee emp =  this.employeeService.getEmplopyeeById(eid);
		System.out.println(emp);
		return emp;
	}
	
	@DeleteMapping("/{eid}")
	public Map<String, String> deleteEmployeeById(@PathVariable int eid)
	{
		Map<String, String> map = new HashMap<String, String>();
		try {
			if(this.employeeService.deleteEmployee(eid))
				map.put("SUCCESS", eid+ " deleted");
		}
		catch(EntityNotFoundException e)
		{
			map.put("FAILURE", e.getMessage());
		}
		return map;
	}
	//@PostMapping
}
