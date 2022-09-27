package com.boot.demo.SpringBootDemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name ="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	@Column(name="order_date")
	private Date date;
	@ManyToOne
	@JoinColumn(name="email")
	private Customer customer;	// customer_email
	@OneToMany(mappedBy = "order")//, fetch = FetchType.EAGER)
	private List<LineItem> lineitems = new  ArrayList<LineItem>();
	private double total;
	public double calculate()
	{
		
		double total = 0.0;
		for(LineItem item:lineitems)
		{
			double cost = item.getProduct().getPrice() * item.getQty(); 
			System.out.println(item.getProduct().getPname()+"\t\t"+item.getQty()+"\t\t"+item.getProduct().getPrice()+"\t"+cost);
			System.out.println("--------------------------------------------------------");
			total += cost;
		}
		return total;
	}
		
}
