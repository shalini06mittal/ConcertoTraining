package com.ms.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.ms.demo.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{

}
