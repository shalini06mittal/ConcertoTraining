package com.boot.demo.SpringBootDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{
	

}
