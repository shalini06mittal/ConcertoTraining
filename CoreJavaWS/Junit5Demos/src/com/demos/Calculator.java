package com.demos;

public class Calculator {
	
	int no1;
	int no2;
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	
	public int add() {
		return no1+no2;
	}
	
	public int sub() throws Exception {
		if(no1<no2)
			throw new Exception("no1 is less then no2");
		return no1-no2;
	}
	
	public int factorial() {
		int fac = 1;
		try {
			Thread.sleep(2100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=no1;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	
	

}
