package com.boot.demo.SpringBootDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootDemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{
	public List<Customer> findByCity(String city);
	
//	@Query(nativeQuery = true, value =  "select * from customer where email like '%gmail.com'" )
//	public List<Customer> getCustomersEndsWithEmail();
	
	 //JPQL
	@Query(value =  "select u from Customer u where email like :endsWith" )
	public List<Customer> getCustomersEndsWithEmail(String endsWith);
	
	//public List<Customer> findByCityAndEmail(String city, String email);
}
