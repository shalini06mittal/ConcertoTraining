package com.boot.demo.SpringBootDemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.demo.SpringBootDemo.entity.Customer;

public interface CustomerPageAndSortRepository extends PagingAndSortingRepository<Customer, String>{

}
