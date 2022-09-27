package com.boot.demo.SpringBootDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
//At entity annotation tells springboot that customer is database manage an entity
//Because email is a primery key so that you can add annotation ID
@Entity
//@Table(name ="Customer_shalini")
public class Customer {
	@Id
	@Column(length = 100)
	private String email;
	@Column(name="name", nullable = false)//columnDefinition = "char")
	private String custname;
	private String password;
	private String city;
	private String phone;

}
