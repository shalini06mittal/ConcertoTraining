package com.lamdbdas;

public class Product implements Comparable<Product>{

	private int pid;
	private String pname;
	private String category;
	private Double price;
	public Product(int pid, String pname, String category, Double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.category = category;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", category=" + category + ", price=" + price + "]";
	}
	// Product p1 , p2
	// p1.compareTo(p2)
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.pname.compareTo(o.getPname());
	}
	
}
