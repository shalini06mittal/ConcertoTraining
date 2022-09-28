package com.boot.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.demo.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
