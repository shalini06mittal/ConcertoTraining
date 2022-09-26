package com.boot.demo.SpringBootDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.Product;
import com.boot.demo.SpringBootDemo.repository.CustomerDatabase;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
import com.boot.demo.SpringBootDemo.repository.OrderRepository;
import com.boot.demo.SpringBootDemo.repository.ProductRepository;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		ApplicationContext context = 
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(context.getBean(CustomerDatabase.class).getTemplate());
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	//@Bean
	public void setUp()
	{
		Customer customer1 = new Customer("abc@test.com", "abc", "abc123", "Mumbai", "4545454545");
		Customer customer2 = new Customer("abc1@test.com", "abc1", "abc1123", "Pune", "4545454545");
		Customer customer3 = new Customer("abc2@test.com", "abc2", "abc1223", "Mumbai", "4545454545");
		
		customerRepository.save(customer1);
		customerRepository.save(customer2);
		customerRepository.save(customer3);
		
		Product p1 =new Product("P1", "pen", 50);
		Product p2 =new Product("P2", "eraser", 10);
		Product p3 =new Product("P3", "notebook", 120);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
	}

}

