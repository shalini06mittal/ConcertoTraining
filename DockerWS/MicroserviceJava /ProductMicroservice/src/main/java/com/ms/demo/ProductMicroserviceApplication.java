package com.ms.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.ms.demo.entity.Product;
import com.ms.demo.repo.ProductRepo;

@SpringBootApplication
@EnableEurekaClient
public class ProductMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApplication.class, args);
	}

	@Autowired
	private ProductRepo repo;
	
	@Bean
	public void initialize()
	{
		Stream.of(new Product(1,"Speaker","Boss Speakers",34000),
				new Product(2,"Laptop","Mac Laptop",134000),
				new Product(3,"Keyboard","Sony Wireless",14000),
				new Product(4,"Mouse","HP Mouse",4000))
		.forEach(product->repo.save(product));
		
		repo.findAll().forEach(System.out::println);
	}
}
