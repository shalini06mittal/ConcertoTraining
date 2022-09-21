package com.concerto.demos.SpringCoreDemo.entity;

public class Student {

	private int rno;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
}
