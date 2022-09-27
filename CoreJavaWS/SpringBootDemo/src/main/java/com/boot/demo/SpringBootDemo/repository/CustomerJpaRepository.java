package com.boot.demo.SpringBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.demo.SpringBootDemo.entity.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, String>{
}
