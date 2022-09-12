package com.demo;


public class Box {
	private int len; // cms => mm
	private int width;
	private int height;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(int len, int width, int height) {
		super();
		this.len = len;
		this.width = width;
		this.height = height;
	}
	public void display()
	{
		System.out.println();
		//return;
	}
	public int calVolume()
	{
		return len*height*width;
	}
}
