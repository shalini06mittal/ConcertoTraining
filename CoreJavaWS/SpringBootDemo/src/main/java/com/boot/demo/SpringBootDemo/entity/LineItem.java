package com.boot.demo.SpringBootDemo.entity;

import java.beans.Transient;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class LineItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//private ProductLineItem primary;
	private int qty;
	@OneToOne
	@JoinColumn(name="prodid", referencedColumnName = "pid")
	private Product product;
	@OneToOne
	@JoinColumn(name="orderid")
	private Order order;
//	@Override
//	public String toString() {
//		return "LineItem [qty=" + qty + ", product=" + product + "]";
//	}
	
	
}
