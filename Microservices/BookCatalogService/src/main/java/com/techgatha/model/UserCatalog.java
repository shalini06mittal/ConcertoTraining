package com.techgatha.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class UserCatalog {

	private String email;
	private String title;
	private String description;
	private double price;
	private String datetime;
	private Integer rating;
	
	public UserCatalog() {
		// TODO Auto-generated constructor stub
	}

	public UserCatalog(String email, String booktitle, String bookdescription, double price, String datetime) {
		super();
		this.email = email;
		this.title = booktitle;
		this.description = bookdescription;
		this.price = price;
		this.datetime = datetime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String booktitle) {
		this.title = booktitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String bookdescription) {
		this.description = bookdescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	
	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "UserCatalog [email=" + email + ", booktitle=" + title + ", bookdescription=" + description
				+ ", price=" + price + ", datetime=" + datetime + "]";
	}
	
}
