package com.boot.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String city;
	private String country;
	private String zipcode;
	/**
	 * {
        "eid": 19,
        "ename": "Emp 19",
        "email": "emp19@test.com",
        "phone": "19234567890",
        "password": "emp19",
        "address": {
            "aid": 19,
            "city": "some 19",
            "country": "some 19",
            "zipcode": "19234"
        }
    }
	 */

	@JsonIgnore
	@OneToOne(mappedBy="address")
	private Employee employee;
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	
	
}
