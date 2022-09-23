package com.springmvc.entity;

public class TransactionDetails {
	
	private int tid;
	private int amount;
	private String email;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "TransactionDatabase [tid=" + tid + ", amount=" + amount + ", email=" + email + "]";
	}
	
	

}
