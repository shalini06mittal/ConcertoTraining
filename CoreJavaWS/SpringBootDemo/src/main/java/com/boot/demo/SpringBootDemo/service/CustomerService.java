package com.boot.demo.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.repository.CustomerJpaRepository;
import com.boot.demo.SpringBootDemo.repository.CustomerPageAndSortRepository;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerJpaRepository customerJpaRepository;
	
	@Autowired
	private CustomerPageAndSortRepository customerPageAndSortRepository;
	
	public List<Customer> getAllCustomersFiltered(Integer pageno, Integer size)
	{
		List<Customer> list = new ArrayList<>();
		Pageable pageable = PageRequest.of(pageno, size);
		
		Page<Customer> pages =this.customerPageAndSortRepository.findAll(pageable);
		
		list = pages.getContent();
		int totalpages = pages.getTotalPages();
		int elementsOnEachPage = pages.getNumberOfElements();
		long totalElements = pages.getTotalElements();
		
		System.out.println("Total pages "+totalpages);
		System.out.println("Total elements "+totalElements);
		System.out.println("Elements on a page "+elementsOnEachPage);
		
		return list;
	}
	
	public List<Customer> getAllCustomers() {
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.findAll().forEach(list::add);

		this.customerJpaRepository.findAll(Sort.by(Direction.ASC));

		
		return list;
	}
	
	public List<Customer> getAllCustomersWithEamilEndsWith(String endsWith) {
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.getCustomersEndsWithEmail("%"+endsWith).forEach(list::add);

		return list;
	}
	public List<Customer> getAllCustomersByCity(String city) {
		ArrayList<Customer> list = new ArrayList<>();
		this.customerRepository.findByCity(city).forEach(list::add);

		return list;
	}


	public boolean save(Customer customer) {

		if(this.customerRepository.existsById(customer.getEmail()))
		{
				throw new EntityExistsException("Customer with "+customer.getEmail()+" already exists");
		}
		this.customerRepository.save(customer);
		return true;
		
	}
	public boolean update(Customer customer) {

		if(! this.customerRepository.existsById(customer.getEmail()))
		{
			throw new EntityNotFoundException("Customer with "+customer.getEmail()+" cannot be updated as it does not exists exists");		
		}
		this.customerRepository.save(customer);
		return true;
	}

	public boolean delete(String id) {
		if(! this.customerRepository.existsById(id))
		{
			throw new EntityNotFoundException("Customer with "+id+" cannot be deleted as it not exists");		
		}
		this.customerRepository.deleteById(id);
		
		return true;
	}

	public Customer get(String id) {
		Optional<Customer> optCust = this.customerRepository.findById(id);
		return optCust.orElseThrow(()->new EntityNotFoundException("Customer with "+id+" not found"));
	}
}
