package com.boot.demo.SpringBootDemo;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.boot.demo.SpringBootDemo.entity.CartItems;
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
//		System.out.println(context.getBean(CustomerDatabase.class).getTemplate());
//		System.out.println();
		CustomerService cs = context.getBean(CustomerService.class);
		
	
		
//		for(Customer c: cs.getAllCustomersByCity("Mumbai"))
//			System.out.println(c);
//		
//		System.out.println();
//		for(Customer c: cs.getAllCustomersWithEamilEndsWith("test.com"))
//			System.out.println(c);
		
		Product p1 =new Product("P1", "pen", 50);
		Product p2 =new Product("P2", "eraser", 10);
		CartItems items1 = new CartItems();
		items1.setProduct(p1);
		items1.setQuantity(100);
//		CartItems items2 = new CartItems();
//		items2.setProduct(p2);
//		items2.setQuantity(16);
		OrderService os = context.getBean(OrderService.class);
//		os.insertOrder(Arrays.asList(items1), "abc@test.com");
			
//		System.out.println();
//		OrderService os=context.getBean(OrderService.class);
//		for(Order o:os.getOrders("abc1@test.com"))
//			System.out.println(o);
		
		System.out.println();
//		System.out.println(cs.get("abc@test.com"));
		for(Customer c : cs.getAllCustomersFiltered(1,10))
			System.out.println(c);
		System.out.println();
//		for(Customer c : cs.getAllCustomersFiltered(0,5))
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
		Customer customer1 = new Customer("abc3@test.com", "abc3", "abc12333", "Mumbai", "1245454545");
		Customer customer2 = new Customer("abc4@test.com", "abc4", "abc112344", "Pune", "6755454545");
		Customer customer3 = new Customer("abc5@test.com", "abc5", "abc12235", "Delhi", "8394454545");
		Customer customer4 = new Customer("abc6@test.com", "abc6", "abc6", "Mumbai", "249543909534");
		Customer customer5 = new Customer("abc7@test.com", "abc7", "abc7", "Pune", "95934224565");
		Customer customer6 = new Customer("abc8@test.com", "abc8", "abc8", "Delhi", "1212121212");
		Customer customer7 = new Customer("abc9@test.com", "abc9", "abc9", "Mumbai", "9023478282");
		Customer customer8 = new Customer("abc10@test.com", "abc10", "abc10", "Pune", "7463738272");
		Customer customer9 = new Customer("abc11@test.com", "abc11", "abc11", "Delhi", "9293948676");
		Customer customer10 = new Customer("abc12@test.com", "abc12", "abc12", "Mumbai", "7489372628");
		Customer customer11 = new Customer("abc13@test.com", "abc13", "abc13", "Pune", "2847463732");
		Customer customer12 = new Customer("abc14@test.com", "abc14", "abc14", "Delhi", "47389272822");
		Customer customer13 = new Customer("abc15@test.com", "abc15", "abc15", "Mumbai", "848303838393");
		Customer customer14 = new Customer("abc16@test.com", "abc16", "abc16", "Pune", "0987363555332");
		Customer customer15 = new Customer("abc17@test.com", "abc17", "abc17", "Delhi", "937635353637");
		
		customerRepository.save(customer1);
		customerRepository.save(customer2);
		customerRepository.save(customer3);
		customerRepository.save(customer4);
		customerRepository.save(customer5);
		customerRepository.save(customer6);
		customerRepository.save(customer7);
		customerRepository.save(customer8);
		customerRepository.save(customer9);
		customerRepository.save(customer10);
		customerRepository.save(customer11);
		customerRepository.save(customer12);
		customerRepository.save(customer13);
		customerRepository.save(customer14);
		customerRepository.save(customer15);
		
		Product p1 =new Product("P1", "pen", 50);
		Product p2 =new Product("P2", "eraser", 10);
		Product p3 =new Product("P3", "notebook", 120);
		
//		productRepository.save(p1);
//		productRepository.save(p2);
//		productRepository.save(p3);
		
		Order o1 = new Order();
		o1.setCustomer(customer1);
		o1.setDate(new Date());
//		Order savedOrder1 = null;//orderRepository.save(o1);
		
		
		Order o2 = new Order();
		o2.setCustomer(customer2);
		
		
		o2.setDate(java.sql.Date.valueOf(LocalDate.of(2022, 9, 10)));
//		Order savedOrder2 = orderRepository.save(o2);
		
//		LineItem item1 = new LineItem(6, 2, p3, savedOrder2);
//		LineItem item2 = new LineItem(7, 5, p2, savedOrder2);
//		LineItem item3 = new LineItem(3, 5, p3, savedOrder1);
//		LineItem item4 = new LineItem(4, 3, p1, savedOrder2);
//		LineItem item5 = new LineItem(5, 4, p2, savedOrder2);
//		
//		lineItemRepository.save(item1);
//		lineItemRepository.save(item2);
	//	lineItemRepository.save(item3);
//		lineItemRepository.save(item4);
//		lineItemRepository.save(item5);
		
	}

}

