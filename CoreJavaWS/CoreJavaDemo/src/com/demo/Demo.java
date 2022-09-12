package com.demo;

public class Demo {

	public static void main(String[] args) {
		/**
		 * byte
		 * char
		 * short
		 * int
		 * loong
		 * float
		 * double
		 * boolean
		 * 
		 * String
		 */
		int x = 10;
		if(x>=10) {
			
		}
		System.out.println("");
		for(int i=0;i<=10;i++)
		{
			
		}
		// arrays => of same type
//		 arr = []
		int arr[]; // array declaration
		// size of the array => no of elements
		arr = new int[5];// 4 bytes
		int a[] = new int [10];
		arr[0] = 10;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	//	String names[]= new String[5];//{"Akshay","Pritam","Shalini"};
		String names[]= {"Akshay","Pritam","Shalini"};
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].toLowerCase());
			
		}
	}

}











