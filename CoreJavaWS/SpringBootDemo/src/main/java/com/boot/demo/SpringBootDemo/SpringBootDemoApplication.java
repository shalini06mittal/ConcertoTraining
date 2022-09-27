package com.boot.demo.SpringBootDemo;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.LineItem;
import com.boot.demo.SpringBootDemo.entity.Order;
import com.boot.demo.SpringBootDemo.entity.Product;
import com.boot.demo.SpringBootDemo.repository.CustomerDatabase;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
import com.boot.demo.SpringBootDemo.repository.LineItemRepository;
import com.boot.demo.SpringBootDemo.repository.OrderRepository;
import com.boot.demo.SpringBootDemo.repository.ProductRepository;
import com.boot.demo.SpringBootDemo.service.CustomerService;
import com.boot.demo.SpringBootDemo.service.OrderService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		ApplicationContext context = 
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(context.getBean(CustomerDatabase.class).getTemplate());
		System.out.println();
		CustomerService cs = context.getBean(CustomerService.class);
		for(Customer c: cs.getAllCustomersByCity("Mumbai"))
			System.out.println(c);
		
		System.out.println();
		for(Customer c: cs.getAllCustomersWithEamilEndsWith("test.com"))
			System.out.println(c);
		
//		System.out.println();
//		OrderService os=context.getBean(OrderService.class);
//		for(Order o:os.getOrders("abc1@test.com"))
//			System.out.println(o);
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
//		System.out.println(cs.get("abc@test.com"));
//		for(Customer c : cs.getAllCustomers())
//			System.out.println(c);
//		
//		try {
//		System.out.println(cs.get("shalini@email.com"));
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		Customer customer1 = new Customer("abc@test.com", "abc", "abc123", "Mumbai", "4545454545");
//		try {
//			System.out.println(cs.save(customer1));
//			}
//			catch(Exception e)
//			{
//				System.out.println(e.getMessage());
//			}
//		customer1 = new Customer("abc4@test.com", "abc4", "abc1234", "Mumbai", "9898989898");
//		System.out.println(cs.save(customer1));
	}
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private LineItemRepository lineItemRepository;
	
	//@Bean
	public void setUp()
	{
		System.out.println("Creating data....");
		Customer customer1 = new Customer("abc@test.com", "abc", "abc123", "Mumbai", "4545454545");
		Customer customer2 = new Customer("abc1@test.com", "abc1", "abc1123", "Pune", "4545454545");
		Customer customer3 = new Customer("abc2@test.com", "abc2", "abc1223", "Mumbai", "4545454545");
		
//		customerRepository.save(customer1);
//		customerRepository.save(customer2);
//		customerRepository.save(customer3);
		
		Product p1 =new Product("P1", "pen", 50);
		Product p2 =new Product("P2", "eraser", 10);
		Product p3 =new Product("P3", "notebook", 120);
		
//		productRepository.save(p1);
//		productRepository.save(p2);
//		productRepository.save(p3);
		
		Order o1 = new Order();
		o1.setCustomer(customer1);
		o1.setDate(new Date());
		Order savedOrder1 = null;//orderRepository.save(o1);
		
		
		Order o2 = new Order();
		o2.setCustomer(customer2);
		
		
		o2.setDate(java.sql.Date.valueOf(LocalDate.of(2022, 9, 10)));
		Order savedOrder2 = orderRepository.save(o2);
		
		LineItem item1 = new LineItem(6, 2, p3, savedOrder2);
		LineItem item2 = new LineItem(7, 5, p2, savedOrder2);
//		LineItem item3 = new LineItem(3, 5, p3, savedOrder1);
//		LineItem item4 = new LineItem(4, 3, p1, savedOrder2);
//		LineItem item5 = new LineItem(5, 4, p2, savedOrder2);
//		
		lineItemRepository.save(item1);
		lineItemRepository.save(item2);
	//	lineItemRepository.save(item3);
//		lineItemRepository.save(item4);
//		lineItemRepository.save(item5);
		
	}

}

