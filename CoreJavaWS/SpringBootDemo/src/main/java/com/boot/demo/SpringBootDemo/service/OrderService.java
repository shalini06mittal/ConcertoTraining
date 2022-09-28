package com.boot.demo.SpringBootDemo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.demo.SpringBootDemo.entity.CartItems;
import com.boot.demo.SpringBootDemo.entity.Customer;
import com.boot.demo.SpringBootDemo.entity.LineItem;
import com.boot.demo.SpringBootDemo.entity.Order;
import com.boot.demo.SpringBootDemo.repository.CustomerRepository;
import com.boot.demo.SpringBootDemo.repository.LineItemRepository;
import com.boot.demo.SpringBootDemo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private LineItemRepository lineItemRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Transactional
	public Integer insertOrder(List<CartItems> cartItems, String username)
	{
		Order order = new Order(); // transient
		Customer customer = customerRepository.findById(username).get();
		order.setCustomer(customer);
		order.setDate(java.sql.Date.valueOf(LocalDate.now()));
		Order savedOrder = this.orderRepository.save(order); // persistent
		List<LineItem> items = new ArrayList<>();
		for(CartItems cartitem : cartItems)
		{
	
			LineItem item = new LineItem();
			item.setOrder(savedOrder);
			item.setProduct(cartitem.getProduct());
			item.setQty(cartitem.getQuantity());
			this.lineItemRepository.save(item);
			items.add(item);
		}
		order.setLineitems(items);
		double total = order.calculate();
		this.orderRepository.updateTotal(total, savedOrder.getOrderid());
		//order.setTotal(total);
		
		return savedOrder.getOrderid();
	}
	@Transactional	
	public List<Order> getOrders(String email)
	{
		ArrayList<Order> ol=new ArrayList<Order>();
		this.orderRepository.findByCustomerEmail(email).forEach(ol::add);
		for(Order o: ol )
			Hibernate.initialize(o.getLineitems());
		return ol;
	}
}
