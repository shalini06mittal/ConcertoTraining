package com.concerto.demos.SpringCoreDemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Book {
	@Value("101")
	private int bookid;
	@Value("Beneath the blue sky")
	private String title;
	@Value("456.89")
	private double price;
	@Autowired
	private Author author;
	public Book() {
		System.out.println("Book default constructor");
	}
	public Book(int bookid, String title, double price) {
		System.out.println("Book parameterized constructor");
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}
	
	public Book(int bookid, String title, double price, Author author) {
		System.out.println("Book parameterized constructor with authoe");
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
}
