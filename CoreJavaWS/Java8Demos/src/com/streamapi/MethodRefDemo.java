package com.streamapi;

import java.util.ArrayList;
import java.util.function.Supplier;

interface Supp{
	public int get(String s);
}
interface Supp1{
	public int get();
}
public class MethodRefDemo {
	public static void main(String[] args) {
		
		//Reference to a unbound non-static Method
		String s = "skjhd";
		 Supp1 supp1 = () -> s.length();
		 supp1 = s::length;
		 Supp supp = s1-> s1.length();
		
		 //Reference to a bound non-static Method
		 supp = String::length;
		System.out.println(supp1.get());
		System.out.println(supp.get("shalini"));
		
		//Reference to a static Method
		supp = Integer::valueOf;
		System.out.println(supp.get("12123"));
		
		// Reference to a default constructor
		Supplier<ArrayList<Integer>> supplier = ArrayList::new;
		
		
		
	}

}
