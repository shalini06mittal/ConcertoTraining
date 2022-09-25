package com.boot.demo.SpringBootDemo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Order {
	
	private int orderid;
	private Date date;
	private Customer customer;	
	private List<LineItem> lineitems = new  ArrayList<LineItem>();

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
