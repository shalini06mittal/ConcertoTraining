package com.boot.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.entity.Address;
import com.boot.demo.entity.Employee;
import com.boot.demo.repository.AddressRepository;
import com.boot.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional
	public Employee insertEmployee(Employee employee) {
		
		Address savedAddress = this.addressRepository.save(employee.getAddress());
		employee.setAddress(savedAddress);
		Employee savedEmployee = this.employeeRepository.save(employee);
		return savedEmployee;
		
	}
	public Employee getEmplopyeeById(int eid) {
		System.out.println("Emp service "+eid);
		return this.employeeRepository
				.findById(eid).orElseThrow(()-> new EntityNotFoundException("Employee "+eid+" not found"));
	}
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		this.employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	public Employee updateEmployee(Employee employee) {
		if(!this.employeeRepository.existsById(employee.getEid()))
			throw new EntityNotFoundException("Employee "+employee.getEid()+" not found and cannot be updated");
		return this.employeeRepository.save(employee);
			
	}
	@Transactional
	public boolean deleteEmployee(int eid) {
		if(!this.employeeRepository.existsById(eid))
			throw new EntityNotFoundException("Employee "+eid+" not found and cannot be deleted");
		this.employeeRepository.deleteById(eid);
		return true;
	}
}
