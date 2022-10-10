package com.ms.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.demo.entity.Product;
import com.ms.demo.repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo repo;
	@GetMapping("/")
	public List<Product> getAllProducts()
	{
		
		List<Product> products = new ArrayList<>();
		this.repo.findAll().forEach(products::add);
		
		return products;
	}
	@GetMapping("/{id}")
	public Product getAllProductsById(@PathVariable int id)
	{
		return this.repo.findById(id).orElseThrow(()->new EntityNotFoundException("Prodcut not found"));
	}
	
	@PostMapping
	public Product insertProduct(@RequestBody Product product)
	{
		return this.repo.save(product);
	}
	
}
